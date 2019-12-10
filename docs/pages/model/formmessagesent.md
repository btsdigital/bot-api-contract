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
| updateId  | true |String| Uuid with backend ID of the update |
| formId  | true |String| Uuid with backend ID of a form |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which form was submitted |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who submitted a form  |
| message  | true |String |  Text of a message  |
| messageId  | true |String |  Uuid with backend ID of a message  |
| additionalMetadata  | true | String| Additional metadata about sent message |
| type  | true | String | "FormMessageSent" value must be filled

## Sample object

```
               {
                           "updateId": "Uuid_value",
                           "formId": "",
                           "dialog": {
                               "id": "Uuid_value",
                               "type": "USER"
                           },
                           "sender": {
                               "id": "Uuid_value",
                               "type": "USER"
                           },
                           "message": "+7**********",
                           "messageId": "Uuid_value",
                           "additionalMetadata": "{\"data_template_result\":\"7**********\",\"private_data\":{\"value\":{\"phone_number\":\"7**********\",\"metadata\":\"XXX\"}},\"hidden_metadata\":\"\"}",
                           "type": "FormMessageSent"
                       }
```
