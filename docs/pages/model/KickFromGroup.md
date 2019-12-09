---
title: KickFromGroup
sidebar: home_sidebar
keywords: KickFromGroup
permalink: KickFromGroup.html
toc: true
folder: Commands
---

![Commands](images/KickFromGroup.png "BotCommandKickFromGroup")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

<p> This method is for removing a user or a service from group dialog.
</p>
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "KickFromGroup" value |Type of request "KickFromGroup" |
| groupId  | true |  String | groupId must be a valid UUID| String for specifying ID of group dialog to remove a member from |
| peerToKick  | true |  [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | For Peer type validation see type page| Peer to be removed from group |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"KickFromGroup",
         "groupId":"Uuid_value",
         "peerToKick":{  
            "type":"USER",
            "id":"Uuid_value"
         }
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
<li> Removing a peer (user/service) from group isn't available if a group dialog wasn't found (deleted/ID error);
</li>
<li>Removing a peer (user/service) from group isn't available if peer wasn't found in group dialog (peer has already exited/been removed/ID error);
</li>
<li> Removing a peer (user/service) from group isn't available if peer is a group owner or admin;
</li>
<li> Removing a peer (user/service) from group isn't available if service isn't a group owner and admin with permission to delete ;
</li>
</ul>
</p>
