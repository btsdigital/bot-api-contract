---
title: Endpoints
sidebar: home_sidebar
keywords: endpoint, send request, send command
permalink: endpoints.html
toc: true
folder: Requests
---

## Description

<p> All requests should be sent to proper endpoints.
</p>
<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/updates/" </b> is used for the following methods:

<ul>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/retrieveUpdate.html">retrieveUpdate</a>;</i>
</li>
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

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/upload/" </b> is used for the <i><a href="">handleUploadFiles</a></i> method.
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/download/" </b> is used for the <i><a href="">handleDownloadFile</a></i> method.
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/getMe/" </b> is used for the <i><a href="">getMe</a></i> method.
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/avatar/" </b> is used for the <i><a href="">uploadAvatar</a></i> method.
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/avatar/{fileId}/" </b> is used for the <i><a href="">downloadAvatar</a></i> method. It's neccesarry to put file Id of avatar instead of  {fileId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/channels/{channelId}/" </b> is used for the <i><a href="">getChannelInfo</a></i> method. It's neccesarry to put peer Id of a channel instead of  {channelId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/channels/{channelId}/admins/" </b> is used for the <i><a href="">getChannelAdmins</a></i> method. It's neccesarry to put peer Id of a channel instead of  {channelId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/channels/{channelId}/messages/" </b> is used for the <i><a href="">getChannelMessages</a></i> method. It's neccesarry to put peer Id of a channel instead of  {channelId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/user/{userId}/avatar/" </b> is used for the <i><a href="">getAvatars</a></i> method. It's neccesarry to put peer Id of a user instead of  {userId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://botapi.aitu.io/bot/v1/webhook/" </b> is used for the following methods:
<ul>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/getwebhookinfo.html">getWebhookInfo;</a></i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/setwebhook.html">setWebhook;</a></i>
</li>
<li> <i><a href="https://btsdigital.github.io/bot-api-contract/deletewebhook.html">deleteWebhook;</a></i>
</li>
</ul>
</p>
