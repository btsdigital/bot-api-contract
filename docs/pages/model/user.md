---
title: User
sidebar: home_sidebar
keywords: User, Media, Contact
permalink: user.html
toc: true
folder: Types
---

## Description

<p> This object represents data on a user of a messenger.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| id  | true |String| Uuid with backend ID of a user |
| firstName  | false |String |  User's first name |
| lastName  | false |String|  User's first name |
| phoneNumber  | false | |  User's phone number  |
| userName  | true | User's first name |User's username |
| avatar  | false | [Avatar](https://btsdigital.github.io/bot-api-contract/avatar.html)| Avatar object  |


## Sample object

```
        {
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
        }

```
