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
import org.openapitools.client.model.MediaContent;

/**
 * RequestByContractor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T00:27:59.866835800+03:00[Europe/Moscow]")
public class RequestByContractor {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CONTRACTOR_ID = "contractor_id";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_ID)
  private Long contractorId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private Long requestId;

  /**
   * Выбор типа задачи для органа - контроль, исполнение:  * &#x60;EXECUTIVE&#x60; - исполнение  * &#x60;SUPERVISING&#x60; - контроль 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VERIFICATION("VERIFICATION"),
    
    EXECUTION("EXECUTION");

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
  private TypeEnum type = TypeEnum.EXECUTION;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<MediaContent> attachments = null;

  public static final String SERIALIZED_NAME_WORKED_AT = "worked_at";
  @SerializedName(SERIALIZED_NAME_WORKED_AT)
  private String workedAt = "null";

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt = "null";

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt = "null";


  public RequestByContractor id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public RequestByContractor contractorId(Long contractorId) {
    
    this.contractorId = contractorId;
    return this;
  }

   /**
   * Get contractorId
   * @return contractorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getContractorId() {
    return contractorId;
  }


  public void setContractorId(Long contractorId) {
    this.contractorId = contractorId;
  }


  public RequestByContractor requestId(Long requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getRequestId() {
    return requestId;
  }


  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }


  public RequestByContractor type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Выбор типа задачи для органа - контроль, исполнение:  * &#x60;EXECUTIVE&#x60; - исполнение  * &#x60;SUPERVISING&#x60; - контроль 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Выбор типа задачи для органа - контроль, исполнение:  * `EXECUTIVE` - исполнение  * `SUPERVISING` - контроль ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RequestByContractor description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * краткое пояснение исполнительного \\ контролирующего органа
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Работы выполнены успешно", value = "краткое пояснение исполнительного \\ контролирующего органа")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RequestByContractor attachments(List<MediaContent> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public RequestByContractor addAttachmentsItem(MediaContent attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<MediaContent>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * медиа данные по исполнению \\ контролю
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "медиа данные по исполнению \\ контролю")

  public List<MediaContent> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<MediaContent> attachments) {
    this.attachments = attachments;
  }


  public RequestByContractor workedAt(String workedAt) {
    
    this.workedAt = workedAt;
    return this;
  }

   /**
   * время проведения работ \\ контроля
   * @return workedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01 12:00:00", value = "время проведения работ \\ контроля")

  public String getWorkedAt() {
    return workedAt;
  }


  public void setWorkedAt(String workedAt) {
    this.workedAt = workedAt;
  }


  public RequestByContractor createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01 12:00:00", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public RequestByContractor updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01 12:00:00", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestByContractor requestByContractor = (RequestByContractor) o;
    return Objects.equals(this.id, requestByContractor.id) &&
        Objects.equals(this.contractorId, requestByContractor.contractorId) &&
        Objects.equals(this.requestId, requestByContractor.requestId) &&
        Objects.equals(this.type, requestByContractor.type) &&
        Objects.equals(this.description, requestByContractor.description) &&
        Objects.equals(this.attachments, requestByContractor.attachments) &&
        Objects.equals(this.workedAt, requestByContractor.workedAt) &&
        Objects.equals(this.createdAt, requestByContractor.createdAt) &&
        Objects.equals(this.updatedAt, requestByContractor.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contractorId, requestId, type, description, attachments, workedAt, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestByContractor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contractorId: ").append(toIndentedString(contractorId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    workedAt: ").append(toIndentedString(workedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

