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
 * A JDBC sink is a resource that writes records to a JDBC database.
 */
@Schema(description = "A JDBC sink is a resource that writes records to a JDBC database.")

public class SinkJdbc extends Resource implements OneOfResourceExchangeDtoResourcesItems, OneOfResourceListResponseDtoResourcesItems, OneOfResourceResponseDtoResource {
  @SerializedName("dataset")
  private String dataset = null;

  @SerializedName("timeoutMs")
  private Integer timeoutMs = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("credentials")
  private String credentials = null;

  @SerializedName("properties")
  private List<Option> properties = null;

  @SerializedName("table")
  private String table = null;

  @SerializedName("logicalDelete")
  private Boolean logicalDelete = null;

  @SerializedName("operationColumn")
  private String operationColumn = null;

  @SerializedName("writeTimestampFlag")
  private Boolean writeTimestampFlag = null;

  @SerializedName("writeTimestampColumn")
  private String writeTimestampColumn = null;

  @SerializedName("writeIdFlag")
  private Boolean writeIdFlag = null;

  @SerializedName("writeIdColumn")
  private String writeIdColumn = null;

  public SinkJdbc dataset(String dataset) {
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

  public SinkJdbc timeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }

   /**
   * The timeout in milliseconds for writing a record.
   * @return timeoutMs
  **/
  @Schema(required = true, description = "The timeout in milliseconds for writing a record.")
  public Integer getTimeoutMs() {
    return timeoutMs;
  }

  public void setTimeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
  }

  public SinkJdbc url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The JDBC URL to connect to the database.
   * @return url
  **/
  @Schema(required = true, description = "The JDBC URL to connect to the database.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SinkJdbc credentials(String credentials) {
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

  public SinkJdbc properties(List<Option> properties) {
    this.properties = properties;
    return this;
  }

  public SinkJdbc addPropertiesItem(Option propertiesItem) {
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

  public SinkJdbc table(String table) {
    this.table = table;
    return this;
  }

   /**
   * The name of the table to write. Eventually include catalog and schema.
   * @return table
  **/
  @Schema(required = true, description = "The name of the table to write. Eventually include catalog and schema.")
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public SinkJdbc logicalDelete(Boolean logicalDelete) {
    this.logicalDelete = logicalDelete;
    return this;
  }

   /**
   * Flag to enable logical delete. By default, records are physically deleted.
   * @return logicalDelete
  **/
  @Schema(description = "Flag to enable logical delete. By default, records are physically deleted.")
  public Boolean isLogicalDelete() {
    return logicalDelete;
  }

  public void setLogicalDelete(Boolean logicalDelete) {
    this.logicalDelete = logicalDelete;
  }

  public SinkJdbc operationColumn(String operationColumn) {
    this.operationColumn = operationColumn;
    return this;
  }

   /**
   * The column to use for logical delete.
   * @return operationColumn
  **/
  @Schema(description = "The column to use for logical delete.")
  public String getOperationColumn() {
    return operationColumn;
  }

  public void setOperationColumn(String operationColumn) {
    this.operationColumn = operationColumn;
  }

  public SinkJdbc writeTimestampFlag(Boolean writeTimestampFlag) {
    this.writeTimestampFlag = writeTimestampFlag;
    return this;
  }

   /**
   * Flag to enable writing Golden timestamp. False by default.
   * @return writeTimestampFlag
  **/
  @Schema(description = "Flag to enable writing Golden timestamp. False by default.")
  public Boolean isWriteTimestampFlag() {
    return writeTimestampFlag;
  }

  public void setWriteTimestampFlag(Boolean writeTimestampFlag) {
    this.writeTimestampFlag = writeTimestampFlag;
  }

  public SinkJdbc writeTimestampColumn(String writeTimestampColumn) {
    this.writeTimestampColumn = writeTimestampColumn;
    return this;
  }

   /**
   * The column to use for writing Golden timestamp.
   * @return writeTimestampColumn
  **/
  @Schema(description = "The column to use for writing Golden timestamp.")
  public String getWriteTimestampColumn() {
    return writeTimestampColumn;
  }

  public void setWriteTimestampColumn(String writeTimestampColumn) {
    this.writeTimestampColumn = writeTimestampColumn;
  }

  public SinkJdbc writeIdFlag(Boolean writeIdFlag) {
    this.writeIdFlag = writeIdFlag;
    return this;
  }

   /**
   * Flag to enable writing Golden identifier. False by default.
   * @return writeIdFlag
  **/
  @Schema(description = "Flag to enable writing Golden identifier. False by default.")
  public Boolean isWriteIdFlag() {
    return writeIdFlag;
  }

  public void setWriteIdFlag(Boolean writeIdFlag) {
    this.writeIdFlag = writeIdFlag;
  }

  public SinkJdbc writeIdColumn(String writeIdColumn) {
    this.writeIdColumn = writeIdColumn;
    return this;
  }

   /**
   * The column to use for writing Golden identifier.
   * @return writeIdColumn
  **/
  @Schema(description = "The column to use for writing Golden identifier.")
  public String getWriteIdColumn() {
    return writeIdColumn;
  }

  public void setWriteIdColumn(String writeIdColumn) {
    this.writeIdColumn = writeIdColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SinkJdbc sinkJdbc = (SinkJdbc) o;
    return Objects.equals(this.dataset, sinkJdbc.dataset) &&
        Objects.equals(this.timeoutMs, sinkJdbc.timeoutMs) &&
        Objects.equals(this.url, sinkJdbc.url) &&
        Objects.equals(this.credentials, sinkJdbc.credentials) &&
        Objects.equals(this.properties, sinkJdbc.properties) &&
        Objects.equals(this.table, sinkJdbc.table) &&
        Objects.equals(this.logicalDelete, sinkJdbc.logicalDelete) &&
        Objects.equals(this.operationColumn, sinkJdbc.operationColumn) &&
        Objects.equals(this.writeTimestampFlag, sinkJdbc.writeTimestampFlag) &&
        Objects.equals(this.writeTimestampColumn, sinkJdbc.writeTimestampColumn) &&
        Objects.equals(this.writeIdFlag, sinkJdbc.writeIdFlag) &&
        Objects.equals(this.writeIdColumn, sinkJdbc.writeIdColumn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, timeoutMs, url, credentials, properties, table, logicalDelete, operationColumn, writeTimestampFlag, writeTimestampColumn, writeIdFlag, writeIdColumn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinkJdbc {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    logicalDelete: ").append(toIndentedString(logicalDelete)).append("\n");
    sb.append("    operationColumn: ").append(toIndentedString(operationColumn)).append("\n");
    sb.append("    writeTimestampFlag: ").append(toIndentedString(writeTimestampFlag)).append("\n");
    sb.append("    writeTimestampColumn: ").append(toIndentedString(writeTimestampColumn)).append("\n");
    sb.append("    writeIdFlag: ").append(toIndentedString(writeIdFlag)).append("\n");
    sb.append("    writeIdColumn: ").append(toIndentedString(writeIdColumn)).append("\n");
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
