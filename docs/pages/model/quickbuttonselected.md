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
| updateId  | true |String| Uuid with backend ID of the update |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which quick button was pushed |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who pushed quick button  |
| metadata  | true | String |metadata transitioned with quick button for a service to process |
| type  | true | String | "QuickButtonSelected" value must be filled

## Sample object

```
               {
                 "updateId" : "Uuid_value",
                 "type" : "QuickButtonSelected",
                 "dialog" : {
                   "type" : "USER",
                   "id" : "Uuid_value",
                   "username" : "TestUserName",
                   "lastName" : "TestLastName",
                   "firstName" : "TestFirstName"
                 },
                 "sender" : {
                   "type" : "USER",
                   "id" : "Uuid_value",
                   "username" : "TestUserName",
                   "lastName" : "TestLastName",
                   "firstName" : "TestFirstName"
                 },
                 "metadata" : "some_metadata"
               }
```
