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
import com.trazadera.golden.restclient.model.TableDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a list of tables.
 */
@Schema(description = "Represents a list of tables.")

public class TableListResponseDto {
  @SerializedName("tables")
  private List<TableDto> tables = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public TableListResponseDto tables(List<TableDto> tables) {
    this.tables = tables;
    return this;
  }

  public TableListResponseDto addTablesItem(TableDto tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<TableDto>();
    }
    this.tables.add(tablesItem);
    return this;
  }

   /**
   * List of tables.
   * @return tables
  **/
  @Schema(description = "List of tables.")
  public List<TableDto> getTables() {
    return tables;
  }

  public void setTables(List<TableDto> tables) {
    this.tables = tables;
  }

  public TableListResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public TableListResponseDto addErrorsItem(String errorsItem) {
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

  public TableListResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public TableListResponseDto addMessagesItem(String messagesItem) {
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
    TableListResponseDto tableListResponseDto = (TableListResponseDto) o;
    return Objects.equals(this.tables, tableListResponseDto.tables) &&
        Objects.equals(this.errors, tableListResponseDto.errors) &&
        Objects.equals(this.messages, tableListResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tables, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableListResponseDto {\n");
    
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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