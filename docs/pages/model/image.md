---
title: Image
sidebar: home_sidebar
keywords: User, Media, Avatar, Image
permalink: image.html
toc: true
folder: Types
---

## Description

<p> This object represents metadata on a image.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| type  | true |String| Must be filled with "Image" value |
| fileId  | true |String |  Uuid with backend file id of an image|
| mimeType  | true |String| [mimeType](https://www.freeformatter.com/mime-types-list.html) of image |
| name  | true |String |  Backend name of an image|
| size  | true |Int| File size, bytes |
| width  | true |Int |  Image width, px |
| height  | true |Int| Image height, px |




## Sample object

```
{  
      "type":"Image",
      "fileId":"361a63f1-abbd-4026-b4fb-96e1d70c5bd1",
      "mimeType":"JPEG",
      "name":"test_avatar.jpeg",
      "size":1024,
      "width":800,
      "height":600
   }
```
