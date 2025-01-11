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
import com.trazadera.golden.restclient.model.Test;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a resource.
 */
@Schema(description = "Represents a resource.")

public class ResourceResponseDto {
  @SerializedName("resource")
  private OneOfResourceResponseDtoResource resource = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("testSupported")
  private Boolean testSupported = null;

  @SerializedName("test")
  private Test test = null;

  public ResourceResponseDto resource(OneOfResourceResponseDtoResource resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Schema(required = true, description = "")
  public OneOfResourceResponseDtoResource getResource() {
    return resource;
  }

  public void setResource(OneOfResourceResponseDtoResource resource) {
    this.resource = resource;
  }

  public ResourceResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public ResourceResponseDto addErrorsItem(String errorsItem) {
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

  public ResourceResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ResourceResponseDto addMessagesItem(String messagesItem) {
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

  public ResourceResponseDto testSupported(Boolean testSupported) {
    this.testSupported = testSupported;
    return this;
  }

   /**
   * Get testSupported
   * @return testSupported
  **/
  @Schema(description = "")
  public Boolean isTestSupported() {
    return testSupported;
  }

  public void setTestSupported(Boolean testSupported) {
    this.testSupported = testSupported;
  }

  public ResourceResponseDto test(Test test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @Schema(description = "")
  public Test getTest() {
    return test;
  }

  public void setTest(Test test) {
    this.test = test;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceResponseDto resourceResponseDto = (ResourceResponseDto) o;
    return Objects.equals(this.resource, resourceResponseDto.resource) &&
        Objects.equals(this.errors, resourceResponseDto.errors) &&
        Objects.equals(this.messages, resourceResponseDto.messages) &&
        Objects.equals(this.testSupported, resourceResponseDto.testSupported) &&
        Objects.equals(this.test, resourceResponseDto.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, errors, messages, testSupported, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceResponseDto {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    testSupported: ").append(toIndentedString(testSupported)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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
