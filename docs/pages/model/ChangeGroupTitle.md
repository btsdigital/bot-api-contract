---
title: ChangeGroupTitle
sidebar: home_sidebar
keywords: ChangeGroupTitle
permalink: ChangeGroupTitle.html
toc: true
folder: Commands
---

![Commands](images/ChangeGroupTitle.png "BotCommandChangeGroupTitle")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>



## Description

<p> This method is for changing  title of group dialog.
</p>
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "ChangeGroupTitle" value |Type of request "ChangeGroupTitle" |
| groupId  | true |  String | groupId must be a valid UUID| String for specifying ID of a group dialog to change title of |
| title  | true |  String | -| String for specifying text of new group dialog title |

## Sample request
```
{  
   "commands":[  
      {  
         "type":"ChangeGroupTitle",
         "groupId":"0fhf26f9-f181-11e9-66782c-f22cgH20c1jc",
         "title":"New title"
      }
   ]
}
```

## Possible business exceptions

<i>Common context
</i>
<p>
<ul>
<li> Changing group title isn't available if a group dialog wasn't found (deleted/ID error);
</li>
<li> Changing group title  isn't available if service isn't a group owner and admin with BOT_EDIT_PROFILE permission;
</li>
</ul>
</p>
