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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.WebhookEventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * WebhookBuilder
 */
@JsonPropertyOrder({
  WebhookBuilder.JSON_PROPERTY_ENABLED,
  WebhookBuilder.JSON_PROPERTY_EVENTS,
  WebhookBuilder.JSON_PROPERTY_ENVIRONMENTS,
  WebhookBuilder.JSON_PROPERTY_PAYLOAD_VERSION,
  WebhookBuilder.JSON_PROPERTY_URL
})
@JsonTypeName("webhook_builder")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class WebhookBuilder {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<WebhookEventType> events;

  public static final String JSON_PROPERTY_ENVIRONMENTS = "environments";
  private List<String> environments;

  public static final String JSON_PROPERTY_PAYLOAD_VERSION = "payload_version";
  private Integer payloadVersion;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public WebhookBuilder() { 
  }

  public WebhookBuilder enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Determine if the webhook is active.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public WebhookBuilder events(List<WebhookEventType> events) {
    this.events = events;
    return this;
  }

  public WebhookBuilder addEventsItem(WebhookEventType eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The events that will be published to the webhook. If the events parameter is omitted all the events will be subscribed. 
   * @return events
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebhookEventType> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<WebhookEventType> events) {
    this.events = events;
  }


  public WebhookBuilder environments(List<String> environments) {
    this.environments = environments;
    return this;
  }

  public WebhookBuilder addEnvironmentsItem(String environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * The environments from which the webhook will receive events. Allowed values are “sandbox” and “live”. If the environments parameter is omitted the webhook will receive events from both environments. 
   * @return environments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEnvironments() {
    return environments;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironments(List<String> environments) {
    this.environments = environments;
  }


  public WebhookBuilder payloadVersion(Integer payloadVersion) {
    this.payloadVersion = payloadVersion;
    return this;
  }

   /**
   * Webhook version used to control the payload object when sending webhooks.
   * @return payloadVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPayloadVersion() {
    return payloadVersion;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloadVersion(Integer payloadVersion) {
    this.payloadVersion = payloadVersion;
  }


  public WebhookBuilder url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url that will listen to notifications (must be https).
   * @return url
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public WebhookBuilder putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this webhook_builder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookBuilder webhookBuilder = (WebhookBuilder) o;
    return Objects.equals(this.enabled, webhookBuilder.enabled) &&
        Objects.equals(this.events, webhookBuilder.events) &&
        Objects.equals(this.environments, webhookBuilder.environments) &&
        Objects.equals(this.payloadVersion, webhookBuilder.payloadVersion) &&
        Objects.equals(this.url, webhookBuilder.url)&&
        Objects.equals(this.additionalProperties, webhookBuilder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, events, environments, payloadVersion, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookBuilder {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    payloadVersion: ").append(toIndentedString(payloadVersion)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

