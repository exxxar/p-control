

# MailingQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**addressTo** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Тип рассылки:   * &#x60;PHONE&#x60; - при помощи смс   * &#x60;MAIL&#x60; - при помощи почты  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Статус отправки:   * &#x60;SUCCESS&#x60; - успешная отправка   * &#x60;FAILURE&#x60; - ошибка при попытке отправки  |  [optional]
**templateName** | **String** | Название шаблона для рассылки (для email) |  [optional]
**messageObject** | [**MailingQueryMessageObject**](MailingQueryMessageObject.md) |  |  [optional]
**requestId** | **Long** |  |  [optional]
**deletedAt** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
PHONE | &quot;PHONE&quot;
MAIL | &quot;MAIL&quot;



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;



