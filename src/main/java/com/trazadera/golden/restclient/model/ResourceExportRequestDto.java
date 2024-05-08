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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a request to export resources.
 */
@Schema(description = "Represents a request to export resources.")

public class ResourceExportRequestDto {
  @SerializedName("id")
  private List<String> id = new ArrayList<String>();

  @SerializedName("all")
  private Boolean all = null;

  public ResourceExportRequestDto id(List<String> id) {
    this.id = id;
    return this;
  }

  public ResourceExportRequestDto addIdItem(String idItem) {
    this.id.add(idItem);
    return this;
  }

   /**
   * Resource identifiers to be exported (optional).
   * @return id
  **/
  @Schema(required = true, description = "Resource identifiers to be exported (optional).")
  public List<String> getId() {
    return id;
  }

  public void setId(List<String> id) {
    this.id = id;
  }

  public ResourceExportRequestDto all(Boolean all) {
    this.all = all;
    return this;
  }

   /**
   * Export all resources flag.
   * @return all
  **/
  @Schema(description = "Export all resources flag.")
  public Boolean isAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceExportRequestDto resourceExportRequestDto = (ResourceExportRequestDto) o;
    return Objects.equals(this.id, resourceExportRequestDto.id) &&
        Objects.equals(this.all, resourceExportRequestDto.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, all);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceExportRequestDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
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
