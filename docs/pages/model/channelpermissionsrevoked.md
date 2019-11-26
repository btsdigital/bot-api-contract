---
title: ChannelPermissionsRevoked
sidebar: home_sidebar
keywords: update, admin, remove admin, delete admin,service, channel
permalink: channelpermissionsrevoked.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents an update about a service being revoked a channel admin role .
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| channelId  | true |String| Backend ID of a channel (peer) |
| type  | true | String | "ChannelPermissionsRevoked" value must be filled

## Sample object

```
		{
          "updateId" : "95828600-d345-4822-a72a-4bbbd3365a2e",
          "type" : "ChannelPermissionsRevoked",
          "channelId" : "26e46ff4-12a9-4a27-b0d6-b818efecc6a3"
        }
```