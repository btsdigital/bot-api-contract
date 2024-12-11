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
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/message.html">Message</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/messageedited.html">MessageEdited</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/messageidassigned.html">MessageIdAssigned</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/messageforwardmetadata.html">MessageForwardMetadata</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/inlinecommandselected.html">InlineCommandSelected</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/invitedtogroup.html">InvitedToGroup</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/kickedfromgroup.html">KickedFromGroup</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/invitedtochannel.html">InvitedToChannel</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/kickedfromchannel.html">KickedFromChannel</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/newchannelsubscriber.html">NewChannelSubscriber</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/channeladminadded.html">ChannelAdminAdded</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/channeladmindeleted.html">ChannelAdminDeleted</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/channelpermissionsgranted.html">ChannelPermissionsGranted</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/channelpermissionsrevoked.html">ChannelPermissionsRevoked</a>;</i>
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
                    "updateId": "Uuid_value",
                    "messageId": "Uuid_value",
                    "sentAt": "2019-11-11T05:57:08.132Z",
                    "author": {
                        "id": "Uuid_value",
                        "username": "alehandro",
                        "lastName": "nanbar",
                        "firstName": "geeky geck",
                        "type": "USER"
                    },
                    "dialog": {
                        "id": "Uuid_value",
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
                    "updateId": "Uuid_value",
                    "messageId": "Uuid_value",
                    "sentAt": "2019-11-11T05:57:11.473Z",
                    "author": {
                        "id": "Uuid_value",
                        "username": "alehandro",
                        "lastName": "nanbar",
                        "firstName": "geeky geck",
                        "type": "USER"
                    },
                    "dialog": {
                        "id": "Uuid_value",
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
