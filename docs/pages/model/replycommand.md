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
   
<p> This object represents a type of button sent as a part of UIstate. Text of a caption is sent to a dialog as new message from user when he pushes this button.
</p>
    
## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| caption | true | String | Caption length should be <= 32, recommended is 20 |Title of a button displayed in messenger's UI, when button is pushed by a user this text is sent to a dialog as a new message from user |

## Sample object

```
   
   		"ReplyCommand": {
            		"caption": "PushMe",
            	}
   	
```
