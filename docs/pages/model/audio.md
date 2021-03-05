---
title: Audio
sidebar: home_sidebar
keywords:  Media, Audio
permalink: audio.html
toc: true
folder: Types
---

## Description

<p> This object represents metadata on a audio file.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| type  | true |String| Must be filled with "Audio" value |
| fileId  | true |String |  Uuid with backend file id of audio file|
| name  | true |String |  Backend name of audio file|
| mimeType  | true |String| M4A |
| size  | true |Int| File size, bytes |

## Sample object

```
{  
      "type":"Audio",
      "fileId":"Uuid value",
      "name":"test.m4a",
      "mimeType":"M4A",
      "size":1024
   }
```
