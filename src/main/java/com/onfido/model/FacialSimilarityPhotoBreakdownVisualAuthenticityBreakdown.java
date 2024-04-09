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
import com.onfido.model.FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetection;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown
 */
@JsonPropertyOrder({
  FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown.JSON_PROPERTY_SPOOFING_DETECTION
})
@JsonTypeName("facial_similarity_photo_breakdown_visual_authenticity_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown {
  public static final String JSON_PROPERTY_SPOOFING_DETECTION = "spoofing_detection";
  private FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetection spoofingDetection;

  public FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown() { 
  }

  public FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown spoofingDetection(FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetection spoofingDetection) {
    this.spoofingDetection = spoofingDetection;
    return this;
  }

   /**
   * Get spoofingDetection
   * @return spoofingDetection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPOOFING_DETECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetection getSpoofingDetection() {
    return spoofingDetection;
  }


  @JsonProperty(JSON_PROPERTY_SPOOFING_DETECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpoofingDetection(FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetection spoofingDetection) {
    this.spoofingDetection = spoofingDetection;
  }


  /**
   * Return true if this facial_similarity_photo_breakdown_visual_authenticity_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown facialSimilarityPhotoBreakdownVisualAuthenticityBreakdown = (FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown) o;
    return Objects.equals(this.spoofingDetection, facialSimilarityPhotoBreakdownVisualAuthenticityBreakdown.spoofingDetection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spoofingDetection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdown {\n");
    sb.append("    spoofingDetection: ").append(toIndentedString(spoofingDetection)).append("\n");
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

