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
|---|:---:|---|---|--------------------------------------------------------------------------------------------|
| fileId | true | String | - | Uuid with backend ID of uploaded file                                                      |
| name | true |  String |LocalID length should be <= 255  | Backend name of a file                                                                     |
| mediaType  | true |  string | -| Type of media file must be set: "DOCUMENT","IMAGE","VIDEO","AUDIO","MUSIC". |

## Sample object

```
    {
 		"fileId":"Uuid_value",
 		"name":"test",
 		"mediaType":"IMAGE"
 	}
```
