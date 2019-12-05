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
| id  | true |String| Backend ID of a user |
| firstName  | false |String |  User's first name |
| lastName  | false |String|  User's first name |
| phoneNumber  | false | |  User's phone number  |
| userName  | true | User's first name |User's username |
| avatar  | false | [Avatar](https://btsdigital.github.io/bot-api-contract/avatar.html)| Avatar object  |


## Sample object

```
        {
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
        }

```
