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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AddressShared
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AddressShared {
  public static final String SERIALIZED_NAME_FLAT_NUMBER = "flat_number";
  @SerializedName(SERIALIZED_NAME_FLAT_NUMBER)
  private String flatNumber;

  public static final String SERIALIZED_NAME_BUILDING_NUMBER = "building_number";
  @SerializedName(SERIALIZED_NAME_BUILDING_NUMBER)
  private String buildingNumber;

  public static final String SERIALIZED_NAME_BUILDING_NAME = "building_name";
  @SerializedName(SERIALIZED_NAME_BUILDING_NAME)
  private String buildingName;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_SUB_STREET = "sub_street";
  @SerializedName(SERIALIZED_NAME_SUB_STREET)
  private String subStreet;

  public static final String SERIALIZED_NAME_TOWN = "town";
  @SerializedName(SERIALIZED_NAME_TOWN)
  private String town;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryCodes country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_LINE3 = "line3";
  @SerializedName(SERIALIZED_NAME_LINE3)
  private String line3;

  public AddressShared() {
  }

  public AddressShared flatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
    return this;
  }

   /**
   * The flat number of this address
   * @return flatNumber
  **/
  @javax.annotation.Nullable
  public String getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
  }


  public AddressShared buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * The building number of this address
   * @return buildingNumber
  **/
  @javax.annotation.Nullable
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }


  public AddressShared buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * The building name of this address
   * @return buildingName
  **/
  @javax.annotation.Nullable
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }


  public AddressShared street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The street of the applicant&#39;s address
   * @return street
  **/
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public AddressShared subStreet(String subStreet) {
    this.subStreet = subStreet;
    return this;
  }

   /**
   * The sub-street of the applicant&#39;s address
   * @return subStreet
  **/
  @javax.annotation.Nullable
  public String getSubStreet() {
    return subStreet;
  }

  public void setSubStreet(String subStreet) {
    this.subStreet = subStreet;
  }


  public AddressShared town(String town) {
    this.town = town;
    return this;
  }

   /**
   * The town of the applicant&#39;s address
   * @return town
  **/
  @javax.annotation.Nullable
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }


  public AddressShared postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode or ZIP of the applicant&#39;s address
   * @return postcode
  **/
  @javax.annotation.Nonnull
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public AddressShared country(CountryCodes country) {
    this.country = country;
    return this;
  }

   /**
   * The 3 character ISO country code of this address. For example, GBR is the country code for the United Kingdom
   * @return country
  **/
  @javax.annotation.Nonnull
  public CountryCodes getCountry() {
    return country;
  }

  public void setCountry(CountryCodes country) {
    this.country = country;
  }


  public AddressShared state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The address state. US states must use the USPS abbreviation (see also ISO 3166-2:US), for example AK, CA, or TX.
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public AddressShared line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Line 1 of the applicant&#39;s address
   * @return line1
  **/
  @javax.annotation.Nullable
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public AddressShared line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Line 2 of the applicant&#39;s address
   * @return line2
  **/
  @javax.annotation.Nullable
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public AddressShared line3(String line3) {
    this.line3 = line3;
    return this;
  }

   /**
   * Line 3 of the applicant&#39;s address
   * @return line3
  **/
  @javax.annotation.Nullable
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
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
   * @return the AddressShared instance itself
   */
  public AddressShared putAdditionalProperty(String key, Object value) {
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
    AddressShared addressShared = (AddressShared) o;
    return Objects.equals(this.flatNumber, addressShared.flatNumber) &&
        Objects.equals(this.buildingNumber, addressShared.buildingNumber) &&
        Objects.equals(this.buildingName, addressShared.buildingName) &&
        Objects.equals(this.street, addressShared.street) &&
        Objects.equals(this.subStreet, addressShared.subStreet) &&
        Objects.equals(this.town, addressShared.town) &&
        Objects.equals(this.postcode, addressShared.postcode) &&
        Objects.equals(this.country, addressShared.country) &&
        Objects.equals(this.state, addressShared.state) &&
        Objects.equals(this.line1, addressShared.line1) &&
        Objects.equals(this.line2, addressShared.line2) &&
        Objects.equals(this.line3, addressShared.line3)&&
        Objects.equals(this.additionalProperties, addressShared.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatNumber, buildingNumber, buildingName, street, subStreet, town, postcode, country, state, line1, line2, line3, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressShared {\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    subStreet: ").append(toIndentedString(subStreet)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
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
    openapiFields.add("flat_number");
    openapiFields.add("building_number");
    openapiFields.add("building_name");
    openapiFields.add("street");
    openapiFields.add("sub_street");
    openapiFields.add("town");
    openapiFields.add("postcode");
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("line1");
    openapiFields.add("line2");
    openapiFields.add("line3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("postcode");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressShared
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressShared is not found in the empty JSON string", AddressShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressShared.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("flat_number") != null && !jsonObj.get("flat_number").isJsonNull()) && !jsonObj.get("flat_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flat_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flat_number").toString()));
      }
      if ((jsonObj.get("building_number") != null && !jsonObj.get("building_number").isJsonNull()) && !jsonObj.get("building_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `building_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("building_number").toString()));
      }
      if ((jsonObj.get("building_name") != null && !jsonObj.get("building_name").isJsonNull()) && !jsonObj.get("building_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `building_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("building_name").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("sub_street") != null && !jsonObj.get("sub_street").isJsonNull()) && !jsonObj.get("sub_street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_street").toString()));
      }
      if ((jsonObj.get("town") != null && !jsonObj.get("town").isJsonNull()) && !jsonObj.get("town").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `town` to be a primitive type in the JSON string but got `%s`", jsonObj.get("town").toString()));
      }
      if (!jsonObj.get("postcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postcode").toString()));
      }
      // validate the required field `country`
      CountryCodes.validateJsonElement(jsonObj.get("country"));
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("line1") != null && !jsonObj.get("line1").isJsonNull()) && !jsonObj.get("line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line1").toString()));
      }
      if ((jsonObj.get("line2") != null && !jsonObj.get("line2").isJsonNull()) && !jsonObj.get("line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line2").toString()));
      }
      if ((jsonObj.get("line3") != null && !jsonObj.get("line3").isJsonNull()) && !jsonObj.get("line3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line3").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressShared.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressShared>() {
           @Override
           public void write(JsonWriter out, AddressShared value) throws IOException {
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
           public AddressShared read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AddressShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddressShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressShared
  * @throws IOException if the JSON string is invalid with respect to AddressShared
  */
  public static AddressShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressShared.class);
  }

 /**
  * Convert an instance of AddressShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

