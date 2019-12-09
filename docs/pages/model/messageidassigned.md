---
title: MessageIdAssigned
sidebar: home_sidebar
keywords: update, id assigned,message id
permalink: messageidassigned.html
toc: true
folder: Types
---

## Description

<p> This object represents update  with a backend ID of the message. in return to sent message with a localID specified.
</p>
<p> This update is returned if localId parameter was set in commands.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| localId  | true |String |  Service ID of the message |
| dialog  | true | [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |Recipient of a message |
| id  | true | String| Uuid with backend ID of the message |
| type  | true | String | "MessageIdAssigned" value must be filled

## Sample object

```
                {
                    "updateId": "Uuid_value",
                    "localId": "54353",
                    "dialog": {
                        "id": "Uuid_value",
                        "type": "USER"
                    },
                    "id": "Uuid_value",
                    "type": "MessageIdAssigned"
                }
```
