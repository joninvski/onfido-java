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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.CountryCodes;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * LocationBuilder
 */
@JsonPropertyOrder({
  LocationBuilder.JSON_PROPERTY_IP_ADDRESS,
  LocationBuilder.JSON_PROPERTY_COUNTRY_OF_RESIDENCE
})
@JsonTypeName("location_builder")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class LocationBuilder {
  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_COUNTRY_OF_RESIDENCE = "country_of_residence";
  private CountryCodes countryOfResidence;

  public LocationBuilder() { 
  }

  public LocationBuilder ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The applicant&#39;s ip address.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public LocationBuilder countryOfResidence(CountryCodes countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
    return this;
  }

   /**
   * The applicant&#39;s country of residence in 3-letter ISO code.
   * @return countryOfResidence
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_RESIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CountryCodes getCountryOfResidence() {
    return countryOfResidence;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_RESIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryOfResidence(CountryCodes countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
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
   */
  @JsonAnySetter
  public LocationBuilder putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this location_builder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationBuilder locationBuilder = (LocationBuilder) o;
    return Objects.equals(this.ipAddress, locationBuilder.ipAddress) &&
        Objects.equals(this.countryOfResidence, locationBuilder.countryOfResidence)&&
        Objects.equals(this.additionalProperties, locationBuilder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, countryOfResidence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationBuilder {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    countryOfResidence: ").append(toIndentedString(countryOfResidence)).append("\n");
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

}

