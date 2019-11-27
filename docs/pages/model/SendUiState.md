---
title: SendUiState
sidebar: home_sidebar
keywords: SendUiState
permalink: SendUiState.html
toc: true
folder: Commands
---

![Commands](images/SendUiState.png "SendUiState")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

<p> This method is for sending to dialog a data massive representing current UI configuration to interact with a user.
</p>
<p> <p> On succes empty response with http code 200 is returned.
    </p>
</p>

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "SendUiState" value |Type of request "SendUiState" |
| recipient  | true |  Peer | For Peer type validation see type page| Peer-actor  to send UI state to |
| toDialog  | true |  Peer | For Peer type validation see type page| Peer-dialog may contain Peer-actor (otherwise recipient=toDialog) to send UI state to |
| uiState | true |  UiState |For UiState type validation see type page  | UI state object describing UI configuration  |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"SendUiState",
         "recipient":{  
            "type":"USER",
            "id":"ba017bae-e3e8-11e8-b418-7a609eaf8200"
         },
         "dialog":{  
            "type":"USER",
            "id":"ga018bae-e3e7-11e8-a458-7a609eaf8200"
         },
         "uiState":{  
            "canWriteText":false,
            "showCameraButton":false,
            "showShareContactButton":false,
            "showRecordAudioButton":false,
            "showGalleryButton":false,
            "showSpeechToTextButton":false
         }
      }
   ]
}
```

## Possible business exceptions

<i>Service to service dialog 
</i>
<p>Sending UI state from service to service is not available, function is not supported.
</p>
<i>Service to user dialog
</i>
<p>
<ul>
<li>Sending UI state to a user who banned a service ( put a service into a black list) is not available;
</li>
<li>Sending UI state to a user isn't available if a dialog wasn't found (deleted/ID error);
</li>
<li> Sending UI state to a user isn't available if Peer type and Peer ID specified in request doesn't match;
</li>
<li> Sending UI state to a user isn't available if recepient doesn't match dialog.
</li>
</ul>
</p>
<i>Service to channel dialog
</i>
<p>
<ul>
  <li> Sending UI state to a channel isn't available if a channel wasn't found (deleted/ID error) or channel was banned;
  </li>
  <li>Sending UI stat to a channel isn't available if a service is not a channel subscriber and has no administrator/owner role assigned and WRITE permission assigned;
  </li>
</ul>
</p>
<i>Service to group dialog
</i>
<p>
Sending UiState to a group dialog is not available. Function is not supported.
</p>
