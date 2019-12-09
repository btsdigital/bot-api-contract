---
title: InlineCommand
sidebar: home_sidebar
keywords: inlinecommand
permalink: inlinecommand.html
toc: true
folder: Types
---

![Types](images/inlinecommand.png "InlineCommand")

## Description

<p> This object represents a type of button sent in a message, it has metadata parameter returned to a service when a button is pushed.
</p>

## Structure

 Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| caption | true | String | Caption length should be <= 32, recommended is 20 |Title of corresponding button displayed in messenger's UI|
| metadata | true |  String |Metadata length should be <= 255  | Json or any string to be returned to a bot as a parameter in update InlineCommandSelected for processing  |

## Sample object

```

		"InlineCommand": {
			"caption": "Get stats",
			"metadata": "commandgetstats::ha018bae-t6e7-11e0-a458-7a629eaf8200"
		}
	
```


