---
title: CommandRequest
sidebar: home_sidebar
keywords: request, command, commands
permalink: commandrequest.html
toc: true
folder: Requests
---

## Description

<p> Object represents commands to be sent. CommandRequest composed of an array of commands.
</p>
<p> Each command has a type repsenting unique set of data.
</p>
<p> There are folowing types of commands available:
<ul>
<li> <i> <a href="https://btsdigital.github.io/bot-api-contract/SendMessage.html">SendMessage</a> ;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/EditMessage.html">EditMessage</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/DeleteMessage.html">DeleteMessage</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/ForwardMessage.html">ForwardMessage</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/KickFromGroup.html">KickFromGroup</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/ChangeGroupAvatar.html">ChangeGroupAvatar</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/DeleteGroupAvatar.html">DeleteGroupAvatar</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/ChangeGroupTitle.html">ChangeGroupTitle</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/ChangeGroupDescription.html">ChangeGroupDescription</a>;</i>
</li>
</ul>
</p>

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| commands | true | List of Command objects | Maximum commands length is 10 |Array of command objects |

## Sample request

```
{  
   "commands":[  
      {  
         "type":"ChangeGroupDescription",
         "groupId":"Uuid_value",
         "description":"New description"
      },
      {  
         "type":"ChangeGroupTitle",
         "groupId":"Uuid_value",
         "title":"New title"
      }
   ]
}
```






