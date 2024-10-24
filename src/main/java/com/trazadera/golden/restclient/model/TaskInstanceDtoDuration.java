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
import com.trazadera.golden.restclient.model.TaskInstanceDtoDurationUnits;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Task ISO duration.
 */
@Schema(description = "Task ISO duration.")

public class TaskInstanceDtoDuration {
  @SerializedName("seconds")
  private Long seconds = null;

  @SerializedName("zero")
  private Boolean zero = null;

  @SerializedName("nano")
  private Integer nano = null;

  @SerializedName("negative")
  private Boolean negative = null;

  @SerializedName("positive")
  private Boolean positive = null;

  @SerializedName("units")
  private List<TaskInstanceDtoDurationUnits> units = null;

  public TaskInstanceDtoDuration seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @Schema(description = "")
  public Long getSeconds() {
    return seconds;
  }

  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }

  public TaskInstanceDtoDuration zero(Boolean zero) {
    this.zero = zero;
    return this;
  }

   /**
   * Get zero
   * @return zero
  **/
  @Schema(description = "")
  public Boolean isZero() {
    return zero;
  }

  public void setZero(Boolean zero) {
    this.zero = zero;
  }

  public TaskInstanceDtoDuration nano(Integer nano) {
    this.nano = nano;
    return this;
  }

   /**
   * Get nano
   * @return nano
  **/
  @Schema(description = "")
  public Integer getNano() {
    return nano;
  }

  public void setNano(Integer nano) {
    this.nano = nano;
  }

  public TaskInstanceDtoDuration negative(Boolean negative) {
    this.negative = negative;
    return this;
  }

   /**
   * Get negative
   * @return negative
  **/
  @Schema(description = "")
  public Boolean isNegative() {
    return negative;
  }

  public void setNegative(Boolean negative) {
    this.negative = negative;
  }

  public TaskInstanceDtoDuration positive(Boolean positive) {
    this.positive = positive;
    return this;
  }

   /**
   * Get positive
   * @return positive
  **/
  @Schema(description = "")
  public Boolean isPositive() {
    return positive;
  }

  public void setPositive(Boolean positive) {
    this.positive = positive;
  }

  public TaskInstanceDtoDuration units(List<TaskInstanceDtoDurationUnits> units) {
    this.units = units;
    return this;
  }

  public TaskInstanceDtoDuration addUnitsItem(TaskInstanceDtoDurationUnits unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<TaskInstanceDtoDurationUnits>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @Schema(description = "")
  public List<TaskInstanceDtoDurationUnits> getUnits() {
    return units;
  }

  public void setUnits(List<TaskInstanceDtoDurationUnits> units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInstanceDtoDuration taskInstanceDtoDuration = (TaskInstanceDtoDuration) o;
    return Objects.equals(this.seconds, taskInstanceDtoDuration.seconds) &&
        Objects.equals(this.zero, taskInstanceDtoDuration.zero) &&
        Objects.equals(this.nano, taskInstanceDtoDuration.nano) &&
        Objects.equals(this.negative, taskInstanceDtoDuration.negative) &&
        Objects.equals(this.positive, taskInstanceDtoDuration.positive) &&
        Objects.equals(this.units, taskInstanceDtoDuration.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds, zero, nano, negative, positive, units);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstanceDtoDuration {\n");
    
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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