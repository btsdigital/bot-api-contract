---
title: MessageForwardMetadata
sidebar: home_sidebar
keywords: update, message, edit message
permalink: messageforwardmetadata.html
toc: true
folder: Types
---

## Description

<p> This object represents forwarded message data ( in present it's a peer type of message sender).
</p>
<p> Object is sent in a forwarding message.
</p>

## Structure

| Variable  | Obligative  | Type| Description
|---|:---:|---|
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | Forwarded message sender |

## Sample object

```
        {
          "sender" : {
            "type" : "USER",
            "id" : "Uuid_value",
            "username" : "TestUsername",
            "lastName" : "TestlastName",
            "firstName" : "TestfirstName"
          }
        }
```
