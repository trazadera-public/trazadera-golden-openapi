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
import com.trazadera.golden.restclient.model.Recipient;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Represents a request to export data from a table
 */
@Schema(description = "Represents a request to export data from a table")

public class TableOperationTransformRequestDto {
  @SerializedName("source")
  private String source = null;

  @SerializedName("transformation")
  private String transformation = null;

  @SerializedName("pipeline")
  private String pipeline = null;

  @SerializedName("maxRecords")
  private Integer maxRecords = null;

  @SerializedName("sampleRecords")
  private Integer sampleRecords = null;

  @SerializedName("notification")
  private Recipient notification = null;

  public TableOperationTransformRequestDto source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source or table identifier. Must exist.
   * @return source
  **/
  @Schema(required = true, description = "Source or table identifier. Must exist.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public TableOperationTransformRequestDto transformation(String transformation) {
    this.transformation = transformation;
    return this;
  }

   /**
   * Optional transformation name. If indicated, the transformation will be applied to the source data after reading from the source.
   * @return transformation
  **/
  @Schema(description = "Optional transformation name. If indicated, the transformation will be applied to the source data after reading from the source.")
  public String getTransformation() {
    return transformation;
  }

  public void setTransformation(String transformation) {
    this.transformation = transformation;
  }

  public TableOperationTransformRequestDto pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Optional pipeline identifier. If indicated, the pipeline will be applied after the optional transformation.
   * @return pipeline
  **/
  @Schema(description = "Optional pipeline identifier. If indicated, the pipeline will be applied after the optional transformation.")
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public TableOperationTransformRequestDto maxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
    return this;
  }

   /**
   * Optional maximum number of records to process (use &lt;0  to process all records). Default is -1 (process all source records).
   * @return maxRecords
  **/
  @Schema(description = "Optional maximum number of records to process (use <0  to process all records). Default is -1 (process all source records).")
  public Integer getMaxRecords() {
    return maxRecords;
  }

  public void setMaxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
  }

  public TableOperationTransformRequestDto sampleRecords(Integer sampleRecords) {
    this.sampleRecords = sampleRecords;
    return this;
  }

   /**
   * Optionally use sampling when processing records (use &lt;&#x3D;0 to avoid sampling). Default is -1 (no sampling).
   * @return sampleRecords
  **/
  @Schema(description = "Optionally use sampling when processing records (use <=0 to avoid sampling). Default is -1 (no sampling).")
  public Integer getSampleRecords() {
    return sampleRecords;
  }

  public void setSampleRecords(Integer sampleRecords) {
    this.sampleRecords = sampleRecords;
  }

  public TableOperationTransformRequestDto notification(Recipient notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @Schema(description = "")
  public Recipient getNotification() {
    return notification;
  }

  public void setNotification(Recipient notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableOperationTransformRequestDto tableOperationTransformRequestDto = (TableOperationTransformRequestDto) o;
    return Objects.equals(this.source, tableOperationTransformRequestDto.source) &&
        Objects.equals(this.transformation, tableOperationTransformRequestDto.transformation) &&
        Objects.equals(this.pipeline, tableOperationTransformRequestDto.pipeline) &&
        Objects.equals(this.maxRecords, tableOperationTransformRequestDto.maxRecords) &&
        Objects.equals(this.sampleRecords, tableOperationTransformRequestDto.sampleRecords) &&
        Objects.equals(this.notification, tableOperationTransformRequestDto.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, transformation, pipeline, maxRecords, sampleRecords, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableOperationTransformRequestDto {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
    sb.append("    sampleRecords: ").append(toIndentedString(sampleRecords)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
