---
title: QuickButtonCommand
sidebar: home_sidebar
keywords: Quick, Button,Command, QuickButtonCommand 
permalink: quickbuttoncommand.html
toc: true
folder: Types
---

![Types](images/QuickButton.png "QuickButtonCommand")

## Desciprtion

<p> This object represents a type of button sent as a part of UIstate. QuickButton is powerful item of Ui that provides execution of various functions in messenger client.
</p>

## Structure

Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| caption | true | String | Caption length should be <= 32, recommended is 20 |Title of corresponding button displayed in messenger's UI|
| action* | true |  QuickButtonAction | -   | An object QuickButtonAction. Corresponds to a specific type of action for messenger client to perfom  |
| metadata | true |  String |Metadata length should be <= 255  | Json or any string to be returned to a service as a parameter in update QuickButtonSelected for processing  |

There are 2 enum types of action may be specified:

<ul>
<li>QUICK_REQUEST</li>
<li>QUICK_FORM_ACTION</li>
</ul>

## QUICK_REQUEST 

If specified messenger client would return to a service an update QuickButtonSelected with a metadata string after this button is pushed.

## QUICK_FORM_ACTION

If specified messenger client calls a specific function determined in a json string sent in a metadata variable after this button is pushed.
This type of action  may invoke native mobile device functions as well.</p>

## Types of QUICK_FORM_ACTION

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




<b>send_private_data</b>

<p>This type of action provides sending user's current phone number and geolocation data to a dialog.</p>

<b>send_message</b>

<p>This type of action provides sending metadata to a service and to a dialog.</p>

<b>submit_form</b>

<p>This type of action provides sending metadata to a service.</p>

<b>open_url</b>

<p>This type of action provides opening weblink specified in metadata in a native web browser.</p>

<b>share_data</b>

<p>This type of action provides sharing data specified in metadata in a native share content UI.</p>

<b>redirect_call</b>

<p>This type of action provides invoking native calling app along with adding a phone number specified in metadata.</p>

<b>open_peer</b>

<p>This type of action provides opening a dialog with a peer specified in metadata. 
If peer is a service and user already has a dialog with it then this dialog is to be opened, if user doesn't have a dialog with a service then service profile is to be opened.
Opening a group dialog is not supported.</p>

<p> Metadata composed of a json string, syntax is described in Form-Builder documentation. (add web-link) </p>

## Sample object
```
{
	 "commands": [{
	 	"type": "SendUiState",
	 	"recipient": {
	 		"type": "USER",
	 		"id": "ba017bae-e3e8-11e8-b418-7a609eaf8200"
	 	},
	 	"dialog": {
	 		"type": "USER",
	 		"id": "ba017bae-e3e8-11e8-b418-7a609eaf8200"
	 	},
	 	"uiState": {
	 		"canWriteText": true,
	 		"showCameraButton": true,
	 		"showShareContactButton": true,
	 		"showRecordAudioButton": true,
	 		"showGalleryButton": true,
	 		"showSpeechToTextButton": true,
	 		"quickButtonCommands": [
	 			{
		 			"caption":"Send your phone #",
		 			"action":"QUICK_FORM_ACTION",
		 			"metadata":"{\r\n   \"action\" : \"send_private_data\",\r\n   \"data_template\" : \"phone XXX\"\r\n}"
		 		},
	 			{
		 			"caption":"Empty Button",
		 			"action":"QUICK_REQUEST",
		 			"metadata":""
	 			}
	 		],
	 		"formMessage": {
	 			"jsonForm": "{\n  
	 			\"form\": {\n    
	 			\"id\": \"form_1\",\n    
	 			\"header\": {\n      
	 			\"type\": \"title\",\n      
	 			\"title\": \"Конвертация (sample)\",\n      
	 			\"options\": {\n        
	 			\"closeable\": true\n      }\n    },\n    \"content\": [\n      {\n        \"id\": \"sample_description\",\n        \"type\": \"text\",\n        \"title\": \"Здесь мы видим пример FormMessage. Это измененная форма из бота конвертера валют. Обратите внимание, что поле ввода Сумма имеет предустановленное значение text, а поле ввода Комментарий не имеет предустановленного значения text\"\n      },\n      {\n        \"id\": \"from\",\n        \"type\": \"catalog\",\n        \"title\": \"Из\",\n        \"placeholder\": \"placeholder\",\n        \"default_value\": {\n          \"id\": \"usd\",\n          \"title\": \"USD\",\n          \"description\": \"Доллар США\"\n        },\n        \"validations_rules\": [\n          {\n            \"type\": \"required\",\n            \"value\": \"true\",\n            \"error\": \"Поле не должно быть пустым\"\n          }\n        ],\n        \"catalog\": {\n          \"options\": {\n            \"title\": \"Выберите валюту\",\n            \"search_enabled\": false,\n            \"closeable\": true\n          },\n          \"items\": [\n            {\n              \"id\": \"usd\",\n              \"title\": \"USD\",\n              \"description\": \"Доллар США\"\n            },\n            {\n              \"id\": \"eur\",\n              \"title\": \"EUR\",\n              \"description\": \"Евро\"\n            },\n            {\n              \"id\": \"KZT\",\n              \"title\": \"KZT\",\n              \"description\": \"Казахстанский тенге\"\n            },\n            {\n              \"id\": \"RUB\",\n              \"title\": \"RUB\",\n              \"description\": \"Российский рубль\"\n            }\n          ]\n        }\n      },\n      {\n        \"id\": \"to\",\n        \"type\": \"catalog\",\n        \"title\": \"В\",\n        \"placeholder\": \"placeholder\",\n        \"default_value\": {\n          \"id\": \"KZT\",\n          \"title\": \"KZT\",\n          \"description\": \"Казахстанский тенге\"\n        },\n        \"validations_rules\": [\n          {\n            \"type\": \"required\",\n            \"value\": \"true\",\n            \"error\": \"Поле не должно быть пустым\"\n          }\n        ],\n        \"catalog\": {\n          \"options\": {\n            \"title\": \"Выберите валюту\",\n            \"search_enabled\": false,\n            \"closeable\": true\n          },\n          \"items\": [\n            {\n              \"id\": \"usd\",\n              \"title\": \"USD\",\n              \"description\": \"Доллар США\"\n            },\n            {\n              \"id\": \"eur\",\n              \"title\": \"EUR\",\n              \"description\": \"Евро\"\n            },\n            {\n              \"id\": \"KZT\",\n              \"title\": \"KZT\",\n              \"description\": \"Казахстанский тенге\"\n            },\n            {\n              \"id\": \"RUB\",\n              \"title\": \"RUB\",\n              \"description\": \"Российский рубль\"\n            }\n          ]\n        }\n      },\n      {\n        \"id\": \"sum\",\n        \"type\": \"input\",\n        \"title\": \"Сумма\",\n        \"text\": \"1000\",\n        \"placeholder\": \"Введите сумму\",\n        \"validations_rules\": [\n          {\n            \"type\": \"required\",\n            \"value\": \"true\",\n            \"error\": \"Поле не должно быть пустым\"\n          }\n        ],\n        \"options\": {\n          \"input_type\": \"number\"\n        }\n      },\n      {\n        \"id\": \"comment\",\n        \"type\": \"text_area\",\n        \"title\": \"Комментарий\",\n        \"placeholder\": \"Введите комментарий к операции\",\n        \"options\": {\n          \"max_length\": \"30\"\n        }\n      },\n      {\n        \"id\": \"submit\",\n        \"type\": \"submit\",\n        \"title\": \"РАССЧИТАТЬ\",\n        \"form_action\": {\n          \"action\": \"send_message\",\n          \"data_template\": \"{form_1.sum} {form_1.from} в {form_1.to} ({form_1.comment})\"\n        }\n      }\n    ]\n  }\n}"
	 		}
	 	}
	 }]
}
```