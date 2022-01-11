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
 * InlineObject10
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T00:27:59.866835800+03:00[Europe/Moscow]")
public class InlineObject10 {
  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private String startAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private String endAt;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private List<Integer> categoryId = null;

  /**
   * Тепловая карта заявок:   * &#x60;ACCEPTED&#x60; - принятые запросы   * &#x60;RESOLVED&#x60; - выполненные запросы   * &#x60;NOT_ACCEPTED&#x60; - не принятые запросы   * &#x60;DECLINED&#x60; - отклоненные запрос 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACCEPTED("ACCEPTED"),
    
    RESOLVED("RESOLVED"),
    
    NOT_ACCEPTED("NOT_ACCEPTED"),
    
    DECLINED("DECLINED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public InlineObject10 startAt(String startAt) {
    
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


  public InlineObject10 endAt(String endAt) {
    
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


  public InlineObject10 categoryId(List<Integer> categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

  public InlineObject10 addCategoryIdItem(Integer categoryIdItem) {
    if (this.categoryId == null) {
      this.categoryId = new ArrayList<Integer>();
    }
    this.categoryId.add(categoryIdItem);
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1,2,3,4,5]", value = "")

  public List<Integer> getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(List<Integer> categoryId) {
    this.categoryId = categoryId;
  }


  public InlineObject10 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Тепловая карта заявок:   * &#x60;ACCEPTED&#x60; - принятые запросы   * &#x60;RESOLVED&#x60; - выполненные запросы   * &#x60;NOT_ACCEPTED&#x60; - не принятые запросы   * &#x60;DECLINED&#x60; - отклоненные запрос 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Тепловая карта заявок:   * `ACCEPTED` - принятые запросы   * `RESOLVED` - выполненные запросы   * `NOT_ACCEPTED` - не принятые запросы   * `DECLINED` - отклоненные запрос ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject10 inlineObject10 = (InlineObject10) o;
    return Objects.equals(this.startAt, inlineObject10.startAt) &&
        Objects.equals(this.endAt, inlineObject10.endAt) &&
        Objects.equals(this.categoryId, inlineObject10.categoryId) &&
        Objects.equals(this.type, inlineObject10.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, endAt, categoryId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject10 {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

