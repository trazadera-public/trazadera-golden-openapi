/*
 * GOLDEN-API
 * Trazadera Golden API
 *
 * OpenAPI spec version: v1
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
 * Represents a lightweight bucket.
 */
@Schema(description = "Represents a lightweight bucket.")

public class GoldenBucketLightResponseDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("score")
  private Integer score = null;

  @SerializedName("deviation")
  private Integer deviation = null;

  /**
   * Classification outcome for a bucket.
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

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public GoldenBucketLightResponseDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Bucket identifier.
   * @return id
  **/
  @Schema(description = "Bucket identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GoldenBucketLightResponseDto key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Bucket key.
   * @return key
  **/
  @Schema(description = "Bucket key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public GoldenBucketLightResponseDto score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Bucket score.
   * @return score
  **/
  @Schema(description = "Bucket score.")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public GoldenBucketLightResponseDto deviation(Integer deviation) {
    this.deviation = deviation;
    return this;
  }

   /**
   * Bucket deviation.
   * @return deviation
  **/
  @Schema(description = "Bucket deviation.")
  public Integer getDeviation() {
    return deviation;
  }

  public void setDeviation(Integer deviation) {
    this.deviation = deviation;
  }

  public GoldenBucketLightResponseDto classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Classification outcome for a bucket.
   * @return classification
  **/
  @Schema(description = "Classification outcome for a bucket.")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public GoldenBucketLightResponseDto count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of records in the bucket.
   * @return count
  **/
  @Schema(description = "Number of records in the bucket.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GoldenBucketLightResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public GoldenBucketLightResponseDto addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors.
   * @return errors
  **/
  @Schema(description = "List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public GoldenBucketLightResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public GoldenBucketLightResponseDto addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<String>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Optional success messages. If present, the request was successful and response code will be 2xx.
   * @return messages
  **/
  @Schema(description = "Optional success messages. If present, the request was successful and response code will be 2xx.")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoldenBucketLightResponseDto goldenBucketLightResponseDto = (GoldenBucketLightResponseDto) o;
    return Objects.equals(this.id, goldenBucketLightResponseDto.id) &&
        Objects.equals(this.key, goldenBucketLightResponseDto.key) &&
        Objects.equals(this.score, goldenBucketLightResponseDto.score) &&
        Objects.equals(this.deviation, goldenBucketLightResponseDto.deviation) &&
        Objects.equals(this.classification, goldenBucketLightResponseDto.classification) &&
        Objects.equals(this.count, goldenBucketLightResponseDto.count) &&
        Objects.equals(this.errors, goldenBucketLightResponseDto.errors) &&
        Objects.equals(this.messages, goldenBucketLightResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, score, deviation, classification, count, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoldenBucketLightResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    deviation: ").append(toIndentedString(deviation)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
