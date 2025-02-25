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
import com.trazadera.golden.restclient.model.Option;
import com.trazadera.golden.restclient.model.Resource;
import com.trazadera.golden.restclient.model.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * A JDBC source is a resource that reads records from a database table using a JDBC connection.
 */
@Schema(description = "A JDBC source is a resource that reads records from a database table using a JDBC connection.")

public class SourceJdbc extends Resource implements OneOfResourceExchangeDtoResourcesItems, OneOfResourceListResponseDtoResourcesItems, OneOfResourceResponseDtoResource {
  @SerializedName("dataset")
  private String dataset = null;

  @SerializedName("fromFilter")
  private OffsetDateTime fromFilter = null;

  @SerializedName("toFilter")
  private OffsetDateTime toFilter = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("credentials")
  private String credentials = null;

  @SerializedName("properties")
  private List<Option> properties = null;

  @SerializedName("table")
  private String table = null;

  @SerializedName("customScripts")
  private Boolean customScripts = null;

  @SerializedName("queryScript")
  private String queryScript = null;

  @SerializedName("countQueryScript")
  private String countQueryScript = null;

  @SerializedName("count")
  private Boolean count = null;

  @SerializedName("timestampFilteringFlag")
  private Boolean timestampFilteringFlag = null;

  @SerializedName("timestampFilteringColumn")
  private String timestampFilteringColumn = null;

  @SerializedName("readTimestampFlag")
  private Boolean readTimestampFlag = null;

  @SerializedName("readTimestampColumn")
  private String readTimestampColumn = null;

  @SerializedName("readIdFlag")
  private Boolean readIdFlag = null;

  @SerializedName("readIdColumn")
  private String readIdColumn = null;

  public SourceJdbc dataset(String dataset) {
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

  public SourceJdbc fromFilter(OffsetDateTime fromFilter) {
    this.fromFilter = fromFilter;
    return this;
  }

   /**
   * The from instant filter (optional).
   * @return fromFilter
  **/
  @Schema(description = "The from instant filter (optional).")
  public OffsetDateTime getFromFilter() {
    return fromFilter;
  }

  public void setFromFilter(OffsetDateTime fromFilter) {
    this.fromFilter = fromFilter;
  }

  public SourceJdbc toFilter(OffsetDateTime toFilter) {
    this.toFilter = toFilter;
    return this;
  }

   /**
   * The to instant filter (optional).
   * @return toFilter
  **/
  @Schema(description = "The to instant filter (optional).")
  public OffsetDateTime getToFilter() {
    return toFilter;
  }

  public void setToFilter(OffsetDateTime toFilter) {
    this.toFilter = toFilter;
  }

  public SourceJdbc url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The JDBC URL of the database.
   * @return url
  **/
  @Schema(required = true, description = "The JDBC URL of the database.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SourceJdbc credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * The credentials to use for the JDBC connection.
   * @return credentials
  **/
  @Schema(description = "The credentials to use for the JDBC connection.")
  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public SourceJdbc properties(List<Option> properties) {
    this.properties = properties;
    return this;
  }

  public SourceJdbc addPropertiesItem(Option propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<Option>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The properties to use for the JDBC connection.
   * @return properties
  **/
  @Schema(description = "The properties to use for the JDBC connection.")
  public List<Option> getProperties() {
    return properties;
  }

  public void setProperties(List<Option> properties) {
    this.properties = properties;
  }

  public SourceJdbc table(String table) {
    this.table = table;
    return this;
  }

   /**
   * The name of the table to read. Eventually include catalog and schema.
   * @return table
  **/
  @Schema(required = true, description = "The name of the table to read. Eventually include catalog and schema.")
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public SourceJdbc customScripts(Boolean customScripts) {
    this.customScripts = customScripts;
    return this;
  }

   /**
   * Flag to enable custom scripts for reading.
   * @return customScripts
  **/
  @Schema(description = "Flag to enable custom scripts for reading.")
  public Boolean isCustomScripts() {
    return customScripts;
  }

  public void setCustomScripts(Boolean customScripts) {
    this.customScripts = customScripts;
  }

  public SourceJdbc queryScript(String queryScript) {
    this.queryScript = queryScript;
    return this;
  }

   /**
   * The custom query script to use for reading.
   * @return queryScript
  **/
  @Schema(description = "The custom query script to use for reading.")
  public String getQueryScript() {
    return queryScript;
  }

  public void setQueryScript(String queryScript) {
    this.queryScript = queryScript;
  }

  public SourceJdbc countQueryScript(String countQueryScript) {
    this.countQueryScript = countQueryScript;
    return this;
  }

   /**
   * The custom count query script to use for reading.
   * @return countQueryScript
  **/
  @Schema(description = "The custom count query script to use for reading.")
  public String getCountQueryScript() {
    return countQueryScript;
  }

  public void setCountQueryScript(String countQueryScript) {
    this.countQueryScript = countQueryScript;
  }

  public SourceJdbc count(Boolean count) {
    this.count = count;
    return this;
  }

   /**
   * Flag to enable count query.
   * @return count
  **/
  @Schema(description = "Flag to enable count query.")
  public Boolean isCount() {
    return count;
  }

  public void setCount(Boolean count) {
    this.count = count;
  }

  public SourceJdbc timestampFilteringFlag(Boolean timestampFilteringFlag) {
    this.timestampFilteringFlag = timestampFilteringFlag;
    return this;
  }

   /**
   * Flag to enable timestamp filtering.
   * @return timestampFilteringFlag
  **/
  @Schema(description = "Flag to enable timestamp filtering.")
  public Boolean isTimestampFilteringFlag() {
    return timestampFilteringFlag;
  }

  public void setTimestampFilteringFlag(Boolean timestampFilteringFlag) {
    this.timestampFilteringFlag = timestampFilteringFlag;
  }

  public SourceJdbc timestampFilteringColumn(String timestampFilteringColumn) {
    this.timestampFilteringColumn = timestampFilteringColumn;
    return this;
  }

   /**
   * The column to use for timestamp filtering.
   * @return timestampFilteringColumn
  **/
  @Schema(description = "The column to use for timestamp filtering.")
  public String getTimestampFilteringColumn() {
    return timestampFilteringColumn;
  }

  public void setTimestampFilteringColumn(String timestampFilteringColumn) {
    this.timestampFilteringColumn = timestampFilteringColumn;
  }

  public SourceJdbc readTimestampFlag(Boolean readTimestampFlag) {
    this.readTimestampFlag = readTimestampFlag;
    return this;
  }

   /**
   * Flag to enable reading Golden timestamp. False by default.
   * @return readTimestampFlag
  **/
  @Schema(description = "Flag to enable reading Golden timestamp. False by default.")
  public Boolean isReadTimestampFlag() {
    return readTimestampFlag;
  }

  public void setReadTimestampFlag(Boolean readTimestampFlag) {
    this.readTimestampFlag = readTimestampFlag;
  }

  public SourceJdbc readTimestampColumn(String readTimestampColumn) {
    this.readTimestampColumn = readTimestampColumn;
    return this;
  }

   /**
   * The column to use for reading Golden timestamp.
   * @return readTimestampColumn
  **/
  @Schema(description = "The column to use for reading Golden timestamp.")
  public String getReadTimestampColumn() {
    return readTimestampColumn;
  }

  public void setReadTimestampColumn(String readTimestampColumn) {
    this.readTimestampColumn = readTimestampColumn;
  }

  public SourceJdbc readIdFlag(Boolean readIdFlag) {
    this.readIdFlag = readIdFlag;
    return this;
  }

   /**
   * Flag to enable reading Golden identifier. False by default.
   * @return readIdFlag
  **/
  @Schema(description = "Flag to enable reading Golden identifier. False by default.")
  public Boolean isReadIdFlag() {
    return readIdFlag;
  }

  public void setReadIdFlag(Boolean readIdFlag) {
    this.readIdFlag = readIdFlag;
  }

  public SourceJdbc readIdColumn(String readIdColumn) {
    this.readIdColumn = readIdColumn;
    return this;
  }

   /**
   * The column to use for reading Golden identifier.
   * @return readIdColumn
  **/
  @Schema(description = "The column to use for reading Golden identifier.")
  public String getReadIdColumn() {
    return readIdColumn;
  }

  public void setReadIdColumn(String readIdColumn) {
    this.readIdColumn = readIdColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceJdbc sourceJdbc = (SourceJdbc) o;
    return Objects.equals(this.dataset, sourceJdbc.dataset) &&
        Objects.equals(this.fromFilter, sourceJdbc.fromFilter) &&
        Objects.equals(this.toFilter, sourceJdbc.toFilter) &&
        Objects.equals(this.url, sourceJdbc.url) &&
        Objects.equals(this.credentials, sourceJdbc.credentials) &&
        Objects.equals(this.properties, sourceJdbc.properties) &&
        Objects.equals(this.table, sourceJdbc.table) &&
        Objects.equals(this.customScripts, sourceJdbc.customScripts) &&
        Objects.equals(this.queryScript, sourceJdbc.queryScript) &&
        Objects.equals(this.countQueryScript, sourceJdbc.countQueryScript) &&
        Objects.equals(this.count, sourceJdbc.count) &&
        Objects.equals(this.timestampFilteringFlag, sourceJdbc.timestampFilteringFlag) &&
        Objects.equals(this.timestampFilteringColumn, sourceJdbc.timestampFilteringColumn) &&
        Objects.equals(this.readTimestampFlag, sourceJdbc.readTimestampFlag) &&
        Objects.equals(this.readTimestampColumn, sourceJdbc.readTimestampColumn) &&
        Objects.equals(this.readIdFlag, sourceJdbc.readIdFlag) &&
        Objects.equals(this.readIdColumn, sourceJdbc.readIdColumn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, fromFilter, toFilter, url, credentials, properties, table, customScripts, queryScript, countQueryScript, count, timestampFilteringFlag, timestampFilteringColumn, readTimestampFlag, readTimestampColumn, readIdFlag, readIdColumn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceJdbc {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    fromFilter: ").append(toIndentedString(fromFilter)).append("\n");
    sb.append("    toFilter: ").append(toIndentedString(toFilter)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    customScripts: ").append(toIndentedString(customScripts)).append("\n");
    sb.append("    queryScript: ").append(toIndentedString(queryScript)).append("\n");
    sb.append("    countQueryScript: ").append(toIndentedString(countQueryScript)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    timestampFilteringFlag: ").append(toIndentedString(timestampFilteringFlag)).append("\n");
    sb.append("    timestampFilteringColumn: ").append(toIndentedString(timestampFilteringColumn)).append("\n");
    sb.append("    readTimestampFlag: ").append(toIndentedString(readTimestampFlag)).append("\n");
    sb.append("    readTimestampColumn: ").append(toIndentedString(readTimestampColumn)).append("\n");
    sb.append("    readIdFlag: ").append(toIndentedString(readIdFlag)).append("\n");
    sb.append("    readIdColumn: ").append(toIndentedString(readIdColumn)).append("\n");
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
