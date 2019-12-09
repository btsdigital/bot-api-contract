---
title: KickedFromChannel
sidebar: home_sidebar
keywords: update, channel, kick, kicked from channel
permalink: kickedfromchannel.html
toc: true
folder: Types
---

## Description

<p> This object represents update  about removing service from channel subcribers.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| channelId  | true |String| Uuid with backend ID of a channel (peer) |
| type  | true | String | "KickedFromChannel" value must be filled

## Sample object

```
               {
                 "updateId" : "Uuid_value",
                 "type" : "KickedFromChannel",
                 "channelId" : "Uuid_value"
               }
```
