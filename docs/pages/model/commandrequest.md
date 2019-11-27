---
title: CommandRequest
sidebar: home_sidebar
keywords: request, command, commands
permalink: commandrequest.html
toc: true
folder: Requests
---

## Description

<p> Object represents commands sent. CommandRequest composed of an array of commands.
</p>
<p> Each command has a type repsenting unique set of data.
</p>
<p> There are folowing types of commands available:
<ul>
<li> <i>SendMessage;</i>
</li>
<li> <i>EditMessage;</i>
</li>
<li> <i>DeleteMessage;</i>
</li>
<li> <i>SendContainerMessage;</i>
</li>
<li> <i>EditContainerMessage;</i>
</li>
<li> <i>SendContactMessage;</i>
</li>
<li> <i>ForwardMessage;</i>
</li>
<li> <i>SendUiState;</i>
</li>
<li> <i>KickFromGroup;</i>
</li>
<li> <i>ChangeGroupAvatar;</i>
</li>
<li> <i>DeleteGroupAvatar;</i>
</li>
<li> <i>ChangeGroupTitle;</i>
</li>
<li> <i>ChangeGroupDescription;</i>
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
         "groupId":"0fhf26f9-f181-11e9-66782c-f22cgH20c1jc",
         "description":"Make America great again"
      },
      {  
         "type":"ChangeGroupTitle",
         "groupId":"0fhf26f9-f181-11e9-66782c-f22cgH20c1jc",
         "title":"New title"
      }
   ]
}
```






