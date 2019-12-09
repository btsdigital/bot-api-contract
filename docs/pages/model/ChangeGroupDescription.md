---
title: ChangeGroupDescription
sidebar: home_sidebar
keywords: ChangeGroupDescription
permalink: ChangeGroupDescription.html
toc: true
folder: Commands
---

![Commands](images/ChangeGroupDescription.png "BotCommandChangeGroupDescription")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>



## Description

<p> This method is for filling in/editing  text of group dialog description .
</p>
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "ChangeGroupDescription" value |Type of request "ChangeGroupDescription" |
| groupId  | true |  String | groupId must be a valid UUID| String for specifying ID of a group dialog to change description  of |
| description  | true |  String | -| String for specifying text of new group dialog description |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"ChangeGroupDescription",
         "groupId":"Uuid_value",
         "description":"The greatest group"
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
<li> Changing group description isn't available if a group dialog wasn't found (deleted/ID error);
</li>
<li> Changing group description  isn't available if service isn't a group owner/admin with permission to edit profile;
</li>
</ul>
</p>
