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
                        "id" : "Uuid_value",
                        "firstName" : "Alex",
                        "lastName" : "Key",
                        "phoneNumber" : "+7**********",
                        "userName" : "@test",
                        "avatar" : {
                          "full" : {
                            "type" : "Image",
                            "fileId" : "Uuid_value",
                            "mimeType" : "JPEG",
                            "name" : "test_avatar.jpeg",
                            "size" : 1024,
                            "width" : 800,
                            "height" : 600
                          },
                          "small" : {
                            "type" : "Image",
                            "fileId" : "Uuid_value",
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
      "phoneNumber":"+7**********"
   }
```
