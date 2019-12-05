---
title: QuickButtonSelected
sidebar: home_sidebar
keywords: update, quick button, quick button selected
permalink: quickbuttonselected.html
toc: true
folder: Types
---

## Description

This object represents update about selected quick button. This type of update is returned for [QuickRequest action type](https://btsdigital.github.io/bot-api-contract/quickbuttoncommand.html) of QuickButton.

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which quick button was pushed |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who pushed quick button  |
| metadata  | true | String |metadata transitioned with quick button for a service to process |
| type  | true | String | "QuickButtonSelected" value must be filled

## Sample object

```
               {
                 "updateId" : "20a8dd0a-7c29-4df9-bfc0-e5d8288d2a8d",
                 "type" : "QuickButtonSelected",
                 "dialog" : {
                   "type" : "USER",
                   "id" : "c81be0d0-2eb0-479e-a7a4-4568e8764509",
                   "username" : "TestUserName",
                   "lastName" : "TestLastName",
                   "firstName" : "TestFirstName"
                 },
                 "sender" : {
                   "type" : "USER",
                   "id" : "d2a1dcb7-ea11-433f-a62a-eb71b06881ce",
                   "username" : "TestUserName",
                   "lastName" : "TestLastName",
                   "firstName" : "TestFirstName"
                 },
                 "metadata" : "some_metadata"
               }
```
