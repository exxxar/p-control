# DefaultApi

All URIs are relative to *https://api.domain-name.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contractorsContractorIdDelete**](DefaultApi.md#contractorsContractorIdDelete) | **DELETE** /contractors/{contractorId} | Удаляем исполнителя по идентификатору
[**contractorsContractorIdGet**](DefaultApi.md#contractorsContractorIdGet) | **GET** /contractors/{contractorId} | Находим исполнителя по идентификатору
[**contractorsContractorIdPut**](DefaultApi.md#contractorsContractorIdPut) | **PUT** /contractors/{contractorId} | Обновляем исполнителя по идентификатору
[**contractorsContractorIdRequestsActiveGet**](DefaultApi.md#contractorsContractorIdRequestsActiveGet) | **GET** /contractors/{contractorId}/requests/active | Список активных заявок по исполнительному органу
[**contractorsContractorIdRequestsArchiveGet**](DefaultApi.md#contractorsContractorIdRequestsArchiveGet) | **GET** /contractors/{contractorId}/requests/archive | Список архивных заявок по исполнительному органу
[**contractorsGet**](DefaultApi.md#contractorsGet) | **GET** /contractors | Список профилей исполнительных органов
[**contractorsPost**](DefaultApi.md#contractorsPost) | **POST** /contractors | Создаем профиль исполнительного органа
[**problemCategoriesGet**](DefaultApi.md#problemCategoriesGet) | **GET** /problem-categories | Список категорий проблем
[**problemCategoriesPost**](DefaultApi.md#problemCategoriesPost) | **POST** /problem-categories | Создаем новую категорию проблем
[**problemCategoriesProblemCategoryIdActiveRequestsGet**](DefaultApi.md#problemCategoriesProblemCategoryIdActiveRequestsGet) | **GET** /problem-categories/{problemCategoryId}/active-requests | Список активных запросов в категории
[**problemCategoriesProblemCategoryIdArchiveRequestsGet**](DefaultApi.md#problemCategoriesProblemCategoryIdArchiveRequestsGet) | **GET** /problem-categories/{problemCategoryId}/archive-requests | Список архивных запросов в категории
[**problemCategoriesProblemCategoryIdCompletedRequestsGet**](DefaultApi.md#problemCategoriesProblemCategoryIdCompletedRequestsGet) | **GET** /problem-categories/{problemCategoryId}/completed-requests | Список выполненных запросов в категории
[**problemCategoriesProblemCategoryIdDelete**](DefaultApi.md#problemCategoriesProblemCategoryIdDelete) | **DELETE** /problem-categories/{problemCategoryId} | Удаляем категорию по идентификатору
[**problemCategoriesProblemCategoryIdGet**](DefaultApi.md#problemCategoriesProblemCategoryIdGet) | **GET** /problem-categories/{problemCategoryId} | Находим категорию по идентификатору
[**problemCategoriesProblemCategoryIdPut**](DefaultApi.md#problemCategoriesProblemCategoryIdPut) | **PUT** /problem-categories/{problemCategoryId} | Обновляем категорию по идентификатору
[**profilesGet**](DefaultApi.md#profilesGet) | **GET** /profiles | Список профилей пользователя
[**profilesPost**](DefaultApi.md#profilesPost) | **POST** /profiles | Создаем профиль
[**profilesProfileIdDelete**](DefaultApi.md#profilesProfileIdDelete) | **DELETE** /profiles/{profileId} | Удаляем пользователя по идентификатору
[**profilesProfileIdGet**](DefaultApi.md#profilesProfileIdGet) | **GET** /profiles/{profileId} | Находим профиль пользователя по идентификатору
[**profilesProfileIdPut**](DefaultApi.md#profilesProfileIdPut) | **PUT** /profiles/{profileId} | Обновляем профиль пользователя по идентификатору
[**requestsGet**](DefaultApi.md#requestsGet) | **GET** /requests | Список заявок
[**requestsInRangePost**](DefaultApi.md#requestsInRangePost) | **POST** /requests/in-range | Подбор заявок в радиусе
[**requestsPost**](DefaultApi.md#requestsPost) | **POST** /requests | Создаем заявку
[**requestsRatingPost**](DefaultApi.md#requestsRatingPost) | **POST** /requests/rating | модификация рейтинга заявки (+-)
[**requestsRequestIdDelete**](DefaultApi.md#requestsRequestIdDelete) | **DELETE** /requests/{requestId} | Удаляем заявку по идентификатору
[**requestsRequestIdGet**](DefaultApi.md#requestsRequestIdGet) | **GET** /requests/{requestId} | Находим заявку по идентификатору
[**requestsRequestIdPdfGet**](DefaultApi.md#requestsRequestIdPdfGet) | **GET** /requests/{requestId}/pdf | формируем заявку в виде pdf
[**requestsRequestIdPut**](DefaultApi.md#requestsRequestIdPut) | **PUT** /requests/{requestId} | Обновляем заявку по идентификатору
[**rolesGet**](DefaultApi.md#rolesGet) | **GET** /roles | Список всех ролей
[**rolesPost**](DefaultApi.md#rolesPost) | **POST** /roles | Создаем черновик заявки
[**rolesRoleIdDelete**](DefaultApi.md#rolesRoleIdDelete) | **DELETE** /roles/{roleId} | Удаляем черновик заявки по идентификатору
[**rolesRoleIdGet**](DefaultApi.md#rolesRoleIdGet) | **GET** /roles/{roleId} | Находим роль по идентификатору
[**rolesRoleIdPut**](DefaultApi.md#rolesRoleIdPut) | **PUT** /roles/{roleId} | Обновляем черновик заявки по идентификатору
[**servicesAddressPost**](DefaultApi.md#servicesAddressPost) | **POST** /services/address | Получаем адрес по координатам
[**servicesCoordsPost**](DefaultApi.md#servicesCoordsPost) | **POST** /services/coords | Получаем координаты по адресу
[**servicesHeatmapPost**](DefaultApi.md#servicesHeatmapPost) | **POST** /services/heatmap | тепловая карта проблемных \\ решенных зон за период
[**servicesMailingPost**](DefaultApi.md#servicesMailingPost) | **POST** /services/mailing | оповещение пользователей
[**servicesRequestExportPost**](DefaultApi.md#servicesRequestExportPost) | **POST** /services/request/export | экспортирование заявок в формате Excel-файла
[**servicesRequestImportPost**](DefaultApi.md#servicesRequestImportPost) | **POST** /services/request/import | импортирование заявок в формате Excel-файла(ов)
[**servicesStatisticPost**](DefaultApi.md#servicesStatisticPost) | **POST** /services/statistic | статистика по категориям за период
[**storedRequestsGet**](DefaultApi.md#storedRequestsGet) | **GET** /stored-requests | Список черновиков заявок
[**storedRequestsPost**](DefaultApi.md#storedRequestsPost) | **POST** /stored-requests | Создаем черновик заявки
[**storedRequestsStoredRequestIdDelete**](DefaultApi.md#storedRequestsStoredRequestIdDelete) | **DELETE** /stored-requests/{storedRequestId} | Удаляем черновик заявки по идентификатору
[**storedRequestsStoredRequestIdGet**](DefaultApi.md#storedRequestsStoredRequestIdGet) | **GET** /stored-requests/{storedRequestId} | Находим черновик заявки по идентификатору
[**storedRequestsStoredRequestIdPut**](DefaultApi.md#storedRequestsStoredRequestIdPut) | **PUT** /stored-requests/{storedRequestId} | Обновляем черновик заявки по идентификатору
[**usersGet**](DefaultApi.md#usersGet) | **GET** /users | Список пользователей
[**usersMeGet**](DefaultApi.md#usersMeGet) | **GET** /users/me | возвращаем текущего пользователя
[**usersPost**](DefaultApi.md#usersPost) | **POST** /users | Создаем пользователя
[**usersUserIdDelete**](DefaultApi.md#usersUserIdDelete) | **DELETE** /users/{userId} | Удаляем пользователя по идентификатору
[**usersUserIdGet**](DefaultApi.md#usersUserIdGet) | **GET** /users/{userId} | Находим пользователя по идентификатору
[**usersUserIdProfileGet**](DefaultApi.md#usersUserIdProfileGet) | **GET** /users/{userId}/profile | Находим профиль пользователя по идентификатору пользователя
[**usersUserIdPut**](DefaultApi.md#usersUserIdPut) | **PUT** /users/{userId} | Обновляем пользователя по идентификатору


<a name="contractorsContractorIdDelete"></a>
# **contractorsContractorIdDelete**
> Contractor contractorsContractorIdDelete(contractorId)

Удаляем исполнителя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long contractorId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      Contractor result = apiInstance.contractorsContractorIdDelete(contractorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsContractorIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractorId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**Contractor**](Contractor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The specified user ID is invalid (not a number). |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="contractorsContractorIdGet"></a>
# **contractorsContractorIdGet**
> Contractor contractorsContractorIdGet(contractorId)

Находим исполнителя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long contractorId = 56L; // Long | Целочисленный идентификатор
    try {
      Contractor result = apiInstance.contractorsContractorIdGet(contractorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsContractorIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractorId** | **Long**| Целочисленный идентификатор |

### Return type

[**Contractor**](Contractor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="contractorsContractorIdPut"></a>
# **contractorsContractorIdPut**
> Contractor contractorsContractorIdPut(contractorId, contractorForm)

Обновляем исполнителя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long contractorId = 56L; // Long | Целочисленный идентификатор исполнителя
    ContractorForm contractorForm = new ContractorForm(); // ContractorForm | 
    try {
      Contractor result = apiInstance.contractorsContractorIdPut(contractorId, contractorForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsContractorIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractorId** | **Long**| Целочисленный идентификатор исполнителя |
 **contractorForm** | [**ContractorForm**](ContractorForm.md)|  | [optional]

### Return type

[**Contractor**](Contractor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор исполнителя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="contractorsContractorIdRequestsActiveGet"></a>
# **contractorsContractorIdRequestsActiveGet**
> PaginateObject contractorsContractorIdRequestsActiveGet(contractorId, page, size)

Список активных заявок по исполнительному органу

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long contractorId = 56L; // Long | Целочисленный идентификатор
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.contractorsContractorIdRequestsActiveGet(contractorId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsContractorIdRequestsActiveGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractorId** | **Long**| Целочисленный идентификатор |
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="contractorsContractorIdRequestsArchiveGet"></a>
# **contractorsContractorIdRequestsArchiveGet**
> PaginateObject contractorsContractorIdRequestsArchiveGet(contractorId, page, size)

Список архивных заявок по исполнительному органу

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long contractorId = 56L; // Long | Целочисленный идентификатор
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.contractorsContractorIdRequestsArchiveGet(contractorId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsContractorIdRequestsArchiveGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractorId** | **Long**| Целочисленный идентификатор |
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="contractorsGet"></a>
# **contractorsGet**
> PaginateObject contractorsGet(page, size)

Список профилей исполнительных органов

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.contractorsGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="contractorsPost"></a>
# **contractorsPost**
> Contractor contractorsPost(contractorForm)

Создаем профиль исполнительного органа

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ContractorForm contractorForm = new ContractorForm(); // ContractorForm | 
    try {
      Contractor result = apiInstance.contractorsPost(contractorForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractorForm** | [**ContractorForm**](ContractorForm.md)|  | [optional]

### Return type

[**Contractor**](Contractor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesGet"></a>
# **problemCategoriesGet**
> PaginateObject problemCategoriesGet(page, size)

Список категорий проблем

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.problemCategoriesGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesPost"></a>
# **problemCategoriesPost**
> ProblemCategory problemCategoriesPost(problemCategoryForm)

Создаем новую категорию проблем

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ProblemCategoryForm problemCategoryForm = new ProblemCategoryForm(); // ProblemCategoryForm | 
    try {
      ProblemCategory result = apiInstance.problemCategoriesPost(problemCategoryForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemCategoryForm** | [**ProblemCategoryForm**](ProblemCategoryForm.md)|  | [optional]

### Return type

[**ProblemCategory**](ProblemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesProblemCategoryIdActiveRequestsGet"></a>
# **problemCategoriesProblemCategoryIdActiveRequestsGet**
> PaginateObject problemCategoriesProblemCategoryIdActiveRequestsGet(problemCategoryId, page, size)

Список активных запросов в категории

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long problemCategoryId = 56L; // Long | Целочисленный идентификатор категории
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.problemCategoriesProblemCategoryIdActiveRequestsGet(problemCategoryId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesProblemCategoryIdActiveRequestsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemCategoryId** | **Long**| Целочисленный идентификатор категории |
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesProblemCategoryIdArchiveRequestsGet"></a>
# **problemCategoriesProblemCategoryIdArchiveRequestsGet**
> PaginateObject problemCategoriesProblemCategoryIdArchiveRequestsGet(problemCategoryId, page, size)

Список архивных запросов в категории

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long problemCategoryId = 56L; // Long | Целочисленный идентификатор категории
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.problemCategoriesProblemCategoryIdArchiveRequestsGet(problemCategoryId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesProblemCategoryIdArchiveRequestsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemCategoryId** | **Long**| Целочисленный идентификатор категории |
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesProblemCategoryIdCompletedRequestsGet"></a>
# **problemCategoriesProblemCategoryIdCompletedRequestsGet**
> PaginateObject problemCategoriesProblemCategoryIdCompletedRequestsGet(problemCategoryId, page, size)

Список выполненных запросов в категории

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long problemCategoryId = 56L; // Long | Целочисленный идентификатор категории
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.problemCategoriesProblemCategoryIdCompletedRequestsGet(problemCategoryId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesProblemCategoryIdCompletedRequestsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemCategoryId** | **Long**| Целочисленный идентификатор категории |
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesProblemCategoryIdDelete"></a>
# **problemCategoriesProblemCategoryIdDelete**
> ProblemCategory problemCategoriesProblemCategoryIdDelete(problemCategoryId)

Удаляем категорию по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long problemCategoryId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      ProblemCategory result = apiInstance.problemCategoriesProblemCategoryIdDelete(problemCategoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesProblemCategoryIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemCategoryId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**ProblemCategory**](ProblemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The specified user ID is invalid (not a number). |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesProblemCategoryIdGet"></a>
# **problemCategoriesProblemCategoryIdGet**
> User problemCategoriesProblemCategoryIdGet(problemCategoryId)

Находим категорию по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long problemCategoryId = 56L; // Long | Целочисленный идентификатор категории
    try {
      User result = apiInstance.problemCategoriesProblemCategoryIdGet(problemCategoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesProblemCategoryIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemCategoryId** | **Long**| Целочисленный идентификатор категории |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор пользователя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="problemCategoriesProblemCategoryIdPut"></a>
# **problemCategoriesProblemCategoryIdPut**
> ProblemCategory problemCategoriesProblemCategoryIdPut(problemCategoryId, problemCategoryForm)

Обновляем категорию по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long problemCategoryId = 56L; // Long | Целочисленный идентификатор категории
    ProblemCategoryForm problemCategoryForm = new ProblemCategoryForm(); // ProblemCategoryForm | 
    try {
      ProblemCategory result = apiInstance.problemCategoriesProblemCategoryIdPut(problemCategoryId, problemCategoryForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#problemCategoriesProblemCategoryIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemCategoryId** | **Long**| Целочисленный идентификатор категории |
 **problemCategoryForm** | [**ProblemCategoryForm**](ProblemCategoryForm.md)|  | [optional]

### Return type

[**ProblemCategory**](ProblemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="profilesGet"></a>
# **profilesGet**
> PaginateObject profilesGet(page, size)

Список профилей пользователя

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.profilesGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#profilesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="profilesPost"></a>
# **profilesPost**
> Profile profilesPost(profileForm)

Создаем профиль

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ProfileForm profileForm = new ProfileForm(); // ProfileForm | 
    try {
      Profile result = apiInstance.profilesPost(profileForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#profilesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileForm** | [**ProfileForm**](ProfileForm.md)|  | [optional]

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="profilesProfileIdDelete"></a>
# **profilesProfileIdDelete**
> Profile profilesProfileIdDelete(profileId)

Удаляем пользователя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long profileId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      Profile result = apiInstance.profilesProfileIdDelete(profileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#profilesProfileIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The specified user ID is invalid (not a number). |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="profilesProfileIdGet"></a>
# **profilesProfileIdGet**
> Profile profilesProfileIdGet(profileId)

Находим профиль пользователя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long profileId = 56L; // Long | Целочисленный идентификатор профиля пользователя
    try {
      Profile result = apiInstance.profilesProfileIdGet(profileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#profilesProfileIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **Long**| Целочисленный идентификатор профиля пользователя |

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор профиля пользователя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="profilesProfileIdPut"></a>
# **profilesProfileIdPut**
> Profile profilesProfileIdPut(profileId, profileForm)

Обновляем профиль пользователя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long profileId = 56L; // Long | Целочисленный идентификатор профиля пользователя
    ProfileForm profileForm = new ProfileForm(); // ProfileForm | 
    try {
      Profile result = apiInstance.profilesProfileIdPut(profileId, profileForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#profilesProfileIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **Long**| Целочисленный идентификатор профиля пользователя |
 **profileForm** | [**ProfileForm**](ProfileForm.md)|  | [optional]

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор пользователя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="requestsGet"></a>
# **requestsGet**
> PaginateObject requestsGet(page, size)

Список заявок

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.requestsGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="requestsInRangePost"></a>
# **requestsInRangePost**
> List&lt;Request&gt; requestsInRangePost(inlineObject7)

Подбор заявок в радиусе

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject7 inlineObject7 = new InlineObject7(); // InlineObject7 | 
    try {
      List<Request> result = apiInstance.requestsInRangePost(inlineObject7);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsInRangePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject7** | [**InlineObject7**](InlineObject7.md)|  | [optional]

### Return type

[**List&lt;Request&gt;**](Request.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="requestsPost"></a>
# **requestsPost**
> Request requestsPost(description, problemCategories, latitude, longitude, parentRequestId, location, baseRating, status, attachments, requestConsiderationAt, beginRequestExecutionAt, completeRequestExecutionAt, requestStatusCheckedAt, isModerated, moderatorId, filenames)

Создаем заявку

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String description = "description_example"; // String | 
    List<Integer> problemCategories = 56; // List<Integer> | 
    BigDecimal latitude = new BigDecimal(78); // BigDecimal | 
    BigDecimal longitude = new BigDecimal(78); // BigDecimal | 
    Long parentRequestId = 56L; // Long | идентификатор более ранней заявки по схожей проблеме
    String location = "\"null\""; // String | 
    Integer baseRating = 0; // Integer | фиксированный рейтинг заявки, указывается администратором для принудительного повышения
    String status = "StatusEnum.IN_PROCESSING"; // String | Тип заявки:  * `IN PROCESSING` - новая заявка  * `IN CONSIDERATION` - заявка на рассмотрении  * `IN EXECUTION` - заявка выполняется  * `IN EXECUTION CHECK` - проверка выполнения заявки  * `COMPLETED` - выполненная заявка  * `ARCHIVED` - заявка находится в архиве 
    List<MediaContent> attachments = new MediaContent(); // List<MediaContent> | 
    String requestConsiderationAt = "requestConsiderationAt_example"; // String | дата начала рассмотрения заявки
    String beginRequestExecutionAt = "beginRequestExecutionAt_example"; // String | дата начала выполнения работ по заявке
    String completeRequestExecutionAt = "completeRequestExecutionAt_example"; // String | дата завершения выполнения работ по заявке
    String requestStatusCheckedAt = "requestStatusCheckedAt_example"; // String | дата финальной проверки выполнения
    Boolean isModerated = true; // Boolean | 
    Long moderatorId = 56L; // Long | 
    List<File> filenames = new File("/path/to/file"); // List<File> | 
    try {
      Request result = apiInstance.requestsPost(description, problemCategories, latitude, longitude, parentRequestId, location, baseRating, status, attachments, requestConsiderationAt, beginRequestExecutionAt, completeRequestExecutionAt, requestStatusCheckedAt, isModerated, moderatorId, filenames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **String**|  |
 **problemCategories** | [**List&lt;Integer&gt;**](Integer.md)|  |
 **latitude** | **BigDecimal**|  |
 **longitude** | **BigDecimal**|  |
 **parentRequestId** | **Long**| идентификатор более ранней заявки по схожей проблеме | [optional]
 **location** | **String**|  | [optional] [default to &quot;null&quot;]
 **baseRating** | **Integer**| фиксированный рейтинг заявки, указывается администратором для принудительного повышения | [optional] [default to 0]
 **status** | **String**| Тип заявки:  * &#x60;IN PROCESSING&#x60; - новая заявка  * &#x60;IN CONSIDERATION&#x60; - заявка на рассмотрении  * &#x60;IN EXECUTION&#x60; - заявка выполняется  * &#x60;IN EXECUTION CHECK&#x60; - проверка выполнения заявки  * &#x60;COMPLETED&#x60; - выполненная заявка  * &#x60;ARCHIVED&#x60; - заявка находится в архиве  | [optional] [default to StatusEnum.IN_PROCESSING] [enum: IN PROCESSING, IN CONSIDERATION, IN EXECUTION, IN EXECUTION CHECK, COMPLETED]
 **attachments** | [**List&lt;MediaContent&gt;**](MediaContent.md)|  | [optional]
 **requestConsiderationAt** | **String**| дата начала рассмотрения заявки | [optional]
 **beginRequestExecutionAt** | **String**| дата начала выполнения работ по заявке | [optional]
 **completeRequestExecutionAt** | **String**| дата завершения выполнения работ по заявке | [optional]
 **requestStatusCheckedAt** | **String**| дата финальной проверки выполнения | [optional]
 **isModerated** | **Boolean**|  | [optional] [default to true]
 **moderatorId** | **Long**|  | [optional]
 **filenames** | **List&lt;File&gt;**|  | [optional]

### Return type

[**Request**](Request.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="requestsRatingPost"></a>
# **requestsRatingPost**
> List&lt;Request&gt; requestsRatingPost(inlineObject8)

модификация рейтинга заявки (+-)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject8 inlineObject8 = new InlineObject8(); // InlineObject8 | 
    try {
      List<Request> result = apiInstance.requestsRatingPost(inlineObject8);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsRatingPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject8** | [**InlineObject8**](InlineObject8.md)|  | [optional]

### Return type

[**List&lt;Request&gt;**](Request.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="requestsRequestIdDelete"></a>
# **requestsRequestIdDelete**
> Request requestsRequestIdDelete(requestId)

Удаляем заявку по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long requestId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      Request result = apiInstance.requestsRequestIdDelete(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsRequestIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**Request**](Request.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The specified user ID is invalid (not a number). |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="requestsRequestIdGet"></a>
# **requestsRequestIdGet**
> Request requestsRequestIdGet(requestId)

Находим заявку по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long requestId = 56L; // Long | Целочисленный идентификатор заявки
    try {
      Request result = apiInstance.requestsRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsRequestIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **Long**| Целочисленный идентификатор заявки |

### Return type

[**Request**](Request.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор заявки не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="requestsRequestIdPdfGet"></a>
# **requestsRequestIdPdfGet**
> File requestsRequestIdPdfGet(requestId)

формируем заявку в виде pdf

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long requestId = 56L; // Long | Целочисленный идентификатор заявки
    try {
      File result = apiInstance.requestsRequestIdPdfGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsRequestIdPdfGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **Long**| Целочисленный идентификатор заявки |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор заявки не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="requestsRequestIdPut"></a>
# **requestsRequestIdPut**
> Request requestsRequestIdPut(requestId, description, problemCategories, latitude, longitude, parentRequestId, location, baseRating, status, attachments, requestConsiderationAt, beginRequestExecutionAt, completeRequestExecutionAt, requestStatusCheckedAt, isModerated, moderatorId, filenames)

Обновляем заявку по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long requestId = 56L; // Long | Целочисленный идентификатор заявки
    String description = "description_example"; // String | 
    List<Integer> problemCategories = 56; // List<Integer> | 
    BigDecimal latitude = new BigDecimal(78); // BigDecimal | 
    BigDecimal longitude = new BigDecimal(78); // BigDecimal | 
    Long parentRequestId = 56L; // Long | идентификатор более ранней заявки по схожей проблеме
    String location = "\"null\""; // String | 
    Integer baseRating = 0; // Integer | фиксированный рейтинг заявки, указывается администратором для принудительного повышения
    String status = "IN PROCESSING"; // String | Тип заявки:  * `IN PROCESSING` - новая заявка  * `IN CONSIDERATION` - заявка на рассмотрении  * `IN EXECUTION` - заявка выполняется  * `IN EXECUTION CHECK` - проверка выполнения заявки  * `COMPLETED` - выполненная заявка  * `ARCHIVED` - заявка находится в архиве 
    List<MediaContent> attachments = new MediaContent(); // List<MediaContent> | 
    String requestConsiderationAt = "requestConsiderationAt_example"; // String | дата начала рассмотрения заявки
    String beginRequestExecutionAt = "beginRequestExecutionAt_example"; // String | дата начала выполнения работ по заявке
    String completeRequestExecutionAt = "completeRequestExecutionAt_example"; // String | дата завершения выполнения работ по заявке
    String requestStatusCheckedAt = "requestStatusCheckedAt_example"; // String | дата финальной проверки выполнения
    Boolean isModerated = true; // Boolean | 
    Long moderatorId = 56L; // Long | 
    List<File> filenames = new File("/path/to/file"); // List<File> | 
    try {
      Request result = apiInstance.requestsRequestIdPut(requestId, description, problemCategories, latitude, longitude, parentRequestId, location, baseRating, status, attachments, requestConsiderationAt, beginRequestExecutionAt, completeRequestExecutionAt, requestStatusCheckedAt, isModerated, moderatorId, filenames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestsRequestIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **Long**| Целочисленный идентификатор заявки |
 **description** | **String**|  |
 **problemCategories** | [**List&lt;Integer&gt;**](Integer.md)|  |
 **latitude** | **BigDecimal**|  |
 **longitude** | **BigDecimal**|  |
 **parentRequestId** | **Long**| идентификатор более ранней заявки по схожей проблеме | [optional]
 **location** | **String**|  | [optional] [default to &quot;null&quot;]
 **baseRating** | **Integer**| фиксированный рейтинг заявки, указывается администратором для принудительного повышения | [optional] [default to 0]
 **status** | **String**| Тип заявки:  * &#x60;IN PROCESSING&#x60; - новая заявка  * &#x60;IN CONSIDERATION&#x60; - заявка на рассмотрении  * &#x60;IN EXECUTION&#x60; - заявка выполняется  * &#x60;IN EXECUTION CHECK&#x60; - проверка выполнения заявки  * &#x60;COMPLETED&#x60; - выполненная заявка  * &#x60;ARCHIVED&#x60; - заявка находится в архиве  | [optional] [default to IN PROCESSING] [enum: IN PROCESSING, IN CONSIDERATION, IN EXECUTION, IN EXECUTION CHECK, COMPLETED]
 **attachments** | [**List&lt;MediaContent&gt;**](MediaContent.md)|  | [optional]
 **requestConsiderationAt** | **String**| дата начала рассмотрения заявки | [optional]
 **beginRequestExecutionAt** | **String**| дата начала выполнения работ по заявке | [optional]
 **completeRequestExecutionAt** | **String**| дата завершения выполнения работ по заявке | [optional]
 **requestStatusCheckedAt** | **String**| дата финальной проверки выполнения | [optional]
 **isModerated** | **Boolean**|  | [optional] [default to true]
 **moderatorId** | **Long**|  | [optional]
 **filenames** | **List&lt;File&gt;**|  | [optional]

### Return type

[**Request**](Request.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор пользователя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="rolesGet"></a>
# **rolesGet**
> PaginateObject rolesGet(page, size)

Список всех ролей

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.rolesGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rolesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="rolesPost"></a>
# **rolesPost**
> StoredRequest rolesPost(storedRequestForm)

Создаем черновик заявки

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    StoredRequestForm storedRequestForm = new StoredRequestForm(); // StoredRequestForm | 
    try {
      StoredRequest result = apiInstance.rolesPost(storedRequestForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rolesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storedRequestForm** | [**StoredRequestForm**](StoredRequestForm.md)|  | [optional]

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="rolesRoleIdDelete"></a>
# **rolesRoleIdDelete**
> StoredRequest rolesRoleIdDelete(roleId)

Удаляем черновик заявки по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long roleId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      StoredRequest result = apiInstance.rolesRoleIdDelete(roleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rolesRoleIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The specified user ID is invalid (not a number). |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="rolesRoleIdGet"></a>
# **rolesRoleIdGet**
> StoredRequest rolesRoleIdGet(roleId)

Находим роль по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long roleId = 56L; // Long | Целочисленный идентификатор заявки
    try {
      StoredRequest result = apiInstance.rolesRoleIdGet(roleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rolesRoleIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| Целочисленный идентификатор заявки |

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор черновика заявки не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="rolesRoleIdPut"></a>
# **rolesRoleIdPut**
> StoredRequest rolesRoleIdPut(roleId, storedRequestForm)

Обновляем черновик заявки по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long roleId = 56L; // Long | Целочисленный идентификатор черновика заявки
    StoredRequestForm storedRequestForm = new StoredRequestForm(); // StoredRequestForm | 
    try {
      StoredRequest result = apiInstance.rolesRoleIdPut(roleId, storedRequestForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rolesRoleIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| Целочисленный идентификатор черновика заявки |
 **storedRequestForm** | [**StoredRequestForm**](StoredRequestForm.md)|  | [optional]

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор черновика заявки не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="servicesAddressPost"></a>
# **servicesAddressPost**
> InlineResponse200 servicesAddressPost(inlineObject)

Получаем адрес по координатам

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      InlineResponse200 result = apiInstance.servicesAddressPost(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#servicesAddressPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="servicesCoordsPost"></a>
# **servicesCoordsPost**
> InlineObject servicesCoordsPost(inlineObject1)

Получаем координаты по адресу

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      InlineObject result = apiInstance.servicesCoordsPost(inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#servicesCoordsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineObject**](InlineObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="servicesHeatmapPost"></a>
# **servicesHeatmapPost**
> InlineResponse2001 servicesHeatmapPost(inlineObject4)

тепловая карта проблемных \\ решенных зон за период

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      InlineResponse2001 result = apiInstance.servicesHeatmapPost(inlineObject4);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#servicesHeatmapPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="servicesMailingPost"></a>
# **servicesMailingPost**
> servicesMailingPost(title, message, level, type, sendAs, userIds, category, filenames)

оповещение пользователей

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String title = "title_example"; // String | 
    String message = "message_example"; // String | 
    String level = "level_example"; // String | Уровень сообщения:   * `INFO` - оповещение   * `DANGER` - критически важное   * `WARNING` - предупреждение 
    String type = "type_example"; // String | Тип сообщения:   * `COORDS_ALERT` - отметка на карте (на случай проишествия)   * `TEXT` - текстовое сообщение с вложениями 
    String sendAs = "AS_EMAIL"; // String | Способ отправки оповещения (по умолчанию отправка на почту):   * `AS_NOTIFICATION` - всплывающее сообщение   * `AS_EMAIL` - почтовое сообщение   * `AS_EMAIL_AND_NOTIFICATION` - всплывающее сообщение + почта   * `AS_SMS` - по СМС   * `ALL` - одновременно через все каналы оповещений 
    List<Integer> userIds = 56; // List<Integer> | приоритетный фильтр для рассылки
    String category = "category_example"; // String | Категория отправки:   * `SELECTED_USERS` - только указанным пользователям   * `ONLY_USERS` - только пользователям   * `ALL` - всем   * `ONLY_ACTIVE_REQUEST` - только пользователям, у которых активные заявки   * `ONLY_ARCHIVE_REQUEST` - только пользователям с архивными заявками   * `ONLY_CONTRACTORS` - только исполнительным \\\\ контролирующим органам   * `ONLY_CONTRACTORS_EXECUTIVE` - только исполнительным органам   * `ONLY_CONTRACTORS_SUPERVISING` - только контролирующим органам 
    List<File> filenames = new File("/path/to/file"); // List<File> | 
    try {
      apiInstance.servicesMailingPost(title, message, level, type, sendAs, userIds, category, filenames);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#servicesMailingPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**|  | [optional]
 **message** | **String**|  | [optional]
 **level** | **String**| Уровень сообщения:   * &#x60;INFO&#x60; - оповещение   * &#x60;DANGER&#x60; - критически важное   * &#x60;WARNING&#x60; - предупреждение  | [optional] [enum: INFO, DANGER, WARNING]
 **type** | **String**| Тип сообщения:   * &#x60;COORDS_ALERT&#x60; - отметка на карте (на случай проишествия)   * &#x60;TEXT&#x60; - текстовое сообщение с вложениями  | [optional] [enum: COORDS_ALERT, TEXT]
 **sendAs** | **String**| Способ отправки оповещения (по умолчанию отправка на почту):   * &#x60;AS_NOTIFICATION&#x60; - всплывающее сообщение   * &#x60;AS_EMAIL&#x60; - почтовое сообщение   * &#x60;AS_EMAIL_AND_NOTIFICATION&#x60; - всплывающее сообщение + почта   * &#x60;AS_SMS&#x60; - по СМС   * &#x60;ALL&#x60; - одновременно через все каналы оповещений  | [optional] [default to AS_EMAIL] [enum: AS_NOTIFICATION, AS_EMAIL, AS_EMAIL_AND_NOTIFICATION, AS_SMS, ALL]
 **userIds** | [**List&lt;Integer&gt;**](Integer.md)| приоритетный фильтр для рассылки | [optional]
 **category** | **String**| Категория отправки:   * &#x60;SELECTED_USERS&#x60; - только указанным пользователям   * &#x60;ONLY_USERS&#x60; - только пользователям   * &#x60;ALL&#x60; - всем   * &#x60;ONLY_ACTIVE_REQUEST&#x60; - только пользователям, у которых активные заявки   * &#x60;ONLY_ARCHIVE_REQUEST&#x60; - только пользователям с архивными заявками   * &#x60;ONLY_CONTRACTORS&#x60; - только исполнительным \\\\ контролирующим органам   * &#x60;ONLY_CONTRACTORS_EXECUTIVE&#x60; - только исполнительным органам   * &#x60;ONLY_CONTRACTORS_SUPERVISING&#x60; - только контролирующим органам  | [optional] [enum: SELECTED_USERS, ONLY_USERS, ALL, ONLY_ACTIVE_REQUEST, ONLY_ARCHIVE_REQUEST, ONLY_CONTRACTORS, ONLY_CONTRACTORS_EXECUTIVE, ONLY_CONTRACTORS_SUPERVISING]
 **filenames** | **List&lt;File&gt;**|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="servicesRequestExportPost"></a>
# **servicesRequestExportPost**
> File servicesRequestExportPost(inlineObject6)

экспортирование заявок в формате Excel-файла

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject6 inlineObject6 = new InlineObject6(); // InlineObject6 | 
    try {
      File result = apiInstance.servicesRequestExportPost(inlineObject6);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#servicesRequestExportPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/binary, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="servicesRequestImportPost"></a>
# **servicesRequestImportPost**
> servicesRequestImportPost(filenames)

импортирование заявок в формате Excel-файла(ов)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<File> filenames = new File("/path/to/file"); // List<File> | 
    try {
      apiInstance.servicesRequestImportPost(filenames);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#servicesRequestImportPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filenames** | **List&lt;File&gt;**|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="servicesStatisticPost"></a>
# **servicesStatisticPost**
> InlineObject servicesStatisticPost(inlineObject3)

статистика по категориям за период

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      InlineObject result = apiInstance.servicesStatisticPost(inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#servicesStatisticPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineObject**](InlineObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="storedRequestsGet"></a>
# **storedRequestsGet**
> PaginateObject storedRequestsGet(page, size)

Список черновиков заявок

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.storedRequestsGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#storedRequestsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="storedRequestsPost"></a>
# **storedRequestsPost**
> StoredRequest storedRequestsPost(storedRequestForm)

Создаем черновик заявки

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    StoredRequestForm storedRequestForm = new StoredRequestForm(); // StoredRequestForm | 
    try {
      StoredRequest result = apiInstance.storedRequestsPost(storedRequestForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#storedRequestsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storedRequestForm** | [**StoredRequestForm**](StoredRequestForm.md)|  | [optional]

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="storedRequestsStoredRequestIdDelete"></a>
# **storedRequestsStoredRequestIdDelete**
> StoredRequest storedRequestsStoredRequestIdDelete(storedRequestId)

Удаляем черновик заявки по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long storedRequestId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      StoredRequest result = apiInstance.storedRequestsStoredRequestIdDelete(storedRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#storedRequestsStoredRequestIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storedRequestId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The specified user ID is invalid (not a number). |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="storedRequestsStoredRequestIdGet"></a>
# **storedRequestsStoredRequestIdGet**
> StoredRequest storedRequestsStoredRequestIdGet(storedRequestId)

Находим черновик заявки по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long storedRequestId = 56L; // Long | Целочисленный идентификатор заявки
    try {
      StoredRequest result = apiInstance.storedRequestsStoredRequestIdGet(storedRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#storedRequestsStoredRequestIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storedRequestId** | **Long**| Целочисленный идентификатор заявки |

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор черновика заявки не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="storedRequestsStoredRequestIdPut"></a>
# **storedRequestsStoredRequestIdPut**
> StoredRequest storedRequestsStoredRequestIdPut(storedRequestId, storedRequestForm)

Обновляем черновик заявки по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long storedRequestId = 56L; // Long | Целочисленный идентификатор черновика заявки
    StoredRequestForm storedRequestForm = new StoredRequestForm(); // StoredRequestForm | 
    try {
      StoredRequest result = apiInstance.storedRequestsStoredRequestIdPut(storedRequestId, storedRequestForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#storedRequestsStoredRequestIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storedRequestId** | **Long**| Целочисленный идентификатор черновика заявки |
 **storedRequestForm** | [**StoredRequestForm**](StoredRequestForm.md)|  | [optional]

### Return type

[**StoredRequest**](StoredRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор черновика заявки не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="usersGet"></a>
# **usersGet**
> PaginateObject usersGet(page, size)

Список пользователей

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long page = 56L; // Long | идентификатор страницы
    Long size = 56L; // Long | размер выдачи на странице
    try {
      PaginateObject result = apiInstance.usersGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| идентификатор страницы | [optional]
 **size** | **Long**| размер выдачи на странице | [optional]

### Return type

[**PaginateObject**](PaginateObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="usersMeGet"></a>
# **usersMeGet**
> User usersMeGet()

возвращаем текущего пользователя

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      User result = apiInstance.usersMeGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersMeGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="usersPost"></a>
# **usersPost**
> User usersPost(userForm)

Создаем пользователя

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UserForm userForm = new UserForm(); // UserForm | 
    try {
      User result = apiInstance.usersPost(userForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userForm** | [**UserForm**](UserForm.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="usersUserIdDelete"></a>
# **usersUserIdDelete**
> User usersUserIdDelete(userId)

Удаляем пользователя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long userId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      User result = apiInstance.usersUserIdDelete(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersUserIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The specified user ID is invalid (not a number). |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="usersUserIdGet"></a>
# **usersUserIdGet**
> User usersUserIdGet(userId)

Находим пользователя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long userId = 56L; // Long | Целочисленный идентификатор пользователя
    try {
      User result = apiInstance.usersUserIdGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersUserIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Целочисленный идентификатор пользователя |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор пользователя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="usersUserIdProfileGet"></a>
# **usersUserIdProfileGet**
> Profile usersUserIdProfileGet(userId)

Находим профиль пользователя по идентификатору пользователя

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long userId = 56L; // Long | Целочисленный идентификатор пользователя
    try {
      Profile result = apiInstance.usersUserIdProfileGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersUserIdProfileGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Целочисленный идентификатор пользователя |

### Return type

[**Profile**](Profile.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор пользователя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

<a name="usersUserIdPut"></a>
# **usersUserIdPut**
> User usersUserIdPut(userId, userForm)

Обновляем пользователя по идентификатору

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.domain-name.ru");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long userId = 56L; // Long | Целочисленный идентификатор пользователя
    UserForm userForm = new UserForm(); // UserForm | 
    try {
      User result = apiInstance.usersUserIdPut(userId, userForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersUserIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Целочисленный идентификатор пользователя |
 **userForm** | [**UserForm**](UserForm.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор пользователя не является числом |  -  |
**404** | A user with the specified ID was not found. |  -  |
**0** | Unexpected error |  -  |

