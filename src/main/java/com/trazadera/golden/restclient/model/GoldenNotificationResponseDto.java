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
import com.trazadera.golden.restclient.model.EntityEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents the result of sent notifications
 */
@Schema(description = "Represents the result of sent notifications")

public class GoldenNotificationResponseDto {
  @SerializedName("notifications")
  private Integer notifications = null;

  @SerializedName("events")
  private List<EntityEvent> events = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public GoldenNotificationResponseDto notifications(Integer notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Number of notifications sent out.
   * @return notifications
  **/
  @Schema(description = "Number of notifications sent out.")
  public Integer getNotifications() {
    return notifications;
  }

  public void setNotifications(Integer notifications) {
    this.notifications = notifications;
  }

  public GoldenNotificationResponseDto events(List<EntityEvent> events) {
    this.events = events;
    return this;
  }

  public GoldenNotificationResponseDto addEventsItem(EntityEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<EntityEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Notification events. One for each found record.
   * @return events
  **/
  @Schema(description = "Notification events. One for each found record.")
  public List<EntityEvent> getEvents() {
    return events;
  }

  public void setEvents(List<EntityEvent> events) {
    this.events = events;
  }

  public GoldenNotificationResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public GoldenNotificationResponseDto addErrorsItem(String errorsItem) {
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

  public GoldenNotificationResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public GoldenNotificationResponseDto addMessagesItem(String messagesItem) {
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
    GoldenNotificationResponseDto goldenNotificationResponseDto = (GoldenNotificationResponseDto) o;
    return Objects.equals(this.notifications, goldenNotificationResponseDto.notifications) &&
        Objects.equals(this.events, goldenNotificationResponseDto.events) &&
        Objects.equals(this.errors, goldenNotificationResponseDto.errors) &&
        Objects.equals(this.messages, goldenNotificationResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, events, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoldenNotificationResponseDto {\n");
    
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
