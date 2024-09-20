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
import java.io.IOException;
import java.time.LocalDate;
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
 * WatchlistEnhancedPropertiesRecordsInnerEventInnerSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class WatchlistEnhancedPropertiesRecordsInnerEventInnerSource {
  public static final String SERIALIZED_NAME_SOURCE_DATE = "source_date";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATE)
  private LocalDate sourceDate;

  public static final String SERIALIZED_NAME_SOURCE_FORMAT = "source_format";
  @SerializedName(SERIALIZED_NAME_SOURCE_FORMAT)
  private String sourceFormat;

  public static final String SERIALIZED_NAME_SOURCE_NAME = "source_name";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public WatchlistEnhancedPropertiesRecordsInnerEventInnerSource() {
  }

  public WatchlistEnhancedPropertiesRecordsInnerEventInnerSource sourceDate(LocalDate sourceDate) {
    this.sourceDate = sourceDate;
    return this;
  }

   /**
   * Get sourceDate
   * @return sourceDate
  **/
  @javax.annotation.Nullable
  public LocalDate getSourceDate() {
    return sourceDate;
  }

  public void setSourceDate(LocalDate sourceDate) {
    this.sourceDate = sourceDate;
  }


  public WatchlistEnhancedPropertiesRecordsInnerEventInnerSource sourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
    return this;
  }

   /**
   * Get sourceFormat
   * @return sourceFormat
  **/
  @javax.annotation.Nullable
  public String getSourceFormat() {
    return sourceFormat;
  }

  public void setSourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
  }


  public WatchlistEnhancedPropertiesRecordsInnerEventInnerSource sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

   /**
   * Get sourceName
   * @return sourceName
  **/
  @javax.annotation.Nullable
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public WatchlistEnhancedPropertiesRecordsInnerEventInnerSource sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  @javax.annotation.Nullable
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
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
   * @return the WatchlistEnhancedPropertiesRecordsInnerEventInnerSource instance itself
   */
  public WatchlistEnhancedPropertiesRecordsInnerEventInnerSource putAdditionalProperty(String key, Object value) {
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
    WatchlistEnhancedPropertiesRecordsInnerEventInnerSource watchlistEnhancedPropertiesRecordsInnerEventInnerSource = (WatchlistEnhancedPropertiesRecordsInnerEventInnerSource) o;
    return Objects.equals(this.sourceDate, watchlistEnhancedPropertiesRecordsInnerEventInnerSource.sourceDate) &&
        Objects.equals(this.sourceFormat, watchlistEnhancedPropertiesRecordsInnerEventInnerSource.sourceFormat) &&
        Objects.equals(this.sourceName, watchlistEnhancedPropertiesRecordsInnerEventInnerSource.sourceName) &&
        Objects.equals(this.sourceUrl, watchlistEnhancedPropertiesRecordsInnerEventInnerSource.sourceUrl)&&
        Objects.equals(this.additionalProperties, watchlistEnhancedPropertiesRecordsInnerEventInnerSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDate, sourceFormat, sourceName, sourceUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistEnhancedPropertiesRecordsInnerEventInnerSource {\n");
    sb.append("    sourceDate: ").append(toIndentedString(sourceDate)).append("\n");
    sb.append("    sourceFormat: ").append(toIndentedString(sourceFormat)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
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
    openapiFields.add("source_date");
    openapiFields.add("source_format");
    openapiFields.add("source_name");
    openapiFields.add("source_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WatchlistEnhancedPropertiesRecordsInnerEventInnerSource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WatchlistEnhancedPropertiesRecordsInnerEventInnerSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WatchlistEnhancedPropertiesRecordsInnerEventInnerSource is not found in the empty JSON string", WatchlistEnhancedPropertiesRecordsInnerEventInnerSource.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("source_format") != null && !jsonObj.get("source_format").isJsonNull()) && !jsonObj.get("source_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_format").toString()));
      }
      if ((jsonObj.get("source_name") != null && !jsonObj.get("source_name").isJsonNull()) && !jsonObj.get("source_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_name").toString()));
      }
      if ((jsonObj.get("source_url") != null && !jsonObj.get("source_url").isJsonNull()) && !jsonObj.get("source_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WatchlistEnhancedPropertiesRecordsInnerEventInnerSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WatchlistEnhancedPropertiesRecordsInnerEventInnerSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WatchlistEnhancedPropertiesRecordsInnerEventInnerSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WatchlistEnhancedPropertiesRecordsInnerEventInnerSource.class));

       return (TypeAdapter<T>) new TypeAdapter<WatchlistEnhancedPropertiesRecordsInnerEventInnerSource>() {
           @Override
           public void write(JsonWriter out, WatchlistEnhancedPropertiesRecordsInnerEventInnerSource value) throws IOException {
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
           public WatchlistEnhancedPropertiesRecordsInnerEventInnerSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WatchlistEnhancedPropertiesRecordsInnerEventInnerSource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WatchlistEnhancedPropertiesRecordsInnerEventInnerSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WatchlistEnhancedPropertiesRecordsInnerEventInnerSource
  * @throws IOException if the JSON string is invalid with respect to WatchlistEnhancedPropertiesRecordsInnerEventInnerSource
  */
  public static WatchlistEnhancedPropertiesRecordsInnerEventInnerSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WatchlistEnhancedPropertiesRecordsInnerEventInnerSource.class);
  }

 /**
  * Convert an instance of WatchlistEnhancedPropertiesRecordsInnerEventInnerSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

