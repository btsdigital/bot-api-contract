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

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| messageId  | true |String |  Uuid with backend ID of the message |
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
          "updateId" : "Uuid_value",
          "type" : "Message",
          "messageId" : "Uuid_value",
          "sentAt" : "2019-11-12T15:11:00.199Z",
          "author" : {
            "type" : "USER",
            "id" : "Uuid_value",
            "username" : "TestUsername",
            "lastName" : "TestlastName",
            "firstName" : "TestfirstName"
          },
          "dialog" : {
            "type" : "GROUP",
            "id" : "Uuid_value",
            "name" : "Toi"
          },
          "content" : "Hello",
          "forwardMetadata" : {
            "sender" : {
              "type" : "USER",
              "id" : "Uuid_value"
            }
          },
          "media" : [ {
            "type" : "Image",
            "fileId" : "Uuid_value",
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
