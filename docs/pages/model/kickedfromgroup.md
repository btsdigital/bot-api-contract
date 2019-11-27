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
| updateId  | true |String| Backend ID of the update |
| groupId  | true |String| Backend ID of a group dialog (peer) |
| type  | true | String | "KickedFromGroup" value must be filled

## Sample object

```
               {
                 "updateId" : "d0c71b68-f677-47bb-90d5-0456b346d63c",
                 "type" : "KickedFromGroup",
                 "groupId" : "92dee053-378c-47f9-bdac-06714f722bbf"
               }
```
