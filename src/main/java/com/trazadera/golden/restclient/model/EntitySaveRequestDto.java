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
import com.trazadera.golden.restclient.model.EntityResourceTransformationSinkDto;
import com.trazadera.golden.restclient.model.EntityResourceTransformationSourceDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Entity save object
 */
@Schema(description = "Entity save object")

public class EntitySaveRequestDto {
  @SerializedName("create")
  private Boolean create = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("table")
  private String table = null;

  @SerializedName("pipeline")
  private String pipeline = null;

  /**
   * The type of entity.
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

  @SerializedName("indexer")
  private String indexer = null;

  @SerializedName("classifier")
  private String classifier = null;

  @SerializedName("merger")
  private String merger = null;

  @SerializedName("steward")
  private String steward = null;

  /**
   * Steward cron scheduling type.
   */
  @JsonAdapter(StewardCronTypeEnum.Adapter.class)
  public enum StewardCronTypeEnum {
    @SerializedName("EVERY_5_MINUTES")
    EVERY_5_MINUTES("EVERY_5_MINUTES"),
    @SerializedName("EVERY_15_MINUTES")
    EVERY_15_MINUTES("EVERY_15_MINUTES"),
    @SerializedName("EVERY_30_MINUTES")
    EVERY_30_MINUTES("EVERY_30_MINUTES"),
    @SerializedName("EVERY_HOUR")
    EVERY_HOUR("EVERY_HOUR"),
    @SerializedName("EVERY_DAY_AT_2AM")
    EVERY_DAY_AT_2AM("EVERY_DAY_AT_2AM"),
    @SerializedName("EXPERT")
    EXPERT("EXPERT");

    private String value;

    StewardCronTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StewardCronTypeEnum fromValue(String input) {
      for (StewardCronTypeEnum b : StewardCronTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StewardCronTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StewardCronTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StewardCronTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StewardCronTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("stewardCronType")
  private StewardCronTypeEnum stewardCronType = null;

  @SerializedName("stewardCron")
  private String stewardCron = null;

  @SerializedName("sources")
  private List<EntityResourceTransformationSourceDto> sources = null;

  @SerializedName("sinks")
  private List<EntityResourceTransformationSinkDto> sinks = null;

  public EntitySaveRequestDto create(Boolean create) {
    this.create = create;
    return this;
  }

   /**
   * Create entity flag. Default is true. If not set, the entity is meant to be updated.
   * @return create
  **/
  @Schema(description = "Create entity flag. Default is true. If not set, the entity is meant to be updated.")
  public Boolean isCreate() {
    return create;
  }

  public void setCreate(Boolean create) {
    this.create = create;
  }

  public EntitySaveRequestDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entity identifier
   * @return id
  **/
  @Schema(description = "Entity identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntitySaveRequestDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Entity description
   * @return description
  **/
  @Schema(description = "Entity description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EntitySaveRequestDto table(String table) {
    this.table = table;
    return this;
  }

   /**
   * Table identifier
   * @return table
  **/
  @Schema(description = "Table identifier")
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public EntitySaveRequestDto pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Pipeline identifier
   * @return pipeline
  **/
  @Schema(description = "Pipeline identifier")
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public EntitySaveRequestDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of entity.
   * @return type
  **/
  @Schema(description = "The type of entity.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EntitySaveRequestDto indexer(String indexer) {
    this.indexer = indexer;
    return this;
  }

   /**
   * Indexer identifier
   * @return indexer
  **/
  @Schema(description = "Indexer identifier")
  public String getIndexer() {
    return indexer;
  }

  public void setIndexer(String indexer) {
    this.indexer = indexer;
  }

  public EntitySaveRequestDto classifier(String classifier) {
    this.classifier = classifier;
    return this;
  }

   /**
   * Classifier identifier
   * @return classifier
  **/
  @Schema(description = "Classifier identifier")
  public String getClassifier() {
    return classifier;
  }

  public void setClassifier(String classifier) {
    this.classifier = classifier;
  }

  public EntitySaveRequestDto merger(String merger) {
    this.merger = merger;
    return this;
  }

   /**
   * Merger identifier
   * @return merger
  **/
  @Schema(description = "Merger identifier")
  public String getMerger() {
    return merger;
  }

  public void setMerger(String merger) {
    this.merger = merger;
  }

  public EntitySaveRequestDto steward(String steward) {
    this.steward = steward;
    return this;
  }

   /**
   * Steward identifier
   * @return steward
  **/
  @Schema(description = "Steward identifier")
  public String getSteward() {
    return steward;
  }

  public void setSteward(String steward) {
    this.steward = steward;
  }

  public EntitySaveRequestDto stewardCronType(StewardCronTypeEnum stewardCronType) {
    this.stewardCronType = stewardCronType;
    return this;
  }

   /**
   * Steward cron scheduling type.
   * @return stewardCronType
  **/
  @Schema(description = "Steward cron scheduling type.")
  public StewardCronTypeEnum getStewardCronType() {
    return stewardCronType;
  }

  public void setStewardCronType(StewardCronTypeEnum stewardCronType) {
    this.stewardCronType = stewardCronType;
  }

  public EntitySaveRequestDto stewardCron(String stewardCron) {
    this.stewardCron = stewardCron;
    return this;
  }

   /**
   * Steward cron scheduling expression.
   * @return stewardCron
  **/
  @Schema(description = "Steward cron scheduling expression.")
  public String getStewardCron() {
    return stewardCron;
  }

  public void setStewardCron(String stewardCron) {
    this.stewardCron = stewardCron;
  }

  public EntitySaveRequestDto sources(List<EntityResourceTransformationSourceDto> sources) {
    this.sources = sources;
    return this;
  }

  public EntitySaveRequestDto addSourcesItem(EntityResourceTransformationSourceDto sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<EntityResourceTransformationSourceDto>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Sources.
   * @return sources
  **/
  @Schema(description = "Sources.")
  public List<EntityResourceTransformationSourceDto> getSources() {
    return sources;
  }

  public void setSources(List<EntityResourceTransformationSourceDto> sources) {
    this.sources = sources;
  }

  public EntitySaveRequestDto sinks(List<EntityResourceTransformationSinkDto> sinks) {
    this.sinks = sinks;
    return this;
  }

  public EntitySaveRequestDto addSinksItem(EntityResourceTransformationSinkDto sinksItem) {
    if (this.sinks == null) {
      this.sinks = new ArrayList<EntityResourceTransformationSinkDto>();
    }
    this.sinks.add(sinksItem);
    return this;
  }

   /**
   * Sinks.
   * @return sinks
  **/
  @Schema(description = "Sinks.")
  public List<EntityResourceTransformationSinkDto> getSinks() {
    return sinks;
  }

  public void setSinks(List<EntityResourceTransformationSinkDto> sinks) {
    this.sinks = sinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitySaveRequestDto entitySaveRequestDto = (EntitySaveRequestDto) o;
    return Objects.equals(this.create, entitySaveRequestDto.create) &&
        Objects.equals(this.id, entitySaveRequestDto.id) &&
        Objects.equals(this.description, entitySaveRequestDto.description) &&
        Objects.equals(this.table, entitySaveRequestDto.table) &&
        Objects.equals(this.pipeline, entitySaveRequestDto.pipeline) &&
        Objects.equals(this.type, entitySaveRequestDto.type) &&
        Objects.equals(this.indexer, entitySaveRequestDto.indexer) &&
        Objects.equals(this.classifier, entitySaveRequestDto.classifier) &&
        Objects.equals(this.merger, entitySaveRequestDto.merger) &&
        Objects.equals(this.steward, entitySaveRequestDto.steward) &&
        Objects.equals(this.stewardCronType, entitySaveRequestDto.stewardCronType) &&
        Objects.equals(this.stewardCron, entitySaveRequestDto.stewardCron) &&
        Objects.equals(this.sources, entitySaveRequestDto.sources) &&
        Objects.equals(this.sinks, entitySaveRequestDto.sinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, id, description, table, pipeline, type, indexer, classifier, merger, steward, stewardCronType, stewardCron, sources, sinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitySaveRequestDto {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    indexer: ").append(toIndentedString(indexer)).append("\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    merger: ").append(toIndentedString(merger)).append("\n");
    sb.append("    steward: ").append(toIndentedString(steward)).append("\n");
    sb.append("    stewardCronType: ").append(toIndentedString(stewardCronType)).append("\n");
    sb.append("    stewardCron: ").append(toIndentedString(stewardCron)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    sinks: ").append(toIndentedString(sinks)).append("\n");
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
