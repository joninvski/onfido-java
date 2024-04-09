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
import com.onfido.model.FacialSimilarityPhotoBreakdownFaceComparison;
import com.onfido.model.FacialSimilarityPhotoBreakdownVisualAuthenticity;
import com.onfido.model.FacialSimilarityPhotoFullyAutoBreakdownImageIntegrity;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * FacialSimilarityPhotoFullyAutoBreakdown
 */
@JsonPropertyOrder({
  FacialSimilarityPhotoFullyAutoBreakdown.JSON_PROPERTY_FACE_COMPARISON,
  FacialSimilarityPhotoFullyAutoBreakdown.JSON_PROPERTY_IMAGE_INTEGRITY,
  FacialSimilarityPhotoFullyAutoBreakdown.JSON_PROPERTY_VISUAL_AUTHENTICITY
})
@JsonTypeName("facial_similarity_photo_fully_auto_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class FacialSimilarityPhotoFullyAutoBreakdown {
  public static final String JSON_PROPERTY_FACE_COMPARISON = "face_comparison";
  private FacialSimilarityPhotoBreakdownFaceComparison faceComparison;

  public static final String JSON_PROPERTY_IMAGE_INTEGRITY = "image_integrity";
  private FacialSimilarityPhotoFullyAutoBreakdownImageIntegrity imageIntegrity;

  public static final String JSON_PROPERTY_VISUAL_AUTHENTICITY = "visual_authenticity";
  private FacialSimilarityPhotoBreakdownVisualAuthenticity visualAuthenticity;

  public FacialSimilarityPhotoFullyAutoBreakdown() { 
  }

  public FacialSimilarityPhotoFullyAutoBreakdown faceComparison(FacialSimilarityPhotoBreakdownFaceComparison faceComparison) {
    this.faceComparison = faceComparison;
    return this;
  }

   /**
   * Get faceComparison
   * @return faceComparison
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACE_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacialSimilarityPhotoBreakdownFaceComparison getFaceComparison() {
    return faceComparison;
  }


  @JsonProperty(JSON_PROPERTY_FACE_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceComparison(FacialSimilarityPhotoBreakdownFaceComparison faceComparison) {
    this.faceComparison = faceComparison;
  }


  public FacialSimilarityPhotoFullyAutoBreakdown imageIntegrity(FacialSimilarityPhotoFullyAutoBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
    return this;
  }

   /**
   * Get imageIntegrity
   * @return imageIntegrity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_INTEGRITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacialSimilarityPhotoFullyAutoBreakdownImageIntegrity getImageIntegrity() {
    return imageIntegrity;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_INTEGRITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageIntegrity(FacialSimilarityPhotoFullyAutoBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
  }


  public FacialSimilarityPhotoFullyAutoBreakdown visualAuthenticity(FacialSimilarityPhotoBreakdownVisualAuthenticity visualAuthenticity) {
    this.visualAuthenticity = visualAuthenticity;
    return this;
  }

   /**
   * Get visualAuthenticity
   * @return visualAuthenticity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISUAL_AUTHENTICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacialSimilarityPhotoBreakdownVisualAuthenticity getVisualAuthenticity() {
    return visualAuthenticity;
  }


  @JsonProperty(JSON_PROPERTY_VISUAL_AUTHENTICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisualAuthenticity(FacialSimilarityPhotoBreakdownVisualAuthenticity visualAuthenticity) {
    this.visualAuthenticity = visualAuthenticity;
  }


  /**
   * Return true if this facial_similarity_photo_fully_auto_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacialSimilarityPhotoFullyAutoBreakdown facialSimilarityPhotoFullyAutoBreakdown = (FacialSimilarityPhotoFullyAutoBreakdown) o;
    return Objects.equals(this.faceComparison, facialSimilarityPhotoFullyAutoBreakdown.faceComparison) &&
        Objects.equals(this.imageIntegrity, facialSimilarityPhotoFullyAutoBreakdown.imageIntegrity) &&
        Objects.equals(this.visualAuthenticity, facialSimilarityPhotoFullyAutoBreakdown.visualAuthenticity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceComparison, imageIntegrity, visualAuthenticity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialSimilarityPhotoFullyAutoBreakdown {\n");
    sb.append("    faceComparison: ").append(toIndentedString(faceComparison)).append("\n");
    sb.append("    imageIntegrity: ").append(toIndentedString(imageIntegrity)).append("\n");
    sb.append("    visualAuthenticity: ").append(toIndentedString(visualAuthenticity)).append("\n");
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

