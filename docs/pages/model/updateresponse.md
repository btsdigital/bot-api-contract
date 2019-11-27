---
title: UpdateResponse
sidebar: home_sidebar
keywords: Update, response, type
permalink: updateresponse.html
toc: true
folder: Updates
---

## Description

<p> Object represents update recieved. UpdateResponse composed of an array of updates.
</p>
<p> Each update has a type repsenting unique set of data.
</p>
<p> There are folowing types of updates available:
<ul>
<li> <i>Message;</i>
</li>
<li> <i>MessageEdited;</i>
</li>
<li> <i>MessageIdAssigned;</i>
</li>
<li> <i>MessageForwardMetadata;</i>
</li>
<li> <i>QuickButtonSelected;</i>
</li>
<li> <i>InlineCommandSelected;</i>
</li>
<li> <i>FormSubmitted;</i>
</li>
<li> <i>FormMessageSent;</i>
</li>
<li> <i>FormClosed;</i>
</li>
<li> <i>InvitedToGroup;</i>
</li>
<li> <i>KickedFromGroup;</i>
</li>
<li> <i>InvitedToChannel;</i>
</li>
<li> <i>KickedFromChannel;</i>
</li>
<li> <i>NewChannelSubscriber;</i>
</li>
<li> <i>ChannelAdminAdded;</i>
</li>
<li> <i>ChannelAdminDeleted;</i>
</li>
<li> <i>ChannelPermissionsGranted;</i>
</li>
<li> <i>ChannelPermissionsRevoked;</i>
</li>
</ul>
</p>

## Structure

| Variable  | Obligative  | Description
|---|:---:|---|
| updates  | true |  String composed of json array of updates  |

## Sample object

```

		{
            "updates": [
                {
                    "updateId": "188383d0-0448-11ea-ab51-7b78bf81d89e",
                    "messageId": "18600f06-0448-11ea-ab3f-d6e38872fb41",
                    "sentAt": "2019-11-11T05:57:08.132Z",
                    "author": {
                        "id": "ba017bae-e3e8-11e8-b418-7a609eaf8200",
                        "username": "alehandro",
                        "lastName": "nanbar",
                        "firstName": "geeky geck",
                        "type": "USER"
                    },
                    "dialog": {
                        "id": "0fab26f9-y181-11e9-882c-f22cfe20c1ac",
                        "type": "USER"
                    },
                    "content": "test1",
                    "forwardMetadata": null,
                    "media": [],
                    "likeCount": null,
                    "repostCount": null,
                    "viewCount": null,
                    "channelPostAuthor": null,
                    "type": "Message"
                },
                {
                    "updateId": "18600f06-0448-11ea-ab3f-d6e38872fb41",
                    "messageId": "1a5dd0fd-0448-11ea-a21b-7a609eaf8200",
                    "sentAt": "2019-11-11T05:57:11.473Z",
                    "author": {
                        "id": "ga018bae-e3e7-11e8-a458-7a609eaf8200",
                        "username": "alehandro",
                        "lastName": "nanbar",
                        "firstName": "geeky geck",
                        "type": "USER"
                    },
                    "dialog": {
                        "id": "0fab26f9-y181-11e9-882c-f22cfe20c1ac",
                        "type": "USER"
                    },
                    "content": "test2",
                    "forwardMetadata": null,
                    "media": [],
                    "likeCount": null,
                    "repostCount": null,
                    "viewCount": null,
                    "channelPostAuthor": null,
                    "type": "Message"
                }
            ]
        }
	
```
