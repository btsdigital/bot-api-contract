---
title: KickedFromGroup
sidebar: home_sidebar
keywords: update, group, kick, kicked from group
permalink: kickedfromgroup.html
toc: true
folder: Types
---

## Description

<p> This object represents update  about removing service from a group dialog. By that fact service is removed from group members.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| groupId  | true |String| Uuid with backend ID of a group dialog (peer) |
| type  | true | String | "KickedFromGroup" value must be filled

## Sample object

```
               {
                 "updateId" : "Uuid_value",
                 "type" : "KickedFromGroup",
                 "groupId" : "Uuid_value"
               }
```
