/*
 * app API
 * app API documentation
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package education.app.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AdminUserDTO
 */
@JsonPropertyOrder({
  AdminUserDTO.JSON_PROPERTY_ACTIVATED,
  AdminUserDTO.JSON_PROPERTY_AUTHORITIES,
  AdminUserDTO.JSON_PROPERTY_CREATED_BY,
  AdminUserDTO.JSON_PROPERTY_CREATED_DATE,
  AdminUserDTO.JSON_PROPERTY_EMAIL,
  AdminUserDTO.JSON_PROPERTY_FIRST_NAME,
  AdminUserDTO.JSON_PROPERTY_ID,
  AdminUserDTO.JSON_PROPERTY_IMAGE_URL,
  AdminUserDTO.JSON_PROPERTY_LANG_KEY,
  AdminUserDTO.JSON_PROPERTY_LAST_MODIFIED_BY,
  AdminUserDTO.JSON_PROPERTY_LAST_MODIFIED_DATE,
  AdminUserDTO.JSON_PROPERTY_LAST_NAME,
  AdminUserDTO.JSON_PROPERTY_LOGIN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public class AdminUserDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACTIVATED = "activated";
  private Boolean activated;

  public static final String JSON_PROPERTY_AUTHORITIES = "authorities";
  private Set<String> authorities = null;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  public static final String JSON_PROPERTY_LANG_KEY = "langKey";
  private String langKey;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "lastModifiedBy";
  private String lastModifiedBy;

  public static final String JSON_PROPERTY_LAST_MODIFIED_DATE = "lastModifiedDate";
  private OffsetDateTime lastModifiedDate;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;


  public AdminUserDTO activated(Boolean activated) {
    
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActivated() {
    return activated;
  }


  public void setActivated(Boolean activated) {
    this.activated = activated;
  }


  public AdminUserDTO authorities(Set<String> authorities) {
    
    this.authorities = authorities;
    return this;
  }

  public AdminUserDTO addAuthoritiesItem(String authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new LinkedHashSet<>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAuthorities() {
    return authorities;
  }


  public void setAuthorities(Set<String> authorities) {
    this.authorities = authorities;
  }


  public AdminUserDTO createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public AdminUserDTO createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public AdminUserDTO email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AdminUserDTO firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AdminUserDTO id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AdminUserDTO imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public AdminUserDTO langKey(String langKey) {
    
    this.langKey = langKey;
    return this;
  }

   /**
   * Get langKey
   * @return langKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLangKey() {
    return langKey;
  }


  public void setLangKey(String langKey) {
    this.langKey = langKey;
  }


  public AdminUserDTO lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public AdminUserDTO lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public AdminUserDTO lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AdminUserDTO login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminUserDTO adminUserDTO = (AdminUserDTO) o;
    return Objects.equals(this.activated, adminUserDTO.activated) &&
        Objects.equals(this.authorities, adminUserDTO.authorities) &&
        Objects.equals(this.createdBy, adminUserDTO.createdBy) &&
        Objects.equals(this.createdDate, adminUserDTO.createdDate) &&
        Objects.equals(this.email, adminUserDTO.email) &&
        Objects.equals(this.firstName, adminUserDTO.firstName) &&
        Objects.equals(this.id, adminUserDTO.id) &&
        Objects.equals(this.imageUrl, adminUserDTO.imageUrl) &&
        Objects.equals(this.langKey, adminUserDTO.langKey) &&
        Objects.equals(this.lastModifiedBy, adminUserDTO.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, adminUserDTO.lastModifiedDate) &&
        Objects.equals(this.lastName, adminUserDTO.lastName) &&
        Objects.equals(this.login, adminUserDTO.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activated, authorities, createdBy, createdDate, email, firstName, id, imageUrl, langKey, lastModifiedBy, lastModifiedDate, lastName, login);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminUserDTO {\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    langKey: ").append(toIndentedString(langKey)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
