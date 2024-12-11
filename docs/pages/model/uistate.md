---
title: UiState
sidebar: home_sidebar
keywords: UiState
permalink: uistate.html
toc: true
folder: Types
---

## Description

<p> Object represents a state of current UI between a service and a user.
</p>

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| canWriteText | true | Boolean | - |Defines whether input text field is available for a user or not in dialog interface |
| showCameraButton  | true |  Boolean | -| Defines whether camera function is available for a user or not in dialog interface  |
| showRecordAudioButton | true |  Boolean |-  | Defines whether voice recording is available for a user or not in dialog interface  |
| showGalleryButton | true |  Boolean | -| Defines whether picking a media from gallery is available for a user or not in dialog interface |

## Sample object

```

		"uiState": {
         		"canWriteText": false,
         		"showCameraButton": false,
         		"showRecordAudioButton": false,
         		"showGalleryButton": false
         	}
	
```
