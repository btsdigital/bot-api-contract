---
title: KickedFromChannel
sidebar: home_sidebar
keywords: update, channel, kick, kicked from channel
permalink: kickedfromchannel.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents update  about removing service from channel subcribers.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| channelId  | true |String| Backend ID of a channel (peer) |
| type  | true | String | "KickedFromChannel" value must be filled

## Sample object

```
               {
                 "updateId" : "d0c71b68-f677-47bb-90d5-0456b346d63c",
                 "type" : "KickedFromChannel",
                 "channelId" : "92dee053-378c-47f9-bdac-06714f722bbf"
               }
```