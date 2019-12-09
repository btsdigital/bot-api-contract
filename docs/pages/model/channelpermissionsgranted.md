---
title: ChannelPermissionsGranted
sidebar: home_sidebar
keywords: update, admin, adding admin, service, channel
permalink: channelpermissionsgranted.html
toc: true
folder: Types
---

## Description

<p> This object represents an update about adding a service to channel admins if service isn't a channel admin or editing admin permissions if service is already a channel admin.
</p>
<p>This update is sent to a  service if it's a channel subcriber
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| channel  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html)| Peer channel object |
| permissions  | true |list of string| Channel admin permission list |
| type  | true | String | "ChannelPermissionsGranted" value must be filled

## Sample object

```
		{
          "updateId" : "Uuid_value",
          "type" : "ChannelPermissionsGranted",
          "channel" : {
            "type" : "CHANNEL",
            "id" : "Uuid_value"
          },
          "permissions" : ["WRITE","READ_ADMINS" ]
        }
```
