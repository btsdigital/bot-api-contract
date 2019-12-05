---
title: ReplyCommand
sidebar: home_sidebar
keywords: ReplyCommand
permalink: replycommand.html
toc: true
folder: Types
---
   
![Types](images/replycommand.png "replycommand")
   
## Description
   
This object represents a type of button sent as a part of [UiState](https://btsdigital.github.io/bot-api-contract/uistate.html). 
Text of a caption is sent to a dialog as new [message](https://btsdigital.github.io/bot-api-contract/message.html) from user when he pushes this button.

    
## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| caption | true | String | Caption length should be <= 32, recommended is 20 |Title of a button displayed in messenger's UI, when button is pushed by a user this text is sent to a dialog as a new message from user |

## Sample object

```
   "replyKeyboard": [
   	 			{
   	 				"caption":"Reply button"
   	 			}
   	 		]
```
