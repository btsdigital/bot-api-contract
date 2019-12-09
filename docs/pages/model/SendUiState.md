---
title: SendUiState
sidebar: home_sidebar
keywords: SendUiState, QiuckButtons, Form
permalink: SendUiState.html
toc: true
folder: Commands
---

![Commands](images/SendUiState.png "SendUiState")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

This method is for sending to dialog a UiState (data classes representing current UI configuration to interact with a user). UiState includes FormMessage which is a Form object representing collection of UI elements composing UI unit to interact with a user (see description in [FormBuilder docs](https://btsdigital.github.io/form-builder/))
<p> On succes empty response with http code 200 is returned.
</p>


## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "SendUiState" value |Type of request "SendUiState" |
| recipient  | true |  [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | For Peer type validation see type page| Peer-actor  to send UI state to |
| toDialog  | true |  [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | For Peer type validation see type page| Peer-dialog may contain Peer-actor (otherwise recipient=toDialog) to send UI state to |
| uiState | true |  [UiState](https://btsdigital.github.io/bot-api-contract/uistate.html) |For UiState type validation see type page  | UI state object describing UI configuration  |

## Sample request

```
{
 	 "commands": [{
 	 	"type": "SendUiState",
 	 	"recipient": {
 	 		"type": "USER",
 	 		"id": "Uuid_value"
 	 	},
 	 	"dialog": {
 	 		"type": "USER",
 	 		"id": "Uuid_value"
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
 		 			"metadata":"{\r\n   \"action\" : \"send_message\",\r\n   \"data_template\" : \"В начале было слово\"\r\n}"
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
 	 			
 	 		],
 	 		"replyKeyboard": [
 	 			{
 	 				"caption":"Reply button"
 	 			}
 	 		],
 	 		
 	 		
 	 		"formMessage": {
 	 			"jsonForm": "{\n  \"form\": {\n    \"id\": \"form_1\",\n    \"header\": {\n      \"type\": \"title\",\n      \"title\": \"Конвертация (sample)\",\n      \"options\": {\n        \"closeable\": true\n      }\n    },\n    \"content\": [\n      {\n        \"id\": \"sample_description\",\n        \"type\": \"text\",\n        \"title\": \"Здесь мы видим пример FormMessage. Это измененная форма из бота конвертера валют. Обратите внимание, что поле ввода Сумма имеет предустановленное значение text, а поле ввода Комментарий не имеет предустановленного значения text\"\n      },\n      {\n        \"id\": \"from\",\n        \"type\": \"catalog\",\n        \"title\": \"Из\",\n        \"placeholder\": \"placeholder\",\n        \"default_value\": {\n          \"id\": \"usd\",\n          \"title\": \"USD\",\n          \"description\": \"Доллар США\"\n        },\n        \"validations_rules\": [\n          {\n            \"type\": \"required\",\n            \"value\": \"true\",\n            \"error\": \"Поле не должно быть пустым\"\n          }\n        ],\n        \"catalog\": {\n          \"options\": {\n            \"title\": \"Выберите валюту\",\n            \"search_enabled\": false,\n            \"closeable\": true\n          },\n          \"items\": [\n            {\n              \"id\": \"usd\",\n              \"title\": \"USD\",\n              \"description\": \"Доллар США\"\n            },\n            {\n              \"id\": \"eur\",\n              \"title\": \"EUR\",\n              \"description\": \"Евро\"\n            },\n            {\n              \"id\": \"KZT\",\n              \"title\": \"KZT\",\n              \"description\": \"Казахстанский тенге\"\n            },\n            {\n              \"id\": \"RUB\",\n              \"title\": \"RUB\",\n              \"description\": \"Российский рубль\"\n            }\n          ]\n        }\n      },\n      {\n        \"id\": \"to\",\n        \"type\": \"catalog\",\n        \"title\": \"В\",\n        \"placeholder\": \"placeholder\",\n        \"default_value\": {\n          \"id\": \"KZT\",\n          \"title\": \"KZT\",\n          \"description\": \"Казахстанский тенге\"\n        },\n        \"validations_rules\": [\n          {\n            \"type\": \"required\",\n            \"value\": \"true\",\n            \"error\": \"Поле не должно быть пустым\"\n          }\n        ],\n        \"catalog\": {\n          \"options\": {\n            \"title\": \"Выберите валюту\",\n            \"search_enabled\": false,\n            \"closeable\": true\n          },\n          \"items\": [\n            {\n              \"id\": \"usd\",\n              \"title\": \"USD\",\n              \"description\": \"Доллар США\"\n            },\n            {\n              \"id\": \"eur\",\n              \"title\": \"EUR\",\n              \"description\": \"Евро\"\n            },\n            {\n              \"id\": \"KZT\",\n              \"title\": \"KZT\",\n              \"description\": \"Казахстанский тенге\"\n            },\n            {\n              \"id\": \"RUB\",\n              \"title\": \"RUB\",\n              \"description\": \"Российский рубль\"\n            }\n          ]\n        }\n      },\n      {\n        \"id\": \"sum\",\n        \"type\": \"input\",\n        \"title\": \"Сумма\",\n        \"text\": \"1000\",\n        \"placeholder\": \"Введите сумму\",\n        \"validations_rules\": [\n          {\n            \"type\": \"required\",\n            \"value\": \"true\",\n            \"error\": \"Поле не должно быть пустым\"\n          }\n        ],\n        \"options\": {\n          \"input_type\": \"number\"\n        }\n      },\n      {\n        \"id\": \"comment\",\n        \"type\": \"text_area\",\n        \"title\": \"Комментарий\",\n        \"placeholder\": \"Введите комментарий к операции\",\n        \"options\": {\n          \"max_length\": \"30\"\n        }\n      },\n      {\n        \"id\": \"submit\",\n        \"type\": \"submit\",\n        \"title\": \"РАССЧИТАТЬ\",\n        \"form_action\": {\n          \"action\": \"send_message\",\n          \"data_template\": \"{form_1.sum} {form_1.from} в {form_1.to} ({form_1.comment})\"\n        }\n      }\n    ]\n  }\n}"
 	 		}
 	 	}
 	 }]
 }
```

## Updates

<p>This method may asynchronously return following updates:
</p>

<ul>
<li> <a href="https://btsdigital.github.io/bot-api-contract/quickbuttonselected.html">QuickButtonSelected</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/formclosed.html">FormClosed</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/formsubmitted.html">FormSubmitted</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/formmessagesent.html">FormMessageSent</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/message.html">Message</a>;
</li>
</ul>

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
  <li>Sending UI stat to a channel isn't available if a service is not a channel subscriber and has no administrator/owner role assigned and permission to write;
  </li>
</ul>
</p>
<i>Service to group dialog
</i>
<p>
Sending UiState to a group dialog is not available. Function is not supported.
</p>
