/*
 * GOLDEN-API
 * Trazadera Golden API
 *
 * OpenAPI spec version: 1.9.0
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
 * Authentication request
 */
@Schema(description = "Authentication request")

public class AuthRequestDto {
  @SerializedName("email")
  private String email = null;

  @SerializedName("password")
  private String password = null;

  public AuthRequestDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email
   * @return email
  **/
  @Schema(required = true, description = "User email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuthRequestDto password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password (in clear text)
   * @return password
  **/
  @Schema(required = true, description = "Password (in clear text)")
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
    AuthRequestDto authRequestDto = (AuthRequestDto) o;
    return Objects.equals(this.email, authRequestDto.email) &&
        Objects.equals(this.password, authRequestDto.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRequestDto {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
