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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * Asserts whether the document NFC chip data was tampered.
 */
@JsonPropertyOrder({
  DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication.JSON_PROPERTY_RESULT,
  DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("document_breakdown_issuing_authority_breakdown_nfc_passive_authentication")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication {
  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Object properties;

  public DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication() { 
  }

  public DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }


  public DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(Object properties) {
    this.properties = properties;
  }


  /**
   * Return true if this document_breakdown_issuing_authority_breakdown_nfc_passive_authentication object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication documentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication = (DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication) o;
    return Objects.equals(this.result, documentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication.result) &&
        Objects.equals(this.properties, documentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

