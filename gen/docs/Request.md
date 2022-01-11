

# Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**parentRequestId** | **Long** | идентификатор более ранней заявки по схожей проблеме |  [optional]
**description** | **String** |  |  [optional]
**problemCategories** | [**List&lt;ProblemCategory&gt;**](ProblemCategory.md) |  |  [optional]
**location** | **String** |  |  [optional]
**latitude** | **BigDecimal** |  |  [optional]
**longitude** | **BigDecimal** |  |  [optional]
**baseRating** | **Integer** | фиксированный рейтинг заявки, указывается администратором для принудительного повышения |  [optional]
**rating** | **Integer** | суммарный рейтинг заявки и всех смежных с ней заявок |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Тип заявки:  * &#x60;IN PROCESSING&#x60; - новая заявка  * &#x60;IN CONSIDERATION&#x60; - заявка на рассмотрении  * &#x60;IN EXECUTION&#x60; - заявка выполняется  * &#x60;IN EXECUTION CHECK&#x60; - проверка выполнения заявки  * &#x60;COMPLETED&#x60; - выполненная заявка  * &#x60;ARCHIVED&#x60; - заявка находится в архиве  |  [optional]
**attachments** | [**List&lt;MediaContent&gt;**](MediaContent.md) |  |  [optional]
**storedProfileData** | [**RequestStoredProfileData**](RequestStoredProfileData.md) |  |  [optional]
**requestConsiderationAt** | **String** | дата начала рассмотрения заявки |  [optional]
**beginRequestExecutionAt** | **String** | дата начала выполнения работ по заявке |  [optional]
**completeRequestExecutionAt** | **String** | дата завершения выполнения работ по заявке |  [optional]
**requestStatusCheckedAt** | **String** | дата финальной проверки выполнения |  [optional]
**isModerated** | **Boolean** |  |  [optional]
**moderatorId** | **Long** |  |  [optional]
**deletedAt** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
IN_PROCESSING | &quot;IN PROCESSING&quot;
IN_CONSIDERATION | &quot;IN CONSIDERATION&quot;
IN_EXECUTION | &quot;IN EXECUTION&quot;
IN_EXECUTION_CHECK | &quot;IN EXECUTION CHECK&quot;
COMPLETED | &quot;COMPLETED&quot;
ARCHIVED | &quot;ARCHIVED&quot;



