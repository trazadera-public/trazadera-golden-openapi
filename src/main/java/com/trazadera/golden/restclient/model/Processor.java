/*
 * GOLDEN-API
 * Trazadera Golden API
 *
 * OpenAPI spec version: 15
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
import com.trazadera.golden.restclient.model.Option;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A processor is used to process records as a stage of a pipeline.
 */
@Schema(description = "A processor is used to process records as a stage of a pipeline.")

public class Processor {
  /**
   * The type of processor.
   */
  @JsonAdapter(ProcessorTypeEnum.Adapter.class)
  public enum ProcessorTypeEnum {
    @SerializedName("CLEANER")
    CLEANER("CLEANER"),
    @SerializedName("REPLACER")
    REPLACER("REPLACER"),
    @SerializedName("TOKENIZER")
    TOKENIZER("TOKENIZER"),
    @SerializedName("SCRIPT")
    SCRIPT("SCRIPT");

    private String value;

    ProcessorTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProcessorTypeEnum fromValue(String input) {
      for (ProcessorTypeEnum b : ProcessorTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProcessorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProcessorTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProcessorTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProcessorTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("processorType")
  private ProcessorTypeEnum processorType = null;

  @SerializedName("properties")
  private List<Option> properties = null;

  @SerializedName("script")
  private String script = null;

  public Processor processorType(ProcessorTypeEnum processorType) {
    this.processorType = processorType;
    return this;
  }

   /**
   * The type of processor.
   * @return processorType
  **/
  @Schema(required = true, description = "The type of processor.")
  public ProcessorTypeEnum getProcessorType() {
    return processorType;
  }

  public void setProcessorType(ProcessorTypeEnum processorType) {
    this.processorType = processorType;
  }

  public Processor properties(List<Option> properties) {
    this.properties = properties;
    return this;
  }

  public Processor addPropertiesItem(Option propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<Option>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Additional properties of the processor.
   * @return properties
  **/
  @Schema(description = "Additional properties of the processor.")
  public List<Option> getProperties() {
    return properties;
  }

  public void setProperties(List<Option> properties) {
    this.properties = properties;
  }

  public Processor script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Optional script to execute.
   * @return script
  **/
  @Schema(description = "Optional script to execute.")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processor processor = (Processor) o;
    return Objects.equals(this.processorType, processor.processorType) &&
        Objects.equals(this.properties, processor.properties) &&
        Objects.equals(this.script, processor.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorType, properties, script);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor {\n");
    
    sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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