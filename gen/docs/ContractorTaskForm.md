

# ContractorTaskForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **Long** |  | 
**contractorId** | **Long** |  | 
**description** | **String** | Пояснение исполнительного   контролирующего органа | 
**responsiblePerson** | **String** | Ответственное за работу лицо от органа исполнения  проверки | 
**contactPhone** | **String** | Номер телефона ответственного лица | 
**contactEmail** | **String** | Адрес эл. почты ответственного лица | 
**estimatedTaskProcessingDate** | **String** | Предполагаемая дата проведения работ  контроля  | 
**actualTaskProcessingDate** | **String** | Фактическая дата проведения работ  контроля  | 
**type** | [**TypeEnum**](#TypeEnum) | Выбор типа организации:  * &#x60;EXECUTIVE&#x60; - исполнительные органы  * &#x60;SUPERVISING&#x60; - контролирующие органы  | 
**attachments** | [**List&lt;MediaContent&gt;**](MediaContent.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EXECUTIVE | &quot;EXECUTIVE&quot;
SUPERVISING | &quot;SUPERVISING&quot;



