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
import com.onfido.model.WebhookEventPayloadObject;
import com.onfido.model.WebhookEventType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * WebhookEventPayload
 */
@JsonPropertyOrder({
  WebhookEventPayload.JSON_PROPERTY_RESOURCE_TYPE,
  WebhookEventPayload.JSON_PROPERTY_ACTION,
  WebhookEventPayload.JSON_PROPERTY_OBJECT,
  WebhookEventPayload.JSON_PROPERTY_RESOURCE
})
@JsonTypeName("webhook_event_payload")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookEventPayload {
  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_ACTION = "action";
  private WebhookEventType action;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private WebhookEventPayloadObject _object;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private Object resource;

  public WebhookEventPayload() { 
  }

  public WebhookEventPayload resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Indicates the resource affected by this event.
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public WebhookEventPayload action(WebhookEventType action) {
    this.action = action;
    return this;
  }

   /**
   * The event that triggered this webhook.
   * @return action
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookEventType getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(WebhookEventType action) {
    this.action = action;
  }


  public WebhookEventPayload _object(WebhookEventPayloadObject _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookEventPayloadObject getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(WebhookEventPayloadObject _object) {
    this._object = _object;
  }


  public WebhookEventPayload resource(Object resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The resource affected by this event.
   * @return resource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getResource() {
    return resource;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResource(Object resource) {
    this.resource = resource;
  }


  /**
   * Return true if this webhook_event_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEventPayload webhookEventPayload = (WebhookEventPayload) o;
    return Objects.equals(this.resourceType, webhookEventPayload.resourceType) &&
        Objects.equals(this.action, webhookEventPayload.action) &&
        Objects.equals(this._object, webhookEventPayload._object) &&
        Objects.equals(this.resource, webhookEventPayload.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, action, _object, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEventPayload {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

