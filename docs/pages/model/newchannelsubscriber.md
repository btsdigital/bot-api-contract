---
title: NewChannelSubscriber
sidebar: home_sidebar
keywords: update, new channel subscriber, channel
permalink: newchannelsubscriber.html
toc: true
folder: Types
---

## Description

<p> This object represents update  about adding a new channel subcriber.
</p>
<p> This update is sent to a service with a channel admin role.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| peer  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html)| New channel subcriber |
| channelId  | true |String| Uuid with backend ID of a channel (peer) |
| type  | true | String | "NewChannelSubscriber" value must be filled

## Sample object

```
                {
                  "updateId" : "Uuid_value",
                  "type" : "NewChannelSubscriber",
                  "peer" : {
                    "type" : "USER",
                    "id" : "Uuid_value",
                    "username" : "TestUserName",
                    "lastName" : "TestLastName",
                    "firstName" : "TestFirstName"
                  },
                  "channelId" : "Uuid_value"
                }
```
