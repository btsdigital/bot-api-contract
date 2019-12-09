---
title: DeleteGroupAvatar
sidebar: home_sidebar
keywords: DeleteGroupAvatar
permalink: DeleteGroupAvatar.html
toc: true
folder: Commands
---

![Commands](images/DeleteGroupAvatar.png "DeleteGroupAvatar")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

<p> This method is for removing avatar picture of group dialog.
</p>
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "DeleteGroupAvatar" value |Type of request "DeleteGroupAvatar" |
| groupId  | true |  String | groupId must be a valid UUID| String for specifying ID of group dialog for removal of avatar picture |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"DeleteGroupAvatar",
         "groupId":"Uuid_value"
      }
   ]
}
```

## Updates

<p>This method may asynchronously return following updates:
</p>

N/A

## Possible business exceptions

<i>Common context
</i>
<p>
<ul>
<li> Removing group avatar isn't available if a group dialog wasn't found (deleted/ID error);
</li>
<li> Removing group avatar isn't available if service isn't a group owner/admin with permission to edit profile;
</li>
</ul>
</p>
