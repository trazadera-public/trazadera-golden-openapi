#!/bin/sh

# Change directory to the root of the project
cd "$(dirname "$0")/.."

# Ensure the swagger-codegen-cli is installed
if ! command -v swagger-codegen &> /dev/null; then
  echo "Error: swagger-codegen-cli not found"
  echo "Please install swagger-codegen-cli by running the following command:"
  echo "brew install swagger-codegen"
  exit 1
fi

# Check if the api-docs.json file exists
if [ ! -f ./api-docs.json ]; then
  echo "Error: api-docs.json not found"
  exit 1
fi

# Create a temporal directory
TEMP_DIR=$(mktemp -d)

# Generate the OpenAPI client
swagger-codegen generate -i ./api-docs.json --api-package com.trazadera.golden.restclient.api --model-package com.trazadera.golden.restclient.model --invoker-package com.trazadera.golden.restclient.invoker -l java -o $TEMP_DIR

# ---- BUGS
# Now traverse all the generated Java files and remove the lines that contains the @javax.annotation.Generated annotation
# This is necessary because the javax.annotation.Generated is not available in Java 9+
find $TEMP_DIR/src/main/java/com/trazadera/golden/restclient/ -name "*.java" -exec sed -i '' '/@javax.annotation.Generated/d' {} \;

# The interface java.util.Map is generated but import is for java.util.HashMap
# Add 'import java.util.Map'
find $TEMP_DIR/src/main/java/com/trazadera/golden/restclient/ -name "*.java" -exec sed -i '' 's/import java.util.HashMap;/import java.util.HashMap;import java.util.Map;/' {} \;

# Clean the current client
rm -rf src/main/java/com/trazadera/golden/restclient/*

# Copy the generated files to the project
mkdir -p src/main/java/com/trazadera/golden/restclient/
cp -r $TEMP_DIR/src/main/java/com/trazadera/golden/restclient/* src/main/java/com/trazadera/golden/restclient/

# Clean the temporal directory
rm -rf $TEMP_DIR
echo "Golden OpenAPI client generated successfully!"
exit 0