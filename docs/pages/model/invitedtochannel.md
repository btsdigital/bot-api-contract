---
title: InvitedToChannel
sidebar: home_sidebar
keywords: update, channel, invite, invite to channel
permalink: invitedtochannel.html
toc: true
folder: Types
---

## Description

<p> This object represents update  about adding service to a channel as a subcriber. 
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| channelId  | true |String| Uuid with backend ID of a channel (peer) |
| type  | true | String | "InvitedToChannel" value must be filled

## Sample object

```
               {
                 "updateId" : "Uuid_value",
                 "type" : "InvitedToChannel",
                 "channelId" : "Uuid_value"
               }
```
