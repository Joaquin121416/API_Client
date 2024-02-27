package com.nttdata.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Client
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-27T10:19:11.588399700-05:00[America/Lima]")
public class Client implements Serializable {

  public Client(Long clientid, String username, String firstName, String lastName, String motherSurname, String email, String password, String phone, StatusEnum status, List<@Valid Tag> tags) {
    this.clientid = clientid;
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.motherSurname = motherSurname;
    this.email = email;
    this.password = password;
    this.phone = phone;
    this.status = status;
    this.tags = tags;
  }

  public Client() {
  }

  private static final long serialVersionUID = 1L;

  private Long clientid;

  private String username;

  private String firstName;

  private String lastName;

  private String motherSurname;

  private String email;

  private String password;

  private String phone;

  /**
   * client status
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  @Valid
  private List<@Valid Tag> tags;

  public Client clientid(Long clientid) {
    this.clientid = clientid;
    return this;
  }

  /**
   * Get clientid
   * @return clientid
  */
  
  @Schema(name = "clientid", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientid")
  public Long getClientid() {
    return clientid;
  }

  public void setClientid(Long clientid) {
    this.clientid = clientid;
  }

  public Client username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", example = "theUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Client firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "Joaquin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Client lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "Cunorana", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Client motherSurname(String motherSurname) {
    this.motherSurname = motherSurname;
    return this;
  }

  /**
   * Get motherSurname
   * @return motherSurname
  */
  
  @Schema(name = "motherSurname", example = "Jimenez", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("motherSurname")
  public String getMotherSurname() {
    return motherSurname;
  }

  public void setMotherSurname(String motherSurname) {
    this.motherSurname = motherSurname;
  }

  public Client email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", example = "joa@email.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Client password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", example = "12345", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Client phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  
  @Schema(name = "phone", example = "12345", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Client status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * client status
   * @return status
  */
  
  @Schema(name = "status", description = "client status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Client tags(List<@Valid Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Client addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<@Valid Tag> getTags() {
    return tags;
  }

  public void setTags(List<@Valid Tag> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.clientid, client.clientid) &&
        Objects.equals(this.username, client.username) &&
        Objects.equals(this.firstName, client.firstName) &&
        Objects.equals(this.lastName, client.lastName) &&
        Objects.equals(this.motherSurname, client.motherSurname) &&
        Objects.equals(this.email, client.email) &&
        Objects.equals(this.password, client.password) &&
        Objects.equals(this.phone, client.phone) &&
        Objects.equals(this.status, client.status) &&
        Objects.equals(this.tags, client.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientid, username, firstName, lastName, motherSurname, email, password, phone, status, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    motherSurname: ").append(toIndentedString(motherSurname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

