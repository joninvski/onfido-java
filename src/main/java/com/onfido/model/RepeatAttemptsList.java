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
import com.onfido.model.RepeatAttemptsListRepeatAttemptsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * RepeatAttemptsList
 */
@JsonPropertyOrder({
  RepeatAttemptsList.JSON_PROPERTY_REPORT_ID,
  RepeatAttemptsList.JSON_PROPERTY_REPEAT_ATTEMPTS,
  RepeatAttemptsList.JSON_PROPERTY_ATTEMPTS_COUNT,
  RepeatAttemptsList.JSON_PROPERTY_ATTEMPTS_CLEAR_RATE,
  RepeatAttemptsList.JSON_PROPERTY_UNIQUE_MISMATCHES_COUNT
})
@JsonTypeName("repeat_attempts_list")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RepeatAttemptsList {
  public static final String JSON_PROPERTY_REPORT_ID = "report_id";
  private UUID reportId;

  public static final String JSON_PROPERTY_REPEAT_ATTEMPTS = "repeat_attempts";
  private List<RepeatAttemptsListRepeatAttemptsInner> repeatAttempts = new ArrayList<>();

  public static final String JSON_PROPERTY_ATTEMPTS_COUNT = "attempts_count";
  private Integer attemptsCount;

  public static final String JSON_PROPERTY_ATTEMPTS_CLEAR_RATE = "attempts_clear_rate";
  private Float attemptsClearRate;

  public static final String JSON_PROPERTY_UNIQUE_MISMATCHES_COUNT = "unique_mismatches_count";
  private Integer uniqueMismatchesCount;

  public RepeatAttemptsList() { 
  }

  public RepeatAttemptsList reportId(UUID reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The unique identifier of the completed Document report.
   * @return reportId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getReportId() {
    return reportId;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportId(UUID reportId) {
    this.reportId = reportId;
  }


  public RepeatAttemptsList repeatAttempts(List<RepeatAttemptsListRepeatAttemptsInner> repeatAttempts) {
    this.repeatAttempts = repeatAttempts;
    return this;
  }

  public RepeatAttemptsList addRepeatAttemptsItem(RepeatAttemptsListRepeatAttemptsInner repeatAttemptsItem) {
    if (this.repeatAttempts == null) {
      this.repeatAttempts = new ArrayList<>();
    }
    this.repeatAttempts.add(repeatAttemptsItem);
    return this;
  }

   /**
   * An array of repeat attempt objects. If no repeat attempts were found, the array will be empty. The number of objects returned can increase over time if more matches are received. 
   * @return repeatAttempts
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPEAT_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RepeatAttemptsListRepeatAttemptsInner> getRepeatAttempts() {
    return repeatAttempts;
  }


  @JsonProperty(JSON_PROPERTY_REPEAT_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepeatAttempts(List<RepeatAttemptsListRepeatAttemptsInner> repeatAttempts) {
    this.repeatAttempts = repeatAttempts;
  }


  public RepeatAttemptsList attemptsCount(Integer attemptsCount) {
    this.attemptsCount = attemptsCount;
    return this;
  }

   /**
   * The total number of attempts using the same document, including the current report under assessment.
   * @return attemptsCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTEMPTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttemptsCount() {
    return attemptsCount;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttemptsCount(Integer attemptsCount) {
    this.attemptsCount = attemptsCount;
  }


  public RepeatAttemptsList attemptsClearRate(Float attemptsClearRate) {
    this.attemptsClearRate = attemptsClearRate;
    return this;
  }

   /**
   * A number between 0 and 1 which indicates the proportion of attempts that have been cleared, including the current report under assessment.
   * minimum: 0
   * maximum: 1
   * @return attemptsClearRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTEMPTS_CLEAR_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAttemptsClearRate() {
    return attemptsClearRate;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPTS_CLEAR_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttemptsClearRate(Float attemptsClearRate) {
    this.attemptsClearRate = attemptsClearRate;
  }


  public RepeatAttemptsList uniqueMismatchesCount(Integer uniqueMismatchesCount) {
    this.uniqueMismatchesCount = uniqueMismatchesCount;
    return this;
  }

   /**
   * The number of unique entries in the repeat_attempts field for which at least one of the fields is a mismatch.
   * @return uniqueMismatchesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_MISMATCHES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUniqueMismatchesCount() {
    return uniqueMismatchesCount;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_MISMATCHES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueMismatchesCount(Integer uniqueMismatchesCount) {
    this.uniqueMismatchesCount = uniqueMismatchesCount;
  }


  /**
   * Return true if this repeat_attempts_list object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatAttemptsList repeatAttemptsList = (RepeatAttemptsList) o;
    return Objects.equals(this.reportId, repeatAttemptsList.reportId) &&
        Objects.equals(this.repeatAttempts, repeatAttemptsList.repeatAttempts) &&
        Objects.equals(this.attemptsCount, repeatAttemptsList.attemptsCount) &&
        Objects.equals(this.attemptsClearRate, repeatAttemptsList.attemptsClearRate) &&
        Objects.equals(this.uniqueMismatchesCount, repeatAttemptsList.uniqueMismatchesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, repeatAttempts, attemptsCount, attemptsClearRate, uniqueMismatchesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatAttemptsList {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    repeatAttempts: ").append(toIndentedString(repeatAttempts)).append("\n");
    sb.append("    attemptsCount: ").append(toIndentedString(attemptsCount)).append("\n");
    sb.append("    attemptsClearRate: ").append(toIndentedString(attemptsClearRate)).append("\n");
    sb.append("    uniqueMismatchesCount: ").append(toIndentedString(uniqueMismatchesCount)).append("\n");
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

