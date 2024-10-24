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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A weight classifier mapping is a mapping between columns of a record that are compared to retrieve a weighted score.
 */
@Schema(description = "A weight classifier mapping is a mapping between columns of a record that are compared to retrieve a weighted score.")

public class ClassifierWeightMapping {
  @SerializedName("id")
  private String id = null;

  @SerializedName("keys")
  private List<String> keys = null;

  @SerializedName("weight")
  private Double weight = null;

  /**
   * A text option is a transformation that can be applied to a text to normalize it.
   */
  @JsonAdapter(OptionsEnum.Adapter.class)
  public enum OptionsEnum {
    @SerializedName("NONE")
    NONE("NONE"),
    @SerializedName("IGNORE_CASE")
    IGNORE_CASE("IGNORE_CASE"),
    @SerializedName("IGNORE_SPACES")
    IGNORE_SPACES("IGNORE_SPACES"),
    @SerializedName("ONLY_ALPHANUMERIC")
    ONLY_ALPHANUMERIC("ONLY_ALPHANUMERIC"),
    @SerializedName("IGNORE_ACCENTS")
    IGNORE_ACCENTS("IGNORE_ACCENTS"),
    @SerializedName("AGGRESSIVE")
    AGGRESSIVE("AGGRESSIVE");

    private String value;

    OptionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OptionsEnum fromValue(String input) {
      for (OptionsEnum b : OptionsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OptionsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OptionsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OptionsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("options")
  private List<OptionsEnum> options = null;

  @SerializedName("object")
  private Boolean object = null;

  @SerializedName("threshold")
  private Integer threshold = null;

  public ClassifierWeightMapping id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the weight classifier mapping.
   * @return id
  **/
  @Schema(description = "The identifier of the weight classifier mapping.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClassifierWeightMapping keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public ClassifierWeightMapping addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<String>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * The column(s) of the record that are compared.
   * @return keys
  **/
  @Schema(description = "The column(s) of the record that are compared.")
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public ClassifierWeightMapping weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the mapping.
   * @return weight
  **/
  @Schema(description = "The weight of the mapping.")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ClassifierWeightMapping options(List<OptionsEnum> options) {
    this.options = options;
    return this;
  }

  public ClassifierWeightMapping addOptionsItem(OptionsEnum optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<OptionsEnum>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The options used for the comparison.
   * @return options
  **/
  @Schema(description = "The options used for the comparison.")
  public List<OptionsEnum> getOptions() {
    return options;
  }

  public void setOptions(List<OptionsEnum> options) {
    this.options = options;
  }

  public ClassifierWeightMapping object(Boolean object) {
    this.object = object;
    return this;
  }

   /**
   * Whether the comparison is an object comparison. By default is not.
   * @return object
  **/
  @Schema(description = "Whether the comparison is an object comparison. By default is not.")
  public Boolean isObject() {
    return object;
  }

  public void setObject(Boolean object) {
    this.object = object;
  }

  public ClassifierWeightMapping threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * The threshold for object comparison. By default is 50.
   * @return threshold
  **/
  @Schema(description = "The threshold for object comparison. By default is 50.")
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassifierWeightMapping classifierWeightMapping = (ClassifierWeightMapping) o;
    return Objects.equals(this.id, classifierWeightMapping.id) &&
        Objects.equals(this.keys, classifierWeightMapping.keys) &&
        Objects.equals(this.weight, classifierWeightMapping.weight) &&
        Objects.equals(this.options, classifierWeightMapping.options) &&
        Objects.equals(this.object, classifierWeightMapping.object) &&
        Objects.equals(this.threshold, classifierWeightMapping.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keys, weight, options, object, threshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifierWeightMapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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