---
title: ChannelPermissionsRevoked
sidebar: home_sidebar
keywords: update, admin, remove admin, delete admin,service, channel
permalink: channelpermissionsrevoked.html
toc: true
folder: Types
---

## Description

<p> This object represents an update about a service being revoked a channel admin role .
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| channelId  | true |String| Uuid with backend ID of a channel (peer) |
| type  | true | String | "ChannelPermissionsRevoked" value must be filled

## Sample object

```
		{
          "updateId" : "Uuid_value",
          "type" : "ChannelPermissionsRevoked",
          "channelId" : "Uuid_value"
        }
```
