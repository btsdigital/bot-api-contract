---
title: FormMessageSent
sidebar: home_sidebar
keywords: update, form, form message sent
permalink: formmessagesent.html
toc: true
folder: Types
---

## Description

<p> This object represents update about message being sent to dialog by the use of quickbutton with <a href="https://btsdigital.github.io/bot-api-contract/quickbuttoncommand.html#types-of-quick_form_action">QUICK_FORM_ACTION type</a> (no message update is returned).
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| formId  | true |String| Backend ID of a form |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which form was submitted |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who submitted a form  |
| message  | true |String |  Text of a message  |
| messageId  | true |String |  Backend ID of a message  |
| additionalMetadata  | true | String| Additional metadata about sent message |
| type  | true | String | "FormMessageSent" value must be filled

## Sample object

```
               {
                           "updateId": "f8095479-d7a6-4122-b4e1-f670b058069f",
                           "formId": "",
                           "dialog": {
                               "id": "3a17518d-63d4-4d63-9c46-9c312588779a",
                               "type": "USER"
                           },
                           "sender": {
                               "id": "3a17518d-63d4-4d63-9c46-9c312588779a",
                               "type": "USER"
                           },
                           "message": "+77057252478",
                           "messageId": "556c0421-1299-11ea-9b4c-02af8e11935e",
                           "additionalMetadata": "{\"data_template_result\":\"77057252478\",\"private_data\":{\"value\":{\"phone_number\":\"+77077221478\",\"metadata\":\"XXX\"}},\"hidden_metadata\":\"\"}",
                           "type": "FormMessageSent"
                       }
```
