---
title: DeleteMessage
sidebar: home_sidebar
keywords: DeleteMessage
permalink: DeleteMessage.html
toc: true
folder: Commands
---

![Commands](images/DeleteMessage.png "BotCommandDeleteMessage")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

<p> This method is for removing messages from dialog. 
</p>
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure


| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "DeleteMessage" value |Type of request "DeleteMessage" |
| messageId | true |  String |Value must be a valid Time UUID  | Backend ID of a message to delete  |
| dialog  | true |  [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | For Peer type validation see type page| Peer message to delete was sent to |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"DeleteMessage",
         "dialog":{  
            "type":"USER",
            "id":"Uuid_value"
         },
         "messageId":"Uuid_value"
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
    <li>Service isn't able to delete message if it wasn't found (deleted/ID error);
    </li>
    <li>Service isn't able to delete  messages it doesn't own;
    </li>
</ul>
</p>
<i>Service to service dialog 
</i>
<p>Deleting messages from service to service is not available, function is not supported.
</p>
<i>Service to user dialog
</i>
<p>
<ul>
<li>Deleting a message sent to a user who banned a service ( put a service into a black list) is not available);
</li>
<li>Service isn't able to delete other users messages;
</li>
<li> Service isn't able to delete message if it was sent more than 2 days ago.
</li>
</ul>
</p>
<i>Service to channel dialog
</i>
<p>
<ul>
  <li> Deleting a message sent to a channel is not available if a channel wasn't found (deleted/ID error) or channel was banned;
  </li>
  <li>Deleting a message sent to a channel is not available if a service is not a channel subscriber and has no administrator/owner role assigned and WRITE permission assigned;
  </li>
  <li>Service isn't able to delete message in a channel those it's not an owner of;
  </li>
  <li>Service isn't able to delete message ina channel if it was sent more than 30 days ago.
  </li>
</ul>
</p>
<i>Service to group dialog</i>
<p>
<ul>
<li>Service isn't able to delete a message sent to a group dialog is it's not a member of this group and has no administrator role and  permission to delete;
</li>
<li>Service isn't able to delete message in a group if it was sent more than 2 days ago.
</li>
</ul>
</p>
