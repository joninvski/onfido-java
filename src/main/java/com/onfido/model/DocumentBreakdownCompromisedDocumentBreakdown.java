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
import com.onfido.model.DocumentBreakdownDataComparisonBreakdownIssuingCountry;
import java.io.IOException;
import java.util.Arrays;

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
 * DocumentBreakdownCompromisedDocumentBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DocumentBreakdownCompromisedDocumentBreakdown {
  public static final String SERIALIZED_NAME_DOCUMENT_DATABASE = "document_database";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_DATABASE)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry documentDatabase;

  public static final String SERIALIZED_NAME_REPEAT_ATTEMPTS = "repeat_attempts";
  @SerializedName(SERIALIZED_NAME_REPEAT_ATTEMPTS)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry repeatAttempts;

  public DocumentBreakdownCompromisedDocumentBreakdown() {
  }

  public DocumentBreakdownCompromisedDocumentBreakdown documentDatabase(DocumentBreakdownDataComparisonBreakdownIssuingCountry documentDatabase) {
    this.documentDatabase = documentDatabase;
    return this;
  }

   /**
   * Get documentDatabase
   * @return documentDatabase
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getDocumentDatabase() {
    return documentDatabase;
  }

  public void setDocumentDatabase(DocumentBreakdownDataComparisonBreakdownIssuingCountry documentDatabase) {
    this.documentDatabase = documentDatabase;
  }


  public DocumentBreakdownCompromisedDocumentBreakdown repeatAttempts(DocumentBreakdownDataComparisonBreakdownIssuingCountry repeatAttempts) {
    this.repeatAttempts = repeatAttempts;
    return this;
  }

   /**
   * Get repeatAttempts
   * @return repeatAttempts
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getRepeatAttempts() {
    return repeatAttempts;
  }

  public void setRepeatAttempts(DocumentBreakdownDataComparisonBreakdownIssuingCountry repeatAttempts) {
    this.repeatAttempts = repeatAttempts;
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
   * @return the DocumentBreakdownCompromisedDocumentBreakdown instance itself
   */
  public DocumentBreakdownCompromisedDocumentBreakdown putAdditionalProperty(String key, Object value) {
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
    DocumentBreakdownCompromisedDocumentBreakdown documentBreakdownCompromisedDocumentBreakdown = (DocumentBreakdownCompromisedDocumentBreakdown) o;
    return Objects.equals(this.documentDatabase, documentBreakdownCompromisedDocumentBreakdown.documentDatabase) &&
        Objects.equals(this.repeatAttempts, documentBreakdownCompromisedDocumentBreakdown.repeatAttempts)&&
        Objects.equals(this.additionalProperties, documentBreakdownCompromisedDocumentBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDatabase, repeatAttempts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownCompromisedDocumentBreakdown {\n");
    sb.append("    documentDatabase: ").append(toIndentedString(documentDatabase)).append("\n");
    sb.append("    repeatAttempts: ").append(toIndentedString(repeatAttempts)).append("\n");
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
    openapiFields.add("document_database");
    openapiFields.add("repeat_attempts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentBreakdownCompromisedDocumentBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentBreakdownCompromisedDocumentBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentBreakdownCompromisedDocumentBreakdown is not found in the empty JSON string", DocumentBreakdownCompromisedDocumentBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `document_database`
      if (jsonObj.get("document_database") != null && !jsonObj.get("document_database").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("document_database"));
      }
      // validate the optional field `repeat_attempts`
      if (jsonObj.get("repeat_attempts") != null && !jsonObj.get("repeat_attempts").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("repeat_attempts"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentBreakdownCompromisedDocumentBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentBreakdownCompromisedDocumentBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentBreakdownCompromisedDocumentBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentBreakdownCompromisedDocumentBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentBreakdownCompromisedDocumentBreakdown>() {
           @Override
           public void write(JsonWriter out, DocumentBreakdownCompromisedDocumentBreakdown value) throws IOException {
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
           public DocumentBreakdownCompromisedDocumentBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentBreakdownCompromisedDocumentBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentBreakdownCompromisedDocumentBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentBreakdownCompromisedDocumentBreakdown
  * @throws IOException if the JSON string is invalid with respect to DocumentBreakdownCompromisedDocumentBreakdown
  */
  public static DocumentBreakdownCompromisedDocumentBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentBreakdownCompromisedDocumentBreakdown.class);
  }

 /**
  * Convert an instance of DocumentBreakdownCompromisedDocumentBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

