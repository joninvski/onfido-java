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
import com.onfido.model.IdentityEnhancedBreakdownSourcesBreakdown;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * Asserts if any sources that an applicant&#39;s details have been verified against have produced a match.
 */
@JsonPropertyOrder({
  IdentityEnhancedBreakdownSources.JSON_PROPERTY_RESULT,
  IdentityEnhancedBreakdownSources.JSON_PROPERTY_BREAKDOWN
})
@JsonTypeName("identity_enhanced_breakdown_sources")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class IdentityEnhancedBreakdownSources {
  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private IdentityEnhancedBreakdownSourcesBreakdown breakdown;

  public IdentityEnhancedBreakdownSources() { 
  }

  public IdentityEnhancedBreakdownSources result(String result) {
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


  public IdentityEnhancedBreakdownSources breakdown(IdentityEnhancedBreakdownSourcesBreakdown breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentityEnhancedBreakdownSourcesBreakdown getBreakdown() {
    return breakdown;
  }


  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakdown(IdentityEnhancedBreakdownSourcesBreakdown breakdown) {
    this.breakdown = breakdown;
  }


  /**
   * Return true if this identity_enhanced_breakdown_sources object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityEnhancedBreakdownSources identityEnhancedBreakdownSources = (IdentityEnhancedBreakdownSources) o;
    return Objects.equals(this.result, identityEnhancedBreakdownSources.result) &&
        Objects.equals(this.breakdown, identityEnhancedBreakdownSources.breakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, breakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityEnhancedBreakdownSources {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
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

