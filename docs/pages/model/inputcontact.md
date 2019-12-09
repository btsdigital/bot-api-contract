---
title: InputContact
sidebar: home_sidebar
keywords: InputContact
permalink: inputcontact.html
toc: true
folder: Types
---

## Description

Object represents contact data. 

<p>There are 2 types to represent registered  and unregistered users in messenger.
</p>

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| contactType | true | String | Must be filled with "InputRegisteredContact" value |Type of contact |
| userId | true | String | - |Uuid with backend ID of of a registered user |
| firstName | false |  String |-  | Registered user's first name |
| lastName  | false |  String | -| Registered user's last name |
| phoneNumber  | false |  String | -| Registered user's phone number |


| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| contactType | true | String | Must be filled with "InputUnregisteredContact" value |Type of contact |
| firstName | false |  String |-  | Unregistered user's first name |
| lastName  | false |  String | -| Unregistered user's last name |
| phoneNumber  | false |  String | -| Unregistered user's phone number |

## Sample object

```

		"inputMedia": {
                            "firstName": "Alexandr",
                            "lastName": "",
                            "phoneNumber": "7**********",
                            "contactType": "InputUnregisteredContact"
                        }
	
```
