---
title: Message
sidebar: home_sidebar
keywords: update, message, new message
permalink: message.html
toc: true
folder: Types
---

## Description

<p> This object represents an update about a new message sent to dialog with a service.
</p>

New message might be sent by user directly or through the use of [ReplyCommand](https://btsdigital.github.io/bot-api-contract/replycommand.html).

<p> Messages sent to dialog through the use of QUICK_FORM_ACTION type of <a href="https://btsdigital.github.io/bot-api-contract/quickbuttoncommand.html">Quickbuttons</a> wont be returned in this updates.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| messageId  | true |String |  Backend ID of the message |
| sentAt  | true |ZonedDateTime|  Time and date of sending a message |
| author  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Sender of a message  |
| dialog  | true | [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |Recipient of a message |
| content  | true | String| Text content  |
| forwardMetadata| false |[MessageForwardMetadata](https://btsdigital.github.io/bot-api-contract/messageforwardmetadata.html) |  Original message info |
| likeCount  | false |Long |  Quantity of likes received (for channel dialogs)  |
| Media  | false | List of [Media](https://btsdigital.github.io/bot-api-contract/media.html)| List of media objects  |
| repostCount  | false | Long | Quantity of reposts done (for channel dialogs) |
| viewCount  | false |Long  |Quantity of post views (for channel dialogs)  |
| channelPostAuthor  | false |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Author of a channel post who offered it for posting to channel (this author can't post in channel)  |
| type  | true | String | "Message" value must be filled

## Sample object

```
        {
          "updateId" : "de07d839-1492-4d29-8bd5-4d4f73e599e6",
          "type" : "Message",
          "messageId" : "ef4a8b9a-2131-453f-8cf8-17f228f0b4fe",
          "sentAt" : "2019-11-12T15:11:00.199Z",
          "author" : {
            "type" : "USER",
            "id" : "1019713e-b2d7-46b2-a6ec-743b0f3c8687",
            "username" : "TestUsername",
            "lastName" : "TestlastName",
            "firstName" : "TestfirstName"
          },
          "dialog" : {
            "type" : "GROUP",
            "id" : "a930b4b4-1520-417a-aaef-7ff52bd8cd25",
            "name" : "Toi"
          },
          "content" : "Hello",
          "forwardMetadata" : {
            "sender" : {
              "type" : "USER",
              "id" : "e77d1dc7-4ecd-46c3-9ee4-74cd773763d6"
            }
          },
          "media" : [ {
            "type" : "Image",
            "fileId" : "610a225e-59e4-4661-b488-d40491c19122",
            "mimeType" : "1234",
            "name" : "test",
            "size" : 100,
            "width" : 800,
            "height" : 800
          } ],
          "likeCount" : null,
          "repostCount" : null,
          "viewCount" : null,
          "channelPostAuthor" : null
        }
```
