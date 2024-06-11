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
 * Normalised data for passenger cars
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle {
  public static final String SERIALIZED_NAME_IS_QUALIFIED = "is_qualified";
  @SerializedName(SERIALIZED_NAME_IS_QUALIFIED)
  private Boolean isQualified;

  public static final String SERIALIZED_NAME_OBTAINMENT_DATE = "obtainment_date";
  @SerializedName(SERIALIZED_NAME_OBTAINMENT_DATE)
  private LocalDate obtainmentDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private LocalDate expiryDate;

  public DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle() {
  }

  public DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle isQualified(Boolean isQualified) {
    this.isQualified = isQualified;
    return this;
  }

   /**
   * Whether they are qualified for a passenger car, such as a “B” class in the UK
   * @return isQualified
  **/
  @javax.annotation.Nullable
  public Boolean getIsQualified() {
    return isQualified;
  }

  public void setIsQualified(Boolean isQualified) {
    this.isQualified = isQualified;
  }


  public DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle obtainmentDate(LocalDate obtainmentDate) {
    this.obtainmentDate = obtainmentDate;
    return this;
  }

   /**
   * Date the class qualification was obtained
   * @return obtainmentDate
  **/
  @javax.annotation.Nullable
  public LocalDate getObtainmentDate() {
    return obtainmentDate;
  }

  public void setObtainmentDate(LocalDate obtainmentDate) {
    this.obtainmentDate = obtainmentDate;
  }


  public DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Date the class qualification expires, which may be different to doc expiry
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
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
   * @return the DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle instance itself
   */
  public DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle putAdditionalProperty(String key, Object value) {
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
    DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle documentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle = (DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle) o;
    return Objects.equals(this.isQualified, documentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.isQualified) &&
        Objects.equals(this.obtainmentDate, documentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.obtainmentDate) &&
        Objects.equals(this.expiryDate, documentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.expiryDate)&&
        Objects.equals(this.additionalProperties, documentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isQualified, obtainmentDate, expiryDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle {\n");
    sb.append("    isQualified: ").append(toIndentedString(isQualified)).append("\n");
    sb.append("    obtainmentDate: ").append(toIndentedString(obtainmentDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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
    openapiFields.add("is_qualified");
    openapiFields.add("obtainment_date");
    openapiFields.add("expiry_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle is not found in the empty JSON string", DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle>() {
           @Override
           public void write(JsonWriter out, DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle value) throws IOException {
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
           public DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle
  * @throws IOException if the JSON string is invalid with respect to DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle
  */
  public static DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle.class);
  }

 /**
  * Convert an instance of DocumentWithDriverVerificationReportAllOfPropertiesAllOfPassengerVehicle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

