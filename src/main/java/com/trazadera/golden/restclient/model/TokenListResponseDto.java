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
import com.trazadera.golden.restclient.model.TokenDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a list of tokens
 */
@Schema(description = "Represents a list of tokens")

public class TokenListResponseDto {
  @SerializedName("tokens")
  private List<TokenDto> tokens = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public TokenListResponseDto tokens(List<TokenDto> tokens) {
    this.tokens = tokens;
    return this;
  }

  public TokenListResponseDto addTokensItem(TokenDto tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<TokenDto>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * List of tokens
   * @return tokens
  **/
  @Schema(description = "List of tokens")
  public List<TokenDto> getTokens() {
    return tokens;
  }

  public void setTokens(List<TokenDto> tokens) {
    this.tokens = tokens;
  }

  public TokenListResponseDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public TokenListResponseDto addErrorsItem(String errorsItem) {
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

  public TokenListResponseDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public TokenListResponseDto addMessagesItem(String messagesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenListResponseDto tokenListResponseDto = (TokenListResponseDto) o;
    return Objects.equals(this.tokens, tokenListResponseDto.tokens) &&
        Objects.equals(this.errors, tokenListResponseDto.errors) &&
        Objects.equals(this.messages, tokenListResponseDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenListResponseDto {\n");
    
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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
