

# ContractorForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mnemonicName** | **String** | Мнемоническое имя | 
**title** | **String** | Название исполнительного органа | 
**description** | **String** | Описание исполнительного органа | 
**responsiblePerson** | **String** | Ответственное лицо от органа исполнения  проверки | 
**image** | **String** | Изображение (аватар исполнительного органа) |  [optional]
**hashTag** | **String** |  | 
**contactPhone** | **String** |  | 
**contactEmail** | **String** |  | 
**preControllerEmail** | **String** | электронная почта отвественного министерства |  [optional]
**telegramChatId** | **String** | идентификатор телеграм канала исполнительного органа | 
**publicWebsite** | **String** | Ссылка на веб-ресурс службы |  [optional]
**moreInfo** | **String** | дополнительная информация о контролирующем \\ исполнительном органе |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Выбор типа организации:  * &#x60;EXECUTIVE&#x60; - исполнительные органы  * &#x60;SUPERVISING&#x60; - контролирующие органы  | 
**schedule** | [**List&lt;ContractorSchedule&gt;**](ContractorSchedule.md) |  | 
**problemCategories** | **List&lt;Integer&gt;** |  | 
**isActive** | **Boolean** | Статус видимости организации в общем списке |  [optional]
**generateDailyReport** | **Boolean** | Генерировать дневные отчеты |  [optional]
**needInformByEmail** | **Boolean** | информировать по электронной почте |  [optional]
**needInformBySms** | **Boolean** | информировать по sms |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EXECUTIVE | &quot;EXECUTIVE&quot;
SUPERVISING | &quot;SUPERVISING&quot;



