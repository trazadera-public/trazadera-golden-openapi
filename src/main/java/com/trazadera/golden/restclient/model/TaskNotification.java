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
import com.trazadera.golden.restclient.model.Recipient;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Task notification.
 */
@Schema(description = "Task notification.")

public class TaskNotification {
  @SerializedName("recipients")
  private List<Recipient> recipients = null;

  /**
   * Task status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("CREATED")
    CREATED("CREATED"),
    @SerializedName("RUNNING")
    RUNNING("RUNNING"),
    @SerializedName("CANCEL")
    CANCEL("CANCEL"),
    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED"),
    @SerializedName("FAILED")
    FAILED("FAILED"),
    @SerializedName("CANCELLED")
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private List<StatusEnum> status = null;

  public TaskNotification recipients(List<Recipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public TaskNotification addRecipientsItem(Recipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<Recipient>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * List of recipients to be notified.
   * @return recipients
  **/
  @Schema(description = "List of recipients to be notified.")
  public List<Recipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Recipient> recipients) {
    this.recipients = recipients;
  }

  public TaskNotification status(List<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public TaskNotification addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<StatusEnum>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Task status notification. Only these statuses will be notified.
   * @return status
  **/
  @Schema(description = "Task status notification. Only these statuses will be notified.")
  public List<StatusEnum> getStatus() {
    return status;
  }

  public void setStatus(List<StatusEnum> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskNotification taskNotification = (TaskNotification) o;
    return Objects.equals(this.recipients, taskNotification.recipients) &&
        Objects.equals(this.status, taskNotification.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskNotification {\n");
    
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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