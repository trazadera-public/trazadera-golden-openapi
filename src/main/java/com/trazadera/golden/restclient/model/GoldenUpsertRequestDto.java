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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Represents a record upsert (update or insert) request
 */
@Schema(description = "Represents a record upsert (update or insert) request")

public class GoldenUpsertRequestDto {
  @SerializedName("transformation")
  private String transformation = null;

  @SerializedName("record")
  private Map<String, Object> record = new HashMap<String, Object>();

  public GoldenUpsertRequestDto transformation(String transformation) {
    this.transformation = transformation;
    return this;
  }

   /**
   * Optional transformation name. If indicated, the transformation must exist and will be applied to the search record before searching.
   * @return transformation
  **/
  @Schema(description = "Optional transformation name. If indicated, the transformation must exist and will be applied to the search record before searching.")
  public String getTransformation() {
    return transformation;
  }

  public void setTransformation(String transformation) {
    this.transformation = transformation;
  }

  public GoldenUpsertRequestDto record(Map<String, Object> record) {
    this.record = record;
    return this;
  }

  public GoldenUpsertRequestDto putRecordItem(String key, Object recordItem) {
    this.record.put(key, recordItem);
    return this;
  }

   /**
   * A record is a document with a unique identifier that is used as the core of Golden and represents a data record.
   * @return record
  **/
  @Schema(required = true, description = "A record is a document with a unique identifier that is used as the core of Golden and represents a data record.")
  public Map<String, Object> getRecord() {
    return record;
  }

  public void setRecord(Map<String, Object> record) {
    this.record = record;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoldenUpsertRequestDto goldenUpsertRequestDto = (GoldenUpsertRequestDto) o;
    return Objects.equals(this.transformation, goldenUpsertRequestDto.transformation) &&
        Objects.equals(this.record, goldenUpsertRequestDto.record);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transformation, record);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoldenUpsertRequestDto {\n");
    
    sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
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