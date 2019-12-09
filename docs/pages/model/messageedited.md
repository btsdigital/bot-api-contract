---
title: MessageEdited
sidebar: home_sidebar
keywords: update, message, edit message
permalink: messageedited.html
toc: true
folder: Types
---

## Description

<p> This object represents an update about edited message.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| messageId  | true |String |  Uuid with backend ID of the message |
| author  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Sender of a message  |
| dialog  | true | [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |Recipient of a message |
| content  | true | String| new text content |
| type  | true | String | "MessageEdited" value must be filled

## Sample object

```
        {
          "updateId" : "Uuid_value",
          "type" : "MessageEdited",
          "messageId" : "Uuid_value",
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
          "content" : "Hello_edited",
        }
```
