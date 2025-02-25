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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A filtering to apply to the buckets.
 */
@Schema(description = "A filtering to apply to the buckets.")

public class StewardFiltering {
  @SerializedName("index")
  private String index = null;

  /**
   * The classification of a bucket. Used to determine what to do with the bucket.
   */
  @JsonAdapter(ClassificationEnum.Adapter.class)
  public enum ClassificationEnum {
    @SerializedName("MATCH")
    MATCH("MATCH"),
    @SerializedName("NON_MATCH")
    NON_MATCH("NON_MATCH"),
    @SerializedName("REVIEW")
    REVIEW("REVIEW"),
    @SerializedName("IGNORE")
    IGNORE("IGNORE");

    private String value;

    ClassificationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClassificationEnum fromValue(String input) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClassificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassificationEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ClassificationEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ClassificationEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("classification")
  private ClassificationEnum classification = null;

  public StewardFiltering index(String index) {
    this.index = index;
    return this;
  }

   /**
   * The index identifier used to filter. Optional. Default is to consider all indexes.
   * @return index
  **/
  @Schema(description = "The index identifier used to filter. Optional. Default is to consider all indexes.")
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public StewardFiltering classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

   /**
   * The classification of a bucket. Used to determine what to do with the bucket.
   * @return classification
  **/
  @Schema(description = "The classification of a bucket. Used to determine what to do with the bucket.")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StewardFiltering stewardFiltering = (StewardFiltering) o;
    return Objects.equals(this.index, stewardFiltering.index) &&
        Objects.equals(this.classification, stewardFiltering.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, classification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StewardFiltering {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
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
