---
title: ChannelAdminAdded
sidebar: home_sidebar
keywords: update, admin, adding admin
permalink: channeladminadded.html
toc: true
folder: Types
---

## Description

<p> This object represents an update about adding new channel admin.
</p>
<p> This update is sent to a  service if it's a channel subcriber.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| channelId  | true |String| Uuid with backend ID of a channel (peer) |
| admin  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html)| New channel admin |
| type  | true | String | "ChannelAdminAdded" value must be filled

## Sample object

```
		{
          "updateId" : "Uuid value",
          "type" : "ChannelAdminAdded",
          "channelId" : "Uuid_value",
          "admin" : {
            "type" : "USER",
            "id" : "Uuid_value",
            "username" : "TestUserName",
            "lastName" : "TestlastName",
            "firstName" : "TestfirstName"
          }
        }
```


