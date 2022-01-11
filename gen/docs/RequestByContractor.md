

# RequestByContractor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**contractorId** | **Long** |  |  [optional]
**requestId** | **Long** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Выбор типа задачи для органа - контроль, исполнение:  * &#x60;EXECUTIVE&#x60; - исполнение  * &#x60;SUPERVISING&#x60; - контроль  |  [optional]
**description** | **String** | краткое пояснение исполнительного \\ контролирующего органа |  [optional]
**attachments** | [**List&lt;MediaContent&gt;**](MediaContent.md) | медиа данные по исполнению \\ контролю |  [optional]
**workedAt** | **String** | время проведения работ \\ контроля |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
VERIFICATION | &quot;VERIFICATION&quot;
EXECUTION | &quot;EXECUTION&quot;



