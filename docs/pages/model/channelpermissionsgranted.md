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
| updateId  | true |String| Backend ID of the update |
| channel  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html)| Peer channel object |
| permissions  | true |list of string| Channel admin permission list |
| type  | true | String | "ChannelPermissionsGranted" value must be filled

## Sample object

```
		{
          "updateId" : "6c4e751c-e344-4fe3-a0ca-f23ab67a1af5",
          "type" : "ChannelPermissionsGranted",
          "channel" : {
            "type" : "CHANNEL",
            "id" : "654fd101-3bbd-40d2-a89d-291a9e2764d3"
          },
          "permissions" : ["WRITE","READ_ADMINS" ]
        }
```
