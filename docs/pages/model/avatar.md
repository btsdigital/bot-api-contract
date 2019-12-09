---
title: Avatar
sidebar: home_sidebar
keywords: User, Media, Avatar
permalink: avatar.html
toc: true
folder: Types
---

## Description

<p> This object represents metadata on a avatar of user, group, service.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| full  | true |[Image](https://btsdigital.github.io/bot-api-contract/image.html)| Metadata on original image uploaded |
| small  | true |[Image](https://btsdigital.github.io/bot-api-contract/image.html) |  Metadata on refined for avatar image|



## Sample object

```
{  
   "full":{  
      "type":"Image",
      "fileId":"Uuid value",
      "mimeType":"JPEG",
      "name":"test_avatar.jpeg",
      "size":1024,
      "width":800,
      "height":600
   },
   "small":{  
      "type":"Image",
      "fileId":"Uuid value",
      "mimeType":"JPEG",
      "name":"test_avatar_small.jpeg",
      "size":1024,
      "width":100,
      "height":100
   }
}
```
