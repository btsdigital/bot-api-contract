---
title: FormMessageSent
sidebar: home_sidebar
keywords: update, form, form message sent
permalink: formmessagesent.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents update  about form being submitted with a data on message being sent to dialog by messenger's backend after a user submitted a form.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| formId  | true |String| Backend ID of a form |
| dialog  | true |Peer |  Dialog in which form was submitted |
| sender  | true |Peer |  User who submitted a form  |
| message  | true |String |  Text of a message  |
| messageId  | true |String |  Backend ID of a message  |
| metadata  | true | String | Metadata transitioned with a form  |
| additionalMetadata  | true | String| Additional metadata transitioned with a form |
| type  | true | String | "FormMessageSent" value must be filled

## Sample object

```
               {
                 "updateId" : "f8095479-d7a6-4122-b4e1-f670b058069f",
                 "type" : "FormMessageSent",
                 "formId" : "b5d11ada-c65e-4745-92bc-ad411d9d20f3",
                 "dialog" : {
                   "type" : "USER",
                   "id" : "3a17518d-63d4-4d63-9c46-9c312588779a",
                   "username" : "TestUserName",
                   "lastName" : "TestlastName",
                   "firstName" : "TestfirstName"
                 },
                 "sender" : {
                   "type" : "USER",
                   "id" : "3a17518d-63d4-4d63-9c46-9c312588779a",
                   "username" : "TestUserName",
                   "lastName" : "TestlastName",
                   "firstName" : "TestfirstName"
                 },
                 "message" : "test_message",
                 "messageId" : "c55330fe-9d43-4f4f-b068-f6d50c0750c8",
                 "additionalMetadata" : "some_metadata"
               }
```