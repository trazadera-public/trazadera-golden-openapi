/*
 * GOLDEN-API
 * Trazadera Golden API
 *
 * OpenAPI spec version: 1.9.0
 * Contact: support@trazadera.com 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.trazadera.golden.restclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trazadera.golden.restclient.model.Column;
import com.trazadera.golden.restclient.model.Dependency;
import com.trazadera.golden.restclient.model.Resource;
import com.trazadera.golden.restclient.model.Test;
import com.trazadera.golden.restclient.model.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * A dataset represents a list of columns and their types. It is used across the system to define the data structure of records, entities, and tables; as such, it is a fundamental building block of the system.
 */
@Schema(description = "A dataset represents a list of columns and their types. It is used across the system to define the data structure of records, entities, and tables; as such, it is a fundamental building block of the system.")

public class Dataset extends Resource {
  @SerializedName("columns")
  private List<Column> columns = new ArrayList<Column>();

  public Dataset columns(List<Column> columns) {
    this.columns = columns;
    return this;
  }

  public Dataset addColumnsItem(Column columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * List of columns in this dataset.
   * @return columns
  **/
  @Schema(required = true, description = "List of columns in this dataset.")
  public List<Column> getColumns() {
    return columns;
  }

  public void setColumns(List<Column> columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.columns, dataset.columns) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
