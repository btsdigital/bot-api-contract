---
title: Document
sidebar: home_sidebar
keywords:  Media, Document
permalink: document.html
toc: true
folder: Types
---

## Description

<p> This object represents metadata on a document.
</p>

## Structure

| Variable  | Obligative  |Type| Description
|---|:---:|---|---|
| type  | true |String| Must be filled with "Document" value |
| fileId  | true |String |  Uuid with backend file id of document|
| name  | true |String |  Backend name of document|
| mimeType  | true |String| [mimeType](https://www.freeformatter.com/mime-types-list.html) of video file |
| size  | true |Int| File size, bytes |





## Sample object

```
{  
      "type":"Document",
      "fileId":"Uuid_value",
      "name":"test.mob",
      "mimeType":"mob",
      "size":1024    
   }
```
