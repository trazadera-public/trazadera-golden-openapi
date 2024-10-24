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
import com.trazadera.golden.restclient.model.FileGolden;
import com.trazadera.golden.restclient.model.Page;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a list of files.
 */
@Schema(description = "Represents a list of files.")

public class FileListResponseDto {
  @SerializedName("files")
  private List<FileGolden> files = null;

  @SerializedName("page")
  private Page page = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public FileListResponseDto files(List<FileGolden> files) {
    this.files = files;
    return this;
  }

  public FileListResponseDto addFilesItem(FileGolden filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<FileGolden>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * List of files.
   * @return files
  **/
  @Schema(description = "List of files.")
  public List<FileGolden> getFiles() {
    return files;
  }

  public void setFiles(List<FileGolden> files) {
    this.files = files;
  }

  public FileListResponseDto page(Page page) {
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

  public FileListResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public FileListResponseDto addErrorsItem(String errorsItem) {
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

  public FileListResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public FileListResponseDto addMessagesItem(String messagesItem) {
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
    FileListResponseDto fileListResponseDto = (FileListResponseDto) o;
    return Objects.equals(this.files, fileListResponseDto.files) &&
        Objects.equals(this.page, fileListResponseDto.page) &&
        Objects.equals(this.errors, fileListResponseDto.errors) &&
        Objects.equals(this.messages, fileListResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, page, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileListResponseDto {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
