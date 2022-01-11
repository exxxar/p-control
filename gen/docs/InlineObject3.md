

# InlineObject3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startAt** | **String** |  |  [optional]
**endAt** | **String** |  |  [optional]
**objectId** | **List&lt;Integer&gt;** |  |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Статистика по:   * &#x60;REQUEST_BY_CATEGORIES&#x60; - запросы по категориям   * &#x60;REQUEST_BY_CONTRACTORS&#x60; - запросы по исполнительным \\ контролирующим органам   * &#x60;REQUEST_BY_CONTRACTORS_EXECUTIVE&#x60; - запросы по исполнительным  органам   * &#x60;REQUEST_BY_CONTRACTORS_SUPERVISING&#x60; - запросы по контролирующим органам   * &#x60;CONTRACTORS&#x60; - добавленные исполнительные \\ контролирующие органы   * &#x60;ACCEPTED_REQUESTS&#x60; - принятые в работу заявки   * &#x60;DECLINE_REQUESTS&#x60; - отклоненные заявки   * &#x60;SUMMARY_ALL&#x60; - суммарная сводка по заявкам   * &#x60;NEW_USERS&#x60; - новые пользователи   * &#x60;ACTIVE_USERS&#x60; - активные пользователи  |  [optional]



## Enum: ObjectTypeEnum

Name | Value
---- | -----
REQUEST_BY_CATEGORIES | &quot;REQUEST_BY_CATEGORIES&quot;
REQUEST_BY_CONTRACTORS | &quot;REQUEST_BY_CONTRACTORS&quot;
REQUEST_BY_CONTRACTORS_EXECUTIVE | &quot;REQUEST_BY_CONTRACTORS_EXECUTIVE&quot;
REQUEST_BY_CONTRACTORS_SUPERVISING | &quot;REQUEST_BY_CONTRACTORS_SUPERVISING&quot;
CONTRACTORS | &quot;CONTRACTORS&quot;
ACCEPTED_REQUESTS | &quot;ACCEPTED_REQUESTS&quot;
DECLINE_REQUESTS | &quot;DECLINE_REQUESTS&quot;
SUMMARY_ALL | &quot;SUMMARY_ALL&quot;
NEW_USERS | &quot;NEW_USERS&quot;
ACTIVE_USERS | &quot;ACTIVE_USERS&quot;



