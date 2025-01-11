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
import org.threeten.bp.OffsetDateTime;
/**
 * A record audit represents auditing information (changes) to a record.
 */
@Schema(description = "A record audit represents auditing information (changes) to a record.")

public class RecordAudit extends HashMap<String, Object> {
  @SerializedName("instant")
  private OffsetDateTime instant = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("records")
  private List<String> records = null;

  @SerializedName("user")
  private String user = null;

  public RecordAudit instant(OffsetDateTime instant) {
    this.instant = instant;
    return this;
  }

   /**
   * Get instant
   * @return instant
  **/
  @Schema(description = "")
  public OffsetDateTime getInstant() {
    return instant;
  }

  public void setInstant(OffsetDateTime instant) {
    this.instant = instant;
  }

  public RecordAudit comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public RecordAudit records(List<String> records) {
    this.records = records;
    return this;
  }

  public RecordAudit addRecordsItem(String recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<String>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @Schema(description = "")
  public List<String> getRecords() {
    return records;
  }

  public void setRecords(List<String> records) {
    this.records = records;
  }

  public RecordAudit user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordAudit recordAudit = (RecordAudit) o;
    return Objects.equals(this.instant, recordAudit.instant) &&
        Objects.equals(this.comment, recordAudit.comment) &&
        Objects.equals(this.records, recordAudit.records) &&
        Objects.equals(this.user, recordAudit.user) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instant, comment, records, user, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordAudit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    instant: ").append(toIndentedString(instant)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
