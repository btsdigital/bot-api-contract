---
title: InlineCommandSelected
sidebar: home_sidebar
keywords: update, inline command, inline command selected
permalink: inlinecommandselected.html
toc: true
folder: Types
---

## Description

<p> This object represents update  about selected inline command.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which inline command button was pushed |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who pushed inline command button  |
| metadata  | true | String |metadata transitioned with inline command for a service to process |
| content  | true | String |Text of a message sent to a dialog when inline command button was pushed |
| type  | true | String | "InlineCommandSelected" value must be filled

## Sample object

```
                 {
                   "updateId" : "Uuid_value",
                   "type" : "InlineCommandSelected",
                   "messageId" : "Uuid_value",
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
                   "metadata" : "some_metadata",
                   "content" : "some_content"
                 }
```
