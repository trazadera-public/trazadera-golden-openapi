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
import com.trazadera.golden.restclient.model.EntityDto;
import com.trazadera.golden.restclient.model.Record;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a bucket disconnect response
 */
@Schema(description = "Represents a bucket disconnect response")

public class GoldenDisconnectBucketResponseDto {
  @SerializedName("entity")
  private EntityDto entity = null;

  @SerializedName("records")
  private List<Record> records = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public GoldenDisconnectBucketResponseDto entity(EntityDto entity) {
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

  public GoldenDisconnectBucketResponseDto records(List<Record> records) {
    this.records = records;
    return this;
  }

  public GoldenDisconnectBucketResponseDto addRecordsItem(Record recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Record>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Disconnected records.
   * @return records
  **/
  @Schema(description = "Disconnected records.")
  public List<Record> getRecords() {
    return records;
  }

  public void setRecords(List<Record> records) {
    this.records = records;
  }

  public GoldenDisconnectBucketResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public GoldenDisconnectBucketResponseDto addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors. Otherwise, not present.
   * @return errors
  **/
  @Schema(description = "List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors. Otherwise, not present.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public GoldenDisconnectBucketResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public GoldenDisconnectBucketResponseDto addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<String>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Optional informational messages. If present, the request was successful and response code will be 2xx.
   * @return messages
  **/
  @Schema(description = "Optional informational messages. If present, the request was successful and response code will be 2xx.")
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
    GoldenDisconnectBucketResponseDto goldenDisconnectBucketResponseDto = (GoldenDisconnectBucketResponseDto) o;
    return Objects.equals(this.entity, goldenDisconnectBucketResponseDto.entity) &&
        Objects.equals(this.records, goldenDisconnectBucketResponseDto.records) &&
        Objects.equals(this.errors, goldenDisconnectBucketResponseDto.errors) &&
        Objects.equals(this.messages, goldenDisconnectBucketResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, records, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoldenDisconnectBucketResponseDto {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
