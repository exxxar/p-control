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
import java.util.ArrayList;
import java.util.List;

/**
 * InlineObject3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T13:03:19.227601400+03:00[Europe/Moscow]")
public class InlineObject3 {
  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private String startAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private String endAt;

  public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private List<Integer> objectId = null;

  /**
   * Статистика по:   * &#x60;REQUEST_BY_CATEGORIES&#x60; - запросы по категориям   * &#x60;REQUEST_BY_CONTRACTORS&#x60; - запросы по исполнительным \\ контролирующим органам   * &#x60;REQUEST_BY_CONTRACTORS_EXECUTIVE&#x60; - запросы по исполнительным  органам   * &#x60;REQUEST_BY_CONTRACTORS_SUPERVISING&#x60; - запросы по контролирующим органам   * &#x60;CONTRACTORS&#x60; - добавленные исполнительные \\ контролирующие органы   * &#x60;ACCEPTED_REQUESTS&#x60; - принятые в работу заявки   * &#x60;DECLINE_REQUESTS&#x60; - отклоненные заявки   * &#x60;SUMMARY_ALL&#x60; - суммарная сводка по заявкам   * &#x60;NEW_USERS&#x60; - новые пользователи   * &#x60;ACTIVE_USERS&#x60; - активные пользователи 
   */
  @JsonAdapter(ObjectTypeEnum.Adapter.class)
  public enum ObjectTypeEnum {
    REQUEST_BY_CATEGORIES("REQUEST_BY_CATEGORIES"),
    
    REQUEST_BY_CONTRACTORS("REQUEST_BY_CONTRACTORS"),
    
    REQUEST_BY_CONTRACTORS_EXECUTIVE("REQUEST_BY_CONTRACTORS_EXECUTIVE"),
    
    REQUEST_BY_CONTRACTORS_SUPERVISING("REQUEST_BY_CONTRACTORS_SUPERVISING"),
    
    CONTRACTORS("CONTRACTORS"),
    
    ACCEPTED_REQUESTS("ACCEPTED_REQUESTS"),
    
    DECLINE_REQUESTS("DECLINE_REQUESTS"),
    
    SUMMARY_ALL("SUMMARY_ALL"),
    
    NEW_USERS("NEW_USERS"),
    
    ACTIVE_USERS("ACTIVE_USERS");

    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectTypeEnum fromValue(String value) {
      for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private ObjectTypeEnum objectType;


  public InlineObject3 startAt(String startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 11:00:00", value = "")

  public String getStartAt() {
    return startAt;
  }


  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }


  public InlineObject3 endAt(String endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-02 11:00:00", value = "")

  public String getEndAt() {
    return endAt;
  }


  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }


  public InlineObject3 objectId(List<Integer> objectId) {
    
    this.objectId = objectId;
    return this;
  }

  public InlineObject3 addObjectIdItem(Integer objectIdItem) {
    if (this.objectId == null) {
      this.objectId = new ArrayList<Integer>();
    }
    this.objectId.add(objectIdItem);
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1,2,3,4,5]", value = "")

  public List<Integer> getObjectId() {
    return objectId;
  }


  public void setObjectId(List<Integer> objectId) {
    this.objectId = objectId;
  }


  public InlineObject3 objectType(ObjectTypeEnum objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Статистика по:   * &#x60;REQUEST_BY_CATEGORIES&#x60; - запросы по категориям   * &#x60;REQUEST_BY_CONTRACTORS&#x60; - запросы по исполнительным \\ контролирующим органам   * &#x60;REQUEST_BY_CONTRACTORS_EXECUTIVE&#x60; - запросы по исполнительным  органам   * &#x60;REQUEST_BY_CONTRACTORS_SUPERVISING&#x60; - запросы по контролирующим органам   * &#x60;CONTRACTORS&#x60; - добавленные исполнительные \\ контролирующие органы   * &#x60;ACCEPTED_REQUESTS&#x60; - принятые в работу заявки   * &#x60;DECLINE_REQUESTS&#x60; - отклоненные заявки   * &#x60;SUMMARY_ALL&#x60; - суммарная сводка по заявкам   * &#x60;NEW_USERS&#x60; - новые пользователи   * &#x60;ACTIVE_USERS&#x60; - активные пользователи 
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Статистика по:   * `REQUEST_BY_CATEGORIES` - запросы по категориям   * `REQUEST_BY_CONTRACTORS` - запросы по исполнительным \\ контролирующим органам   * `REQUEST_BY_CONTRACTORS_EXECUTIVE` - запросы по исполнительным  органам   * `REQUEST_BY_CONTRACTORS_SUPERVISING` - запросы по контролирующим органам   * `CONTRACTORS` - добавленные исполнительные \\ контролирующие органы   * `ACCEPTED_REQUESTS` - принятые в работу заявки   * `DECLINE_REQUESTS` - отклоненные заявки   * `SUMMARY_ALL` - суммарная сводка по заявкам   * `NEW_USERS` - новые пользователи   * `ACTIVE_USERS` - активные пользователи ")

  public ObjectTypeEnum getObjectType() {
    return objectType;
  }


  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject3 inlineObject3 = (InlineObject3) o;
    return Objects.equals(this.startAt, inlineObject3.startAt) &&
        Objects.equals(this.endAt, inlineObject3.endAt) &&
        Objects.equals(this.objectId, inlineObject3.objectId) &&
        Objects.equals(this.objectType, inlineObject3.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, endAt, objectId, objectType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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
