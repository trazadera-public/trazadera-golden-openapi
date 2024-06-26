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
import com.trazadera.golden.restclient.model.ClassificationDetailDto;
import com.trazadera.golden.restclient.model.Column;
import com.trazadera.golden.restclient.model.EntityDto;
import com.trazadera.golden.restclient.model.Record;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Represents a bucket with all available information.
 */
@Schema(description = "Represents a bucket with all available information.")

public class GoldenBucketFullResponseDto {
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

  @SerializedName("entity")
  private EntityDto entity = null;

  @SerializedName("index")
  private String index = null;

  @SerializedName("records")
  private List<Record> records = null;

  @SerializedName("merged")
  private Map<String, Object> merged = null;

  @SerializedName("split")
  private List<Record> split = null;

  @SerializedName("columns")
  private List<String> columns = null;

  @SerializedName("columnMap")
  private Map<String, Column> columnMap = null;

  @SerializedName("details")
  private List<ClassificationDetailDto> details = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public GoldenBucketFullResponseDto id(String id) {
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

  public GoldenBucketFullResponseDto key(String key) {
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

  public GoldenBucketFullResponseDto score(Integer score) {
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

  public GoldenBucketFullResponseDto deviation(Integer deviation) {
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

  public GoldenBucketFullResponseDto classification(ClassificationEnum classification) {
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

  public GoldenBucketFullResponseDto count(Integer count) {
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

  public GoldenBucketFullResponseDto entity(EntityDto entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @Schema(description = "")
  public EntityDto getEntity() {
    return entity;
  }

  public void setEntity(EntityDto entity) {
    this.entity = entity;
  }

  public GoldenBucketFullResponseDto index(String index) {
    this.index = index;
    return this;
  }

   /**
   * Index that created this bucket
   * @return index
  **/
  @Schema(description = "Index that created this bucket")
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public GoldenBucketFullResponseDto records(List<Record> records) {
    this.records = records;
    return this;
  }

  public GoldenBucketFullResponseDto addRecordsItem(Record recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Record>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Records in this bucket
   * @return records
  **/
  @Schema(description = "Records in this bucket")
  public List<Record> getRecords() {
    return records;
  }

  public void setRecords(List<Record> records) {
    this.records = records;
  }

  public GoldenBucketFullResponseDto merged(Map<String, Object> merged) {
    this.merged = merged;
    return this;
  }

  public GoldenBucketFullResponseDto putMergedItem(String key, Object mergedItem) {
    if (this.merged == null) {
      this.merged = new HashMap<String, Object>();
    }
    this.merged.put(key, mergedItem);
    return this;
  }

   /**
   * A record is a document with a unique identifier that is used as the core of Golden and represents a data record.
   * @return merged
  **/
  @Schema(description = "A record is a document with a unique identifier that is used as the core of Golden and represents a data record.")
  public Map<String, Object> getMerged() {
    return merged;
  }

  public void setMerged(Map<String, Object> merged) {
    this.merged = merged;
  }

  public GoldenBucketFullResponseDto split(List<Record> split) {
    this.split = split;
    return this;
  }

  public GoldenBucketFullResponseDto addSplitItem(Record splitItem) {
    if (this.split == null) {
      this.split = new ArrayList<Record>();
    }
    this.split.add(splitItem);
    return this;
  }

   /**
   * Candidates to split records
   * @return split
  **/
  @Schema(description = "Candidates to split records")
  public List<Record> getSplit() {
    return split;
  }

  public void setSplit(List<Record> split) {
    this.split = split;
  }

  public GoldenBucketFullResponseDto columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public GoldenBucketFullResponseDto addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Column names in this bucket
   * @return columns
  **/
  @Schema(description = "Column names in this bucket")
  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public GoldenBucketFullResponseDto columnMap(Map<String, Column> columnMap) {
    this.columnMap = columnMap;
    return this;
  }

  public GoldenBucketFullResponseDto putColumnMapItem(String key, Column columnMapItem) {
    if (this.columnMap == null) {
      this.columnMap = new HashMap<String, Column>();
    }
    this.columnMap.put(key, columnMapItem);
    return this;
  }

   /**
   * Map of columns with detailed information.
   * @return columnMap
  **/
  @Schema(description = "Map of columns with detailed information.")
  public Map<String, Column> getColumnMap() {
    return columnMap;
  }

  public void setColumnMap(Map<String, Column> columnMap) {
    this.columnMap = columnMap;
  }

  public GoldenBucketFullResponseDto details(List<ClassificationDetailDto> details) {
    this.details = details;
    return this;
  }

  public GoldenBucketFullResponseDto addDetailsItem(ClassificationDetailDto detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<ClassificationDetailDto>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Optional classification information
   * @return details
  **/
  @Schema(description = "Optional classification information")
  public List<ClassificationDetailDto> getDetails() {
    return details;
  }

  public void setDetails(List<ClassificationDetailDto> details) {
    this.details = details;
  }

  public GoldenBucketFullResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public GoldenBucketFullResponseDto addErrorsItem(String errorsItem) {
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

  public GoldenBucketFullResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public GoldenBucketFullResponseDto addMessagesItem(String messagesItem) {
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
    GoldenBucketFullResponseDto goldenBucketFullResponseDto = (GoldenBucketFullResponseDto) o;
    return Objects.equals(this.id, goldenBucketFullResponseDto.id) &&
        Objects.equals(this.key, goldenBucketFullResponseDto.key) &&
        Objects.equals(this.score, goldenBucketFullResponseDto.score) &&
        Objects.equals(this.deviation, goldenBucketFullResponseDto.deviation) &&
        Objects.equals(this.classification, goldenBucketFullResponseDto.classification) &&
        Objects.equals(this.count, goldenBucketFullResponseDto.count) &&
        Objects.equals(this.entity, goldenBucketFullResponseDto.entity) &&
        Objects.equals(this.index, goldenBucketFullResponseDto.index) &&
        Objects.equals(this.records, goldenBucketFullResponseDto.records) &&
        Objects.equals(this.merged, goldenBucketFullResponseDto.merged) &&
        Objects.equals(this.split, goldenBucketFullResponseDto.split) &&
        Objects.equals(this.columns, goldenBucketFullResponseDto.columns) &&
        Objects.equals(this.columnMap, goldenBucketFullResponseDto.columnMap) &&
        Objects.equals(this.details, goldenBucketFullResponseDto.details) &&
        Objects.equals(this.errors, goldenBucketFullResponseDto.errors) &&
        Objects.equals(this.messages, goldenBucketFullResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, score, deviation, classification, count, entity, index, records, merged, split, columns, columnMap, details, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoldenBucketFullResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    deviation: ").append(toIndentedString(deviation)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    columnMap: ").append(toIndentedString(columnMap)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
