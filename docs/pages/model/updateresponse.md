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
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/quickbuttonselected.html">QuickButtonSelected</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/inlinecommandselected.html">InlineCommandSelected</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/formsubmitted.html">FormSubmitted</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/formmessagesent.html">FormMessageSent</a>;</i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/formclosed.html">FormClosed</a>;</i>
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
