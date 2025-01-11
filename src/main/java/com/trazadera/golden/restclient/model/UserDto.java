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
import org.threeten.bp.OffsetDateTime;
/**
 * Represents an user, usually a physical person that accesses the Golden web application.
 */
@Schema(description = "Represents an user, usually a physical person that accesses the Golden web application.")

public class UserDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("role")
  private String role = "USER";

  @SerializedName("internal")
  private Boolean internal = false;

  @SerializedName("lastAccess")
  private OffsetDateTime lastAccess = null;

  @SerializedName("totalFailedAccesses")
  private Integer totalFailedAccesses = null;

  @SerializedName("locked")
  private Boolean locked = false;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("deleted")
  private Boolean deleted = false;

  public UserDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * User identifier.
   * @return id
  **/
  @Schema(description = "User identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User name
   * @return name
  **/
  @Schema(description = "User name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserDto surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * User surname(s)
   * @return surname
  **/
  @Schema(description = "User surname(s)")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UserDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email. Must be unique.
   * @return email
  **/
  @Schema(description = "User email. Must be unique.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDto role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Role assigned to this user
   * @return role
  **/
  @Schema(description = "Role assigned to this user")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserDto internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Flag to indicate if user is internal or external (Single Sign-On). By default, users are considered to be internal.
   * @return internal
  **/
  @Schema(description = "Flag to indicate if user is internal or external (Single Sign-On). By default, users are considered to be internal.")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public UserDto lastAccess(OffsetDateTime lastAccess) {
    this.lastAccess = lastAccess;
    return this;
  }

   /**
   * Last successful login as ISO timestamp. If the user has never logged in, this field is null.
   * @return lastAccess
  **/
  @Schema(required = true, description = "Last successful login as ISO timestamp. If the user has never logged in, this field is null.")
  public OffsetDateTime getLastAccess() {
    return lastAccess;
  }

  public void setLastAccess(OffsetDateTime lastAccess) {
    this.lastAccess = lastAccess;
  }

  public UserDto totalFailedAccesses(Integer totalFailedAccesses) {
    this.totalFailedAccesses = totalFailedAccesses;
    return this;
  }

   /**
   * Total number of login attempts since last successful login. After certain number of failed attempts, the user is locked.
   * @return totalFailedAccesses
  **/
  @Schema(description = "Total number of login attempts since last successful login. After certain number of failed attempts, the user is locked.")
  public Integer getTotalFailedAccesses() {
    return totalFailedAccesses;
  }

  public void setTotalFailedAccesses(Integer totalFailedAccesses) {
    this.totalFailedAccesses = totalFailedAccesses;
  }

  public UserDto locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * User locked flag.
   * @return locked
  **/
  @Schema(description = "User locked flag.")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public UserDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * User enabled flag.
   * @return enabled
  **/
  @Schema(description = "User enabled flag.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UserDto deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * User deleted flag. Users are not physically deleted from the database, but marked as deleted (due to audited events).
   * @return deleted
  **/
  @Schema(description = "User deleted flag. Users are not physically deleted from the database, but marked as deleted (due to audited events).")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.id, userDto.id) &&
        Objects.equals(this.name, userDto.name) &&
        Objects.equals(this.surname, userDto.surname) &&
        Objects.equals(this.email, userDto.email) &&
        Objects.equals(this.role, userDto.role) &&
        Objects.equals(this.internal, userDto.internal) &&
        Objects.equals(this.lastAccess, userDto.lastAccess) &&
        Objects.equals(this.totalFailedAccesses, userDto.totalFailedAccesses) &&
        Objects.equals(this.locked, userDto.locked) &&
        Objects.equals(this.enabled, userDto.enabled) &&
        Objects.equals(this.deleted, userDto.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, email, role, internal, lastAccess, totalFailedAccesses, locked, enabled, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    lastAccess: ").append(toIndentedString(lastAccess)).append("\n");
    sb.append("    totalFailedAccesses: ").append(toIndentedString(totalFailedAccesses)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
