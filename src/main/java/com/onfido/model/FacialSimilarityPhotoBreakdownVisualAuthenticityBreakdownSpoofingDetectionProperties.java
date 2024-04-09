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
 * FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties
 */
@JsonPropertyOrder({
  FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties.JSON_PROPERTY_SCORE
})
@JsonTypeName("facial_similarity_photo_breakdown_visual_authenticity_breakdown_spoofing_detection_properties")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties {
  public static final String JSON_PROPERTY_SCORE = "score";
  private Float score;

  public FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties() { 
  }

  public FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * A floating point number between 0 and 1. The closer the score is to 0, the more likely it is to be a spoof.
   * @return score
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(Float score) {
    this.score = score;
  }


  /**
   * Return true if this facial_similarity_photo_breakdown_visual_authenticity_breakdown_spoofing_detection_properties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties facialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties = (FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties) o;
    return Objects.equals(this.score, facialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialSimilarityPhotoBreakdownVisualAuthenticityBreakdownSpoofingDetectionProperties {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

