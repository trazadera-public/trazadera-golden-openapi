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
import com.trazadera.golden.restclient.model.Dependency;
import com.trazadera.golden.restclient.model.Resource;
import com.trazadera.golden.restclient.model.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * A source file is a resource that reads records from a Golden file.
 */
@Schema(description = "A source file is a resource that reads records from a Golden file.")

public class SourceFile extends Resource implements OneOfResourceExchangeDtoResourcesItems, OneOfResourceListResponseDtoResourcesItems, OneOfResourceResponseDtoResource {
  @SerializedName("dataset")
  private String dataset = null;

  @SerializedName("fromFilter")
  private OffsetDateTime fromFilter = null;

  @SerializedName("toFilter")
  private OffsetDateTime toFilter = null;

  @SerializedName("inputPattern")
  private String inputPattern = null;

  /**
   * The format of the file.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    @SerializedName("CSV")
    CSV("CSV"),
    @SerializedName("JSON")
    JSON("JSON");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FormatEnum fromValue(String input) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FormatEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("format")
  private FormatEnum format = null;

  @SerializedName("ignoreQuotes")
  private Boolean ignoreQuotes = null;

  @SerializedName("separator")
  private String separator = null;

  @SerializedName("header")
  private Boolean header = null;

  public SourceFile dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * The dataset to use.
   * @return dataset
  **/
  @Schema(description = "The dataset to use.")
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public SourceFile fromFilter(OffsetDateTime fromFilter) {
    this.fromFilter = fromFilter;
    return this;
  }

   /**
   * The from instant filter (optional).
   * @return fromFilter
  **/
  @Schema(description = "The from instant filter (optional).")
  public OffsetDateTime getFromFilter() {
    return fromFilter;
  }

  public void setFromFilter(OffsetDateTime fromFilter) {
    this.fromFilter = fromFilter;
  }

  public SourceFile toFilter(OffsetDateTime toFilter) {
    this.toFilter = toFilter;
    return this;
  }

   /**
   * The to instant filter (optional).
   * @return toFilter
  **/
  @Schema(description = "The to instant filter (optional).")
  public OffsetDateTime getToFilter() {
    return toFilter;
  }

  public void setToFilter(OffsetDateTime toFilter) {
    this.toFilter = toFilter;
  }

  public SourceFile inputPattern(String inputPattern) {
    this.inputPattern = inputPattern;
    return this;
  }

   /**
   * The pattern of the file name. Supports wildcards.
   * @return inputPattern
  **/
  @Schema(required = true, description = "The pattern of the file name. Supports wildcards.")
  public String getInputPattern() {
    return inputPattern;
  }

  public void setInputPattern(String inputPattern) {
    this.inputPattern = inputPattern;
  }

  public SourceFile format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * The format of the file.
   * @return format
  **/
  @Schema(required = true, description = "The format of the file.")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public SourceFile ignoreQuotes(Boolean ignoreQuotes) {
    this.ignoreQuotes = ignoreQuotes;
    return this;
  }

   /**
   * Ignore quotes in the file (only for CSV).
   * @return ignoreQuotes
  **/
  @Schema(description = "Ignore quotes in the file (only for CSV).")
  public Boolean isIgnoreQuotes() {
    return ignoreQuotes;
  }

  public void setIgnoreQuotes(Boolean ignoreQuotes) {
    this.ignoreQuotes = ignoreQuotes;
  }

  public SourceFile separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * The separator in the file (only for CSV).
   * @return separator
  **/
  @Schema(description = "The separator in the file (only for CSV).")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public SourceFile header(Boolean header) {
    this.header = header;
    return this;
  }

   /**
   * The file has a header (only for CSV).
   * @return header
  **/
  @Schema(description = "The file has a header (only for CSV).")
  public Boolean isHeader() {
    return header;
  }

  public void setHeader(Boolean header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceFile sourceFile = (SourceFile) o;
    return Objects.equals(this.dataset, sourceFile.dataset) &&
        Objects.equals(this.fromFilter, sourceFile.fromFilter) &&
        Objects.equals(this.toFilter, sourceFile.toFilter) &&
        Objects.equals(this.inputPattern, sourceFile.inputPattern) &&
        Objects.equals(this.format, sourceFile.format) &&
        Objects.equals(this.ignoreQuotes, sourceFile.ignoreQuotes) &&
        Objects.equals(this.separator, sourceFile.separator) &&
        Objects.equals(this.header, sourceFile.header) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, fromFilter, toFilter, inputPattern, format, ignoreQuotes, separator, header, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceFile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    fromFilter: ").append(toIndentedString(fromFilter)).append("\n");
    sb.append("    toFilter: ").append(toIndentedString(toFilter)).append("\n");
    sb.append("    inputPattern: ").append(toIndentedString(inputPattern)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    ignoreQuotes: ").append(toIndentedString(ignoreQuotes)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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