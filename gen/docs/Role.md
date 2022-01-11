

# Role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**title** | [**TitleEnum**](#TitleEnum) | Роли пользователя:   * &#x60;GUEST&#x60; - гость (не используется)   * &#x60;USER&#x60; - польователь системы   * &#x60;ADMINISTRATOR&#x60; - администратор системы   * &#x60;CONTRACTOR&#x60; - исполнительный или контролирующий орган   * &#x60;CONTRACTOR_EXECUTIVE&#x60; - исполнительный орган   * &#x60;CONTRACTOR_SUPERVISING&#x60; - контролирующий орган   * &#x60;TECHNICAL&#x60; - технический пользователь системы  | 
**slug** | **String** | мнемоническое имя роли | 
**deletedAt** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]



## Enum: TitleEnum

Name | Value
---- | -----
GUEST | &quot;GUEST&quot;
USER | &quot;USER&quot;
ADMINISTRATOR | &quot;ADMINISTRATOR&quot;
CONTRACTOR | &quot;CONTRACTOR&quot;
CONTRACTOR_EXECUTIVE | &quot;CONTRACTOR_EXECUTIVE&quot;
CONTRACTOR_SUPERVISING | &quot;CONTRACTOR_SUPERVISING&quot;
TECHNICAL | &quot;TECHNICAL&quot;



