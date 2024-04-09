/*
 * Onfido API v3.6
 * The Onfido API
 *
 * The version of the OpenAPI document: 3.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.DocumentBreakdownDataComparisonBreakdownIssuingCountry;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * UsDrivingLicenceBreakdownPersonalBreakdown
 */
@JsonPropertyOrder({
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_FIRST_NAME,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_NAME_SUFFIX,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_HEIGHT,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_WEIGHT,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_SEX_CODE,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_EYE_COLOR,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_DATE_OF_BIRTH,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_LAST_NAME,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_MIDDLE_NAME,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_FIRST_NAME_FUZZY,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_MIDDLE_NAME_FUZZY,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_LAST_NAME_FUZZY,
  UsDrivingLicenceBreakdownPersonalBreakdown.JSON_PROPERTY_MIDDLE_INITIAL
})
@JsonTypeName("us_driving_licence_breakdown_personal_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UsDrivingLicenceBreakdownPersonalBreakdown {
  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName;

  public static final String JSON_PROPERTY_NAME_SUFFIX = "name_suffix";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry nameSuffix;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry height;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry weight;

  public static final String JSON_PROPERTY_SEX_CODE = "sex_code";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry sexCode;

  public static final String JSON_PROPERTY_EYE_COLOR = "eye_color";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry eyeColor;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "date_of_birth";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middle_name";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry middleName;

  public static final String JSON_PROPERTY_FIRST_NAME_FUZZY = "first_name_fuzzy";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry firstNameFuzzy;

  public static final String JSON_PROPERTY_MIDDLE_NAME_FUZZY = "middle_name_fuzzy";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry middleNameFuzzy;

  public static final String JSON_PROPERTY_LAST_NAME_FUZZY = "last_name_fuzzy";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry lastNameFuzzy;

  public static final String JSON_PROPERTY_MIDDLE_INITIAL = "middle_initial";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry middleInitial;

  public UsDrivingLicenceBreakdownPersonalBreakdown() { 
  }

  public UsDrivingLicenceBreakdownPersonalBreakdown firstName(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName) {
    this.firstName = firstName;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown nameSuffix(DocumentBreakdownDataComparisonBreakdownIssuingCountry nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

   /**
   * Get nameSuffix
   * @return nameSuffix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getNameSuffix() {
    return nameSuffix;
  }


  @JsonProperty(JSON_PROPERTY_NAME_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameSuffix(DocumentBreakdownDataComparisonBreakdownIssuingCountry nameSuffix) {
    this.nameSuffix = nameSuffix;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown height(DocumentBreakdownDataComparisonBreakdownIssuingCountry height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(DocumentBreakdownDataComparisonBreakdownIssuingCountry height) {
    this.height = height;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown weight(DocumentBreakdownDataComparisonBreakdownIssuingCountry weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(DocumentBreakdownDataComparisonBreakdownIssuingCountry weight) {
    this.weight = weight;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown sexCode(DocumentBreakdownDataComparisonBreakdownIssuingCountry sexCode) {
    this.sexCode = sexCode;
    return this;
  }

   /**
   * Get sexCode
   * @return sexCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getSexCode() {
    return sexCode;
  }


  @JsonProperty(JSON_PROPERTY_SEX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSexCode(DocumentBreakdownDataComparisonBreakdownIssuingCountry sexCode) {
    this.sexCode = sexCode;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown eyeColor(DocumentBreakdownDataComparisonBreakdownIssuingCountry eyeColor) {
    this.eyeColor = eyeColor;
    return this;
  }

   /**
   * Get eyeColor
   * @return eyeColor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EYE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getEyeColor() {
    return eyeColor;
  }


  @JsonProperty(JSON_PROPERTY_EYE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEyeColor(DocumentBreakdownDataComparisonBreakdownIssuingCountry eyeColor) {
    this.eyeColor = eyeColor;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown dateOfBirth(DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown lastName(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName) {
    this.lastName = lastName;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown middleName(DocumentBreakdownDataComparisonBreakdownIssuingCountry middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getMiddleName() {
    return middleName;
  }


  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiddleName(DocumentBreakdownDataComparisonBreakdownIssuingCountry middleName) {
    this.middleName = middleName;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown firstNameFuzzy(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstNameFuzzy) {
    this.firstNameFuzzy = firstNameFuzzy;
    return this;
  }

   /**
   * Get firstNameFuzzy
   * @return firstNameFuzzy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME_FUZZY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getFirstNameFuzzy() {
    return firstNameFuzzy;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME_FUZZY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstNameFuzzy(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstNameFuzzy) {
    this.firstNameFuzzy = firstNameFuzzy;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown middleNameFuzzy(DocumentBreakdownDataComparisonBreakdownIssuingCountry middleNameFuzzy) {
    this.middleNameFuzzy = middleNameFuzzy;
    return this;
  }

   /**
   * Get middleNameFuzzy
   * @return middleNameFuzzy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME_FUZZY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getMiddleNameFuzzy() {
    return middleNameFuzzy;
  }


  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME_FUZZY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiddleNameFuzzy(DocumentBreakdownDataComparisonBreakdownIssuingCountry middleNameFuzzy) {
    this.middleNameFuzzy = middleNameFuzzy;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown lastNameFuzzy(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastNameFuzzy) {
    this.lastNameFuzzy = lastNameFuzzy;
    return this;
  }

   /**
   * Get lastNameFuzzy
   * @return lastNameFuzzy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME_FUZZY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getLastNameFuzzy() {
    return lastNameFuzzy;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME_FUZZY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastNameFuzzy(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastNameFuzzy) {
    this.lastNameFuzzy = lastNameFuzzy;
  }


  public UsDrivingLicenceBreakdownPersonalBreakdown middleInitial(DocumentBreakdownDataComparisonBreakdownIssuingCountry middleInitial) {
    this.middleInitial = middleInitial;
    return this;
  }

   /**
   * Get middleInitial
   * @return middleInitial
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIDDLE_INITIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getMiddleInitial() {
    return middleInitial;
  }


  @JsonProperty(JSON_PROPERTY_MIDDLE_INITIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiddleInitial(DocumentBreakdownDataComparisonBreakdownIssuingCountry middleInitial) {
    this.middleInitial = middleInitial;
  }


  /**
   * Return true if this us_driving_licence_breakdown_personal_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsDrivingLicenceBreakdownPersonalBreakdown usDrivingLicenceBreakdownPersonalBreakdown = (UsDrivingLicenceBreakdownPersonalBreakdown) o;
    return Objects.equals(this.firstName, usDrivingLicenceBreakdownPersonalBreakdown.firstName) &&
        Objects.equals(this.nameSuffix, usDrivingLicenceBreakdownPersonalBreakdown.nameSuffix) &&
        Objects.equals(this.height, usDrivingLicenceBreakdownPersonalBreakdown.height) &&
        Objects.equals(this.weight, usDrivingLicenceBreakdownPersonalBreakdown.weight) &&
        Objects.equals(this.sexCode, usDrivingLicenceBreakdownPersonalBreakdown.sexCode) &&
        Objects.equals(this.eyeColor, usDrivingLicenceBreakdownPersonalBreakdown.eyeColor) &&
        Objects.equals(this.dateOfBirth, usDrivingLicenceBreakdownPersonalBreakdown.dateOfBirth) &&
        Objects.equals(this.lastName, usDrivingLicenceBreakdownPersonalBreakdown.lastName) &&
        Objects.equals(this.middleName, usDrivingLicenceBreakdownPersonalBreakdown.middleName) &&
        Objects.equals(this.firstNameFuzzy, usDrivingLicenceBreakdownPersonalBreakdown.firstNameFuzzy) &&
        Objects.equals(this.middleNameFuzzy, usDrivingLicenceBreakdownPersonalBreakdown.middleNameFuzzy) &&
        Objects.equals(this.lastNameFuzzy, usDrivingLicenceBreakdownPersonalBreakdown.lastNameFuzzy) &&
        Objects.equals(this.middleInitial, usDrivingLicenceBreakdownPersonalBreakdown.middleInitial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, nameSuffix, height, weight, sexCode, eyeColor, dateOfBirth, lastName, middleName, firstNameFuzzy, middleNameFuzzy, lastNameFuzzy, middleInitial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsDrivingLicenceBreakdownPersonalBreakdown {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    sexCode: ").append(toIndentedString(sexCode)).append("\n");
    sb.append("    eyeColor: ").append(toIndentedString(eyeColor)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    firstNameFuzzy: ").append(toIndentedString(firstNameFuzzy)).append("\n");
    sb.append("    middleNameFuzzy: ").append(toIndentedString(middleNameFuzzy)).append("\n");
    sb.append("    lastNameFuzzy: ").append(toIndentedString(lastNameFuzzy)).append("\n");
    sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
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

}

