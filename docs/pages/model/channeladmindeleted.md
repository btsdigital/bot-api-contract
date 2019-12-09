---
title: ChannelAdminDeleted
sidebar: home_sidebar
keywords: update, admin, remove admin, delete admin
permalink: channeladmindeleted.html
toc: true
folder: Types
---

## Description

<p> This object represents an update about removing channel admin.
</p>
<p> This update is sent to a  service if it's a channel subcriber.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| channelId  | true |String| Uuid with backend ID of a channel (peer) |
| admin  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html)| Channel admin removed |
| type  | true | String | "ChannelAdminDeleted" value must be filled

## Sample object

```
		{
          "updateId" : "bd6cf695-0c13-45fd-b0ff-10f2a7504865",
          "type" : "ChannelAdminDeleted",
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
