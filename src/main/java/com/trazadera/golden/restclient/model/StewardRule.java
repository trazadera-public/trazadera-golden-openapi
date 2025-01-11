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
import com.trazadera.golden.restclient.model.StewardCondition;
import com.trazadera.golden.restclient.model.StewardFiltering;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A rule to filter buckets and execute an action.
 */
@Schema(description = "A rule to filter buckets and execute an action.")

public class StewardRule {
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("filtering")
  private StewardFiltering filtering = null;

  /**
   * The sorting criteria for a bucket.
   */
  @JsonAdapter(SortingEnum.Adapter.class)
  public enum SortingEnum {
    @SerializedName("SIZE_ASC")
    SIZE_ASC("SIZE_ASC"),
    @SerializedName("SIZE_DESC")
    SIZE_DESC("SIZE_DESC"),
    @SerializedName("SCORE_ASC")
    SCORE_ASC("SCORE_ASC"),
    @SerializedName("SCORE_DESC")
    SCORE_DESC("SCORE_DESC"),
    @SerializedName("DEVIATION_ASC")
    DEVIATION_ASC("DEVIATION_ASC"),
    @SerializedName("DEVIATION_DESC")
    DEVIATION_DESC("DEVIATION_DESC"),
    @SerializedName("NATURAL")
    NATURAL("NATURAL");

    private String value;

    SortingEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SortingEnum fromValue(String input) {
      for (SortingEnum b : SortingEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SortingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortingEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SortingEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SortingEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("sorting")
  private List<SortingEnum> sorting = null;

  @SerializedName("conditions")
  private List<StewardCondition> conditions = null;

  /**
   * An action to execute on a bucket.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    @SerializedName("MERGE")
    MERGE("MERGE"),
    @SerializedName("DISCONNECT")
    DISCONNECT("DISCONNECT"),
    @SerializedName("SPLIT")
    SPLIT("SPLIT"),
    @SerializedName("DELETE")
    DELETE("DELETE"),
    @SerializedName("IGNORE")
    IGNORE("IGNORE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionEnum fromValue(String input) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ActionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("action")
  private ActionEnum action = null;

  public StewardRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the rule.
   * @return id
  **/
  @Schema(required = true, description = "The identifier of the rule.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StewardRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the rule.
   * @return description
  **/
  @Schema(description = "The description of the rule.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StewardRule filtering(StewardFiltering filtering) {
    this.filtering = filtering;
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @Schema(description = "")
  public StewardFiltering getFiltering() {
    return filtering;
  }

  public void setFiltering(StewardFiltering filtering) {
    this.filtering = filtering;
  }

  public StewardRule sorting(List<SortingEnum> sorting) {
    this.sorting = sorting;
    return this;
  }

  public StewardRule addSortingItem(SortingEnum sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<SortingEnum>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

   /**
   * The sorting used to filter. Optional. Default is to consider natural sorting.
   * @return sorting
  **/
  @Schema(description = "The sorting used to filter. Optional. Default is to consider natural sorting.")
  public List<SortingEnum> getSorting() {
    return sorting;
  }

  public void setSorting(List<SortingEnum> sorting) {
    this.sorting = sorting;
  }

  public StewardRule conditions(List<StewardCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public StewardRule addConditionsItem(StewardCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<StewardCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The bucket conditions.
   * @return conditions
  **/
  @Schema(description = "The bucket conditions.")
  public List<StewardCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<StewardCondition> conditions) {
    this.conditions = conditions;
  }

  public StewardRule action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * An action to execute on a bucket.
   * @return action
  **/
  @Schema(required = true, description = "An action to execute on a bucket.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StewardRule stewardRule = (StewardRule) o;
    return Objects.equals(this.id, stewardRule.id) &&
        Objects.equals(this.description, stewardRule.description) &&
        Objects.equals(this.filtering, stewardRule.filtering) &&
        Objects.equals(this.sorting, stewardRule.sorting) &&
        Objects.equals(this.conditions, stewardRule.conditions) &&
        Objects.equals(this.action, stewardRule.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, filtering, sorting, conditions, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StewardRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
