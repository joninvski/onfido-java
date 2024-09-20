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
import com.onfido.model.CountryCodes;
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
 * WatchlistEnhancedPropertiesRecordsInnerAddressInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class WatchlistEnhancedPropertiesRecordsInnerAddressInner {
  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryCodes country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "state_province";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_TOWN = "town";
  @SerializedName(SERIALIZED_NAME_TOWN)
  private String town;

  public static final String SERIALIZED_NAME_LOCATOR_TYPE = "locator_type";
  @SerializedName(SERIALIZED_NAME_LOCATOR_TYPE)
  private String locatorType;

  public WatchlistEnhancedPropertiesRecordsInnerAddressInner() {
  }

  public WatchlistEnhancedPropertiesRecordsInnerAddressInner addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public WatchlistEnhancedPropertiesRecordsInnerAddressInner country(CountryCodes country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public CountryCodes getCountry() {
    return country;
  }

  public void setCountry(CountryCodes country) {
    this.country = country;
  }


  public WatchlistEnhancedPropertiesRecordsInnerAddressInner postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public WatchlistEnhancedPropertiesRecordsInnerAddressInner stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * Get stateProvince
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  public WatchlistEnhancedPropertiesRecordsInnerAddressInner town(String town) {
    this.town = town;
    return this;
  }

   /**
   * Get town
   * @return town
  **/
  @javax.annotation.Nullable
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }


  public WatchlistEnhancedPropertiesRecordsInnerAddressInner locatorType(String locatorType) {
    this.locatorType = locatorType;
    return this;
  }

   /**
   * Get locatorType
   * @return locatorType
  **/
  @javax.annotation.Nullable
  public String getLocatorType() {
    return locatorType;
  }

  public void setLocatorType(String locatorType) {
    this.locatorType = locatorType;
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
   * @return the WatchlistEnhancedPropertiesRecordsInnerAddressInner instance itself
   */
  public WatchlistEnhancedPropertiesRecordsInnerAddressInner putAdditionalProperty(String key, Object value) {
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
    WatchlistEnhancedPropertiesRecordsInnerAddressInner watchlistEnhancedPropertiesRecordsInnerAddressInner = (WatchlistEnhancedPropertiesRecordsInnerAddressInner) o;
    return Objects.equals(this.addressLine1, watchlistEnhancedPropertiesRecordsInnerAddressInner.addressLine1) &&
        Objects.equals(this.country, watchlistEnhancedPropertiesRecordsInnerAddressInner.country) &&
        Objects.equals(this.postalCode, watchlistEnhancedPropertiesRecordsInnerAddressInner.postalCode) &&
        Objects.equals(this.stateProvince, watchlistEnhancedPropertiesRecordsInnerAddressInner.stateProvince) &&
        Objects.equals(this.town, watchlistEnhancedPropertiesRecordsInnerAddressInner.town) &&
        Objects.equals(this.locatorType, watchlistEnhancedPropertiesRecordsInnerAddressInner.locatorType)&&
        Objects.equals(this.additionalProperties, watchlistEnhancedPropertiesRecordsInnerAddressInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, country, postalCode, stateProvince, town, locatorType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistEnhancedPropertiesRecordsInnerAddressInner {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    locatorType: ").append(toIndentedString(locatorType)).append("\n");
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
    openapiFields.add("address_line1");
    openapiFields.add("country");
    openapiFields.add("postal_code");
    openapiFields.add("state_province");
    openapiFields.add("town");
    openapiFields.add("locator_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WatchlistEnhancedPropertiesRecordsInnerAddressInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WatchlistEnhancedPropertiesRecordsInnerAddressInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WatchlistEnhancedPropertiesRecordsInnerAddressInner is not found in the empty JSON string", WatchlistEnhancedPropertiesRecordsInnerAddressInner.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address_line1") != null && !jsonObj.get("address_line1").isJsonNull()) && !jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      // validate the optional field `country`
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) {
        CountryCodes.validateJsonElement(jsonObj.get("country"));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if ((jsonObj.get("state_province") != null && !jsonObj.get("state_province").isJsonNull()) && !jsonObj.get("state_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_province").toString()));
      }
      if ((jsonObj.get("town") != null && !jsonObj.get("town").isJsonNull()) && !jsonObj.get("town").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `town` to be a primitive type in the JSON string but got `%s`", jsonObj.get("town").toString()));
      }
      if ((jsonObj.get("locator_type") != null && !jsonObj.get("locator_type").isJsonNull()) && !jsonObj.get("locator_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locator_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locator_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WatchlistEnhancedPropertiesRecordsInnerAddressInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WatchlistEnhancedPropertiesRecordsInnerAddressInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WatchlistEnhancedPropertiesRecordsInnerAddressInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WatchlistEnhancedPropertiesRecordsInnerAddressInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WatchlistEnhancedPropertiesRecordsInnerAddressInner>() {
           @Override
           public void write(JsonWriter out, WatchlistEnhancedPropertiesRecordsInnerAddressInner value) throws IOException {
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
           public WatchlistEnhancedPropertiesRecordsInnerAddressInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WatchlistEnhancedPropertiesRecordsInnerAddressInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WatchlistEnhancedPropertiesRecordsInnerAddressInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WatchlistEnhancedPropertiesRecordsInnerAddressInner
  * @throws IOException if the JSON string is invalid with respect to WatchlistEnhancedPropertiesRecordsInnerAddressInner
  */
  public static WatchlistEnhancedPropertiesRecordsInnerAddressInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WatchlistEnhancedPropertiesRecordsInnerAddressInner.class);
  }

 /**
  * Convert an instance of WatchlistEnhancedPropertiesRecordsInnerAddressInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

