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



## Desciprtion

<p> This method is for changing  text of group dialog description .
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
         "groupId":"0fhf26f9-f181-11e9-66782c-f22cgH20c1jc",
         "description":"Make America great again"
      }
   ]
}
```

## Possible business exceptions

<i>Common context
</i>
<p>
<ul>
<li> Changing group description isn't available if a group dialog wasn't found (deleted/ID error);
</li>
<li> Changing group description  isn't available if service isn't a group owner and admin with BOT_EDIT_PROFILE permission;
</li>
</ul>
</p>