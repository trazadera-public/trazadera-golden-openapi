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
 * TableFilter
 */


public class TableFilter {
  @SerializedName("filterError")
  private Boolean filterError = null;

  @SerializedName("filterMerged")
  private Boolean filterMerged = null;

  @SerializedName("filterDisconnected")
  private Boolean filterDisconnected = null;

  @SerializedName("filterUpdatedAfter")
  private OffsetDateTime filterUpdatedAfter = null;

  @SerializedName("filterUpdatedBefore")
  private OffsetDateTime filterUpdatedBefore = null;

  @SerializedName("filterQualityGreater")
  private Double filterQualityGreater = null;

  @SerializedName("filterQualityLess")
  private Double filterQualityLess = null;

  public TableFilter filterError(Boolean filterError) {
    this.filterError = filterError;
    return this;
  }

   /**
   * Get filterError
   * @return filterError
  **/
  @Schema(description = "")
  public Boolean isFilterError() {
    return filterError;
  }

  public void setFilterError(Boolean filterError) {
    this.filterError = filterError;
  }

  public TableFilter filterMerged(Boolean filterMerged) {
    this.filterMerged = filterMerged;
    return this;
  }

   /**
   * Get filterMerged
   * @return filterMerged
  **/
  @Schema(description = "")
  public Boolean isFilterMerged() {
    return filterMerged;
  }

  public void setFilterMerged(Boolean filterMerged) {
    this.filterMerged = filterMerged;
  }

  public TableFilter filterDisconnected(Boolean filterDisconnected) {
    this.filterDisconnected = filterDisconnected;
    return this;
  }

   /**
   * Get filterDisconnected
   * @return filterDisconnected
  **/
  @Schema(description = "")
  public Boolean isFilterDisconnected() {
    return filterDisconnected;
  }

  public void setFilterDisconnected(Boolean filterDisconnected) {
    this.filterDisconnected = filterDisconnected;
  }

  public TableFilter filterUpdatedAfter(OffsetDateTime filterUpdatedAfter) {
    this.filterUpdatedAfter = filterUpdatedAfter;
    return this;
  }

   /**
   * Get filterUpdatedAfter
   * @return filterUpdatedAfter
  **/
  @Schema(description = "")
  public OffsetDateTime getFilterUpdatedAfter() {
    return filterUpdatedAfter;
  }

  public void setFilterUpdatedAfter(OffsetDateTime filterUpdatedAfter) {
    this.filterUpdatedAfter = filterUpdatedAfter;
  }

  public TableFilter filterUpdatedBefore(OffsetDateTime filterUpdatedBefore) {
    this.filterUpdatedBefore = filterUpdatedBefore;
    return this;
  }

   /**
   * Get filterUpdatedBefore
   * @return filterUpdatedBefore
  **/
  @Schema(description = "")
  public OffsetDateTime getFilterUpdatedBefore() {
    return filterUpdatedBefore;
  }

  public void setFilterUpdatedBefore(OffsetDateTime filterUpdatedBefore) {
    this.filterUpdatedBefore = filterUpdatedBefore;
  }

  public TableFilter filterQualityGreater(Double filterQualityGreater) {
    this.filterQualityGreater = filterQualityGreater;
    return this;
  }

   /**
   * Get filterQualityGreater
   * @return filterQualityGreater
  **/
  @Schema(description = "")
  public Double getFilterQualityGreater() {
    return filterQualityGreater;
  }

  public void setFilterQualityGreater(Double filterQualityGreater) {
    this.filterQualityGreater = filterQualityGreater;
  }

  public TableFilter filterQualityLess(Double filterQualityLess) {
    this.filterQualityLess = filterQualityLess;
    return this;
  }

   /**
   * Get filterQualityLess
   * @return filterQualityLess
  **/
  @Schema(description = "")
  public Double getFilterQualityLess() {
    return filterQualityLess;
  }

  public void setFilterQualityLess(Double filterQualityLess) {
    this.filterQualityLess = filterQualityLess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableFilter tableFilter = (TableFilter) o;
    return Objects.equals(this.filterError, tableFilter.filterError) &&
        Objects.equals(this.filterMerged, tableFilter.filterMerged) &&
        Objects.equals(this.filterDisconnected, tableFilter.filterDisconnected) &&
        Objects.equals(this.filterUpdatedAfter, tableFilter.filterUpdatedAfter) &&
        Objects.equals(this.filterUpdatedBefore, tableFilter.filterUpdatedBefore) &&
        Objects.equals(this.filterQualityGreater, tableFilter.filterQualityGreater) &&
        Objects.equals(this.filterQualityLess, tableFilter.filterQualityLess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterError, filterMerged, filterDisconnected, filterUpdatedAfter, filterUpdatedBefore, filterQualityGreater, filterQualityLess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableFilter {\n");
    
    sb.append("    filterError: ").append(toIndentedString(filterError)).append("\n");
    sb.append("    filterMerged: ").append(toIndentedString(filterMerged)).append("\n");
    sb.append("    filterDisconnected: ").append(toIndentedString(filterDisconnected)).append("\n");
    sb.append("    filterUpdatedAfter: ").append(toIndentedString(filterUpdatedAfter)).append("\n");
    sb.append("    filterUpdatedBefore: ").append(toIndentedString(filterUpdatedBefore)).append("\n");
    sb.append("    filterQualityGreater: ").append(toIndentedString(filterQualityGreater)).append("\n");
    sb.append("    filterQualityLess: ").append(toIndentedString(filterQualityLess)).append("\n");
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
