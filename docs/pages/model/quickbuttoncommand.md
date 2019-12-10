---
title: QuickButtonCommand
sidebar: home_sidebar
keywords: Quick, Button,Command, QuickButtonCommand, metadata, form action, action
permalink: quickbuttoncommand.html
toc: true
folder: Types
---

![Types](images/QuickButton.png "QuickButtonCommand")

## Description

This object represents a type of button sent as a part of [UIstate](https://btsdigital.github.io/bot-api-contract/uistate.html). QuickButton is powerful item of Ui that provides execution of various functions in messenger client with the use of form action mechanism.


## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| caption | true | String | Caption length should be <= 32, recommended is 20 |Title of corresponding button displayed in messenger's UI |
| action | true | enum | Specific type of item must be set |Types of QuickButtonAction. Corresponds to a specific type of action for messenger client to perform  |
| metadata | true | String | Metadata length should be <= 255  |Json or any string to be returned to a service as a parameter in update QuickButtonSelected for processing and/or data used by client to perform specific action |

There are 2 main enum types of action:

<ul>
<li>QUICK_REQUEST</li>
<li>QUICK_FORM_ACTION</li>
</ul>

## QUICK_REQUEST 

For this messenger client would return to a service an update QuickButtonSelected with a metadata string after this button is pushed.

## QUICK_FORM_ACTION

For this messenger client calls a specific function determined by json object sent in metadata  after this button is pushed (contents of json object in metadata must be shielded).
This type of action  may invoke native mobile device functions as well.

Template of json object for metadata:

```

		"metadata"= "{
            "action":"QUICK_FORM_ACTION*",
            "data_template":"data template*"
         }"
	
```

## Types of QUICK_FORM_ACTION*

<p> There are folowing types of QUICK_FORM_ACTION:</p>
<ul>
<li>send_message</li>
<li>submit_form</li>
<li>open_url</li>
<li>share_data</li>
<li>open_peer</li>
<li>redirect_call</li>
<li>send_private_data</li>
</ul>



<b>send_message
</b>

<p>This type of action provides sending text or content in a form (included in UiState) to a dialog.
</p>

For this action service gets  [FormMessageSent](https://btsdigital.github.io/bot-api-contract/formmessagesent.html) update that means that through the use of this action a new message was sent to dialog (no message update is sent).

<b>submit_form
</b>

<p>This type of action provides sending metadata to a service without sending a message to a dialog.
</p>

For this action service gets  [FormSubmitted](https://btsdigital.github.io/bot-api-contract/formsubmitted.html) update that means that user pushed this button.

<b>open_url
</b>

<p>This type of action provides opening weblink/deep link specified in metadata in a native web browser or app.
</p>

For this action service gets  [FormSubmitted](https://btsdigital.github.io/bot-api-contract/formsubmitted.html) update that means that user pushed this button.

<b>share_data
</b>

<p>This type of action provides sharing text specified in metadata by opening list of apps to use for sharing.
</p>

For this action service gets  [FormSubmitted](https://btsdigital.github.io/bot-api-contract/formsubmitted.html) update that means that user pushed this button.

<b>open_peer</b>

<p>This type of action provides opening a dialog with a peer specified in metadata or opening it's profile.
</p>

For this action service gets  [FormSubmitted](https://btsdigital.github.io/bot-api-contract/formsubmitted.html) update that means that user pushed this button.

If peer is a service and user already has a dialog with it then this dialog is to be opened, if user doesn't have a dialog with a service then client opens this service's profile.
<p>If peer is a user client opens a user profile.
</p>
Opening a group dialog or channel is not supported.

<b>redirect_call</b>

<p>This type of action provides invoking native calling app with a phone number filled and ready to make a phone call.
</p>

For this action service gets  [FormSubmitted](https://btsdigital.github.io/bot-api-contract/formsubmitted.html) update that means that user pushed this button.

<b>send_private_data
</b>

<p>This type of action provides sending user's phone number registered for account to a dialog.
</p>

For this action service gets  [FormMessageSent](https://btsdigital.github.io/bot-api-contract/formmessagesent.html) (for updated services) and [FormSubmitted](https://btsdigital.github.io/bot-api-contract/formmessagesent.html) (for old services) updates that means that through the use of this action a new message was sent to dialog (no message update is sent). 

<p> Every form action needs specific data template to be sent in json object.
</p>

| Action  |  Data template | IOS support|Android support| Description
|---|:---:|---|---|---|
| send_message | {form.id.content[n].id}/plain text | + | + | if specified {form.id.content[n].id}, client sends to dialog content of  field user filled in a form, if plain text specified it is sent to dialog as it is   |
| submit_form | {form.id.content[n].id}/plain text | + | + | if specified {form.id.content[n].id}, client sends to service content of  field user filled in a form, if plain text specified it is sent to service as it is   |
| close_form | - | + | + | Client closes a form   |
| open_url | URL/Deeplink | + | + | Client opens web-page by a default web-browser or mobile app |
| share_data | Plain text | + | + | Client opens dialog with a list of installed apps to choose one for sharing a text string|
| open_peer | @username | + | + | Client opens dialog with user/service or service's profile  |
| send_private_data | "phone XXX" | + | + | Client asks user for approval if positive it sends user's phone number to dialog |
| redirect_call |+phone_number*  | + | + |Client opens native calling app with specified phone number pasted   |

<p> * number from 0 to 9, max 15 symbols
</p>

## Sample object
```
"quickButtonCommands": [
 	 			{
 		 			"caption":"Send your phone #",
 		 			"action":"QUICK_FORM_ACTION",
 		 			"metadata":"{\r\n   \"action\" : \"send_private_data\",\r\n   \"data_template\" : \"phone XXX\"\r\n}"
 		 		},
 	 			{
 		 			"caption":"Empty Button",
 		 			"action":"QUICK_REQUEST",
 		 			"metadata":"test"
 	 			},
 	 			{
 		 			"caption":"Go to link",
 		 			"action":"QUICK_FORM_ACTION",
 		 			"metadata":"{\r\n   \"action\" : \"open_url\",\r\n   \"data_template\" : \"https://www.youtube.com/watch?v=XNJTVLFotr0\"\r\n}"
 	 			},
 	 			{
 		 			"caption":"Send message",
 		 			"action":"QUICK_FORM_ACTION",
 		 			"metadata":"{\r\n   \"action\" : \"send_message\",\r\n   \"data_template\" : \"Yes, you can!\"\r\n}"
 	 			},
 	 			{
 		 			"caption":"Share text",
 		 			"action":"QUICK_FORM_ACTION",
 		 			"metadata":"{\r\n   \"action\" : \"share_data\",\r\n   \"data_template\" : \"Share me\"\r\n}"
 	 			},
 	 			{
 		 			"caption":"Open peer",
 		 			"action":"QUICK_FORM_ACTION",
 		 			"metadata":"{\r\n   \"action\" : \"open_peer\",\r\n   \"data_template\" : \"@MasterService\"\r\n}"
 	 			},
 	 			{
 		 			"caption":"Call me maybe",
 		 			"action":"QUICK_FORM_ACTION",
 		 			"metadata":"{\r\n   \"action\" : \"redirect_call\",\r\n   \"data_template\" : \"+7**********\"\r\n}"
 	 			}
 	 			
 	 		]
```
