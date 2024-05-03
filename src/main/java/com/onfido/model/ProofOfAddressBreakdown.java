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
import com.onfido.model.ProofOfAddressBreakdownDataComparison;
import com.onfido.model.ProofOfAddressBreakdownDocumentClassification;
import com.onfido.model.ProofOfAddressBreakdownImageIntegrity;
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
 * ProofOfAddressBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ProofOfAddressBreakdown {
  public static final String SERIALIZED_NAME_DATA_COMPARISON = "data_comparison";
  @SerializedName(SERIALIZED_NAME_DATA_COMPARISON)
  private ProofOfAddressBreakdownDataComparison dataComparison;

  public static final String SERIALIZED_NAME_DOCUMENT_CLASSIFICATION = "document_classification";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CLASSIFICATION)
  private ProofOfAddressBreakdownDocumentClassification documentClassification;

  public static final String SERIALIZED_NAME_IMAGE_INTEGRITY = "image_integrity";
  @SerializedName(SERIALIZED_NAME_IMAGE_INTEGRITY)
  private ProofOfAddressBreakdownImageIntegrity imageIntegrity;

  public ProofOfAddressBreakdown() {
  }

  public ProofOfAddressBreakdown dataComparison(ProofOfAddressBreakdownDataComparison dataComparison) {
    this.dataComparison = dataComparison;
    return this;
  }

   /**
   * Get dataComparison
   * @return dataComparison
  **/
  @javax.annotation.Nullable
  public ProofOfAddressBreakdownDataComparison getDataComparison() {
    return dataComparison;
  }

  public void setDataComparison(ProofOfAddressBreakdownDataComparison dataComparison) {
    this.dataComparison = dataComparison;
  }


  public ProofOfAddressBreakdown documentClassification(ProofOfAddressBreakdownDocumentClassification documentClassification) {
    this.documentClassification = documentClassification;
    return this;
  }

   /**
   * Get documentClassification
   * @return documentClassification
  **/
  @javax.annotation.Nullable
  public ProofOfAddressBreakdownDocumentClassification getDocumentClassification() {
    return documentClassification;
  }

  public void setDocumentClassification(ProofOfAddressBreakdownDocumentClassification documentClassification) {
    this.documentClassification = documentClassification;
  }


  public ProofOfAddressBreakdown imageIntegrity(ProofOfAddressBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
    return this;
  }

   /**
   * Get imageIntegrity
   * @return imageIntegrity
  **/
  @javax.annotation.Nullable
  public ProofOfAddressBreakdownImageIntegrity getImageIntegrity() {
    return imageIntegrity;
  }

  public void setImageIntegrity(ProofOfAddressBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
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
   * @return the ProofOfAddressBreakdown instance itself
   */
  public ProofOfAddressBreakdown putAdditionalProperty(String key, Object value) {
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
    ProofOfAddressBreakdown proofOfAddressBreakdown = (ProofOfAddressBreakdown) o;
    return Objects.equals(this.dataComparison, proofOfAddressBreakdown.dataComparison) &&
        Objects.equals(this.documentClassification, proofOfAddressBreakdown.documentClassification) &&
        Objects.equals(this.imageIntegrity, proofOfAddressBreakdown.imageIntegrity)&&
        Objects.equals(this.additionalProperties, proofOfAddressBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataComparison, documentClassification, imageIntegrity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofOfAddressBreakdown {\n");
    sb.append("    dataComparison: ").append(toIndentedString(dataComparison)).append("\n");
    sb.append("    documentClassification: ").append(toIndentedString(documentClassification)).append("\n");
    sb.append("    imageIntegrity: ").append(toIndentedString(imageIntegrity)).append("\n");
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
    openapiFields.add("data_comparison");
    openapiFields.add("document_classification");
    openapiFields.add("image_integrity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProofOfAddressBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProofOfAddressBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProofOfAddressBreakdown is not found in the empty JSON string", ProofOfAddressBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `data_comparison`
      if (jsonObj.get("data_comparison") != null && !jsonObj.get("data_comparison").isJsonNull()) {
        ProofOfAddressBreakdownDataComparison.validateJsonElement(jsonObj.get("data_comparison"));
      }
      // validate the optional field `document_classification`
      if (jsonObj.get("document_classification") != null && !jsonObj.get("document_classification").isJsonNull()) {
        ProofOfAddressBreakdownDocumentClassification.validateJsonElement(jsonObj.get("document_classification"));
      }
      // validate the optional field `image_integrity`
      if (jsonObj.get("image_integrity") != null && !jsonObj.get("image_integrity").isJsonNull()) {
        ProofOfAddressBreakdownImageIntegrity.validateJsonElement(jsonObj.get("image_integrity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProofOfAddressBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProofOfAddressBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProofOfAddressBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProofOfAddressBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<ProofOfAddressBreakdown>() {
           @Override
           public void write(JsonWriter out, ProofOfAddressBreakdown value) throws IOException {
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
           public ProofOfAddressBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProofOfAddressBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProofOfAddressBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProofOfAddressBreakdown
  * @throws IOException if the JSON string is invalid with respect to ProofOfAddressBreakdown
  */
  public static ProofOfAddressBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProofOfAddressBreakdown.class);
  }

 /**
  * Convert an instance of ProofOfAddressBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

