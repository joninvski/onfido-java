/*
 * Onfido API v3.6
 * The Onfido API (v3.6)
 *
 * The version of the OpenAPI document: v3.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.onfido.model.WorkflowRunResponseError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * WorkflowRunResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class WorkflowRunResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_WORKFLOW_VERSION_ID = "workflow_version_id";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_VERSION_ID)
  private Integer workflowVersionId;

  public static final String SERIALIZED_NAME_DASHBOARD_URL = "dashboard_url";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_URL)
  private String dashboardUrl;

  /**
   * The status of the Workflow Run.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AWAITING_INPUT("awaiting_input"),
    
    PROCESSING("processing"),
    
    ABANDONED("abandoned"),
    
    ERROR("error"),
    
    APPROVED("approved"),
    
    REVIEW("review"),
    
    DECLINED("declined"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private Object output;

  public static final String SERIALIZED_NAME_REASONS = "reasons";
  @SerializedName(SERIALIZED_NAME_REASONS)
  private List<String> reasons;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private WorkflowRunResponseError error;

  public WorkflowRunResponse() {
  }

  public WorkflowRunResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the Workflow Run.
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public WorkflowRunResponse workflowVersionId(Integer workflowVersionId) {
    this.workflowVersionId = workflowVersionId;
    return this;
  }

   /**
   * The identifier for the Workflow version.
   * @return workflowVersionId
  **/
  @javax.annotation.Nullable
  public Integer getWorkflowVersionId() {
    return workflowVersionId;
  }

  public void setWorkflowVersionId(Integer workflowVersionId) {
    this.workflowVersionId = workflowVersionId;
  }


  public WorkflowRunResponse dashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

   /**
   * The URL for viewing the Workflow Run results on your Onfido Dashboard.
   * @return dashboardUrl
  **/
  @javax.annotation.Nullable
  public String getDashboardUrl() {
    return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
  }


  public WorkflowRunResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the Workflow Run.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WorkflowRunResponse output(Object output) {
    this.output = output;
    return this;
  }

   /**
   * Output object contains all of the properties configured on the Workflow version.
   * @return output
  **/
  @javax.annotation.Nullable
  public Object getOutput() {
    return output;
  }

  public void setOutput(Object output) {
    this.output = output;
  }


  public WorkflowRunResponse reasons(List<String> reasons) {
    this.reasons = reasons;
    return this;
  }

  public WorkflowRunResponse addReasonsItem(String reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * The reasons the Workflow Run outcome was reached. Configurable when creating the Workflow version.
   * @return reasons
  **/
  @javax.annotation.Nullable
  public List<String> getReasons() {
    return reasons;
  }

  public void setReasons(List<String> reasons) {
    this.reasons = reasons;
  }


  public WorkflowRunResponse error(WorkflowRunResponseError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public WorkflowRunResponseError getError() {
    return error;
  }

  public void setError(WorkflowRunResponseError error) {
    this.error = error;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WorkflowRunResponse instance itself
   */
  public WorkflowRunResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRunResponse workflowRunResponse = (WorkflowRunResponse) o;
    return Objects.equals(this.id, workflowRunResponse.id) &&
        Objects.equals(this.workflowVersionId, workflowRunResponse.workflowVersionId) &&
        Objects.equals(this.dashboardUrl, workflowRunResponse.dashboardUrl) &&
        Objects.equals(this.status, workflowRunResponse.status) &&
        Objects.equals(this.output, workflowRunResponse.output) &&
        Objects.equals(this.reasons, workflowRunResponse.reasons) &&
        Objects.equals(this.error, workflowRunResponse.error)&&
        Objects.equals(this.additionalProperties, workflowRunResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workflowVersionId, dashboardUrl, status, output, reasons, error, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRunResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workflowVersionId: ").append(toIndentedString(workflowVersionId)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("workflow_version_id");
    openapiFields.add("dashboard_url");
    openapiFields.add("status");
    openapiFields.add("output");
    openapiFields.add("reasons");
    openapiFields.add("error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkflowRunResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowRunResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowRunResponse is not found in the empty JSON string", WorkflowRunResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowRunResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("dashboard_url") != null && !jsonObj.get("dashboard_url").isJsonNull()) && !jsonObj.get("dashboard_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboard_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboard_url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reasons") != null && !jsonObj.get("reasons").isJsonNull() && !jsonObj.get("reasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasons` to be an array in the JSON string but got `%s`", jsonObj.get("reasons").toString()));
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        WorkflowRunResponseError.validateJsonElement(jsonObj.get("error"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowRunResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowRunResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowRunResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowRunResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowRunResponse>() {
           @Override
           public void write(JsonWriter out, WorkflowRunResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowRunResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WorkflowRunResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowRunResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowRunResponse
  * @throws IOException if the JSON string is invalid with respect to WorkflowRunResponse
  */
  public static WorkflowRunResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowRunResponse.class);
  }

 /**
  * Convert an instance of WorkflowRunResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

