---
title: retrieveUpdate
sidebar: home_sidebar
keywords: peer,types
permalink: retrieveUpdate.html
toc: true
folder: Types
---

![Types](images/retrieveUpdates.png "retrieveUpdate")

## Desciprtion

<p> This method is for getting updates. 
</p>
<p>  If there is a webhook url set for service, backend would return http error with a status code 400. It's neccesarry to delete webhook from backed before using this method.
</p>
<p> On succes serialized json object with a  updateResponse is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Sample object

```

		empty request
	
```


