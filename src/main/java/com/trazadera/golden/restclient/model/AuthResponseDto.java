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
import java.util.ArrayList;
import java.util.HashMap;import java.util.Map;
import java.util.List;
import java.util.Map;
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

  @SerializedName("role")
  private String role = null;

  /**
   * Simplified permission
   */
  @JsonAdapter(InnerEnum.Adapter.class)
  public enum InnerEnum {
    @SerializedName("ALLOW")
    ALLOW("ALLOW"),
    @SerializedName("DENY")
    DENY("DENY"),
    @SerializedName("CUSTOM")
    CUSTOM("CUSTOM");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InnerEnum fromValue(String input) {
      for (InnerEnum b : InnerEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InnerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InnerEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InnerEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InnerEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("permissions")
  private Map<String, InnerEnum> permissions = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  /**
   * Principal type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("USER")
    USER("USER"),
    @SerializedName("ACCESS_TOKEN")
    ACCESS_TOKEN("ACCESS_TOKEN"),
    @SerializedName("NONE")
    NONE("NONE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

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
   * Email
   * @return email
  **/
  @Schema(description = "Email")
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
   * Unique user identifier
   * @return id
  **/
  @Schema(description = "Unique user identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuthResponseDto role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Role assigned
   * @return role
  **/
  @Schema(description = "Role assigned")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public AuthResponseDto permissions(Map<String, InnerEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AuthResponseDto putPermissionsItem(String key, InnerEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new HashMap<String, InnerEnum>();
    }
    this.permissions.put(key, permissionsItem);
    return this;
  }

   /**
   * Permissions assigned to role
   * @return permissions
  **/
  @Schema(description = "Permissions assigned to role")
  public Map<String, InnerEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(Map<String, InnerEnum> permissions) {
    this.permissions = permissions;
  }

  public AuthResponseDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @Schema(description = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public AuthResponseDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Principal type.
   * @return type
  **/
  @Schema(description = "Principal type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
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
        Objects.equals(this.permissions, authResponseDto.permissions) &&
        Objects.equals(this.name, authResponseDto.name) &&
        Objects.equals(this.errors, authResponseDto.errors) &&
        Objects.equals(this.messages, authResponseDto.messages) &&
        Objects.equals(this.type, authResponseDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, email, id, role, permissions, name, errors, messages, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResponseDto {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
