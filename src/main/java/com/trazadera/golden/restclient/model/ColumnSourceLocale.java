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
import java.util.ArrayList;
import java.util.List;
/**
 * Data locale. Used for validating the format.
 */
@Schema(description = "Data locale. Used for validating the format.")

public class ColumnSourceLocale {
  @SerializedName("language")
  private String language = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("variant")
  private String variant = null;

  @SerializedName("script")
  private String script = null;

  @SerializedName("unicodeLocaleAttributes")
  private List<String> unicodeLocaleAttributes = null;

  @SerializedName("unicodeLocaleKeys")
  private List<String> unicodeLocaleKeys = null;

  @SerializedName("displayLanguage")
  private String displayLanguage = null;

  @SerializedName("displayScript")
  private String displayScript = null;

  @SerializedName("displayCountry")
  private String displayCountry = null;

  @SerializedName("displayVariant")
  private String displayVariant = null;

  @SerializedName("extensionKeys")
  private List<String> extensionKeys = null;

  @SerializedName("iso3Language")
  private String iso3Language = null;

  @SerializedName("iso3Country")
  private String iso3Country = null;

  public ColumnSourceLocale language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ColumnSourceLocale displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ColumnSourceLocale country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ColumnSourceLocale variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @Schema(description = "")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public ColumnSourceLocale script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @Schema(description = "")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }

  public ColumnSourceLocale unicodeLocaleAttributes(List<String> unicodeLocaleAttributes) {
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
    return this;
  }

  public ColumnSourceLocale addUnicodeLocaleAttributesItem(String unicodeLocaleAttributesItem) {
    if (this.unicodeLocaleAttributes == null) {
      this.unicodeLocaleAttributes = new ArrayList<String>();
    }
    this.unicodeLocaleAttributes.add(unicodeLocaleAttributesItem);
    return this;
  }

   /**
   * Get unicodeLocaleAttributes
   * @return unicodeLocaleAttributes
  **/
  @Schema(description = "")
  public List<String> getUnicodeLocaleAttributes() {
    return unicodeLocaleAttributes;
  }

  public void setUnicodeLocaleAttributes(List<String> unicodeLocaleAttributes) {
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
  }

  public ColumnSourceLocale unicodeLocaleKeys(List<String> unicodeLocaleKeys) {
    this.unicodeLocaleKeys = unicodeLocaleKeys;
    return this;
  }

  public ColumnSourceLocale addUnicodeLocaleKeysItem(String unicodeLocaleKeysItem) {
    if (this.unicodeLocaleKeys == null) {
      this.unicodeLocaleKeys = new ArrayList<String>();
    }
    this.unicodeLocaleKeys.add(unicodeLocaleKeysItem);
    return this;
  }

   /**
   * Get unicodeLocaleKeys
   * @return unicodeLocaleKeys
  **/
  @Schema(description = "")
  public List<String> getUnicodeLocaleKeys() {
    return unicodeLocaleKeys;
  }

  public void setUnicodeLocaleKeys(List<String> unicodeLocaleKeys) {
    this.unicodeLocaleKeys = unicodeLocaleKeys;
  }

  public ColumnSourceLocale displayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
    return this;
  }

   /**
   * Get displayLanguage
   * @return displayLanguage
  **/
  @Schema(description = "")
  public String getDisplayLanguage() {
    return displayLanguage;
  }

  public void setDisplayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
  }

  public ColumnSourceLocale displayScript(String displayScript) {
    this.displayScript = displayScript;
    return this;
  }

   /**
   * Get displayScript
   * @return displayScript
  **/
  @Schema(description = "")
  public String getDisplayScript() {
    return displayScript;
  }

  public void setDisplayScript(String displayScript) {
    this.displayScript = displayScript;
  }

  public ColumnSourceLocale displayCountry(String displayCountry) {
    this.displayCountry = displayCountry;
    return this;
  }

   /**
   * Get displayCountry
   * @return displayCountry
  **/
  @Schema(description = "")
  public String getDisplayCountry() {
    return displayCountry;
  }

  public void setDisplayCountry(String displayCountry) {
    this.displayCountry = displayCountry;
  }

  public ColumnSourceLocale displayVariant(String displayVariant) {
    this.displayVariant = displayVariant;
    return this;
  }

   /**
   * Get displayVariant
   * @return displayVariant
  **/
  @Schema(description = "")
  public String getDisplayVariant() {
    return displayVariant;
  }

  public void setDisplayVariant(String displayVariant) {
    this.displayVariant = displayVariant;
  }

  public ColumnSourceLocale extensionKeys(List<String> extensionKeys) {
    this.extensionKeys = extensionKeys;
    return this;
  }

  public ColumnSourceLocale addExtensionKeysItem(String extensionKeysItem) {
    if (this.extensionKeys == null) {
      this.extensionKeys = new ArrayList<String>();
    }
    this.extensionKeys.add(extensionKeysItem);
    return this;
  }

   /**
   * Get extensionKeys
   * @return extensionKeys
  **/
  @Schema(description = "")
  public List<String> getExtensionKeys() {
    return extensionKeys;
  }

  public void setExtensionKeys(List<String> extensionKeys) {
    this.extensionKeys = extensionKeys;
  }

  public ColumnSourceLocale iso3Language(String iso3Language) {
    this.iso3Language = iso3Language;
    return this;
  }

   /**
   * Get iso3Language
   * @return iso3Language
  **/
  @Schema(description = "")
  public String getIso3Language() {
    return iso3Language;
  }

  public void setIso3Language(String iso3Language) {
    this.iso3Language = iso3Language;
  }

  public ColumnSourceLocale iso3Country(String iso3Country) {
    this.iso3Country = iso3Country;
    return this;
  }

   /**
   * Get iso3Country
   * @return iso3Country
  **/
  @Schema(description = "")
  public String getIso3Country() {
    return iso3Country;
  }

  public void setIso3Country(String iso3Country) {
    this.iso3Country = iso3Country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnSourceLocale columnSourceLocale = (ColumnSourceLocale) o;
    return Objects.equals(this.language, columnSourceLocale.language) &&
        Objects.equals(this.displayName, columnSourceLocale.displayName) &&
        Objects.equals(this.country, columnSourceLocale.country) &&
        Objects.equals(this.variant, columnSourceLocale.variant) &&
        Objects.equals(this.script, columnSourceLocale.script) &&
        Objects.equals(this.unicodeLocaleAttributes, columnSourceLocale.unicodeLocaleAttributes) &&
        Objects.equals(this.unicodeLocaleKeys, columnSourceLocale.unicodeLocaleKeys) &&
        Objects.equals(this.displayLanguage, columnSourceLocale.displayLanguage) &&
        Objects.equals(this.displayScript, columnSourceLocale.displayScript) &&
        Objects.equals(this.displayCountry, columnSourceLocale.displayCountry) &&
        Objects.equals(this.displayVariant, columnSourceLocale.displayVariant) &&
        Objects.equals(this.extensionKeys, columnSourceLocale.extensionKeys) &&
        Objects.equals(this.iso3Language, columnSourceLocale.iso3Language) &&
        Objects.equals(this.iso3Country, columnSourceLocale.iso3Country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, displayName, country, variant, script, unicodeLocaleAttributes, unicodeLocaleKeys, displayLanguage, displayScript, displayCountry, displayVariant, extensionKeys, iso3Language, iso3Country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnSourceLocale {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    unicodeLocaleAttributes: ").append(toIndentedString(unicodeLocaleAttributes)).append("\n");
    sb.append("    unicodeLocaleKeys: ").append(toIndentedString(unicodeLocaleKeys)).append("\n");
    sb.append("    displayLanguage: ").append(toIndentedString(displayLanguage)).append("\n");
    sb.append("    displayScript: ").append(toIndentedString(displayScript)).append("\n");
    sb.append("    displayCountry: ").append(toIndentedString(displayCountry)).append("\n");
    sb.append("    displayVariant: ").append(toIndentedString(displayVariant)).append("\n");
    sb.append("    extensionKeys: ").append(toIndentedString(extensionKeys)).append("\n");
    sb.append("    iso3Language: ").append(toIndentedString(iso3Language)).append("\n");
    sb.append("    iso3Country: ").append(toIndentedString(iso3Country)).append("\n");
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
