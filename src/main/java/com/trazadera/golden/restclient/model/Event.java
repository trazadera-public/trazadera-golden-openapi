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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Event
 */
@Schema(description = "Event")

public class Event {
  @SerializedName("id")
  private String id = null;

  @SerializedName("sink")
  private String sink = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("modified")
  private OffsetDateTime modified = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("valid")
  private Boolean valid = null;

  public Event id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Event identifier
   * @return id
  **/
  @Schema(description = "Event identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Event sink(String sink) {
    this.sink = sink;
    return this;
  }

   /**
   * Sink identifier
   * @return sink
  **/
  @Schema(description = "Sink identifier")
  public String getSink() {
    return sink;
  }

  public void setSink(String sink) {
    this.sink = sink;
  }

  public Event payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Event payload
   * @return payload
  **/
  @Schema(description = "Event payload")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public Event created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Event creation timestamp in ISO 8601 format
   * @return created
  **/
  @Schema(description = "Event creation timestamp in ISO 8601 format")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Event modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Event modification timestamp in ISO 8601 format
   * @return modified
  **/
  @Schema(description = "Event modification timestamp in ISO 8601 format")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public Event error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Event error message
   * @return error
  **/
  @Schema(description = "Event error message")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Event valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Event valid flag
   * @return valid
  **/
  @Schema(description = "Event valid flag")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.sink, event.sink) &&
        Objects.equals(this.payload, event.payload) &&
        Objects.equals(this.created, event.created) &&
        Objects.equals(this.modified, event.modified) &&
        Objects.equals(this.error, event.error) &&
        Objects.equals(this.valid, event.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sink, payload, created, modified, error, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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