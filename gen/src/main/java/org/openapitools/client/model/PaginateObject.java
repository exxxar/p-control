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
import org.openapitools.client.model.PaginateObjectLinks;

/**
 * PaginateObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T00:27:59.866835800+03:00[Europe/Moscow]")
public class PaginateObject {
  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginateObjectLinks links;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Integer from;

  public static final String SERIALIZED_NAME_LAST_PAGE = "last_page";
  @SerializedName(SERIALIZED_NAME_LAST_PAGE)
  private Integer lastPage;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private Integer to;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;


  public PaginateObject links(PaginateObjectLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginateObjectLinks getLinks() {
    return links;
  }


  public void setLinks(PaginateObjectLinks links) {
    this.links = links;
  }


  public PaginateObject currentPage(Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  public PaginateObject from(Integer from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFrom() {
    return from;
  }


  public void setFrom(Integer from) {
    this.from = from;
  }


  public PaginateObject lastPage(Integer lastPage) {
    
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getLastPage() {
    return lastPage;
  }


  public void setLastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }


  public PaginateObject path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://localhost:8000/api/{method_name}", value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public PaginateObject perPage(Integer perPage) {
    
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getPerPage() {
    return perPage;
  }


  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }


  public PaginateObject to(Integer to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTo() {
    return to;
  }


  public void setTo(Integer to) {
    this.to = to;
  }


  public PaginateObject total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginateObject paginateObject = (PaginateObject) o;
    return Objects.equals(this.links, paginateObject.links) &&
        Objects.equals(this.currentPage, paginateObject.currentPage) &&
        Objects.equals(this.from, paginateObject.from) &&
        Objects.equals(this.lastPage, paginateObject.lastPage) &&
        Objects.equals(this.path, paginateObject.path) &&
        Objects.equals(this.perPage, paginateObject.perPage) &&
        Objects.equals(this.to, paginateObject.to) &&
        Objects.equals(this.total, paginateObject.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, currentPage, from, lastPage, path, perPage, to, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginateObject {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

