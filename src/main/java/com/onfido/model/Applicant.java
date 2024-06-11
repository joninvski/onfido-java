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
import com.onfido.model.Address;
import com.onfido.model.IdNumber;
import com.onfido.model.Location;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
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
 * Applicant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class Applicant {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private LocalDate dob;

  public static final String SERIALIZED_NAME_ID_NUMBERS = "id_numbers";
  @SerializedName(SERIALIZED_NAME_ID_NUMBERS)
  private List<IdNumber> idNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DELETE_AT = "delete_at";
  @SerializedName(SERIALIZED_NAME_DELETE_AT)
  private OffsetDateTime deleteAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public Applicant() {
  }

  public Applicant email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The applicant&#39;s email address. Required if doing a US check, or a UK check for which &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Applicant dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

   /**
   * The applicant&#39;s date of birth
   * @return dob
  **/
  @javax.annotation.Nullable
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }


  public Applicant idNumbers(List<IdNumber> idNumbers) {
    this.idNumbers = idNumbers;
    return this;
  }

  public Applicant addIdNumbersItem(IdNumber idNumbersItem) {
    if (this.idNumbers == null) {
      this.idNumbers = new ArrayList<>();
    }
    this.idNumbers.add(idNumbersItem);
    return this;
  }

   /**
   * Get idNumbers
   * @return idNumbers
  **/
  @javax.annotation.Nullable
  public List<IdNumber> getIdNumbers() {
    return idNumbers;
  }

  public void setIdNumbers(List<IdNumber> idNumbers) {
    this.idNumbers = idNumbers;
  }


  public Applicant phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The applicant&#39;s phone number
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public Applicant firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The applicant&#39;s first name
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Applicant lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The applicant&#39;s surname
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Applicant id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the applicant.
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public Applicant createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this applicant was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Applicant deleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * The date and time when this applicant is scheduled to be deleted.
   * @return deleteAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
  }


  public Applicant href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of this resource.
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public Applicant sandbox(Boolean sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Get sandbox
   * @return sandbox
  **/
  @javax.annotation.Nullable
  public Boolean getSandbox() {
    return sandbox;
  }

  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  public Applicant address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  public Applicant location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
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
   * @return the Applicant instance itself
   */
  public Applicant putAdditionalProperty(String key, Object value) {
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
    Applicant applicant = (Applicant) o;
    return Objects.equals(this.email, applicant.email) &&
        Objects.equals(this.dob, applicant.dob) &&
        Objects.equals(this.idNumbers, applicant.idNumbers) &&
        Objects.equals(this.phoneNumber, applicant.phoneNumber) &&
        Objects.equals(this.firstName, applicant.firstName) &&
        Objects.equals(this.lastName, applicant.lastName) &&
        Objects.equals(this.id, applicant.id) &&
        Objects.equals(this.createdAt, applicant.createdAt) &&
        Objects.equals(this.deleteAt, applicant.deleteAt) &&
        Objects.equals(this.href, applicant.href) &&
        Objects.equals(this.sandbox, applicant.sandbox) &&
        Objects.equals(this.address, applicant.address) &&
        Objects.equals(this.location, applicant.location)&&
        Objects.equals(this.additionalProperties, applicant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, dob, idNumbers, phoneNumber, firstName, lastName, id, createdAt, deleteAt, href, sandbox, address, location, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applicant {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    idNumbers: ").append(toIndentedString(idNumbers)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("dob");
    openapiFields.add("id_numbers");
    openapiFields.add("phone_number");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("delete_at");
    openapiFields.add("href");
    openapiFields.add("sandbox");
    openapiFields.add("address");
    openapiFields.add("location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Applicant
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Applicant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Applicant is not found in the empty JSON string", Applicant.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Applicant.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("id_numbers") != null && !jsonObj.get("id_numbers").isJsonNull()) {
        JsonArray jsonArrayidNumbers = jsonObj.getAsJsonArray("id_numbers");
        if (jsonArrayidNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("id_numbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `id_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("id_numbers").toString()));
          }

          // validate the optional field `id_numbers` (array)
          for (int i = 0; i < jsonArrayidNumbers.size(); i++) {
            IdNumber.validateJsonElement(jsonArrayidNumbers.get(i));
          };
        }
      }
      if ((jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location.validateJsonElement(jsonObj.get("location"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Applicant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Applicant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Applicant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Applicant.class));

       return (TypeAdapter<T>) new TypeAdapter<Applicant>() {
           @Override
           public void write(JsonWriter out, Applicant value) throws IOException {
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
           public Applicant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Applicant instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Applicant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Applicant
  * @throws IOException if the JSON string is invalid with respect to Applicant
  */
  public static Applicant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Applicant.class);
  }

 /**
  * Convert an instance of Applicant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

