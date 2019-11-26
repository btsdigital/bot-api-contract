---
title: InvitedToChannel
sidebar: home_sidebar
keywords: update, channel, invite, invite to channel
permalink: invitedtochannel.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents update  about adding service to a channel as a subcriber. 
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| channelId  | true |String| Backend ID of a channel (peer) |
| type  | true | String | "InvitedToChannel" value must be filled

## Sample object

```
               {
                 "updateId" : "d0c71b68-f677-47bb-90d5-0456b346d63c",
                 "type" : "InvitedToChannel",
                 "channelId" : "92dee053-378c-47f9-bdac-06714f722bbf"
               }
```