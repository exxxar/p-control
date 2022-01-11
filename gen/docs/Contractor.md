

# Contractor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**mnemonicName** | **String** | Мнемоническое имя |  [optional]
**title** | **String** | Название исполнительного органа |  [optional]
**description** | **String** | Описание исполнительного органа |  [optional]
**responsiblePerson** | **String** | Ответственное лицо от органа исполнения  проверки |  [optional]
**image** | **String** | Изображение (аватар исполнительного органа) |  [optional]
**hashTag** | **String** |  |  [optional]
**contactPhone** | **String** |  |  [optional]
**contactEmail** | **String** |  |  [optional]
**preControllerEmail** | **String** | электронная почта отвественного министерства |  [optional]
**telegramChatId** | **String** | идентификатор телеграм канала исполнительного органа |  [optional]
**publicWebsite** | **String** | Ссылка на веб-ресурс службы |  [optional]
**moreInfo** | **String** | дополнительная информация о контролирующем \\ исполнительном органе |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Выбор типа организации:  * &#x60;EXECUTIVE&#x60; - исполнительные органы  * &#x60;SUPERVISING&#x60; - контролирующие органы  |  [optional]
**schedule** | [**List&lt;ContractorSchedule&gt;**](ContractorSchedule.md) |  |  [optional]
**problemCategories** | [**List&lt;ProblemCategory&gt;**](ProblemCategory.md) | категории проблем, за которые ответственный орган |  [optional]
**isActive** | **Boolean** | Статус видимости организации в общем списке |  [optional]
**generateDailyReport** | **Boolean** | Генерировать дневные отчеты |  [optional]
**needInformByEmail** | **Boolean** | информировать по электронной почте |  [optional]
**needInformBySms** | **Boolean** | информировать по sms |  [optional]
**deletedAt** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EXECUTIVE | &quot;EXECUTIVE&quot;
SUPERVISING | &quot;SUPERVISING&quot;



