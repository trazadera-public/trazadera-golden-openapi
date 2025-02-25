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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Represents a bucket merge request
 */
@Schema(description = "Represents a bucket merge request")

public class GoldenMergeBucketRequestDto {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("audit")
  private Boolean audit = null;

  public GoldenMergeBucketRequestDto comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Optional comment for the bucket operation.
   * @return comment
  **/
  @Schema(description = "Optional comment for the bucket operation.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public GoldenMergeBucketRequestDto audit(Boolean audit) {
    this.audit = audit;
    return this;
  }

   /**
   * Flag to return audit information. By default is false.
   * @return audit
  **/
  @Schema(required = true, description = "Flag to return audit information. By default is false.")
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
    GoldenMergeBucketRequestDto goldenMergeBucketRequestDto = (GoldenMergeBucketRequestDto) o;
    return Objects.equals(this.comment, goldenMergeBucketRequestDto.comment) &&
        Objects.equals(this.audit, goldenMergeBucketRequestDto.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, audit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoldenMergeBucketRequestDto {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
