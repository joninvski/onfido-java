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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * The object affected by this event.
 */
@JsonPropertyOrder({
  WebhookEventPayloadObject.JSON_PROPERTY_ID,
  WebhookEventPayloadObject.JSON_PROPERTY_STATUS,
  WebhookEventPayloadObject.JSON_PROPERTY_COMPLETED_AT_ISO8601,
  WebhookEventPayloadObject.JSON_PROPERTY_HREF
})
@JsonTypeName("webhook_event_payload_object")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class WebhookEventPayloadObject {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_COMPLETED_AT_ISO8601 = "completed_at_iso8601";
  private OffsetDateTime completedAtIso8601;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public WebhookEventPayloadObject() { 
  }

  public WebhookEventPayloadObject id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the resource.
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public WebhookEventPayloadObject status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The current state of the object, if available.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public WebhookEventPayloadObject completedAtIso8601(OffsetDateTime completedAtIso8601) {
    this.completedAtIso8601 = completedAtIso8601;
    return this;
  }

   /**
   * The date and time when the operation was completed, if available.
   * @return completedAtIso8601
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT_ISO8601)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCompletedAtIso8601() {
    return completedAtIso8601;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT_ISO8601)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAtIso8601(OffsetDateTime completedAtIso8601) {
    this.completedAtIso8601 = completedAtIso8601;
  }


  public WebhookEventPayloadObject href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of the resource.
   * @return href
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHref(String href) {
    this.href = href;
  }


  /**
   * Return true if this webhook_event_payload_object object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEventPayloadObject webhookEventPayloadObject = (WebhookEventPayloadObject) o;
    return Objects.equals(this.id, webhookEventPayloadObject.id) &&
        Objects.equals(this.status, webhookEventPayloadObject.status) &&
        Objects.equals(this.completedAtIso8601, webhookEventPayloadObject.completedAtIso8601) &&
        Objects.equals(this.href, webhookEventPayloadObject.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, completedAtIso8601, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEventPayloadObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    completedAtIso8601: ").append(toIndentedString(completedAtIso8601)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

