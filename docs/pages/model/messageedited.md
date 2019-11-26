---
title: MessageEdited
sidebar: home_sidebar
keywords: update, message, edit message
permalink: messageedited.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents an update about edited message.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| messageId  | true |String |  Backend ID of the message |
| author  | true |Peer |  Sender of a message  |
| dialog  | true | Peer |Recipient of a message |
| content  | true | String| new text content |
| type  | true | String | "MessageEdited" value must be filled

## Sample object

```
        {
          "updateId" : "de07d839-1492-4d29-8bd5-4d4f73e599e6",
          "type" : "MessageEdited",
          "messageId" : "ef4a8b9a-2131-453f-8cf8-17f228f0b4fe",
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
          "content" : "Hello_edited",
        }
```