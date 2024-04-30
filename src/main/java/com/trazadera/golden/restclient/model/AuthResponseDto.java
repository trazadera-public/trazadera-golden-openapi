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
 * Represents a successful user authentication
 */
@Schema(description = "Represents a successful user authentication")

public class AuthResponseDto {
  @SerializedName("token")
  private String token = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

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
  private RoleEnum role = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public AuthResponseDto token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Bearer token
   * @return token
  **/
  @Schema(description = "Bearer token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AuthResponseDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email
   * @return email
  **/
  @Schema(description = "User email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuthResponseDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * User unique identifier - used across the API
   * @return id
  **/
  @Schema(description = "User unique identifier - used across the API")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuthResponseDto role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Security role.
   * @return role
  **/
  @Schema(description = "Security role.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public AuthResponseDto name(String name) {
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

  public AuthResponseDto surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * User surname
   * @return surname
  **/
  @Schema(description = "User surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public AuthResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public AuthResponseDto addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors.
   * @return errors
  **/
  @Schema(description = "List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public AuthResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public AuthResponseDto addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<String>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Optional success messages. If present, the request was successful and response code will be 2xx.
   * @return messages
  **/
  @Schema(description = "Optional success messages. If present, the request was successful and response code will be 2xx.")
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
    AuthResponseDto authResponseDto = (AuthResponseDto) o;
    return Objects.equals(this.token, authResponseDto.token) &&
        Objects.equals(this.email, authResponseDto.email) &&
        Objects.equals(this.id, authResponseDto.id) &&
        Objects.equals(this.role, authResponseDto.role) &&
        Objects.equals(this.name, authResponseDto.name) &&
        Objects.equals(this.surname, authResponseDto.surname) &&
        Objects.equals(this.errors, authResponseDto.errors) &&
        Objects.equals(this.messages, authResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, email, id, role, name, surname, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResponseDto {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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
