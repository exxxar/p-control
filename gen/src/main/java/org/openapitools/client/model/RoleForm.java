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
 * RoleForm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T00:27:59.866835800+03:00[Europe/Moscow]")
public class RoleForm {
  /**
   * Роли пользователя:   * &#x60;GUEST&#x60; - гость (не используется)   * &#x60;USER&#x60; - польователь системы   * &#x60;ADMINISTRATOR&#x60; - администратор системы   * &#x60;CONTRACTOR&#x60; - исполнительный или контролирующий орган   * &#x60;CONTRACTOR_EXECUTIVE&#x60; - исполнительный орган   * &#x60;CONTRACTOR_SUPERVISING&#x60; - контролирующий орган   * &#x60;TECHNICAL&#x60; - технический пользователь системы 
   */
  @JsonAdapter(TitleEnum.Adapter.class)
  public enum TitleEnum {
    GUEST("GUEST"),
    
    USER("USER"),
    
    ADMINISTRATOR("ADMINISTRATOR"),
    
    CONTRACTOR("CONTRACTOR"),
    
    CONTRACTOR_EXECUTIVE("CONTRACTOR_EXECUTIVE"),
    
    CONTRACTOR_SUPERVISING("CONTRACTOR_SUPERVISING"),
    
    TECHNICAL("TECHNICAL");

    private String value;

    TitleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TitleEnum fromValue(String value) {
      for (TitleEnum b : TitleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TitleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TitleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TitleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TitleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private TitleEnum title;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug = "guest";


  public RoleForm title(TitleEnum title) {
    
    this.title = title;
    return this;
  }

   /**
   * Роли пользователя:   * &#x60;GUEST&#x60; - гость (не используется)   * &#x60;USER&#x60; - польователь системы   * &#x60;ADMINISTRATOR&#x60; - администратор системы   * &#x60;CONTRACTOR&#x60; - исполнительный или контролирующий орган   * &#x60;CONTRACTOR_EXECUTIVE&#x60; - исполнительный орган   * &#x60;CONTRACTOR_SUPERVISING&#x60; - контролирующий орган   * &#x60;TECHNICAL&#x60; - технический пользователь системы 
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Роли пользователя:   * `GUEST` - гость (не используется)   * `USER` - польователь системы   * `ADMINISTRATOR` - администратор системы   * `CONTRACTOR` - исполнительный или контролирующий орган   * `CONTRACTOR_EXECUTIVE` - исполнительный орган   * `CONTRACTOR_SUPERVISING` - контролирующий орган   * `TECHNICAL` - технический пользователь системы ")

  public TitleEnum getTitle() {
    return title;
  }


  public void setTitle(TitleEnum title) {
    this.title = title;
  }


  public RoleForm slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * мнемоническое имя роли
   * @return slug
  **/
  @ApiModelProperty(required = true, value = "мнемоническое имя роли")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleForm roleForm = (RoleForm) o;
    return Objects.equals(this.title, roleForm.title) &&
        Objects.equals(this.slug, roleForm.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, slug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleForm {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
