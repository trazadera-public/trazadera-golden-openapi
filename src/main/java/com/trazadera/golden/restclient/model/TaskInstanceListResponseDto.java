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
import com.trazadera.golden.restclient.model.Page;
import com.trazadera.golden.restclient.model.Principal;
import com.trazadera.golden.restclient.model.TaskInstanceDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;import java.util.Map;
import java.util.List;
import java.util.Map;
/**
 * Represents a list of task instances.
 */
@Schema(description = "Represents a list of task instances.")

public class TaskInstanceListResponseDto {
  @SerializedName("principals")
  private Map<String, Principal> principals = null;

  @SerializedName("tasks")
  private List<TaskInstanceDto> tasks = null;

  @SerializedName("page")
  private Page page = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public TaskInstanceListResponseDto principals(Map<String, Principal> principals) {
    this.principals = principals;
    return this;
  }

  public TaskInstanceListResponseDto putPrincipalsItem(String key, Principal principalsItem) {
    if (this.principals == null) {
      this.principals = new HashMap<String, Principal>();
    }
    this.principals.put(key, principalsItem);
    return this;
  }

   /**
   * Map of principals. Handy to decorate the user identifiers.
   * @return principals
  **/
  @Schema(description = "Map of principals. Handy to decorate the user identifiers.")
  public Map<String, Principal> getPrincipals() {
    return principals;
  }

  public void setPrincipals(Map<String, Principal> principals) {
    this.principals = principals;
  }

  public TaskInstanceListResponseDto tasks(List<TaskInstanceDto> tasks) {
    this.tasks = tasks;
    return this;
  }

  public TaskInstanceListResponseDto addTasksItem(TaskInstanceDto tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskInstanceDto>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * List of task instances.
   * @return tasks
  **/
  @Schema(description = "List of task instances.")
  public List<TaskInstanceDto> getTasks() {
    return tasks;
  }

  public void setTasks(List<TaskInstanceDto> tasks) {
    this.tasks = tasks;
  }

  public TaskInstanceListResponseDto page(Page page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public TaskInstanceListResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public TaskInstanceListResponseDto addErrorsItem(String errorsItem) {
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

  public TaskInstanceListResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public TaskInstanceListResponseDto addMessagesItem(String messagesItem) {
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
    TaskInstanceListResponseDto taskInstanceListResponseDto = (TaskInstanceListResponseDto) o;
    return Objects.equals(this.principals, taskInstanceListResponseDto.principals) &&
        Objects.equals(this.tasks, taskInstanceListResponseDto.tasks) &&
        Objects.equals(this.page, taskInstanceListResponseDto.page) &&
        Objects.equals(this.errors, taskInstanceListResponseDto.errors) &&
        Objects.equals(this.messages, taskInstanceListResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principals, tasks, page, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstanceListResponseDto {\n");
    
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
