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
import org.threeten.bp.OffsetDateTime;
/**
 * Represents a token, usually to provide programmatic access to the API for applications.
 */
@Schema(description = "Represents a token, usually to provide programmatic access to the API for applications.")

public class TokenDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("maskedToken")
  private String maskedToken = null;

  @SerializedName("masked")
  private Boolean masked = null;

  @SerializedName("name")
  private String name = null;

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

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("expires")
  private OffsetDateTime expires = null;

  @SerializedName("expired")
  private Boolean expired = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public TokenDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Token identifier
   * @return id
  **/
  @Schema(description = "Token identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TokenDto token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token raw value (only available if not masked). Once it has been copied, the token is not provided anymore.
   * @return token
  **/
  @Schema(description = "Token raw value (only available if not masked). Once it has been copied, the token is not provided anymore.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public TokenDto maskedToken(String maskedToken) {
    this.maskedToken = maskedToken;
    return this;
  }

   /**
   * Masked token. Always provided.
   * @return maskedToken
  **/
  @Schema(description = "Masked token. Always provided.")
  public String getMaskedToken() {
    return maskedToken;
  }

  public void setMaskedToken(String maskedToken) {
    this.maskedToken = maskedToken;
  }

  public TokenDto masked(Boolean masked) {
    this.masked = masked;
    return this;
  }

   /**
   * Masked flag. Indicates if the token is masked or not. If true, the token is not provided.
   * @return masked
  **/
  @Schema(description = "Masked flag. Indicates if the token is masked or not. If true, the token is not provided.")
  public Boolean isMasked() {
    return masked;
  }

  public void setMasked(Boolean masked) {
    this.masked = masked;
  }

  public TokenDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Token name
   * @return name
  **/
  @Schema(description = "Token name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TokenDto role(RoleEnum role) {
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

  public TokenDto created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date
   * @return created
  **/
  @Schema(required = true, description = "Creation date")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public TokenDto expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Expiration date
   * @return expires
  **/
  @Schema(required = true, description = "Expiration date")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public TokenDto expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Token expiration flag
   * @return expired
  **/
  @Schema(description = "Token expiration flag")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public TokenDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Token enabled flag
   * @return enabled
  **/
  @Schema(description = "Token enabled flag")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public TokenDto deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Token deleted flag
   * @return deleted
  **/
  @Schema(description = "Token deleted flag")
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
    TokenDto tokenDto = (TokenDto) o;
    return Objects.equals(this.id, tokenDto.id) &&
        Objects.equals(this.token, tokenDto.token) &&
        Objects.equals(this.maskedToken, tokenDto.maskedToken) &&
        Objects.equals(this.masked, tokenDto.masked) &&
        Objects.equals(this.name, tokenDto.name) &&
        Objects.equals(this.role, tokenDto.role) &&
        Objects.equals(this.created, tokenDto.created) &&
        Objects.equals(this.expires, tokenDto.expires) &&
        Objects.equals(this.expired, tokenDto.expired) &&
        Objects.equals(this.enabled, tokenDto.enabled) &&
        Objects.equals(this.deleted, tokenDto.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, maskedToken, masked, name, role, created, expires, expired, enabled, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    maskedToken: ").append(toIndentedString(maskedToken)).append("\n");
    sb.append("    masked: ").append(toIndentedString(masked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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
