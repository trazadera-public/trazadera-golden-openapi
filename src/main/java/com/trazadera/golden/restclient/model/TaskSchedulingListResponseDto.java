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
import com.trazadera.golden.restclient.model.TaskSchedulingDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a list of task schedulings.
 */
@Schema(description = "Represents a list of task schedulings.")

public class TaskSchedulingListResponseDto {
  @SerializedName("schedulings")
  private List<TaskSchedulingDto> schedulings = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public TaskSchedulingListResponseDto schedulings(List<TaskSchedulingDto> schedulings) {
    this.schedulings = schedulings;
    return this;
  }

  public TaskSchedulingListResponseDto addSchedulingsItem(TaskSchedulingDto schedulingsItem) {
    if (this.schedulings == null) {
      this.schedulings = new ArrayList<TaskSchedulingDto>();
    }
    this.schedulings.add(schedulingsItem);
    return this;
  }

   /**
   * List of task schedulings.
   * @return schedulings
  **/
  @Schema(description = "List of task schedulings.")
  public List<TaskSchedulingDto> getSchedulings() {
    return schedulings;
  }

  public void setSchedulings(List<TaskSchedulingDto> schedulings) {
    this.schedulings = schedulings;
  }

  public TaskSchedulingListResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public TaskSchedulingListResponseDto addErrorsItem(String errorsItem) {
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

  public TaskSchedulingListResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public TaskSchedulingListResponseDto addMessagesItem(String messagesItem) {
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
    TaskSchedulingListResponseDto taskSchedulingListResponseDto = (TaskSchedulingListResponseDto) o;
    return Objects.equals(this.schedulings, taskSchedulingListResponseDto.schedulings) &&
        Objects.equals(this.errors, taskSchedulingListResponseDto.errors) &&
        Objects.equals(this.messages, taskSchedulingListResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulings, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSchedulingListResponseDto {\n");
    
    sb.append("    schedulings: ").append(toIndentedString(schedulings)).append("\n");
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
