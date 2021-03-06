/*
 * API системы \"Народный контроль\"
 *  <h2>Приложение Народный контроль</h2> <p><strong>Основная цель</strong>: контроль за состоянием сфер жизнедеятельности города по отраслям:</p> <ul> <li>общественный транспорт (мин.транс)</li> <li>состояние дорог и прилегающий территорий (мин.транс)</li> <li>состояние благоустройства города (мин. хоз)</li> <li>аварийные участки города, прорывы водо- тепло- коммуникаций, обрывы электро коммуникаций  (жэк)</li> <li>постройки в аварийном состоянии (мин. Хоз)</li> <li>уборка территории и вывоз отходов (мин. Хоз)</li> <li>некачественные товары (потреб контроль)</li> <li>скопление животных (мин. Хоз)</li> <li>последствия стихийных бедствий  (мин. Хоз,  мчс)</li> <li>последствие военных действий (мчс, военные, мин. Транс)</li> <li>проявления вандализмам (в т.ч. размещение рекламы в неположенном месте)</li> <li>состояние фортификационных сооружений (мчс)</li> <li>состояние рабочего места (проф. Комиссии)</li> <li>регулярное скопление криминальных (или асоциальных) элементов общества или проявление аморального поведения в общественных местах (мин. Хоз)</li> <li>нарушение ПДД участниками дорожного движения (мвд)</li> <li>также могут быть заявки без категории</li> <li>инициативы граждан - полезные нововведения от граждан</li> <li>заявки на утерянные или найденные вещи</li> </ul> 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: exxxar@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * сохранение данных профиля на момент формирования заявки
 */
@ApiModel(description = "сохранение данных профиля на момент формирования заявки")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T00:27:59.866835800+03:00[Europe/Moscow]")
public class RequestStoredProfileData {
  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone = "null";

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Integer rating;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = "null";


  public RequestStoredProfileData fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Алексей Алексеевич Алексеев", value = "")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public RequestStoredProfileData location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Донецк, Куйбышевский район", value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public RequestStoredProfileData phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "07143200000", value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public RequestStoredProfileData rating(Integer rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * персональный рейтинг пользователя на момент обращения
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1023", value = "персональный рейтинг пользователя на момент обращения")

  public Integer getRating() {
    return rating;
  }


  public void setRating(Integer rating) {
    this.rating = rating;
  }


  public RequestStoredProfileData email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@test.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestStoredProfileData requestStoredProfileData = (RequestStoredProfileData) o;
    return Objects.equals(this.fullName, requestStoredProfileData.fullName) &&
        Objects.equals(this.location, requestStoredProfileData.location) &&
        Objects.equals(this.phone, requestStoredProfileData.phone) &&
        Objects.equals(this.rating, requestStoredProfileData.rating) &&
        Objects.equals(this.email, requestStoredProfileData.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, location, phone, rating, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestStoredProfileData {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

