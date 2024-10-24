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
/**
 * Represents an entity sink.
 */
@Schema(description = "Represents an entity sink.")

public class EntityResourceTransformationSinkDto {
  @SerializedName("resource")
  private String resource = null;

  @SerializedName("transformation")
  private String transformation = null;

  @SerializedName("audit")
  private Boolean audit = null;

  public EntityResourceTransformationSinkDto resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Resource identifier.
   * @return resource
  **/
  @Schema(description = "Resource identifier.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public EntityResourceTransformationSinkDto transformation(String transformation) {
    this.transformation = transformation;
    return this;
  }

   /**
   * Optional transformation identifier.
   * @return transformation
  **/
  @Schema(description = "Optional transformation identifier.")
  public String getTransformation() {
    return transformation;
  }

  public void setTransformation(String transformation) {
    this.transformation = transformation;
  }

  public EntityResourceTransformationSinkDto audit(Boolean audit) {
    this.audit = audit;
    return this;
  }

   /**
   * Flag to include metadata audit when sinking.
   * @return audit
  **/
  @Schema(description = "Flag to include metadata audit when sinking.")
  public Boolean isAudit() {
    return audit;
  }

  public void setAudit(Boolean audit) {
    this.audit = audit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResourceTransformationSinkDto entityResourceTransformationSinkDto = (EntityResourceTransformationSinkDto) o;
    return Objects.equals(this.resource, entityResourceTransformationSinkDto.resource) &&
        Objects.equals(this.transformation, entityResourceTransformationSinkDto.transformation) &&
        Objects.equals(this.audit, entityResourceTransformationSinkDto.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, transformation, audit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResourceTransformationSinkDto {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
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