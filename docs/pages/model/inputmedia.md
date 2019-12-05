---
title: InputMedia
sidebar: home_sidebar
keywords: InputMedia, media, video, pics, photo
permalink: inputmedia.html
toc: true
folder: Types
---

## Description

<p> Object represents a collection of metadata for media file. 
</p>

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| fileId | true | String | - |Backend ID of uploaded file |
| name | true |  String |LocalID length should be <= 255  | Backend name of a file |
| mediaType  | true |  string | -| Type of media file must be set: "DOCUMENT","IMAGE","VIDEO","AUDIO".|

## Sample object

```
    {
 		"fileId":"08d5251b-0b86-11ea-9162-ee73f85aba69",
 		"name":"test",
 		"mediaType":"IMAGE"
 	}
```
