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
import com.onfido.model.KnownFacesBreakdownImageIntegrity;
import com.onfido.model.KnownFacesBreakdownPreviouslySeenFaces;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * KnownFacesBreakdown
 */
@JsonPropertyOrder({
  KnownFacesBreakdown.JSON_PROPERTY_PREVIOUSLY_SEEN_FACES,
  KnownFacesBreakdown.JSON_PROPERTY_IMAGE_INTEGRITY
})
@JsonTypeName("known_faces_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KnownFacesBreakdown {
  public static final String JSON_PROPERTY_PREVIOUSLY_SEEN_FACES = "previously_seen_faces";
  private KnownFacesBreakdownPreviouslySeenFaces previouslySeenFaces;

  public static final String JSON_PROPERTY_IMAGE_INTEGRITY = "image_integrity";
  private KnownFacesBreakdownImageIntegrity imageIntegrity;

  public KnownFacesBreakdown() { 
  }

  public KnownFacesBreakdown previouslySeenFaces(KnownFacesBreakdownPreviouslySeenFaces previouslySeenFaces) {
    this.previouslySeenFaces = previouslySeenFaces;
    return this;
  }

   /**
   * Get previouslySeenFaces
   * @return previouslySeenFaces
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_SEEN_FACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KnownFacesBreakdownPreviouslySeenFaces getPreviouslySeenFaces() {
    return previouslySeenFaces;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_SEEN_FACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviouslySeenFaces(KnownFacesBreakdownPreviouslySeenFaces previouslySeenFaces) {
    this.previouslySeenFaces = previouslySeenFaces;
  }


  public KnownFacesBreakdown imageIntegrity(KnownFacesBreakdownImageIntegrity imageIntegrity) {
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

  public KnownFacesBreakdownImageIntegrity getImageIntegrity() {
    return imageIntegrity;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_INTEGRITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageIntegrity(KnownFacesBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
  }


  /**
   * Return true if this known_faces_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnownFacesBreakdown knownFacesBreakdown = (KnownFacesBreakdown) o;
    return Objects.equals(this.previouslySeenFaces, knownFacesBreakdown.previouslySeenFaces) &&
        Objects.equals(this.imageIntegrity, knownFacesBreakdown.imageIntegrity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previouslySeenFaces, imageIntegrity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnownFacesBreakdown {\n");
    sb.append("    previouslySeenFaces: ").append(toIndentedString(previouslySeenFaces)).append("\n");
    sb.append("    imageIntegrity: ").append(toIndentedString(imageIntegrity)).append("\n");
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

