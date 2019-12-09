---
title: SendMessage
sidebar: home_sidebar
keywords: SendMessage
permalink: SendMessage.html
toc: true
folder: Commands
---

![Commands](images/SendMessage.png "SendMessage")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

<p> This method is for sending common messages from service (bot) to a dialog with a user, group dialog or a channel. 
</p>
<p> If a service specify value of localID variable, it would get <a href="https://btsdigital.github.io/bot-api-contract/messageidassigned.html">MessageIdAssigned</a> with localId - messageId match update asynchroniously.
</p>
<p> If you set media and inline buttons concurrently in one message client won't display inline buttons, as this an issue for future development.
</p>
<p> On succes empty response with http code 200 is returned.
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "SendMessage" value |Type of request "SendMessage" |
| localId | false |  String |LocalID length should be <= 255  | Message ID generated by Bot  |
| content| true |  String |Content length should be <= 4096  | Text of a message  |
| recipient  | true |  [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | For Peer type validation see type page| Peer to send this message to |
| replyToMessageId  | false |  String | Content length should be <= 4096 | Message ID to reply to |
| inlineCommands  | false | List of [InlineCommand](https://btsdigital.github.io/bot-api-contract/inlinecommand.html)  | Number of inlineCommands should be <= 8, recommended number is 3. For inlineCommand type validation see type page | List of InlineCommands (list of buttons that will be displayed on Messenger UI inside the message). Currently this is deprecated, use inlineCommandRows
| inlineCommandRows  | false |List of [InlineCommand](https://btsdigital.github.io/bot-api-contract/inlinecommand.html) lists | Table should not have more than 25 rows, 25 columns|List containing lists of InlineCommands (Table of buttons that will be displayed on Messenger UI inside the message)|
| uiState  | false | [UiState](https://btsdigital.github.io/bot-api-contract/uistate.html) |For uiState type validation see type page |Bot Ui State buttons with ReplyKeyboard and QuickButtons  |
| mediaList  | false | List of [InputMedia](https://btsdigital.github.io/bot-api-contract/inputmedia.html)  |mediaList size should be <= 100 |List of InputMedia. Media content to be showed in a message |

## Sample request
```
   "commands":[  
      {  
         "type":"SendMessage",
         "localId":"12345",
         "content":"Hello",
         "recipient":{  
            "type":"USER",
            "id":"Uuid_value"
         }
      }
   ]
```

## Updates

<p>This method may asynchronously return following updates:
</p>
<ul>
<li> <a href="https://btsdigital.github.io/bot-api-contract/quickbuttonselected.html">QuickButtonSelected</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/formclosed.html">FormClosed</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/formsubmitted.html">FormSubmitted</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/formmessagesent.html">FormMessageSent</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/message.html">Message</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/inlinecommandselected.html">InlineCommandSelected</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/messageidassigned.html">MessageIdAssigned</a>;
</li>
</ul>

## Possible business exceptions

<i>Service to service dialog </i>
<p> Sending messages from service to service is not available, function is not supported.
</p>

<i>Service to user dialog</i>
<p>
<ul>
  <li> Sending a message to a user who banned a service ( put a service into a black list) is not available;
  </li>
  <li> Sending a message to a user is not available if a dialog wasn't found (deleted/ID error);
  </li>
  <li> Sending a message to a user is not available if Peer type and Peer ID specified in request doesn't match;
  </li>
</ul>  
</p>

<i>Service to channel dialog</i>

<p>
<ul>
  <li> Sending a message to a channel is not available if a channel wasn't found (deleted/ID error) or channel was banned;
  </li>
  <li>Sending a message to a channel is not available if a service is not a channel subscriber and has no administrator/owner role assigned;
  </li>
  </ul>
  </p>

<i>Service to group dialog</i>
<p>
Sending a message to a group dialog is not available if a service is not a member of this group.
</p>
