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
import com.trazadera.golden.restclient.model.Dependency;
import com.trazadera.golden.restclient.model.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Represents a generic Golden resource. Specific resources extend this resource with more specific configuration fields.
 */
@Schema(description = "Represents a generic Golden resource. Specific resources extend this resource with more specific configuration fields.")

public class Resource {
  @SerializedName("_id")
  private String _id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("validation")
  private Validation validation = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("dependency")
  private Dependency dependency = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("lockCount")
  private Integer lockCount = null;

  @SerializedName("category")
  private String category = null;

  public Resource() {
    this.type = this.getClass().getSimpleName();
  }
  public Resource _id(String _id) {
    this._id = _id;
    return this;
  }

   /**
   * Resource identifier
   * @return _id
  **/
  @Schema(required = true, description = "Resource identifier")
  public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public Resource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Resource description
   * @return description
  **/
  @Schema(required = true, description = "Resource description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Resource lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Last update timestamp
   * @return lastUpdated
  **/
  @Schema(description = "Last update timestamp")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Resource validation(Validation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @Schema(description = "")
  public Validation getValidation() {
    return validation;
  }

  public void setValidation(Validation validation) {
    this.validation = validation;
  }

  public Resource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Resource type
   * @return type
  **/
  @Schema(required = true, description = "Resource type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Resource dependency(Dependency dependency) {
    this.dependency = dependency;
    return this;
  }

   /**
   * Get dependency
   * @return dependency
  **/
  @Schema(description = "")
  public Dependency getDependency() {
    return dependency;
  }

  public void setDependency(Dependency dependency) {
    this.dependency = dependency;
  }

  public Resource locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Locking flag to indicate if resource can be modified
   * @return locked
  **/
  @Schema(description = "Locking flag to indicate if resource can be modified")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Resource lockCount(Integer lockCount) {
    this.lockCount = lockCount;
    return this;
  }

   /**
   * Resource lock count. Resource unlocked only if count is zero.
   * @return lockCount
  **/
  @Schema(description = "Resource lock count. Resource unlocked only if count is zero.")
  public Integer getLockCount() {
    return lockCount;
  }

  public void setLockCount(Integer lockCount) {
    this.lockCount = lockCount;
  }

  public Resource category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this._id, resource._id) &&
        Objects.equals(this.description, resource.description) &&
        Objects.equals(this.lastUpdated, resource.lastUpdated) &&
        Objects.equals(this.validation, resource.validation) &&
        Objects.equals(this.type, resource.type) &&
        Objects.equals(this.dependency, resource.dependency) &&
        Objects.equals(this.locked, resource.locked) &&
        Objects.equals(this.lockCount, resource.lockCount) &&
        Objects.equals(this.category, resource.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, description, lastUpdated, validation, type, dependency, locked, lockCount, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dependency: ").append(toIndentedString(dependency)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lockCount: ").append(toIndentedString(lockCount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
