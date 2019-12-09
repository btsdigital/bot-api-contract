---
title: FormClosed
sidebar: home_sidebar
keywords: update, form, form closed, SendUiState
permalink: formclosed.html
toc: true
folder: Types
---

## Description

 This object represents update  about form (sent within [UiState](https://btsdigital.github.io/bot-api-contract/uistate.html) in [SendUiState method](https://btsdigital.github.io/bot-api-contract/SendUiState.html)) being closed in a client by a user.


## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| formId  | true |String| Backend ID of a form |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which form was closed |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who closed a form  |
| type  | true | String | "FormClosed" value must be filled

## Sample object

```
               {
                 "updateId" : "e7377c24-d975-4e5b-b4f7-b1aeaa12b243",
                 "type" : "FormClosed",
                 "formId" : "Uuid_value",
                 "dialog" : {
                   "type" : "GROUP",
                   "id" : "Uuid_value",
                   "name" : "Aitu"
                 },
                 "sender" : {
                   "type" : "USER",
                   "id" : "Uuid_value",
                   "username" : "TestUserName",
                   "lastName" : "TestlastName",
                   "firstName" : "testfirstName"
                 }
               }
```
