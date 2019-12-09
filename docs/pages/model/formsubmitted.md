---
title: FormSubmitted
sidebar: home_sidebar
keywords: update, form, form submitted
permalink: formsubmitted.html
toc: true
folder: Types
---

## Description

<p> This object represents update  about a form being submitted (or selected quickbutton with <a href="https://btsdigital.github.io/bot-api-contract/quickbuttoncommand.html#types-of-quick_form_action">QUICK_FORM_ACTION type</a>) in a dialog.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Uuid with backend ID of the update |
| formId  | true |String| Uuid with backend ID of a form |
| dialog  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  Dialog in which form was submitted |
| sender  | true |[Peer](https://btsdigital.github.io/bot-api-contract/peer.html) |  User who submitted a form  |
| metadata  | true | String | Metadata transitioned with a form  |
| additionalMetadata  | true | String| Additional metadata transitioned with a form |
| type  | true | String | "FormSubmitted" value must be filled

## Sample object

```
               {
                 "updateId" : "Uuid_value",
                 "type" : "FormSubmitted",
                 "formId" : "Uuid_value",
                 "dialog" : {
                   "type" : "USER",
                   "id" : "Uuid_value",
                   "username" : "TestUserName",
                   "lastName" : "TestlastName",
                   "firstName" : "TestfirstName"
                 },
                 "sender" : {
                   "type" : "USER",
                   "id" : "Uuid_value",
                   "username" : "TestUserName",
                   "lastName" : "TestlastName",
                   "firstName" : "TestfirstName"
                 },
                 "metadata" : "metadata_string",
                 "additionalMetadata" : "more_metadata_string"
               }
```
