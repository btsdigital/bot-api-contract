---
title: InvitedToGroup
sidebar: home_sidebar
keywords: update, group, invite, invite to group
permalink: invitedtogroup.html
toc: true
folder: Types
---

## Description

<p> This object represents update  about adding service to a group dialog. By that fact service becomes new group member.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| groupId  | true |String| Uuid with backend ID of a group dialog (peer) |
| type  | true | String | "InvitedToGroup" value must be filled

## Sample object

```
               {
                 "updateId" : "Uuid_value",
                 "type" : "InvitedToGroup",
                 "groupId" : "Uuid_value"
               }
```
