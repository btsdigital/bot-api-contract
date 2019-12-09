---
title: Video
sidebar: home_sidebar
keywords:  Media, Video
permalink: video.html
toc: true
folder: Types
---

## Description

<p> This object represents metadata on a video file.
</p>


## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| type  | true |String| Must be filled with "Video" value |
| fileId  | true |String |  Uuid with backend file id of video file|
| name  | true |String |  Backend name of video file|
| mimeType  | true |String| [mimeType](https://www.freeformatter.com/mime-types-list.html) of video file |
| size  | true |Int| File size, bytes |
| width  | true |Int |  Video resolution width, px |
| height  | true |Int| Video resolution height, px |
| duration  | true |Int| Video duration, seconds |




## Sample object

```
{  
      "type":"Video",
      "fileId":"Uuid_value",
      "name":"test.mp4",
      "mimeType":"MP4",
      "size":1024,
      "width":800,
      "height":600,
      "duration": 35433
   }
```
