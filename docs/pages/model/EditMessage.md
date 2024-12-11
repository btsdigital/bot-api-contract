---
title: EditMessage
sidebar: home_sidebar
keywords: EditMessage
permalink: EditMessage.html
toc: true
folder: Commands
---

![Commands](images/EditMessage.png "BotCommandEditMessage")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

<p> This method is for editing common messages from service (bot). 
</p>
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure
 
| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "EditMessage" value |Type of request "EditMessage" |
| messageId | true |  String |Value must be a valid UUID  | Backend ID of a message to edit  |
| recipient  | true |  [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | For Peer type validation see type page| Peer message to edit was sent to |
| content| true |  String |Content length should be <= 4096  | Text of a message to replace original  |
| inlineCommands  | false | List of [InlineCommand](https://btsdigital.github.io/bot-api-contract/inlinecommand.html)  | Number of inlineCommands should be <= 8, recommended number is 3. For inlineCommand type validation see type page | List of InlineCommands   (list of buttons that will be displayed on Messenger UI inside the message). Currently this is deprecated, use inlineCommandRows
| inlineCommandRows  | false |List of [InlineCommand](https://btsdigital.github.io/bot-api-contract/inlinecommand.html) lists | Table should not have more than 25 rows, 25 columns|List containing lists of InlineCommands (Table of buttons that will be displayed on Messenger UI inside the message)|
| uiState  | false | [UiState](https://btsdigital.github.io/bot-api-contract/uistate.html) |For uiState type validation see type page |Bot Ui State buttons |
| mediaList  | false | List of [InputMedia](https://btsdigital.github.io/bot-api-contract/inputmedia.html)  |mediaList size should be <= 100. For InputMedia type validation see type page  |List of InputMedia. Media content to replace original |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"EditMessage",
         "content":"text",
         "messageId":"Uuid_value",
         "recipient":{  
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

<i>Common context </i>
<p>
<ul>
    <li>Service isn't able to edit message if it wasn't found (deleted/ID error);</li>
    <li>Service isn't able to edit message if this command is used for container type message, as for editing that type of messages  other command is specified;</li>
    <li>Service isn't able to edit forwarded message;</li>
    <li> Service isn't able to edit message if it was sent more than 30 days ago  </li>
</ul>
</p>
<i>Service to service dialog
</i>
<p>Editing messages from service to service is not available, function is not supported.
</p>
<i>Service to user dialog
</i>
<p>
Editing a message sent to a user who banned a service ( put a service into a black list) is not available).
</p>
<i>Service to channel dialog
</i>
<p>
<ul>
  <li> Editing a message sent to a channel is not available if a channel wasn't found (deleted/ID error) or channel was banned;
  </li>
  <li>Editing a message sent to a channel is not available if a service is not a channel subscriber and has no administrator/owner role assigned;
  </li>
</ul>
</p>
<i>Service to group dialog
</i>
<p>
Editing a message sent to a group dialog is is not available if a service is not a member of this group.
</p>

