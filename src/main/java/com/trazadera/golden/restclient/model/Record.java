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
import com.trazadera.golden.restclient.model.RecordAudit;
import com.trazadera.golden.restclient.model.RecordInternal;
import com.trazadera.golden.restclient.model.RecordMetadata;
import com.trazadera.golden.restclient.model.RecordSearch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;import java.util.Map;
import java.util.List;
import java.util.Map;
/**
 * A record represents an user data record as a JSON document with a unique identifier (_id), metadata (_metadata) and auditing (_audit). A record represents that main data asset in Golden and can also be used to store data in plain (text), XML and binary formats using a JSON structure.
 */
@Schema(description = "A record represents an user data record as a JSON document with a unique identifier (_id), metadata (_metadata) and auditing (_audit). A record represents that main data asset in Golden and can also be used to store data in plain (text), XML and binary formats using a JSON structure.")

public class Record extends HashMap<String, Object> {
  @SerializedName("_internal")
  private RecordInternal _internal = null;

  @SerializedName("_id")
  private String _id = null;

  @SerializedName("_metadata")
  private RecordMetadata _metadata = null;

  @SerializedName("_audit")
  private List<RecordAudit> _audit = null;

  @SerializedName("_search")
  private RecordSearch _search = null;

  public Record _internal(RecordInternal _internal) {
    this._internal = _internal;
    return this;
  }

   /**
   * Get _internal
   * @return _internal
  **/
  @Schema(description = "")
  public RecordInternal getInternal() {
    return _internal;
  }

  public void setInternal(RecordInternal _internal) {
    this._internal = _internal;
  }

  public Record _id(String _id) {
    this._id = _id;
    return this;
  }

   /**
   * Get _id
   * @return _id
  **/
  @Schema(description = "")
  public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public Record _metadata(RecordMetadata _metadata) {
    this._metadata = _metadata;
    return this;
  }

   /**
   * Get _metadata
   * @return _metadata
  **/
  @Schema(description = "")
  public RecordMetadata getMetadata() {
    return _metadata;
  }

  public void setMetadata(RecordMetadata _metadata) {
    this._metadata = _metadata;
  }

  public Record _audit(List<RecordAudit> _audit) {
    this._audit = _audit;
    return this;
  }

  public Record addAuditItem(RecordAudit _auditItem) {
    if (this._audit == null) {
      this._audit = new ArrayList<RecordAudit>();
    }
    this._audit.add(_auditItem);
    return this;
  }

   /**
   * Get _audit
   * @return _audit
  **/
  @Schema(description = "")
  public List<RecordAudit> getAudit() {
    return _audit;
  }

  public void setAudit(List<RecordAudit> _audit) {
    this._audit = _audit;
  }

  public Record _search(RecordSearch _search) {
    this._search = _search;
    return this;
  }

   /**
   * Get _search
   * @return _search
  **/
  @Schema(description = "")
  public RecordSearch getSearch() {
    return _search;
  }

  public void setSearch(RecordSearch _search) {
    this._search = _search;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Record record = (Record) o;
    return Objects.equals(this._internal, record._internal) &&
        Objects.equals(this._id, record._id) &&
        Objects.equals(this._metadata, record._metadata) &&
        Objects.equals(this._audit, record._audit) &&
        Objects.equals(this._search, record._search) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_internal, _id, _metadata, _audit, _search, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Record {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _internal: ").append(toIndentedString(_internal)).append("\n");
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    _metadata: ").append(toIndentedString(_metadata)).append("\n");
    sb.append("    _audit: ").append(toIndentedString(_audit)).append("\n");
    sb.append("    _search: ").append(toIndentedString(_search)).append("\n");
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
