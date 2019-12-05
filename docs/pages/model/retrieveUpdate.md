---
title: retrieveUpdate
sidebar: home_sidebar
keywords: peer,types
permalink: retrieveUpdate.html
toc: true
folder: Types
---

![Types](images/retrieveUpdates.png "retrieveUpdates")

## Description

<p> This method is for getting updates. 
</p>
<p>  If there is a webhook url set for service, backend would return http error with a status code 400. It's neccesarry to <a href="https://btsdigital.github.io/bot-api-contract/deletewebhook.html">delete webhook</a> from backed before using this method.
</p>
<p> On succes serialized json object with a  <a href="https://btsdigital.github.io/bot-api-contract/updateresponse.html">updateResponse</a> is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Sample object

```

		empty request
	
```


