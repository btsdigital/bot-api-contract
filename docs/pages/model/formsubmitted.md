---
title: FormSubmitted
sidebar: home_sidebar
keywords: update, form, form submitted
permalink: formsubmitted.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents update  about a form being submitted in a dialog.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| updateId  | true |String| Backend ID of the update |
| formId  | true |String| Backend ID of a form |
| dialog  | true |Peer |  Dialog in which form was submitted |
| sender  | true |Peer |  User who submitted a form  |
| metadata  | true | String | Metadata transitioned with a form  |
| additionalMetadata  | true | String| Additional metadata transitioned with a form |
| type  | true | String | "FormSubmitted" value must be filled

## Sample object

```
               {
                 "updateId" : "235789af-9f48-448b-b711-432f18f1d6b1",
                 "type" : "FormSubmitted",
                 "formId" : "56d889a7-c40b-4fbc-be1b-2a4fbffe1558",
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
                 "metadata" : "metadata_string",
                 "additionalMetadata" : "more_metadata_string"
               }
```