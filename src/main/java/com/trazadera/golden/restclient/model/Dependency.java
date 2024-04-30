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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a dependency between objects.
 */
@Schema(description = "Represents a dependency between objects.")

public class Dependency {
  @SerializedName("uses")
  private List<String> uses = null;

  @SerializedName("usesCount")
  private Integer usesCount = null;

  @SerializedName("usedBy")
  private List<String> usedBy = null;

  @SerializedName("usedByCount")
  private Integer usedByCount = null;

  public Dependency uses(List<String> uses) {
    this.uses = uses;
    return this;
  }

  public Dependency addUsesItem(String usesItem) {
    if (this.uses == null) {
      this.uses = new ArrayList<String>();
    }
    this.uses.add(usesItem);
    return this;
  }

   /**
   * Set of objects that this object is using.
   * @return uses
  **/
  @Schema(description = "Set of objects that this object is using.")
  public List<String> getUses() {
    return uses;
  }

  public void setUses(List<String> uses) {
    this.uses = uses;
  }

  public Dependency usesCount(Integer usesCount) {
    this.usesCount = usesCount;
    return this;
  }

   /**
   * Number of objects that this object is using.
   * @return usesCount
  **/
  @Schema(description = "Number of objects that this object is using.")
  public Integer getUsesCount() {
    return usesCount;
  }

  public void setUsesCount(Integer usesCount) {
    this.usesCount = usesCount;
  }

  public Dependency usedBy(List<String> usedBy) {
    this.usedBy = usedBy;
    return this;
  }

  public Dependency addUsedByItem(String usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<String>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

   /**
   * Set of objects that are using this object.
   * @return usedBy
  **/
  @Schema(description = "Set of objects that are using this object.")
  public List<String> getUsedBy() {
    return usedBy;
  }

  public void setUsedBy(List<String> usedBy) {
    this.usedBy = usedBy;
  }

  public Dependency usedByCount(Integer usedByCount) {
    this.usedByCount = usedByCount;
    return this;
  }

   /**
   * Number of objects that are using this object.
   * @return usedByCount
  **/
  @Schema(description = "Number of objects that are using this object.")
  public Integer getUsedByCount() {
    return usedByCount;
  }

  public void setUsedByCount(Integer usedByCount) {
    this.usedByCount = usedByCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependency dependency = (Dependency) o;
    return Objects.equals(this.uses, dependency.uses) &&
        Objects.equals(this.usesCount, dependency.usesCount) &&
        Objects.equals(this.usedBy, dependency.usedBy) &&
        Objects.equals(this.usedByCount, dependency.usedByCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uses, usesCount, usedBy, usedByCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    uses: ").append(toIndentedString(uses)).append("\n");
    sb.append("    usesCount: ").append(toIndentedString(usesCount)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
    sb.append("    usedByCount: ").append(toIndentedString(usedByCount)).append("\n");
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