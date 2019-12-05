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
| updateId  | true |String| Backend ID of the update |
| peer  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html)| New channel subcriber |
| channelId  | true |String| Backend ID of a channel (peer) |
| type  | true | String | "NewChannelSubscriber" value must be filled

## Sample object

```
                {
                  "updateId" : "e7b8b8c2-7835-40c7-bac6-5a242ae291f9",
                  "type" : "NewChannelSubscriber",
                  "peer" : {
                    "type" : "USER",
                    "id" : "a3474872-0a2e-4b3e-af6a-7fd710ecb26f",
                    "username" : "TestUserName",
                    "lastName" : "TestLastName",
                    "firstName" : "TestFirstName"
                  },
                  "channelId" : "d3080695-5d31-48ef-9435-dd7c9eeab48a"
                }
```
