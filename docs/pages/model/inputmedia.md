---
title: InputMedia
sidebar: home_sidebar
keywords: InputMedia, media, video, pics, photo
permalink: inputmedia.html
toc: true
folder: Types
---

## Description

<p> Object represents a collection of metadata describing media file. Object is sent as a element of array in message.
</p>

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| fileId | true | String | - |Backend ID of uploaded file |
| name | true |  String |LocalID length should be <= 255  | Backend name of a file |
| mediaType  | true |  InputMediaType | -| Type of media file (DOCUMENT, IMAGE, VIDEO, AUDIO) |

## Sample object

```
{
 		"fileId":"08d5251b-0b86-11ea-9162-ee73f85aba69",
 		"name":"test",
 		"mediaType":"IMAGE"
 	}
```
