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
 * Represents a request to insert/update some user fields
 */
@Schema(description = "Represents a request to insert/update some user fields")

public class UserFullRequestDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("email")
  private String email = null;

  /**
   * Security role.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    @SerializedName("USER")
    USER("USER"),
    @SerializedName("STEWARD")
    STEWARD("STEWARD"),
    @SerializedName("ADMIN")
    ADMIN("ADMIN");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RoleEnum fromValue(String input) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RoleEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("role")
  private RoleEnum role = RoleEnum.USER;

  @SerializedName("enabled")
  private Boolean enabled = false;

  public UserFullRequestDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @Schema(required = true, description = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserFullRequestDto surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Surname(s)
   * @return surname
  **/
  @Schema(required = true, description = "Surname(s)")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UserFullRequestDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email (must be unique)
   * @return email
  **/
  @Schema(required = true, description = "User email (must be unique)")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserFullRequestDto role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Security role.
   * @return role
  **/
  @Schema(required = true, description = "Security role.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public UserFullRequestDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * User enabled flag
   * @return enabled
  **/
  @Schema(description = "User enabled flag")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFullRequestDto userFullRequestDto = (UserFullRequestDto) o;
    return Objects.equals(this.name, userFullRequestDto.name) &&
        Objects.equals(this.surname, userFullRequestDto.surname) &&
        Objects.equals(this.email, userFullRequestDto.email) &&
        Objects.equals(this.role, userFullRequestDto.role) &&
        Objects.equals(this.enabled, userFullRequestDto.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, email, role, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFullRequestDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
