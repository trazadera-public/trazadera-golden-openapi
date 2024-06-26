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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Represents an entity.
 */
@Schema(description = "Represents an entity.")

public class EntityDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("automatic")
  private Boolean automatic = null;

  /**
   * Entity status (for duplicates).
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("EMPTY")
    EMPTY("EMPTY"),
    @SerializedName("WORKING")
    WORKING("WORKING"),
    @SerializedName("READY")
    READY("READY"),
    @SerializedName("INCONSISTENT")
    INCONSISTENT("INCONSISTENT"),
    @SerializedName("ERROR")
    ERROR("ERROR");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("dataset")
  private String dataset = null;

  @SerializedName("table")
  private String table = null;

  /**
   * Entity type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("NONE")
    NONE("NONE"),
    @SerializedName("SEARCH")
    SEARCH("SEARCH"),
    @SerializedName("DUPLICATES")
    DUPLICATES("DUPLICATES"),
    @SerializedName("AUTO_DUPLICATES")
    AUTO_DUPLICATES("AUTO_DUPLICATES");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("searches")
  private Boolean searches = null;

  @SerializedName("duplicates")
  private Boolean duplicates = null;

  @SerializedName("indexer")
  private String indexer = null;

  @SerializedName("classifier")
  private String classifier = null;

  @SerializedName("merger")
  private String merger = null;

  @SerializedName("pipeline")
  private String pipeline = null;

  @SerializedName("steward")
  private String steward = null;

  @SerializedName("lastUpdated")
  private Long lastUpdated = null;

  @SerializedName("recordCount")
  private Long recordCount = null;

  @SerializedName("bucketCount")
  private Long bucketCount = null;

  @SerializedName("duplicateBucketCount")
  private Long duplicateBucketCount = null;

  @SerializedName("indexDuplicateCounts")
  private Map<String, Long> indexDuplicateCounts = null;

  @SerializedName("indexLabels")
  private Map<String, String> indexLabels = null;

  @SerializedName("events")
  private Boolean events = null;

  @SerializedName("eventSink")
  private String eventSink = null;

  public EntityDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entity identifier.
   * @return id
  **/
  @Schema(description = "Entity identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntityDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Entity description.
   * @return description
  **/
  @Schema(description = "Entity description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EntityDto locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Locked flag.
   * @return locked
  **/
  @Schema(description = "Locked flag.")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public EntityDto automatic(Boolean automatic) {
    this.automatic = automatic;
    return this;
  }

   /**
   * Automatic management flag.
   * @return automatic
  **/
  @Schema(description = "Automatic management flag.")
  public Boolean isAutomatic() {
    return automatic;
  }

  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  public EntityDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Entity status (for duplicates).
   * @return status
  **/
  @Schema(description = "Entity status (for duplicates).")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EntityDto dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * Associated dataset.
   * @return dataset
  **/
  @Schema(description = "Associated dataset.")
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public EntityDto table(String table) {
    this.table = table;
    return this;
  }

   /**
   * Associated table.
   * @return table
  **/
  @Schema(description = "Associated table.")
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public EntityDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Entity type.
   * @return type
  **/
  @Schema(description = "Entity type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EntityDto searches(Boolean searches) {
    this.searches = searches;
    return this;
  }

   /**
   * Entity supports searches flag.
   * @return searches
  **/
  @Schema(description = "Entity supports searches flag.")
  public Boolean isSearches() {
    return searches;
  }

  public void setSearches(Boolean searches) {
    this.searches = searches;
  }

  public EntityDto duplicates(Boolean duplicates) {
    this.duplicates = duplicates;
    return this;
  }

   /**
   * Entity supports duplicates flag.
   * @return duplicates
  **/
  @Schema(description = "Entity supports duplicates flag.")
  public Boolean isDuplicates() {
    return duplicates;
  }

  public void setDuplicates(Boolean duplicates) {
    this.duplicates = duplicates;
  }

  public EntityDto indexer(String indexer) {
    this.indexer = indexer;
    return this;
  }

   /**
   * Associated indexer.
   * @return indexer
  **/
  @Schema(description = "Associated indexer.")
  public String getIndexer() {
    return indexer;
  }

  public void setIndexer(String indexer) {
    this.indexer = indexer;
  }

  public EntityDto classifier(String classifier) {
    this.classifier = classifier;
    return this;
  }

   /**
   * Associated classifier.
   * @return classifier
  **/
  @Schema(description = "Associated classifier.")
  public String getClassifier() {
    return classifier;
  }

  public void setClassifier(String classifier) {
    this.classifier = classifier;
  }

  public EntityDto merger(String merger) {
    this.merger = merger;
    return this;
  }

   /**
   * Associated merger.
   * @return merger
  **/
  @Schema(description = "Associated merger.")
  public String getMerger() {
    return merger;
  }

  public void setMerger(String merger) {
    this.merger = merger;
  }

  public EntityDto pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Associated pipeline.
   * @return pipeline
  **/
  @Schema(description = "Associated pipeline.")
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public EntityDto steward(String steward) {
    this.steward = steward;
    return this;
  }

   /**
   * Associated steward.
   * @return steward
  **/
  @Schema(description = "Associated steward.")
  public String getSteward() {
    return steward;
  }

  public void setSteward(String steward) {
    this.steward = steward;
  }

  public EntityDto lastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Last updated timestamp.
   * @return lastUpdated
  **/
  @Schema(description = "Last updated timestamp.")
  public Long getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public EntityDto recordCount(Long recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Number of managed records.
   * @return recordCount
  **/
  @Schema(description = "Number of managed records.")
  public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }

  public EntityDto bucketCount(Long bucketCount) {
    this.bucketCount = bucketCount;
    return this;
  }

   /**
   * Number of managed buckets.
   * @return bucketCount
  **/
  @Schema(description = "Number of managed buckets.")
  public Long getBucketCount() {
    return bucketCount;
  }

  public void setBucketCount(Long bucketCount) {
    this.bucketCount = bucketCount;
  }

  public EntityDto duplicateBucketCount(Long duplicateBucketCount) {
    this.duplicateBucketCount = duplicateBucketCount;
    return this;
  }

   /**
   * Number of potential duplicate buckets.
   * @return duplicateBucketCount
  **/
  @Schema(description = "Number of potential duplicate buckets.")
  public Long getDuplicateBucketCount() {
    return duplicateBucketCount;
  }

  public void setDuplicateBucketCount(Long duplicateBucketCount) {
    this.duplicateBucketCount = duplicateBucketCount;
  }

  public EntityDto indexDuplicateCounts(Map<String, Long> indexDuplicateCounts) {
    this.indexDuplicateCounts = indexDuplicateCounts;
    return this;
  }

  public EntityDto putIndexDuplicateCountsItem(String key, Long indexDuplicateCountsItem) {
    if (this.indexDuplicateCounts == null) {
      this.indexDuplicateCounts = new HashMap<String, Long>();
    }
    this.indexDuplicateCounts.put(key, indexDuplicateCountsItem);
    return this;
  }

   /**
   * Number of potential duplicate buckets.
   * @return indexDuplicateCounts
  **/
  @Schema(description = "Number of potential duplicate buckets.")
  public Map<String, Long> getIndexDuplicateCounts() {
    return indexDuplicateCounts;
  }

  public void setIndexDuplicateCounts(Map<String, Long> indexDuplicateCounts) {
    this.indexDuplicateCounts = indexDuplicateCounts;
  }

  public EntityDto indexLabels(Map<String, String> indexLabels) {
    this.indexLabels = indexLabels;
    return this;
  }

  public EntityDto putIndexLabelsItem(String key, String indexLabelsItem) {
    if (this.indexLabels == null) {
      this.indexLabels = new HashMap<String, String>();
    }
    this.indexLabels.put(key, indexLabelsItem);
    return this;
  }

   /**
   * Index description.
   * @return indexLabels
  **/
  @Schema(description = "Index description.")
  public Map<String, String> getIndexLabels() {
    return indexLabels;
  }

  public void setIndexLabels(Map<String, String> indexLabels) {
    this.indexLabels = indexLabels;
  }

  public EntityDto events(Boolean events) {
    this.events = events;
    return this;
  }

   /**
   * Events supported flag.
   * @return events
  **/
  @Schema(description = "Events supported flag.")
  public Boolean isEvents() {
    return events;
  }

  public void setEvents(Boolean events) {
    this.events = events;
  }

  public EntityDto eventSink(String eventSink) {
    this.eventSink = eventSink;
    return this;
  }

   /**
   * Event sink name.
   * @return eventSink
  **/
  @Schema(description = "Event sink name.")
  public String getEventSink() {
    return eventSink;
  }

  public void setEventSink(String eventSink) {
    this.eventSink = eventSink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDto entityDto = (EntityDto) o;
    return Objects.equals(this.id, entityDto.id) &&
        Objects.equals(this.description, entityDto.description) &&
        Objects.equals(this.locked, entityDto.locked) &&
        Objects.equals(this.automatic, entityDto.automatic) &&
        Objects.equals(this.status, entityDto.status) &&
        Objects.equals(this.dataset, entityDto.dataset) &&
        Objects.equals(this.table, entityDto.table) &&
        Objects.equals(this.type, entityDto.type) &&
        Objects.equals(this.searches, entityDto.searches) &&
        Objects.equals(this.duplicates, entityDto.duplicates) &&
        Objects.equals(this.indexer, entityDto.indexer) &&
        Objects.equals(this.classifier, entityDto.classifier) &&
        Objects.equals(this.merger, entityDto.merger) &&
        Objects.equals(this.pipeline, entityDto.pipeline) &&
        Objects.equals(this.steward, entityDto.steward) &&
        Objects.equals(this.lastUpdated, entityDto.lastUpdated) &&
        Objects.equals(this.recordCount, entityDto.recordCount) &&
        Objects.equals(this.bucketCount, entityDto.bucketCount) &&
        Objects.equals(this.duplicateBucketCount, entityDto.duplicateBucketCount) &&
        Objects.equals(this.indexDuplicateCounts, entityDto.indexDuplicateCounts) &&
        Objects.equals(this.indexLabels, entityDto.indexLabels) &&
        Objects.equals(this.events, entityDto.events) &&
        Objects.equals(this.eventSink, entityDto.eventSink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, locked, automatic, status, dataset, table, type, searches, duplicates, indexer, classifier, merger, pipeline, steward, lastUpdated, recordCount, bucketCount, duplicateBucketCount, indexDuplicateCounts, indexLabels, events, eventSink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
    sb.append("    duplicates: ").append(toIndentedString(duplicates)).append("\n");
    sb.append("    indexer: ").append(toIndentedString(indexer)).append("\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    merger: ").append(toIndentedString(merger)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    steward: ").append(toIndentedString(steward)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    bucketCount: ").append(toIndentedString(bucketCount)).append("\n");
    sb.append("    duplicateBucketCount: ").append(toIndentedString(duplicateBucketCount)).append("\n");
    sb.append("    indexDuplicateCounts: ").append(toIndentedString(indexDuplicateCounts)).append("\n");
    sb.append("    indexLabels: ").append(toIndentedString(indexLabels)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    eventSink: ").append(toIndentedString(eventSink)).append("\n");
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
