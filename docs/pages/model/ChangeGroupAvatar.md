---
title: ChangeGroupAvatar
sidebar: home_sidebar
keywords: ChangeGroupAvatar
permalink: ChangeGroupAvatar.html
toc: true
folder: Commands
---

![Commands](images/ChangeGroupAvatar.png "BotCommandChangeGroupAvatar")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>



## Description

<p> This method is for changing avatar picture of group dialog.
</p>

It's neccesarry to specify avatar file ID which is returned after [uploading avatar]() (not a file). 
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "ChangeGroupAvatar" value |Type of request "ChangeGroupAvatar" |
| groupId  | true |  String | groupId must be a valid UUID| String for specifying ID of a group dialog to change avatar of |
| fileId  | true |  String |groupId must be a valid UUID| String for specifying file ID which has already been uploaded as an avatar ([uploadAvatar]()) |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"ChangeGroupAvatar",
         "groupId":"Uuid_value",
         "fileId":"Uuid_value"
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
<li> Changing group avatar isn't available if a group dialog wasn't found (deleted/ID error);
</li>
<li> Changing group avatar isn't available if media file according to fileId specified wasn't found (for this method avatar fileId required);
</li>
<li> Changing group avatar  isn't available if service isn't a group owner/admin with permission to edit profile ;
</li>
</ul>
</p>
