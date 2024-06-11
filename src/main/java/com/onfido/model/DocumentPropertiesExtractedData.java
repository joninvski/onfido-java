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
 * DocumentPropertiesExtractedData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class DocumentPropertiesExtractedData {
  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "document_number";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_DATE_OF_EXPIRY = "date_of_expiry";
  @SerializedName(SERIALIZED_NAME_DATE_OF_EXPIRY)
  private LocalDate dateOfExpiry;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_SPOUSE_NAME = "spouse_name";
  @SerializedName(SERIALIZED_NAME_SPOUSE_NAME)
  private String spouseName;

  public static final String SERIALIZED_NAME_WIDOW_NAME = "widow_name";
  @SerializedName(SERIALIZED_NAME_WIDOW_NAME)
  private String widowName;

  public static final String SERIALIZED_NAME_ALIAS_NAME = "alias_name";
  @SerializedName(SERIALIZED_NAME_ALIAS_NAME)
  private String aliasName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_MRZ_LINE1 = "mrz_line1";
  @SerializedName(SERIALIZED_NAME_MRZ_LINE1)
  private String mrzLine1;

  public static final String SERIALIZED_NAME_MRZ_LINE2 = "mrz_line2";
  @SerializedName(SERIALIZED_NAME_MRZ_LINE2)
  private String mrzLine2;

  public static final String SERIALIZED_NAME_MRZ_LINE3 = "mrz_line3";
  @SerializedName(SERIALIZED_NAME_MRZ_LINE3)
  private String mrzLine3;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line_1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line_2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_LINE3 = "address_line_3";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE3)
  private String addressLine3;

  public static final String SERIALIZED_NAME_ADDRESS_LINE4 = "address_line_4";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE4)
  private String addressLine4;

  public static final String SERIALIZED_NAME_ADDRESS_LINE5 = "address_line_5";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE5)
  private String addressLine5;

  public static final String SERIALIZED_NAME_ISSUING_AUTHORITY = "issuing_authority";
  @SerializedName(SERIALIZED_NAME_ISSUING_AUTHORITY)
  private String issuingAuthority;

  public DocumentPropertiesExtractedData() {
  }

  public DocumentPropertiesExtractedData documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Get documentNumber
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public DocumentPropertiesExtractedData dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public DocumentPropertiesExtractedData dateOfExpiry(LocalDate dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

   /**
   * Get dateOfExpiry
   * @return dateOfExpiry
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(LocalDate dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }


  public DocumentPropertiesExtractedData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public DocumentPropertiesExtractedData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public DocumentPropertiesExtractedData middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public DocumentPropertiesExtractedData fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public DocumentPropertiesExtractedData spouseName(String spouseName) {
    this.spouseName = spouseName;
    return this;
  }

   /**
   * Get spouseName
   * @return spouseName
  **/
  @javax.annotation.Nullable
  public String getSpouseName() {
    return spouseName;
  }

  public void setSpouseName(String spouseName) {
    this.spouseName = spouseName;
  }


  public DocumentPropertiesExtractedData widowName(String widowName) {
    this.widowName = widowName;
    return this;
  }

   /**
   * Get widowName
   * @return widowName
  **/
  @javax.annotation.Nullable
  public String getWidowName() {
    return widowName;
  }

  public void setWidowName(String widowName) {
    this.widowName = widowName;
  }


  public DocumentPropertiesExtractedData aliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

   /**
   * Get aliasName
   * @return aliasName
  **/
  @javax.annotation.Nullable
  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }


  public DocumentPropertiesExtractedData gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public DocumentPropertiesExtractedData mrzLine1(String mrzLine1) {
    this.mrzLine1 = mrzLine1;
    return this;
  }

   /**
   * Get mrzLine1
   * @return mrzLine1
  **/
  @javax.annotation.Nullable
  public String getMrzLine1() {
    return mrzLine1;
  }

  public void setMrzLine1(String mrzLine1) {
    this.mrzLine1 = mrzLine1;
  }


  public DocumentPropertiesExtractedData mrzLine2(String mrzLine2) {
    this.mrzLine2 = mrzLine2;
    return this;
  }

   /**
   * Get mrzLine2
   * @return mrzLine2
  **/
  @javax.annotation.Nullable
  public String getMrzLine2() {
    return mrzLine2;
  }

  public void setMrzLine2(String mrzLine2) {
    this.mrzLine2 = mrzLine2;
  }


  public DocumentPropertiesExtractedData mrzLine3(String mrzLine3) {
    this.mrzLine3 = mrzLine3;
    return this;
  }

   /**
   * Get mrzLine3
   * @return mrzLine3
  **/
  @javax.annotation.Nullable
  public String getMrzLine3() {
    return mrzLine3;
  }

  public void setMrzLine3(String mrzLine3) {
    this.mrzLine3 = mrzLine3;
  }


  public DocumentPropertiesExtractedData nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public DocumentPropertiesExtractedData addressLine1(String addressLine1) {
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


  public DocumentPropertiesExtractedData addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public DocumentPropertiesExtractedData addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Get addressLine3
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public DocumentPropertiesExtractedData addressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
    return this;
  }

   /**
   * Get addressLine4
   * @return addressLine4
  **/
  @javax.annotation.Nullable
  public String getAddressLine4() {
    return addressLine4;
  }

  public void setAddressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
  }


  public DocumentPropertiesExtractedData addressLine5(String addressLine5) {
    this.addressLine5 = addressLine5;
    return this;
  }

   /**
   * Get addressLine5
   * @return addressLine5
  **/
  @javax.annotation.Nullable
  public String getAddressLine5() {
    return addressLine5;
  }

  public void setAddressLine5(String addressLine5) {
    this.addressLine5 = addressLine5;
  }


  public DocumentPropertiesExtractedData issuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
    return this;
  }

   /**
   * Get issuingAuthority
   * @return issuingAuthority
  **/
  @javax.annotation.Nullable
  public String getIssuingAuthority() {
    return issuingAuthority;
  }

  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
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
   * @return the DocumentPropertiesExtractedData instance itself
   */
  public DocumentPropertiesExtractedData putAdditionalProperty(String key, Object value) {
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
    DocumentPropertiesExtractedData documentPropertiesExtractedData = (DocumentPropertiesExtractedData) o;
    return Objects.equals(this.documentNumber, documentPropertiesExtractedData.documentNumber) &&
        Objects.equals(this.dateOfBirth, documentPropertiesExtractedData.dateOfBirth) &&
        Objects.equals(this.dateOfExpiry, documentPropertiesExtractedData.dateOfExpiry) &&
        Objects.equals(this.firstName, documentPropertiesExtractedData.firstName) &&
        Objects.equals(this.lastName, documentPropertiesExtractedData.lastName) &&
        Objects.equals(this.middleName, documentPropertiesExtractedData.middleName) &&
        Objects.equals(this.fullName, documentPropertiesExtractedData.fullName) &&
        Objects.equals(this.spouseName, documentPropertiesExtractedData.spouseName) &&
        Objects.equals(this.widowName, documentPropertiesExtractedData.widowName) &&
        Objects.equals(this.aliasName, documentPropertiesExtractedData.aliasName) &&
        Objects.equals(this.gender, documentPropertiesExtractedData.gender) &&
        Objects.equals(this.mrzLine1, documentPropertiesExtractedData.mrzLine1) &&
        Objects.equals(this.mrzLine2, documentPropertiesExtractedData.mrzLine2) &&
        Objects.equals(this.mrzLine3, documentPropertiesExtractedData.mrzLine3) &&
        Objects.equals(this.nationality, documentPropertiesExtractedData.nationality) &&
        Objects.equals(this.addressLine1, documentPropertiesExtractedData.addressLine1) &&
        Objects.equals(this.addressLine2, documentPropertiesExtractedData.addressLine2) &&
        Objects.equals(this.addressLine3, documentPropertiesExtractedData.addressLine3) &&
        Objects.equals(this.addressLine4, documentPropertiesExtractedData.addressLine4) &&
        Objects.equals(this.addressLine5, documentPropertiesExtractedData.addressLine5) &&
        Objects.equals(this.issuingAuthority, documentPropertiesExtractedData.issuingAuthority)&&
        Objects.equals(this.additionalProperties, documentPropertiesExtractedData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentNumber, dateOfBirth, dateOfExpiry, firstName, lastName, middleName, fullName, spouseName, widowName, aliasName, gender, mrzLine1, mrzLine2, mrzLine3, nationality, addressLine1, addressLine2, addressLine3, addressLine4, addressLine5, issuingAuthority, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPropertiesExtractedData {\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    spouseName: ").append(toIndentedString(spouseName)).append("\n");
    sb.append("    widowName: ").append(toIndentedString(widowName)).append("\n");
    sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    mrzLine1: ").append(toIndentedString(mrzLine1)).append("\n");
    sb.append("    mrzLine2: ").append(toIndentedString(mrzLine2)).append("\n");
    sb.append("    mrzLine3: ").append(toIndentedString(mrzLine3)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    addressLine4: ").append(toIndentedString(addressLine4)).append("\n");
    sb.append("    addressLine5: ").append(toIndentedString(addressLine5)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
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
    openapiFields.add("document_number");
    openapiFields.add("date_of_birth");
    openapiFields.add("date_of_expiry");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("middle_name");
    openapiFields.add("full_name");
    openapiFields.add("spouse_name");
    openapiFields.add("widow_name");
    openapiFields.add("alias_name");
    openapiFields.add("gender");
    openapiFields.add("mrz_line1");
    openapiFields.add("mrz_line2");
    openapiFields.add("mrz_line3");
    openapiFields.add("nationality");
    openapiFields.add("address_line_1");
    openapiFields.add("address_line_2");
    openapiFields.add("address_line_3");
    openapiFields.add("address_line_4");
    openapiFields.add("address_line_5");
    openapiFields.add("issuing_authority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentPropertiesExtractedData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentPropertiesExtractedData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentPropertiesExtractedData is not found in the empty JSON string", DocumentPropertiesExtractedData.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("document_number") != null && !jsonObj.get("document_number").isJsonNull()) && !jsonObj.get("document_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_number").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("middle_name") != null && !jsonObj.get("middle_name").isJsonNull()) && !jsonObj.get("middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_name").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("spouse_name") != null && !jsonObj.get("spouse_name").isJsonNull()) && !jsonObj.get("spouse_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spouse_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spouse_name").toString()));
      }
      if ((jsonObj.get("widow_name") != null && !jsonObj.get("widow_name").isJsonNull()) && !jsonObj.get("widow_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `widow_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("widow_name").toString()));
      }
      if ((jsonObj.get("alias_name") != null && !jsonObj.get("alias_name").isJsonNull()) && !jsonObj.get("alias_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias_name").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("mrz_line1") != null && !jsonObj.get("mrz_line1").isJsonNull()) && !jsonObj.get("mrz_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mrz_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mrz_line1").toString()));
      }
      if ((jsonObj.get("mrz_line2") != null && !jsonObj.get("mrz_line2").isJsonNull()) && !jsonObj.get("mrz_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mrz_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mrz_line2").toString()));
      }
      if ((jsonObj.get("mrz_line3") != null && !jsonObj.get("mrz_line3").isJsonNull()) && !jsonObj.get("mrz_line3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mrz_line3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mrz_line3").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("address_line_1") != null && !jsonObj.get("address_line_1").isJsonNull()) && !jsonObj.get("address_line_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_1").toString()));
      }
      if ((jsonObj.get("address_line_2") != null && !jsonObj.get("address_line_2").isJsonNull()) && !jsonObj.get("address_line_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_2").toString()));
      }
      if ((jsonObj.get("address_line_3") != null && !jsonObj.get("address_line_3").isJsonNull()) && !jsonObj.get("address_line_3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_3").toString()));
      }
      if ((jsonObj.get("address_line_4") != null && !jsonObj.get("address_line_4").isJsonNull()) && !jsonObj.get("address_line_4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_4").toString()));
      }
      if ((jsonObj.get("address_line_5") != null && !jsonObj.get("address_line_5").isJsonNull()) && !jsonObj.get("address_line_5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_5").toString()));
      }
      if ((jsonObj.get("issuing_authority") != null && !jsonObj.get("issuing_authority").isJsonNull()) && !jsonObj.get("issuing_authority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuing_authority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuing_authority").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentPropertiesExtractedData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentPropertiesExtractedData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentPropertiesExtractedData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentPropertiesExtractedData.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentPropertiesExtractedData>() {
           @Override
           public void write(JsonWriter out, DocumentPropertiesExtractedData value) throws IOException {
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
           public DocumentPropertiesExtractedData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentPropertiesExtractedData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentPropertiesExtractedData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentPropertiesExtractedData
  * @throws IOException if the JSON string is invalid with respect to DocumentPropertiesExtractedData
  */
  public static DocumentPropertiesExtractedData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentPropertiesExtractedData.class);
  }

 /**
  * Convert an instance of DocumentPropertiesExtractedData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

