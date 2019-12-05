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
      "fileId":"361a63f1-abbd-4026-b4fb-96e1d70c5bd1",
      "mimeType":"JPEG",
      "name":"test_avatar.jpeg",
      "size":1024,
      "width":800,
      "height":600
   },
   "small":{  
      "type":"Image",
      "fileId":"382f03e6-12cd-4ef4-a88e-95a4ad05d350",
      "mimeType":"JPEG",
      "name":"test_avatar_small.jpeg",
      "size":1024,
      "width":100,
      "height":100
   }
}
```
