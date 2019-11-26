---
title: ChannelAdminDeleted
sidebar: home_sidebar
keywords: update, admin, remove admin, delete admin
permalink: channeladmindeleted.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents an update about removing channel admin.
</p>
<p> This update is sent to a  service if it's a channel subcriber.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| channelId  | true |String| Backend ID of a channel (peer) |
| admin  | true |Peer| Channel admin removed |
| type  | true | String | "ChannelAdminDeleted" value must be filled

## Sample object

```
		{
          "updateId" : "bd6cf695-0c13-45fd-b0ff-10f2a7504865",
          "type" : "ChannelAdminDeleted",
          "channelId" : "2ea63185-01b4-40ae-b225-1c8d87efdda2",
          "admin" : {
            "type" : "USER",
            "id" : "5d8df81e-e280-480a-b165-7e68c36308c3",
            "username" : "TestUserName",
            "lastName" : "TestlastName",
            "firstName" : "TestfirstName"
          }
        }
```