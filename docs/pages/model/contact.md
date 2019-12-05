---
title: Contact
sidebar: home_sidebar
keywords: User, Media, 
permalink: contact.html
toc: true
folder: Types
---

## Description

<p> This object represents data on contact. Contacts can be represented by registered and unregistered users in messenger. 
</p>

## Structure

<i>RegisteredContact
</i>

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "RegisteredContact" value |Type of contact |
| user | true | [User](https://btsdigital.github.io/bot-api-contract/user.html)) |See User page for validation|User object |


<i>UnregisteredContact
</i>

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "UnregisteredContact" value |Type of contact |
| firstName | false |  String |-  | Unregistered user's first name |
| lastName  | false |  String | -| Unregistered user's last name |
| phoneNumber  | false |  String | -| Unregistered user's phone number |




## Sample object for RegisteredContact

```
{  
      "type":"RegisteredContact",
      "user": {
                        "id" : "f1a6b389-40e2-4318-adbc-3b38c57bf1f4",
                        "firstName" : "Alex",
                        "lastName" : "Key",
                        "phoneNumber" : "+77077661234",
                        "userName" : "@test",
                        "avatar" : {
                          "full" : {
                            "type" : "Image",
                            "fileId" : "361a63f1-abbd-4026-b4fb-96e1d70c5bd1",
                            "mimeType" : "JPEG",
                            "name" : "test_avatar.jpeg",
                            "size" : 1024,
                            "width" : 800,
                            "height" : 600
                          },
                          "small" : {
                            "type" : "Image",
                            "fileId" : "382f03e6-12cd-4ef4-a88e-95a4ad05d350",
                            "mimeType" : "JPEG",
                            "name" : "test_avatar_small.jpeg",
                            "size" : 1024,
                            "width" : 100,
                            "height" : 100
                          }
      
   }
```

## Sample object for UnregisteredContact

```
{  
      "type":"UnregisteredContact",
      "firstName": "Tom",
      "phoneNumber":"+77018981221"
   }
```
