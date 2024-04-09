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
 * SdkTokenRequest
 */
@JsonPropertyOrder({
  SdkTokenRequest.JSON_PROPERTY_APPLICANT_ID,
  SdkTokenRequest.JSON_PROPERTY_REFERRER,
  SdkTokenRequest.JSON_PROPERTY_APPLICATION_ID,
  SdkTokenRequest.JSON_PROPERTY_CROSS_DEVICE_URL
})
@JsonTypeName("sdk_token_request")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SdkTokenRequest {
  public static final String JSON_PROPERTY_APPLICANT_ID = "applicant_id";
  private UUID applicantId;

  public static final String JSON_PROPERTY_REFERRER = "referrer";
  private String referrer;

  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private UUID applicationId;

  public static final String JSON_PROPERTY_CROSS_DEVICE_URL = "cross_device_url";
  private String crossDeviceUrl;

  public SdkTokenRequest() { 
  }

  public SdkTokenRequest applicantId(UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The unique identifier of the applicant
   * @return applicantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLICANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getApplicantId() {
    return applicantId;
  }


  @JsonProperty(JSON_PROPERTY_APPLICANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicantId(UUID applicantId) {
    this.applicantId = applicantId;
  }


  public SdkTokenRequest referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * The referrer URL pattern
   * @return referrer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferrer() {
    return referrer;
  }


  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }


  public SdkTokenRequest applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The application ID (iOS or Android)
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getApplicationId() {
    return applicationId;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }


  public SdkTokenRequest crossDeviceUrl(String crossDeviceUrl) {
    this.crossDeviceUrl = crossDeviceUrl;
    return this;
  }

   /**
   * The URL to be used by the Web SDK for the cross device flow.
   * @return crossDeviceUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_DEVICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrossDeviceUrl() {
    return crossDeviceUrl;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_DEVICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossDeviceUrl(String crossDeviceUrl) {
    this.crossDeviceUrl = crossDeviceUrl;
  }


  /**
   * Return true if this sdk_token_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SdkTokenRequest sdkTokenRequest = (SdkTokenRequest) o;
    return Objects.equals(this.applicantId, sdkTokenRequest.applicantId) &&
        Objects.equals(this.referrer, sdkTokenRequest.referrer) &&
        Objects.equals(this.applicationId, sdkTokenRequest.applicationId) &&
        Objects.equals(this.crossDeviceUrl, sdkTokenRequest.crossDeviceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, referrer, applicationId, crossDeviceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdkTokenRequest {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    crossDeviceUrl: ").append(toIndentedString(crossDeviceUrl)).append("\n");
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

