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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * ExtractRequest
 */
@JsonPropertyOrder({
  ExtractRequest.JSON_PROPERTY_DOCUMENT_ID
})
@JsonTypeName("extract_request")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ExtractRequest {
  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private UUID documentId;

  public ExtractRequest() { 
  }

  public ExtractRequest documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * The unique identifier of the uploaded document to run extraction on
   * @return documentId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getDocumentId() {
    return documentId;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }


  /**
   * Return true if this extract_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractRequest extractRequest = (ExtractRequest) o;
    return Objects.equals(this.documentId, extractRequest.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractRequest {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

