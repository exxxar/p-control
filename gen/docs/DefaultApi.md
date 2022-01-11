# DefaultApi

All URIs are relative to *https://api.domain-name.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authLoginPost**](DefaultApi.md#authLoginPost) | **POST** /auth/login | авторизация пользователя в системе
[**authLogoutPost**](DefaultApi.md#authLogoutPost) | **POST** /auth/logout | выход из системы
[**authRefreshtokenPost**](DefaultApi.md#authRefreshtokenPost) | **POST** /auth/refreshtoken | обновления тоукена доступа
[**authResetPost**](DefaultApi.md#authResetPost) | **POST** /auth/reset | сброс пароля на почту или на телефон пользователя
[**authResetSavePost**](DefaultApi.md#authResetSavePost) | **POST** /auth/reset/save | сохранение пароля после сброса
[**authResetUpdatePost**](DefaultApi.md#authResetUpdatePost) | **POST** /auth/reset/update | сброс пароля
[**authSignupPost**](DefaultApi.md#authSignupPost) | **POST** /auth/signup | регистрация пользователя в системе
[**contractorsContractorIdDelete**](DefaultApi.md#contractorsContractorIdDelete) | **DELETE** /contractors/{contractorId} | Удаляем исполнителя по идентификатору
[**contractorsContractorIdGet**](DefaultApi.md#contractorsContractorIdGet) | **GET** /contractors/{contractorId} | Находим исполнителя по идентификатору
[**contractorsContractorIdPut**](DefaultApi.md#contractorsContractorIdPut) | **PUT** /contractors/{contractorId} | Обновляем исполнителя по идентификатору
[**contractorsContractorIdRequestsActiveGet**](DefaultApi.md#contractorsContractorIdRequestsActiveGet) | **GET** /contractors/{contractorId}/requests/active | Список активных заявок по исполнительному органу
[**contractorsContractorIdRequestsArchiveGet**](DefaultApi.md#contractorsContractorIdRequestsArchiveGet) | **GET** /contractors/{contractorId}/requests/archive | Список архивных заявок по исполнительному органу
[**contractorsContractorIdTasksGet**](DefaultApi.md#contractorsContractorIdTasksGet) | **GET** /contractors/{contractorId}/tasks | Находим активные задачи для выбранного исполнительного \\ контролирующего органа
[**contractorsGet**](DefaultApi.md#contractorsGet) | **GET** /contractors | Список профилей исполнительных органов
[**contractorsPost**](DefaultApi.md#contractorsPost) | **POST** /contractors | Создаем профиль исполнительного органа
[**mailingGet**](DefaultApi.md#mailingGet) | **GET** /mailing | Список всех рассылок
[**mailingHandlerGet**](DefaultApi.md#mailingHandlerGet) | **GET** /mailing/handler | запуск рассылок в CRON
[**mailingMailingIdDelete**](DefaultApi.md#mailingMailingIdDelete) | **DELETE** /mailing/{mailingId} | удаляем из рассылки по идентификатору
[**mailingMailingIdGet**](DefaultApi.md#mailingMailingIdGet) | **GET** /mailing/{mailingId} | Находим рассылку по идентификатору
[**mailingMailingIdPut**](DefaultApi.md#mailingMailingIdPut) | **PUT** /mailing/{mailingId} | Обновляем черновик заявки по идентификатору
[**mailingPost**](DefaultApi.md#mailingPost) | **POST** /mailing | Создаем рассылку
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
[**rolesPost**](DefaultApi.md#rolesPost) | **POST** /roles | Создаем новую роль
[**rolesRoleIdDelete**](DefaultApi.md#rolesRoleIdDelete) | **DELETE** /roles/{roleId} | Удаляем роль по идентификатору
[**rolesRoleIdGet**](DefaultApi.md#rolesRoleIdGet) | **GET** /roles/{roleId} | Находим роль по идентификатору
[**rolesRoleIdPut**](DefaultApi.md#rolesRoleIdPut) | **PUT** /roles/{roleId} | Обновляем роль по идентификатору
[**servicesAddressPost**](DefaultApi.md#servicesAddressPost) | **POST** /services/address | Получаем адрес по координатам
[**servicesCoordsPost**](DefaultApi.md#servicesCoordsPost) | **POST** /services/coords | Получаем координаты по адресу
[**servicesHeatmapPost**](DefaultApi.md#servicesHeatmapPost) | **POST** /services/heatmap | тепловая карта проблемных \\ решенных зон за период
[**servicesMailingPost**](DefaultApi.md#servicesMailingPost) | **POST** /services/mailing | оповещение пользователей
[**servicesRequestExportPost**](DefaultApi.md#servicesRequestExportPost) | **POST** /services/request/export | экспортирование заявок в формате Excel-файла
[**servicesRequestImportPost**](DefaultApi.md#servicesRequestImportPost) | **POST** /services/request/import | импортирование заявок в формате Excel-файла(ов)
[**servicesStatisticPost**](DefaultApi.md#servicesStatisticPost) | **POST** /services/statistic | статистика по категориям за период
[**storedRequestsGet**](DefaultApi.md#storedRequestsGet) | **GET** /stored-requests | Список черновиков заявок
[**storedRequestsPost**](DefaultApi.md#storedRequestsPost) | **POST** /stored-requests | Создаем черновик заявки.
[**storedRequestsStoredRequestIdDelete**](DefaultApi.md#storedRequestsStoredRequestIdDelete) | **DELETE** /stored-requests/{storedRequestId} | Удаляем черновик заявки по идентификатору
[**storedRequestsStoredRequestIdGet**](DefaultApi.md#storedRequestsStoredRequestIdGet) | **GET** /stored-requests/{storedRequestId} | Находим черновик заявки по идентификатору
[**storedRequestsStoredRequestIdPut**](DefaultApi.md#storedRequestsStoredRequestIdPut) | **PUT** /stored-requests/{storedRequestId} | Обновляем черновик заявки по идентификатору
[**tasksGet**](DefaultApi.md#tasksGet) | **GET** /tasks | Список всех задач
[**tasksPost**](DefaultApi.md#tasksPost) | **POST** /tasks | Создаем новую задачу для исполнительного \\ контролирующего органа
[**tasksTaskIdDelete**](DefaultApi.md#tasksTaskIdDelete) | **DELETE** /tasks/{taskId} | удаляем задачу по идентификатору
[**tasksTaskIdGet**](DefaultApi.md#tasksTaskIdGet) | **GET** /tasks/{taskId} | Находим задачу по по идентификатору
[**tasksTaskIdPut**](DefaultApi.md#tasksTaskIdPut) | **PUT** /tasks/{taskId} | Обновляем заявку по идентификатору
[**usersGet**](DefaultApi.md#usersGet) | **GET** /users | Список пользователей
[**usersMeGet**](DefaultApi.md#usersMeGet) | **GET** /users/me | возвращаем текущего пользователя
[**usersPost**](DefaultApi.md#usersPost) | **POST** /users | Создаем пользователя
[**usersUserIdBlockedGet**](DefaultApi.md#usersUserIdBlockedGet) | **GET** /users/{userId}/blocked | блокируем пользователя по идентификатору
[**usersUserIdDelete**](DefaultApi.md#usersUserIdDelete) | **DELETE** /users/{userId} | Удаляем пользователя по идентификатору
[**usersUserIdGet**](DefaultApi.md#usersUserIdGet) | **GET** /users/{userId} | Находим пользователя по идентификатору
[**usersUserIdProfileGet**](DefaultApi.md#usersUserIdProfileGet) | **GET** /users/{userId}/profile | Находим профиль пользователя по идентификатору пользователя
[**usersUserIdPut**](DefaultApi.md#usersUserIdPut) | **PUT** /users/{userId} | Обновляем пользователя по идентификатору
[**usersUserIdRolesPut**](DefaultApi.md#usersUserIdRolesPut) | **PUT** /users/{userId}/roles | Обновляем роли пользователя
[**usersUserIdUnblockedGet**](DefaultApi.md#usersUserIdUnblockedGet) | **GET** /users/{userId}/unblocked | разблокируем пользователя по идентификатору


<a name="authLoginPost"></a>
# **authLoginPost**
> InlineResponse200 authLoginPost(inlineObject1)

авторизация пользователя в системе

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
      InlineResponse200 result = apiInstance.authLoginPost(inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authLoginPost");
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
**400** | Ошибка регистрации, такой пользователь уже есть |  -  |
**0** | Unexpected error |  -  |

<a name="authLogoutPost"></a>
# **authLogoutPost**
> authLogoutPost()

выход из системы

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
      apiInstance.authLogoutPost();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authLogoutPost");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="authRefreshtokenPost"></a>
# **authRefreshtokenPost**
> InlineResponse200 authRefreshtokenPost(inlineObject2)

обновления тоукена доступа

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
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      InlineResponse200 result = apiInstance.authRefreshtokenPost(inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authRefreshtokenPost");
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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
**400** | неверный Refresh Token |  -  |
**0** | Unexpected error |  -  |

<a name="authResetPost"></a>
# **authResetPost**
> authResetPost(inlineObject3)

сброс пароля на почту или на телефон пользователя

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
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      apiInstance.authResetPost(inlineObject3);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authResetPost");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**400** | Ошибка регистрации, такой пользователь уже есть |  -  |
**0** | Unexpected error |  -  |

<a name="authResetSavePost"></a>
# **authResetSavePost**
> authResetSavePost(inlineObject4)

сохранение пароля после сброса

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
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      apiInstance.authResetSavePost(inlineObject4);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authResetSavePost");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**400** | Ошибка токена |  -  |
**0** | Unexpected error |  -  |

<a name="authResetUpdatePost"></a>
# **authResetUpdatePost**
> authResetUpdatePost(inlineObject5)

сброс пароля

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
    InlineObject5 inlineObject5 = new InlineObject5(); // InlineObject5 | 
    try {
      apiInstance.authResetUpdatePost(inlineObject5);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authResetUpdatePost");
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
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**400** | Ошибка ввода старого пароля |  -  |
**0** | Unexpected error |  -  |

<a name="authSignupPost"></a>
# **authSignupPost**
> authSignupPost(inlineObject)

регистрация пользователя в системе

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
      apiInstance.authSignupPost(inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authSignupPost");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**400** | Ошибка регистрации, такой пользователь уже есть |  -  |
**0** | Unexpected error |  -  |

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

[bearerAuth](../README.md#bearerAuth)

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

<a name="contractorsContractorIdTasksGet"></a>
# **contractorsContractorIdTasksGet**
> ContractorTask contractorsContractorIdTasksGet(contractorId)

Находим активные задачи для выбранного исполнительного \\ контролирующего органа

активными считаются те задачи, у которых не проставлено время выполнения \\ контроля

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
      ContractorTask result = apiInstance.contractorsContractorIdTasksGet(contractorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractorsContractorIdTasksGet");
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

[**ContractorTask**](ContractorTask.md)

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="mailingGet"></a>
# **mailingGet**
> PaginateObject mailingGet(page, size)

Список всех рассылок

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
      PaginateObject result = apiInstance.mailingGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#mailingGet");
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

<a name="mailingHandlerGet"></a>
# **mailingHandlerGet**
> mailingHandlerGet(page, size)

запуск рассылок в CRON

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
      apiInstance.mailingHandlerGet(page, size);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#mailingHandlerGet");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**0** | Unexpected error |  -  |

<a name="mailingMailingIdDelete"></a>
# **mailingMailingIdDelete**
> MailingQuery mailingMailingIdDelete(mailingId)

удаляем из рассылки по идентификатору

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
    Long mailingId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      MailingQuery result = apiInstance.mailingMailingIdDelete(mailingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#mailingMailingIdDelete");
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
 **mailingId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**MailingQuery**](MailingQuery.md)

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

<a name="mailingMailingIdGet"></a>
# **mailingMailingIdGet**
> MailingQuery mailingMailingIdGet(mailingId)

Находим рассылку по идентификатору

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
    Long mailingId = 56L; // Long | Целочисленный идентификатор записи
    try {
      MailingQuery result = apiInstance.mailingMailingIdGet(mailingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#mailingMailingIdGet");
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
 **mailingId** | **Long**| Целочисленный идентификатор записи |

### Return type

[**MailingQuery**](MailingQuery.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор не является числом |  -  |
**404** | указанный идентификатор не найден |  -  |
**0** | Unexpected error |  -  |

<a name="mailingMailingIdPut"></a>
# **mailingMailingIdPut**
> MailingQuery mailingMailingIdPut(mailingId, mailingQueryForm)

Обновляем черновик заявки по идентификатору

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
    Long mailingId = 56L; // Long | Целочисленный идентификатор
    MailingQueryForm mailingQueryForm = new MailingQueryForm(); // MailingQueryForm | 
    try {
      MailingQuery result = apiInstance.mailingMailingIdPut(mailingId, mailingQueryForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#mailingMailingIdPut");
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
 **mailingId** | **Long**| Целочисленный идентификатор |
 **mailingQueryForm** | [**MailingQueryForm**](MailingQueryForm.md)|  | [optional]

### Return type

[**MailingQuery**](MailingQuery.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор черновика не является числом |  -  |
**404** | указанный идентификатор |  -  |
**0** | Unexpected error |  -  |

<a name="mailingPost"></a>
# **mailingPost**
> MailingQuery mailingPost(mailingQueryForm)

Создаем рассылку

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
    MailingQueryForm mailingQueryForm = new MailingQueryForm(); // MailingQueryForm | 
    try {
      MailingQuery result = apiInstance.mailingPost(mailingQueryForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#mailingPost");
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
 **mailingQueryForm** | [**MailingQueryForm**](MailingQueryForm.md)|  | [optional]

### Return type

[**MailingQuery**](MailingQuery.md)

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

[bearerAuth](../README.md#bearerAuth)

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

[bearerAuth](../README.md#bearerAuth)

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

[bearerAuth](../README.md#bearerAuth)

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

[bearerAuth](../README.md#bearerAuth)

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

[bearerAuth](../README.md#bearerAuth)

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
> List&lt;Request&gt; requestsInRangePost(inlineObject14)

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
    InlineObject14 inlineObject14 = new InlineObject14(); // InlineObject14 | 
    try {
      List<Request> result = apiInstance.requestsInRangePost(inlineObject14);
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
 **inlineObject14** | [**InlineObject14**](InlineObject14.md)|  | [optional]

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

При создании заявки регестрируем и авторизируем пользователя

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
> List&lt;Request&gt; requestsRatingPost(inlineObject15)

модификация рейтинга заявки (+-)

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
    InlineObject15 inlineObject15 = new InlineObject15(); // InlineObject15 | 
    try {
      List<Request> result = apiInstance.requestsRatingPost(inlineObject15);
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
 **inlineObject15** | [**InlineObject15**](InlineObject15.md)|  | [optional]

### Return type

[**List&lt;Request&gt;**](Request.md)

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

[bearerAuth](../README.md#bearerAuth)

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

[bearerAuth](../README.md#bearerAuth)

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

[bearerAuth](../README.md#bearerAuth)

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
> Role rolesPost(roleForm)

Создаем новую роль

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
    RoleForm roleForm = new RoleForm(); // RoleForm | 
    try {
      Role result = apiInstance.rolesPost(roleForm);
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
 **roleForm** | [**RoleForm**](RoleForm.md)|  | [optional]

### Return type

[**Role**](Role.md)

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

<a name="rolesRoleIdDelete"></a>
# **rolesRoleIdDelete**
> Role rolesRoleIdDelete(roleId)

Удаляем роль по идентификатору

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
    Long roleId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      Role result = apiInstance.rolesRoleIdDelete(roleId);
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

[**Role**](Role.md)

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

<a name="rolesRoleIdGet"></a>
# **rolesRoleIdGet**
> Role rolesRoleIdGet(roleId)

Находим роль по идентификатору

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
    Long roleId = 56L; // Long | Целочисленный идентификатор заявки
    try {
      Role result = apiInstance.rolesRoleIdGet(roleId);
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

[**Role**](Role.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

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
> Role rolesRoleIdPut(roleId, roleForm)

Обновляем роль по идентификатору

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
    Long roleId = 56L; // Long | Целочисленный идентификатор роли
    RoleForm roleForm = new RoleForm(); // RoleForm | 
    try {
      Role result = apiInstance.rolesRoleIdPut(roleId, roleForm);
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
 **roleId** | **Long**| Целочисленный идентификатор роли |
 **roleForm** | [**RoleForm**](RoleForm.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

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
> InlineResponse2001 servicesAddressPost(inlineObject6)

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
    InlineObject6 inlineObject6 = new InlineObject6(); // InlineObject6 | 
    try {
      InlineResponse2001 result = apiInstance.servicesAddressPost(inlineObject6);
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
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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
> InlineObject6 servicesCoordsPost(inlineObject7)

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
    InlineObject7 inlineObject7 = new InlineObject7(); // InlineObject7 | 
    try {
      InlineObject6 result = apiInstance.servicesCoordsPost(inlineObject7);
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
 **inlineObject7** | [**InlineObject7**](InlineObject7.md)|  | [optional]

### Return type

[**InlineObject6**](InlineObject6.md)

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
> InlineResponse2002 servicesHeatmapPost(inlineObject10)

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
    InlineObject10 inlineObject10 = new InlineObject10(); // InlineObject10 | 
    try {
      InlineResponse2002 result = apiInstance.servicesHeatmapPost(inlineObject10);
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
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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
> File servicesRequestExportPost(inlineObject12)

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
    InlineObject12 inlineObject12 = new InlineObject12(); // InlineObject12 | 
    try {
      File result = apiInstance.servicesRequestExportPost(inlineObject12);
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
 **inlineObject12** | [**InlineObject12**](InlineObject12.md)|  | [optional]

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
> InlineObject6 servicesStatisticPost(inlineObject9)

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
    InlineObject9 inlineObject9 = new InlineObject9(); // InlineObject9 | 
    try {
      InlineObject6 result = apiInstance.servicesStatisticPost(inlineObject9);
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
 **inlineObject9** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**InlineObject6**](InlineObject6.md)

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

[bearerAuth](../README.md#bearerAuth)

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

Создаем черновик заявки.

Перед выполнением данной команды стоит предложить зарегестрироваться или авторизоваться.

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

[bearerAuth](../README.md#bearerAuth)

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

[bearerAuth](../README.md#bearerAuth)

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

<a name="tasksGet"></a>
# **tasksGet**
> PaginateObject tasksGet(page, size)

Список всех задач

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
      PaginateObject result = apiInstance.tasksGet(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tasksGet");
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

<a name="tasksPost"></a>
# **tasksPost**
> ContractorTask tasksPost(contractorTaskForm)

Создаем новую задачу для исполнительного \\ контролирующего органа

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
    ContractorTaskForm contractorTaskForm = new ContractorTaskForm(); // ContractorTaskForm | 
    try {
      ContractorTask result = apiInstance.tasksPost(contractorTaskForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tasksPost");
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
 **contractorTaskForm** | [**ContractorTaskForm**](ContractorTaskForm.md)|  | [optional]

### Return type

[**ContractorTask**](ContractorTask.md)

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

<a name="tasksTaskIdDelete"></a>
# **tasksTaskIdDelete**
> ContractorTask tasksTaskIdDelete(taskId)

удаляем задачу по идентификатору

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
    Long taskId = 56L; // Long | Parameter description in CommonMark or HTML.
    try {
      ContractorTask result = apiInstance.tasksTaskIdDelete(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tasksTaskIdDelete");
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
 **taskId** | **Long**| Parameter description in CommonMark or HTML. |

### Return type

[**ContractorTask**](ContractorTask.md)

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
**404** | задача не найдена по идентификатору |  -  |
**0** | Unexpected error |  -  |

<a name="tasksTaskIdGet"></a>
# **tasksTaskIdGet**
> ContractorTask tasksTaskIdGet(taskId)

Находим задачу по по идентификатору

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
    Long taskId = 56L; // Long | Целочисленный идентификатор записи
    try {
      ContractorTask result = apiInstance.tasksTaskIdGet(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tasksTaskIdGet");
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
 **taskId** | **Long**| Целочисленный идентификатор записи |

### Return type

[**ContractorTask**](ContractorTask.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор не является числом |  -  |
**404** | указанный идентификатор не найден |  -  |
**0** | Unexpected error |  -  |

<a name="tasksTaskIdPut"></a>
# **tasksTaskIdPut**
> ContractorTask tasksTaskIdPut(taskId, contractorTaskForm)

Обновляем заявку по идентификатору

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
    Long taskId = 56L; // Long | Целочисленный идентификатор
    ContractorTaskForm contractorTaskForm = new ContractorTaskForm(); // ContractorTaskForm | 
    try {
      ContractorTask result = apiInstance.tasksTaskIdPut(taskId, contractorTaskForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tasksTaskIdPut");
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
 **taskId** | **Long**| Целочисленный идентификатор |
 **contractorTaskForm** | [**ContractorTaskForm**](ContractorTaskForm.md)|  | [optional]

### Return type

[**ContractorTask**](ContractorTask.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Указанный идентификатор черновика не является числом |  -  |
**404** | указанный идентификатор |  -  |
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

<a name="usersUserIdBlockedGet"></a>
# **usersUserIdBlockedGet**
> User usersUserIdBlockedGet(userId)

блокируем пользователя по идентификатору

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
      User result = apiInstance.usersUserIdBlockedGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersUserIdBlockedGet");
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

<a name="usersUserIdRolesPut"></a>
# **usersUserIdRolesPut**
> User usersUserIdRolesPut(userId, inlineObject13)

Обновляем роли пользователя

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
    InlineObject13 inlineObject13 = new InlineObject13(); // InlineObject13 | 
    try {
      User result = apiInstance.usersUserIdRolesPut(userId, inlineObject13);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersUserIdRolesPut");
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
 **inlineObject13** | [**InlineObject13**](InlineObject13.md)|  | [optional]

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

<a name="usersUserIdUnblockedGet"></a>
# **usersUserIdUnblockedGet**
> User usersUserIdUnblockedGet(userId)

разблокируем пользователя по идентификатору

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
      User result = apiInstance.usersUserIdUnblockedGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#usersUserIdUnblockedGet");
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

