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
import com.trazadera.golden.restclient.model.Dependency;
import com.trazadera.golden.restclient.model.Resource;
import com.trazadera.golden.restclient.model.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * An HTTP sink is a resource that writes records to a remote endpoint URL using a certain method (POST, PUT, PATCH).
 */
@Schema(description = "An HTTP sink is a resource that writes records to a remote endpoint URL using a certain method (POST, PUT, PATCH).")

public class SinkHttp extends Resource implements OneOfResourceExchangeDtoResourcesItems, OneOfResourceListResponseDtoResourcesItems, OneOfResourceResponseDtoResource {
  @SerializedName("dataset")
  private String dataset = null;

  @SerializedName("timeoutMs")
  private Integer timeoutMs = null;

  @SerializedName("credentials")
  private String credentials = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("method")
  private String method = null;

  public SinkHttp dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * The dataset to use.
   * @return dataset
  **/
  @Schema(description = "The dataset to use.")
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public SinkHttp timeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }

   /**
   * The timeout in milliseconds for writing a record.
   * @return timeoutMs
  **/
  @Schema(required = true, description = "The timeout in milliseconds for writing a record.")
  public Integer getTimeoutMs() {
    return timeoutMs;
  }

  public void setTimeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
  }

  public SinkHttp credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * The credentials to use for the HTTP(S) call.
   * @return credentials
  **/
  @Schema(description = "The credentials to use for the HTTP(S) call.")
  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public SinkHttp url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the remote endpoint.
   * @return url
  **/
  @Schema(required = true, description = "The URL of the remote endpoint.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SinkHttp method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP method to use for the call.
   * @return method
  **/
  @Schema(description = "The HTTP method to use for the call.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SinkHttp sinkHttp = (SinkHttp) o;
    return Objects.equals(this.dataset, sinkHttp.dataset) &&
        Objects.equals(this.timeoutMs, sinkHttp.timeoutMs) &&
        Objects.equals(this.credentials, sinkHttp.credentials) &&
        Objects.equals(this.url, sinkHttp.url) &&
        Objects.equals(this.method, sinkHttp.method) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, timeoutMs, credentials, url, method, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinkHttp {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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