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
| updateId  | true |String| Backend ID of the update |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which inline command button was pushed |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who pushed inline command button  |
| metadata  | true | String |metadata transitioned with inline command for a service to process |
| content  | true | String |Text of a message sent to a dialog when inline command button was pushed |
| type  | true | String | "InlineCommandSelected" value must be filled

## Sample object

```
                 {
                   "updateId" : "ab73a722-9336-4f19-8574-1e53a8eb2dfe",
                   "type" : "InlineCommandSelected",
                   "messageId" : "eab999e1-31ac-49ba-8ff7-9f9560acdefc",
                   "dialog" : {
                     "type" : "USER",
                     "id" : "7cf5e66f-60cb-4483-bb17-b8d6b829c695",
                     "username" : "TestUserName",
                     "lastName" : "TestLastName",
                     "firstName" : "TestFirstName"
                   },
                   "sender" : {
                     "type" : "USER",
                     "id" : "015c1bdd-39e3-474f-9f7d-a607f853999f",
                     "username" : "TestUserName",
                     "lastName" : "TestLastName",
                     "firstName" : "TestFirstName"
                   },
                   "metadata" : "some_metadata",
                   "content" : "some_content"
                 }
```
