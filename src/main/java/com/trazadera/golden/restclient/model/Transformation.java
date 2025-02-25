/*
 * GOLDEN-API
 * Trazadera Golden API
 *
 * OpenAPI spec version: 16-SNAPSHOT
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
import com.trazadera.golden.restclient.model.Dependency;
import com.trazadera.golden.restclient.model.Resource;
import com.trazadera.golden.restclient.model.TransformationMapping;
import com.trazadera.golden.restclient.model.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * A transformation is a resource that maps data from a source dataset to a target dataset.
 */
@Schema(description = "A transformation is a resource that maps data from a source dataset to a target dataset.")

public class Transformation extends Resource implements OneOfResourceExchangeDtoResourcesItems, OneOfResourceListResponseDtoResourcesItems, OneOfResourceResponseDtoResource {
  @SerializedName("source")
  private String source = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("carryOverMetadata")
  private Boolean carryOverMetadata = null;

  @SerializedName("carryOverData")
  private Boolean carryOverData = null;

  /**
   * The type of transformation mapping. Either by colums or using a custom script.
   */
  @JsonAdapter(TransformationTypeEnum.Adapter.class)
  public enum TransformationTypeEnum {
    @SerializedName("MAPPINGS (Mapped columns)")
    MAPPINGS_MAPPED_COLUMNS_("MAPPINGS (Mapped columns)"),
    @SerializedName("SCRIPT (Custom script)")
    SCRIPT_CUSTOM_SCRIPT_("SCRIPT (Custom script)");

    private String value;

    TransformationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TransformationTypeEnum fromValue(String input) {
      for (TransformationTypeEnum b : TransformationTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TransformationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransformationTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TransformationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TransformationTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("transformationType")
  private TransformationTypeEnum transformationType = null;

  @SerializedName("script")
  private String script = null;

  @SerializedName("mappings")
  private List<TransformationMapping> mappings = new ArrayList<TransformationMapping>();

  public Transformation source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source dataset identifier.
   * @return source
  **/
  @Schema(required = true, description = "The source dataset identifier.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Transformation target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The target dataset identifier.
   * @return target
  **/
  @Schema(required = true, description = "The target dataset identifier.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Transformation carryOverMetadata(Boolean carryOverMetadata) {
    this.carryOverMetadata = carryOverMetadata;
    return this;
  }

   /**
   * Carry over (copy) metadata from source to target.
   * @return carryOverMetadata
  **/
  @Schema(description = "Carry over (copy) metadata from source to target.")
  public Boolean isCarryOverMetadata() {
    return carryOverMetadata;
  }

  public void setCarryOverMetadata(Boolean carryOverMetadata) {
    this.carryOverMetadata = carryOverMetadata;
  }

  public Transformation carryOverData(Boolean carryOverData) {
    this.carryOverData = carryOverData;
    return this;
  }

   /**
   * Carry over (copy) data from source to target.
   * @return carryOverData
  **/
  @Schema(description = "Carry over (copy) data from source to target.")
  public Boolean isCarryOverData() {
    return carryOverData;
  }

  public void setCarryOverData(Boolean carryOverData) {
    this.carryOverData = carryOverData;
  }

  public Transformation transformationType(TransformationTypeEnum transformationType) {
    this.transformationType = transformationType;
    return this;
  }

   /**
   * The type of transformation mapping. Either by colums or using a custom script.
   * @return transformationType
  **/
  @Schema(description = "The type of transformation mapping. Either by colums or using a custom script.")
  public TransformationTypeEnum getTransformationType() {
    return transformationType;
  }

  public void setTransformationType(TransformationTypeEnum transformationType) {
    this.transformationType = transformationType;
  }

  public Transformation script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Optional transformation script.
   * @return script
  **/
  @Schema(description = "Optional transformation script.")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }

  public Transformation mappings(List<TransformationMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public Transformation addMappingsItem(TransformationMapping mappingsItem) {
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * The transformation mappings.
   * @return mappings
  **/
  @Schema(required = true, description = "The transformation mappings.")
  public List<TransformationMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<TransformationMapping> mappings) {
    this.mappings = mappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transformation transformation = (Transformation) o;
    return Objects.equals(this.source, transformation.source) &&
        Objects.equals(this.target, transformation.target) &&
        Objects.equals(this.carryOverMetadata, transformation.carryOverMetadata) &&
        Objects.equals(this.carryOverData, transformation.carryOverData) &&
        Objects.equals(this.transformationType, transformation.transformationType) &&
        Objects.equals(this.script, transformation.script) &&
        Objects.equals(this.mappings, transformation.mappings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target, carryOverMetadata, carryOverData, transformationType, script, mappings, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transformation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    carryOverMetadata: ").append(toIndentedString(carryOverMetadata)).append("\n");
    sb.append("    carryOverData: ").append(toIndentedString(carryOverData)).append("\n");
    sb.append("    transformationType: ").append(toIndentedString(transformationType)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
