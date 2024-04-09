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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * IdPhoto
 */
@JsonPropertyOrder({
  IdPhoto.JSON_PROPERTY_ID,
  IdPhoto.JSON_PROPERTY_CREATED_AT,
  IdPhoto.JSON_PROPERTY_HREF,
  IdPhoto.JSON_PROPERTY_DOWNLOAD_HREF,
  IdPhoto.JSON_PROPERTY_FILE_NAME,
  IdPhoto.JSON_PROPERTY_FILE_TYPE,
  IdPhoto.JSON_PROPERTY_FILE_SIZE
})
@JsonTypeName("id_photo")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class IdPhoto {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_DOWNLOAD_HREF = "download_href";
  private String downloadHref;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_TYPE = "file_type";
  private String fileType;

  public static final String JSON_PROPERTY_FILE_SIZE = "file_size";
  private Integer fileSize;

  public IdPhoto() { 
  }

  public IdPhoto id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the photo.
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


  public IdPhoto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the photo was uploaded.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public IdPhoto href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of this resource.
   * @return href
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public IdPhoto downloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
    return this;
  }

   /**
   * The uri that can be used to download the photo.
   * @return downloadHref
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownloadHref() {
    return downloadHref;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
  }


  public IdPhoto fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the uploaded file.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public IdPhoto fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The file type of the uploaded file.
   * @return fileType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  public IdPhoto fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The size of the file in bytes.
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
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
  public IdPhoto putAdditionalProperty(String key, Object value) {
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
   * Return true if this id_photo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdPhoto idPhoto = (IdPhoto) o;
    return Objects.equals(this.id, idPhoto.id) &&
        Objects.equals(this.createdAt, idPhoto.createdAt) &&
        Objects.equals(this.href, idPhoto.href) &&
        Objects.equals(this.downloadHref, idPhoto.downloadHref) &&
        Objects.equals(this.fileName, idPhoto.fileName) &&
        Objects.equals(this.fileType, idPhoto.fileType) &&
        Objects.equals(this.fileSize, idPhoto.fileSize)&&
        Objects.equals(this.additionalProperties, idPhoto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, downloadHref, fileName, fileType, fileSize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdPhoto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    downloadHref: ").append(toIndentedString(downloadHref)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

