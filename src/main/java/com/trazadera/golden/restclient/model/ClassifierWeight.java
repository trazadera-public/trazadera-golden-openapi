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
import com.trazadera.golden.restclient.model.ClassifierWeightMapping;
import com.trazadera.golden.restclient.model.Dependency;
import com.trazadera.golden.restclient.model.Resource;
import com.trazadera.golden.restclient.model.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Weighted classifier is a resource that classifies records according to classification mappings and weights.
 */
@Schema(description = "Weighted classifier is a resource that classifies records according to classification mappings and weights.")

public class ClassifierWeight extends Resource implements OneOfResourceExchangeDtoResourcesItems, OneOfResourceListResponseDtoResourcesItems, OneOfResourceResponseDtoResource {
  @SerializedName("dataset")
  private String dataset = null;

  @SerializedName("nonMatchThreshold")
  private Double nonMatchThreshold = null;

  @SerializedName("matchThreshold")
  private Double matchThreshold = null;

  @SerializedName("bucketSizeReviewThreshold")
  private Integer bucketSizeReviewThreshold = null;

  @SerializedName("defaultWeight")
  private Double defaultWeight = null;

  /**
   * A text option is a transformation that can be applied to a text to normalize it.
   */
  @JsonAdapter(DefaultOptionsEnum.Adapter.class)
  public enum DefaultOptionsEnum {
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

    DefaultOptionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DefaultOptionsEnum fromValue(String input) {
      for (DefaultOptionsEnum b : DefaultOptionsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DefaultOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultOptionsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DefaultOptionsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DefaultOptionsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("defaultOptions")
  private List<DefaultOptionsEnum> defaultOptions = null;

  @SerializedName("mappings")
  private List<ClassifierWeightMapping> mappings = new ArrayList<ClassifierWeightMapping>();

  public ClassifierWeight dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * The dataset to use.
   * @return dataset
  **/
  @Schema(description = "The dataset to use.")
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public ClassifierWeight nonMatchThreshold(Double nonMatchThreshold) {
    this.nonMatchThreshold = nonMatchThreshold;
    return this;
  }

   /**
   * Lower threshold to consider a non-match. Any score below this threshold will be considered a non-match.
   * @return nonMatchThreshold
  **/
  @Schema(description = "Lower threshold to consider a non-match. Any score below this threshold will be considered a non-match.")
  public Double getNonMatchThreshold() {
    return nonMatchThreshold;
  }

  public void setNonMatchThreshold(Double nonMatchThreshold) {
    this.nonMatchThreshold = nonMatchThreshold;
  }

  public ClassifierWeight matchThreshold(Double matchThreshold) {
    this.matchThreshold = matchThreshold;
    return this;
  }

   /**
   * Upper threshold to consider a match. Any score above this threshold will be considered a match.
   * @return matchThreshold
  **/
  @Schema(description = "Upper threshold to consider a match. Any score above this threshold will be considered a match.")
  public Double getMatchThreshold() {
    return matchThreshold;
  }

  public void setMatchThreshold(Double matchThreshold) {
    this.matchThreshold = matchThreshold;
  }

  public ClassifierWeight bucketSizeReviewThreshold(Integer bucketSizeReviewThreshold) {
    this.bucketSizeReviewThreshold = bucketSizeReviewThreshold;
    return this;
  }

   /**
   * Bucket size review threshold. If a bucket has more records than this threshold, it will marked to be reviewed.
   * @return bucketSizeReviewThreshold
  **/
  @Schema(description = "Bucket size review threshold. If a bucket has more records than this threshold, it will marked to be reviewed.")
  public Integer getBucketSizeReviewThreshold() {
    return bucketSizeReviewThreshold;
  }

  public void setBucketSizeReviewThreshold(Integer bucketSizeReviewThreshold) {
    this.bucketSizeReviewThreshold = bucketSizeReviewThreshold;
  }

  public ClassifierWeight defaultWeight(Double defaultWeight) {
    this.defaultWeight = defaultWeight;
    return this;
  }

   /**
   * Default weight used for mappings that do not have a specific weight. By default, 1.0.
   * @return defaultWeight
  **/
  @Schema(description = "Default weight used for mappings that do not have a specific weight. By default, 1.0.")
  public Double getDefaultWeight() {
    return defaultWeight;
  }

  public void setDefaultWeight(Double defaultWeight) {
    this.defaultWeight = defaultWeight;
  }

  public ClassifierWeight defaultOptions(List<DefaultOptionsEnum> defaultOptions) {
    this.defaultOptions = defaultOptions;
    return this;
  }

  public ClassifierWeight addDefaultOptionsItem(DefaultOptionsEnum defaultOptionsItem) {
    if (this.defaultOptions == null) {
      this.defaultOptions = new ArrayList<DefaultOptionsEnum>();
    }
    this.defaultOptions.add(defaultOptionsItem);
    return this;
  }

   /**
   * Default text options used for mappings that do not have specific options. By default, aggressive.
   * @return defaultOptions
  **/
  @Schema(description = "Default text options used for mappings that do not have specific options. By default, aggressive.")
  public List<DefaultOptionsEnum> getDefaultOptions() {
    return defaultOptions;
  }

  public void setDefaultOptions(List<DefaultOptionsEnum> defaultOptions) {
    this.defaultOptions = defaultOptions;
  }

  public ClassifierWeight mappings(List<ClassifierWeightMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public ClassifierWeight addMappingsItem(ClassifierWeightMapping mappingsItem) {
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * List of mappings that define the comparison between columns.
   * @return mappings
  **/
  @Schema(required = true, description = "List of mappings that define the comparison between columns.")
  public List<ClassifierWeightMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<ClassifierWeightMapping> mappings) {
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
    ClassifierWeight classifierWeight = (ClassifierWeight) o;
    return Objects.equals(this.dataset, classifierWeight.dataset) &&
        Objects.equals(this.nonMatchThreshold, classifierWeight.nonMatchThreshold) &&
        Objects.equals(this.matchThreshold, classifierWeight.matchThreshold) &&
        Objects.equals(this.bucketSizeReviewThreshold, classifierWeight.bucketSizeReviewThreshold) &&
        Objects.equals(this.defaultWeight, classifierWeight.defaultWeight) &&
        Objects.equals(this.defaultOptions, classifierWeight.defaultOptions) &&
        Objects.equals(this.mappings, classifierWeight.mappings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, nonMatchThreshold, matchThreshold, bucketSizeReviewThreshold, defaultWeight, defaultOptions, mappings, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifierWeight {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    nonMatchThreshold: ").append(toIndentedString(nonMatchThreshold)).append("\n");
    sb.append("    matchThreshold: ").append(toIndentedString(matchThreshold)).append("\n");
    sb.append("    bucketSizeReviewThreshold: ").append(toIndentedString(bucketSizeReviewThreshold)).append("\n");
    sb.append("    defaultWeight: ").append(toIndentedString(defaultWeight)).append("\n");
    sb.append("    defaultOptions: ").append(toIndentedString(defaultOptions)).append("\n");
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
