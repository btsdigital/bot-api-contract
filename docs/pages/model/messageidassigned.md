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
| updateId  | true |String| Backend ID of the update |
| localId  | true |String |  Service ID of the message |
| dialog  | true | [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |Recipient of a message |
| id  | true | String| Backend ID of the message |
| type  | true | String | "MessageIdAssigned" value must be filled

## Sample object

```
                {
                    "updateId": "8e84a6d0-0606-11ea-ab51-7b65bf81d89e",
                    "localId": "54353",
                    "dialog": {
                        "id": "ba017bae-e3e8-11e8-b418-7a609eaf8200",
                        "type": "USER"
                    },
                    "id": "8e73ddf0-0606-11ea-a404-dabd23db7be6",
                    "type": "MessageIdAssigned"
                }
```
