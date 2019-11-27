---
title: UiState
sidebar: home_sidebar
keywords: UiState
permalink: uistate.html
toc: true
folder: Types
---

![Types](images/UiState.png "UiState")

## Description

<p> Object represents a state of current UI between a service and a user.
</p>

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| canWriteText | true | Boolean | - |Defines whether input text field is available for a user or not in dialog interface |
| showCameraButton  | true |  Boolean | -| Defines whether camera function is available for a user or not in dialog interface  |
| showShareContactButton  | true |  Boolean | -| Defines whether contact sharing is available for a user or not in dialog interface |
| showRecordAudioButton | true |  Boolean |-  | Defines whether voice recording is available for a user or not in dialog interface  |
| showGalleryButton | true |  Boolean | -| Defines whether picking a media from gallery is available for a user or not in dialog interface |
| showSpeechToTextButton  | true |  Boolean | -| Defines whether speech-to-text function is available for a user or not in dialog interface |
| replyKeyboard | false |  ReplyCommand |For ReplyCommand type validation see type page  | A list composed of ReplyCommand objects  |
| quickButtonCommands | false |  QuickButtonCommand |Size of quickButtonCommands should be <=25. For QuickButtonCommand type validation see type page  | A list composed of QuickButtonCommand objects  |
| formMessage | true |  FormMessage |For FormMessage type validation see FormBuilder docs (web=link)  | FormMessage object  |

## Sample object

```

		"uiState": {
         		"canWriteText": false,
         		"showCameraButton": false,
         		"showShareContactButton": false,
         		"showRecordAudioButton": false,
         		"showGalleryButton": false,
         		"showSpeechToTextButton": false
         	}
	
```
