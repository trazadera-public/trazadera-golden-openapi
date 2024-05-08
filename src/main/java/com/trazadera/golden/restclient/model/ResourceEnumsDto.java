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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Represents handy configuration enumerations and lists.
 */
@Schema(description = "Represents handy configuration enumerations and lists.")

public class ResourceEnumsDto {
  @SerializedName("columnTokens")
  private List<String> columnTokens = null;

  @SerializedName("columnTokensLabels")
  private Map<String, String> columnTokensLabels = null;

  @SerializedName("columnValidations")
  private List<String> columnValidations = null;

  @SerializedName("columnValidationsLabels")
  private Map<String, String> columnValidationsLabels = null;

  @SerializedName("textOptions")
  private List<String> textOptions = null;

  @SerializedName("textOptionsLabels")
  private Map<String, String> textOptionsLabels = null;

  @SerializedName("columnErrorPolicies")
  private List<String> columnErrorPolicies = null;

  @SerializedName("columnErrorPoliciesLabels")
  private Map<String, String> columnErrorPoliciesLabels = null;

  @SerializedName("datasetColumns")
  private Map<String, List<String>> datasetColumns = null;

  @SerializedName("datasetColumnsLabels")
  private Map<String, Map<String, String>> datasetColumnsLabels = null;

  @SerializedName("datasets")
  private List<String> datasets = null;

  @SerializedName("datasetsLabels")
  private Map<String, String> datasetsLabels = null;

  @SerializedName("credentials")
  private List<String> credentials = null;

  @SerializedName("credentialsLabels")
  private Map<String, String> credentialsLabels = null;

  @SerializedName("tables")
  private List<String> tables = null;

  @SerializedName("tablesLabels")
  private Map<String, String> tablesLabels = null;

  @SerializedName("sources")
  private List<String> sources = null;

  @SerializedName("sourcesLabels")
  private Map<String, String> sourcesLabels = null;

  @SerializedName("sinks")
  private List<String> sinks = null;

  @SerializedName("sinksLabels")
  private Map<String, String> sinksLabels = null;

  @SerializedName("transformations")
  private List<String> transformations = null;

  @SerializedName("transformationsLabels")
  private Map<String, String> transformationsLabels = null;

  @SerializedName("pipelines")
  private List<String> pipelines = null;

  @SerializedName("pipelinesLabels")
  private Map<String, String> pipelinesLabels = null;

  @SerializedName("pipelineProcessors")
  private List<String> pipelineProcessors = null;

  @SerializedName("pipelineProcessorsLabels")
  private Map<String, String> pipelineProcessorsLabels = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public ResourceEnumsDto columnTokens(List<String> columnTokens) {
    this.columnTokens = columnTokens;
    return this;
  }

  public ResourceEnumsDto addColumnTokensItem(String columnTokensItem) {
    if (this.columnTokens == null) {
      this.columnTokens = new ArrayList<String>();
    }
    this.columnTokens.add(columnTokensItem);
    return this;
  }

   /**
   * Column tokens.
   * @return columnTokens
  **/
  @Schema(description = "Column tokens.")
  public List<String> getColumnTokens() {
    return columnTokens;
  }

  public void setColumnTokens(List<String> columnTokens) {
    this.columnTokens = columnTokens;
  }

  public ResourceEnumsDto columnTokensLabels(Map<String, String> columnTokensLabels) {
    this.columnTokensLabels = columnTokensLabels;
    return this;
  }

  public ResourceEnumsDto putColumnTokensLabelsItem(String key, String columnTokensLabelsItem) {
    if (this.columnTokensLabels == null) {
      this.columnTokensLabels = new HashMap<String, String>();
    }
    this.columnTokensLabels.put(key, columnTokensLabelsItem);
    return this;
  }

   /**
   * Column tokens and labels.
   * @return columnTokensLabels
  **/
  @Schema(description = "Column tokens and labels.")
  public Map<String, String> getColumnTokensLabels() {
    return columnTokensLabels;
  }

  public void setColumnTokensLabels(Map<String, String> columnTokensLabels) {
    this.columnTokensLabels = columnTokensLabels;
  }

  public ResourceEnumsDto columnValidations(List<String> columnValidations) {
    this.columnValidations = columnValidations;
    return this;
  }

  public ResourceEnumsDto addColumnValidationsItem(String columnValidationsItem) {
    if (this.columnValidations == null) {
      this.columnValidations = new ArrayList<String>();
    }
    this.columnValidations.add(columnValidationsItem);
    return this;
  }

   /**
   * Column validations.
   * @return columnValidations
  **/
  @Schema(description = "Column validations.")
  public List<String> getColumnValidations() {
    return columnValidations;
  }

  public void setColumnValidations(List<String> columnValidations) {
    this.columnValidations = columnValidations;
  }

  public ResourceEnumsDto columnValidationsLabels(Map<String, String> columnValidationsLabels) {
    this.columnValidationsLabels = columnValidationsLabels;
    return this;
  }

  public ResourceEnumsDto putColumnValidationsLabelsItem(String key, String columnValidationsLabelsItem) {
    if (this.columnValidationsLabels == null) {
      this.columnValidationsLabels = new HashMap<String, String>();
    }
    this.columnValidationsLabels.put(key, columnValidationsLabelsItem);
    return this;
  }

   /**
   * Column validations and labels.
   * @return columnValidationsLabels
  **/
  @Schema(description = "Column validations and labels.")
  public Map<String, String> getColumnValidationsLabels() {
    return columnValidationsLabels;
  }

  public void setColumnValidationsLabels(Map<String, String> columnValidationsLabels) {
    this.columnValidationsLabels = columnValidationsLabels;
  }

  public ResourceEnumsDto textOptions(List<String> textOptions) {
    this.textOptions = textOptions;
    return this;
  }

  public ResourceEnumsDto addTextOptionsItem(String textOptionsItem) {
    if (this.textOptions == null) {
      this.textOptions = new ArrayList<String>();
    }
    this.textOptions.add(textOptionsItem);
    return this;
  }

   /**
   * Text options.
   * @return textOptions
  **/
  @Schema(description = "Text options.")
  public List<String> getTextOptions() {
    return textOptions;
  }

  public void setTextOptions(List<String> textOptions) {
    this.textOptions = textOptions;
  }

  public ResourceEnumsDto textOptionsLabels(Map<String, String> textOptionsLabels) {
    this.textOptionsLabels = textOptionsLabels;
    return this;
  }

  public ResourceEnumsDto putTextOptionsLabelsItem(String key, String textOptionsLabelsItem) {
    if (this.textOptionsLabels == null) {
      this.textOptionsLabels = new HashMap<String, String>();
    }
    this.textOptionsLabels.put(key, textOptionsLabelsItem);
    return this;
  }

   /**
   * Text options and labels.
   * @return textOptionsLabels
  **/
  @Schema(description = "Text options and labels.")
  public Map<String, String> getTextOptionsLabels() {
    return textOptionsLabels;
  }

  public void setTextOptionsLabels(Map<String, String> textOptionsLabels) {
    this.textOptionsLabels = textOptionsLabels;
  }

  public ResourceEnumsDto columnErrorPolicies(List<String> columnErrorPolicies) {
    this.columnErrorPolicies = columnErrorPolicies;
    return this;
  }

  public ResourceEnumsDto addColumnErrorPoliciesItem(String columnErrorPoliciesItem) {
    if (this.columnErrorPolicies == null) {
      this.columnErrorPolicies = new ArrayList<String>();
    }
    this.columnErrorPolicies.add(columnErrorPoliciesItem);
    return this;
  }

   /**
   * Column error policies.
   * @return columnErrorPolicies
  **/
  @Schema(description = "Column error policies.")
  public List<String> getColumnErrorPolicies() {
    return columnErrorPolicies;
  }

  public void setColumnErrorPolicies(List<String> columnErrorPolicies) {
    this.columnErrorPolicies = columnErrorPolicies;
  }

  public ResourceEnumsDto columnErrorPoliciesLabels(Map<String, String> columnErrorPoliciesLabels) {
    this.columnErrorPoliciesLabels = columnErrorPoliciesLabels;
    return this;
  }

  public ResourceEnumsDto putColumnErrorPoliciesLabelsItem(String key, String columnErrorPoliciesLabelsItem) {
    if (this.columnErrorPoliciesLabels == null) {
      this.columnErrorPoliciesLabels = new HashMap<String, String>();
    }
    this.columnErrorPoliciesLabels.put(key, columnErrorPoliciesLabelsItem);
    return this;
  }

   /**
   * Column error policies and labels.
   * @return columnErrorPoliciesLabels
  **/
  @Schema(description = "Column error policies and labels.")
  public Map<String, String> getColumnErrorPoliciesLabels() {
    return columnErrorPoliciesLabels;
  }

  public void setColumnErrorPoliciesLabels(Map<String, String> columnErrorPoliciesLabels) {
    this.columnErrorPoliciesLabels = columnErrorPoliciesLabels;
  }

  public ResourceEnumsDto datasetColumns(Map<String, List<String>> datasetColumns) {
    this.datasetColumns = datasetColumns;
    return this;
  }

  public ResourceEnumsDto putDatasetColumnsItem(String key, List<String> datasetColumnsItem) {
    if (this.datasetColumns == null) {
      this.datasetColumns = new HashMap<String, List<String>>();
    }
    this.datasetColumns.put(key, datasetColumnsItem);
    return this;
  }

   /**
   * Datasets and columns.
   * @return datasetColumns
  **/
  @Schema(description = "Datasets and columns.")
  public Map<String, List<String>> getDatasetColumns() {
    return datasetColumns;
  }

  public void setDatasetColumns(Map<String, List<String>> datasetColumns) {
    this.datasetColumns = datasetColumns;
  }

  public ResourceEnumsDto datasetColumnsLabels(Map<String, Map<String, String>> datasetColumnsLabels) {
    this.datasetColumnsLabels = datasetColumnsLabels;
    return this;
  }

  public ResourceEnumsDto putDatasetColumnsLabelsItem(String key, Map<String, String> datasetColumnsLabelsItem) {
    if (this.datasetColumnsLabels == null) {
      this.datasetColumnsLabels = new HashMap<String, Map<String, String>>();
    }
    this.datasetColumnsLabels.put(key, datasetColumnsLabelsItem);
    return this;
  }

   /**
   * Datasets, columns and labels.
   * @return datasetColumnsLabels
  **/
  @Schema(description = "Datasets, columns and labels.")
  public Map<String, Map<String, String>> getDatasetColumnsLabels() {
    return datasetColumnsLabels;
  }

  public void setDatasetColumnsLabels(Map<String, Map<String, String>> datasetColumnsLabels) {
    this.datasetColumnsLabels = datasetColumnsLabels;
  }

  public ResourceEnumsDto datasets(List<String> datasets) {
    this.datasets = datasets;
    return this;
  }

  public ResourceEnumsDto addDatasetsItem(String datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<String>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * Datasets.
   * @return datasets
  **/
  @Schema(description = "Datasets.")
  public List<String> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<String> datasets) {
    this.datasets = datasets;
  }

  public ResourceEnumsDto datasetsLabels(Map<String, String> datasetsLabels) {
    this.datasetsLabels = datasetsLabels;
    return this;
  }

  public ResourceEnumsDto putDatasetsLabelsItem(String key, String datasetsLabelsItem) {
    if (this.datasetsLabels == null) {
      this.datasetsLabels = new HashMap<String, String>();
    }
    this.datasetsLabels.put(key, datasetsLabelsItem);
    return this;
  }

   /**
   * Datasets and labels.
   * @return datasetsLabels
  **/
  @Schema(description = "Datasets and labels.")
  public Map<String, String> getDatasetsLabels() {
    return datasetsLabels;
  }

  public void setDatasetsLabels(Map<String, String> datasetsLabels) {
    this.datasetsLabels = datasetsLabels;
  }

  public ResourceEnumsDto credentials(List<String> credentials) {
    this.credentials = credentials;
    return this;
  }

  public ResourceEnumsDto addCredentialsItem(String credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<String>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Credentials.
   * @return credentials
  **/
  @Schema(description = "Credentials.")
  public List<String> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<String> credentials) {
    this.credentials = credentials;
  }

  public ResourceEnumsDto credentialsLabels(Map<String, String> credentialsLabels) {
    this.credentialsLabels = credentialsLabels;
    return this;
  }

  public ResourceEnumsDto putCredentialsLabelsItem(String key, String credentialsLabelsItem) {
    if (this.credentialsLabels == null) {
      this.credentialsLabels = new HashMap<String, String>();
    }
    this.credentialsLabels.put(key, credentialsLabelsItem);
    return this;
  }

   /**
   * Credentials and labels.
   * @return credentialsLabels
  **/
  @Schema(description = "Credentials and labels.")
  public Map<String, String> getCredentialsLabels() {
    return credentialsLabels;
  }

  public void setCredentialsLabels(Map<String, String> credentialsLabels) {
    this.credentialsLabels = credentialsLabels;
  }

  public ResourceEnumsDto tables(List<String> tables) {
    this.tables = tables;
    return this;
  }

  public ResourceEnumsDto addTablesItem(String tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<String>();
    }
    this.tables.add(tablesItem);
    return this;
  }

   /**
   * Tables.
   * @return tables
  **/
  @Schema(description = "Tables.")
  public List<String> getTables() {
    return tables;
  }

  public void setTables(List<String> tables) {
    this.tables = tables;
  }

  public ResourceEnumsDto tablesLabels(Map<String, String> tablesLabels) {
    this.tablesLabels = tablesLabels;
    return this;
  }

  public ResourceEnumsDto putTablesLabelsItem(String key, String tablesLabelsItem) {
    if (this.tablesLabels == null) {
      this.tablesLabels = new HashMap<String, String>();
    }
    this.tablesLabels.put(key, tablesLabelsItem);
    return this;
  }

   /**
   * Tables and labels.
   * @return tablesLabels
  **/
  @Schema(description = "Tables and labels.")
  public Map<String, String> getTablesLabels() {
    return tablesLabels;
  }

  public void setTablesLabels(Map<String, String> tablesLabels) {
    this.tablesLabels = tablesLabels;
  }

  public ResourceEnumsDto sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public ResourceEnumsDto addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<String>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Sources.
   * @return sources
  **/
  @Schema(description = "Sources.")
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public ResourceEnumsDto sourcesLabels(Map<String, String> sourcesLabels) {
    this.sourcesLabels = sourcesLabels;
    return this;
  }

  public ResourceEnumsDto putSourcesLabelsItem(String key, String sourcesLabelsItem) {
    if (this.sourcesLabels == null) {
      this.sourcesLabels = new HashMap<String, String>();
    }
    this.sourcesLabels.put(key, sourcesLabelsItem);
    return this;
  }

   /**
   * Sources and labels.
   * @return sourcesLabels
  **/
  @Schema(description = "Sources and labels.")
  public Map<String, String> getSourcesLabels() {
    return sourcesLabels;
  }

  public void setSourcesLabels(Map<String, String> sourcesLabels) {
    this.sourcesLabels = sourcesLabels;
  }

  public ResourceEnumsDto sinks(List<String> sinks) {
    this.sinks = sinks;
    return this;
  }

  public ResourceEnumsDto addSinksItem(String sinksItem) {
    if (this.sinks == null) {
      this.sinks = new ArrayList<String>();
    }
    this.sinks.add(sinksItem);
    return this;
  }

   /**
   * Sinks.
   * @return sinks
  **/
  @Schema(description = "Sinks.")
  public List<String> getSinks() {
    return sinks;
  }

  public void setSinks(List<String> sinks) {
    this.sinks = sinks;
  }

  public ResourceEnumsDto sinksLabels(Map<String, String> sinksLabels) {
    this.sinksLabels = sinksLabels;
    return this;
  }

  public ResourceEnumsDto putSinksLabelsItem(String key, String sinksLabelsItem) {
    if (this.sinksLabels == null) {
      this.sinksLabels = new HashMap<String, String>();
    }
    this.sinksLabels.put(key, sinksLabelsItem);
    return this;
  }

   /**
   * Sinks and labels.
   * @return sinksLabels
  **/
  @Schema(description = "Sinks and labels.")
  public Map<String, String> getSinksLabels() {
    return sinksLabels;
  }

  public void setSinksLabels(Map<String, String> sinksLabels) {
    this.sinksLabels = sinksLabels;
  }

  public ResourceEnumsDto transformations(List<String> transformations) {
    this.transformations = transformations;
    return this;
  }

  public ResourceEnumsDto addTransformationsItem(String transformationsItem) {
    if (this.transformations == null) {
      this.transformations = new ArrayList<String>();
    }
    this.transformations.add(transformationsItem);
    return this;
  }

   /**
   * Transformations.
   * @return transformations
  **/
  @Schema(description = "Transformations.")
  public List<String> getTransformations() {
    return transformations;
  }

  public void setTransformations(List<String> transformations) {
    this.transformations = transformations;
  }

  public ResourceEnumsDto transformationsLabels(Map<String, String> transformationsLabels) {
    this.transformationsLabels = transformationsLabels;
    return this;
  }

  public ResourceEnumsDto putTransformationsLabelsItem(String key, String transformationsLabelsItem) {
    if (this.transformationsLabels == null) {
      this.transformationsLabels = new HashMap<String, String>();
    }
    this.transformationsLabels.put(key, transformationsLabelsItem);
    return this;
  }

   /**
   * Transformations and labels.
   * @return transformationsLabels
  **/
  @Schema(description = "Transformations and labels.")
  public Map<String, String> getTransformationsLabels() {
    return transformationsLabels;
  }

  public void setTransformationsLabels(Map<String, String> transformationsLabels) {
    this.transformationsLabels = transformationsLabels;
  }

  public ResourceEnumsDto pipelines(List<String> pipelines) {
    this.pipelines = pipelines;
    return this;
  }

  public ResourceEnumsDto addPipelinesItem(String pipelinesItem) {
    if (this.pipelines == null) {
      this.pipelines = new ArrayList<String>();
    }
    this.pipelines.add(pipelinesItem);
    return this;
  }

   /**
   * Pipelines.
   * @return pipelines
  **/
  @Schema(description = "Pipelines.")
  public List<String> getPipelines() {
    return pipelines;
  }

  public void setPipelines(List<String> pipelines) {
    this.pipelines = pipelines;
  }

  public ResourceEnumsDto pipelinesLabels(Map<String, String> pipelinesLabels) {
    this.pipelinesLabels = pipelinesLabels;
    return this;
  }

  public ResourceEnumsDto putPipelinesLabelsItem(String key, String pipelinesLabelsItem) {
    if (this.pipelinesLabels == null) {
      this.pipelinesLabels = new HashMap<String, String>();
    }
    this.pipelinesLabels.put(key, pipelinesLabelsItem);
    return this;
  }

   /**
   * Pipelines and labels.
   * @return pipelinesLabels
  **/
  @Schema(description = "Pipelines and labels.")
  public Map<String, String> getPipelinesLabels() {
    return pipelinesLabels;
  }

  public void setPipelinesLabels(Map<String, String> pipelinesLabels) {
    this.pipelinesLabels = pipelinesLabels;
  }

  public ResourceEnumsDto pipelineProcessors(List<String> pipelineProcessors) {
    this.pipelineProcessors = pipelineProcessors;
    return this;
  }

  public ResourceEnumsDto addPipelineProcessorsItem(String pipelineProcessorsItem) {
    if (this.pipelineProcessors == null) {
      this.pipelineProcessors = new ArrayList<String>();
    }
    this.pipelineProcessors.add(pipelineProcessorsItem);
    return this;
  }

   /**
   * Pipeline processors.
   * @return pipelineProcessors
  **/
  @Schema(description = "Pipeline processors.")
  public List<String> getPipelineProcessors() {
    return pipelineProcessors;
  }

  public void setPipelineProcessors(List<String> pipelineProcessors) {
    this.pipelineProcessors = pipelineProcessors;
  }

  public ResourceEnumsDto pipelineProcessorsLabels(Map<String, String> pipelineProcessorsLabels) {
    this.pipelineProcessorsLabels = pipelineProcessorsLabels;
    return this;
  }

  public ResourceEnumsDto putPipelineProcessorsLabelsItem(String key, String pipelineProcessorsLabelsItem) {
    if (this.pipelineProcessorsLabels == null) {
      this.pipelineProcessorsLabels = new HashMap<String, String>();
    }
    this.pipelineProcessorsLabels.put(key, pipelineProcessorsLabelsItem);
    return this;
  }

   /**
   * Pipeline processors and labels.
   * @return pipelineProcessorsLabels
  **/
  @Schema(description = "Pipeline processors and labels.")
  public Map<String, String> getPipelineProcessorsLabels() {
    return pipelineProcessorsLabels;
  }

  public void setPipelineProcessorsLabels(Map<String, String> pipelineProcessorsLabels) {
    this.pipelineProcessorsLabels = pipelineProcessorsLabels;
  }

  public ResourceEnumsDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public ResourceEnumsDto addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors.
   * @return errors
  **/
  @Schema(description = "List of errors. If HTTP response represents an error (4xx or 5xx) this will contain a list of errors.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public ResourceEnumsDto messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ResourceEnumsDto addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<String>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Optional success messages. If present, the request was successful and response code will be 2xx.
   * @return messages
  **/
  @Schema(description = "Optional success messages. If present, the request was successful and response code will be 2xx.")
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
    ResourceEnumsDto resourceEnumsDto = (ResourceEnumsDto) o;
    return Objects.equals(this.columnTokens, resourceEnumsDto.columnTokens) &&
        Objects.equals(this.columnTokensLabels, resourceEnumsDto.columnTokensLabels) &&
        Objects.equals(this.columnValidations, resourceEnumsDto.columnValidations) &&
        Objects.equals(this.columnValidationsLabels, resourceEnumsDto.columnValidationsLabels) &&
        Objects.equals(this.textOptions, resourceEnumsDto.textOptions) &&
        Objects.equals(this.textOptionsLabels, resourceEnumsDto.textOptionsLabels) &&
        Objects.equals(this.columnErrorPolicies, resourceEnumsDto.columnErrorPolicies) &&
        Objects.equals(this.columnErrorPoliciesLabels, resourceEnumsDto.columnErrorPoliciesLabels) &&
        Objects.equals(this.datasetColumns, resourceEnumsDto.datasetColumns) &&
        Objects.equals(this.datasetColumnsLabels, resourceEnumsDto.datasetColumnsLabels) &&
        Objects.equals(this.datasets, resourceEnumsDto.datasets) &&
        Objects.equals(this.datasetsLabels, resourceEnumsDto.datasetsLabels) &&
        Objects.equals(this.credentials, resourceEnumsDto.credentials) &&
        Objects.equals(this.credentialsLabels, resourceEnumsDto.credentialsLabels) &&
        Objects.equals(this.tables, resourceEnumsDto.tables) &&
        Objects.equals(this.tablesLabels, resourceEnumsDto.tablesLabels) &&
        Objects.equals(this.sources, resourceEnumsDto.sources) &&
        Objects.equals(this.sourcesLabels, resourceEnumsDto.sourcesLabels) &&
        Objects.equals(this.sinks, resourceEnumsDto.sinks) &&
        Objects.equals(this.sinksLabels, resourceEnumsDto.sinksLabels) &&
        Objects.equals(this.transformations, resourceEnumsDto.transformations) &&
        Objects.equals(this.transformationsLabels, resourceEnumsDto.transformationsLabels) &&
        Objects.equals(this.pipelines, resourceEnumsDto.pipelines) &&
        Objects.equals(this.pipelinesLabels, resourceEnumsDto.pipelinesLabels) &&
        Objects.equals(this.pipelineProcessors, resourceEnumsDto.pipelineProcessors) &&
        Objects.equals(this.pipelineProcessorsLabels, resourceEnumsDto.pipelineProcessorsLabels) &&
        Objects.equals(this.errors, resourceEnumsDto.errors) &&
        Objects.equals(this.messages, resourceEnumsDto.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnTokens, columnTokensLabels, columnValidations, columnValidationsLabels, textOptions, textOptionsLabels, columnErrorPolicies, columnErrorPoliciesLabels, datasetColumns, datasetColumnsLabels, datasets, datasetsLabels, credentials, credentialsLabels, tables, tablesLabels, sources, sourcesLabels, sinks, sinksLabels, transformations, transformationsLabels, pipelines, pipelinesLabels, pipelineProcessors, pipelineProcessorsLabels, errors, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceEnumsDto {\n");
    
    sb.append("    columnTokens: ").append(toIndentedString(columnTokens)).append("\n");
    sb.append("    columnTokensLabels: ").append(toIndentedString(columnTokensLabels)).append("\n");
    sb.append("    columnValidations: ").append(toIndentedString(columnValidations)).append("\n");
    sb.append("    columnValidationsLabels: ").append(toIndentedString(columnValidationsLabels)).append("\n");
    sb.append("    textOptions: ").append(toIndentedString(textOptions)).append("\n");
    sb.append("    textOptionsLabels: ").append(toIndentedString(textOptionsLabels)).append("\n");
    sb.append("    columnErrorPolicies: ").append(toIndentedString(columnErrorPolicies)).append("\n");
    sb.append("    columnErrorPoliciesLabels: ").append(toIndentedString(columnErrorPoliciesLabels)).append("\n");
    sb.append("    datasetColumns: ").append(toIndentedString(datasetColumns)).append("\n");
    sb.append("    datasetColumnsLabels: ").append(toIndentedString(datasetColumnsLabels)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    datasetsLabels: ").append(toIndentedString(datasetsLabels)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    credentialsLabels: ").append(toIndentedString(credentialsLabels)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
    sb.append("    tablesLabels: ").append(toIndentedString(tablesLabels)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    sourcesLabels: ").append(toIndentedString(sourcesLabels)).append("\n");
    sb.append("    sinks: ").append(toIndentedString(sinks)).append("\n");
    sb.append("    sinksLabels: ").append(toIndentedString(sinksLabels)).append("\n");
    sb.append("    transformations: ").append(toIndentedString(transformations)).append("\n");
    sb.append("    transformationsLabels: ").append(toIndentedString(transformationsLabels)).append("\n");
    sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
    sb.append("    pipelinesLabels: ").append(toIndentedString(pipelinesLabels)).append("\n");
    sb.append("    pipelineProcessors: ").append(toIndentedString(pipelineProcessors)).append("\n");
    sb.append("    pipelineProcessorsLabels: ").append(toIndentedString(pipelineProcessorsLabels)).append("\n");
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
