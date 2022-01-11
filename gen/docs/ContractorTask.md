

# ContractorTask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**requestId** | **Long** |  |  [optional]
**contractorId** | **Long** |  |  [optional]
**request** | [**Request**](Request.md) |  |  [optional]
**contractor** | [**Contractor**](Contractor.md) |  |  [optional]
**estimatedTaskProcessingDate** | **String** | Предполагаемая дата проведения работ  контроля  |  [optional]
**actualTaskProcessingDate** | **String** | Фактическая дата проведения работ  контроля  |  [optional]
**description** | **String** | Пояснение исполнительного   контролирующего органа |  [optional]
**responsiblePerson** | **String** | Ответственное за работу лицо от органа исполнения  проверки |  [optional]
**contactPhone** | **String** | Номер телефона ответственного лица |  [optional]
**contactEmail** | **String** | Адрес эл. почты ответственного лица |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Выбор типа организации:  * &#x60;EXECUTIVE&#x60; - исполнительные органы  * &#x60;SUPERVISING&#x60; - контролирующие органы  |  [optional]
**attachments** | [**List&lt;MediaContent&gt;**](MediaContent.md) |  |  [optional]
**deletedAt** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EXECUTIVE | &quot;EXECUTIVE&quot;
SUPERVISING | &quot;SUPERVISING&quot;



