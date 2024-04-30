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
/**
 * Authentication password update request
 */
@Schema(description = "Authentication password update request")

public class AuthPassUpdateRequestDto {
  @SerializedName("token")
  private String token = null;

  @SerializedName("password")
  private String password = null;

  public AuthPassUpdateRequestDto token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Unique token (previously provided)
   * @return token
  **/
  @Schema(required = true, description = "Unique token (previously provided)")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AuthPassUpdateRequestDto password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password (clear text)
   * @return password
  **/
  @Schema(required = true, description = "Password (clear text)")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthPassUpdateRequestDto authPassUpdateRequestDto = (AuthPassUpdateRequestDto) o;
    return Objects.equals(this.token, authPassUpdateRequestDto.token) &&
        Objects.equals(this.password, authPassUpdateRequestDto.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthPassUpdateRequestDto {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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