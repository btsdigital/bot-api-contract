---
title: Endpoints
sidebar: home_sidebar
keywords: endpoint, send request, send command
permalink: endpoints.html
toc: true
folder: Requests
---

## Description

<p> All requests should be sent to a proper endpoints.
</p>
<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/updates/" </b> is used for the following methods:
<ul>
<li> <i>retrieveUpdate;</i>
</li>
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

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/upload/" </b> is used for the <i>handleUploadFiles</i> method.
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/download/" </b> is used for the <i>handleDownloadFile</i> method.
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/getMe/" </b> is used for the <i>getMe</i> method.
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/avatar/" </b> is used for the <i>uploadAvatar</i> method.
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/avatar/{fileId}/" </b> is used for the <i>downloadAvatar</i> method. It's neccesarry to put file Id of avatar instead of  {fileId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/channels/{channelId}/" </b> is used for the <i>getChannelInfo</i> method. It's neccesarry to put peer Id of a channel instead of  {channelId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/channels/{channelId}/admins/" </b> is used for the <i>getChannelAdmins</i> method. It's neccesarry to put peer Id of a channel instead of  {channelId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/channels/{channelId}/messages/" </b> is used for the <i>getChannelMessages</i> method. It's neccesarry to put peer Id of a channel instead of  {channelId} value in a endpoint string. 
</p>

<p> Endpoint <b> "https://messapi.btsdapps.net/bot/v1/user/{userId}/avatar/" </b> is used for the <i>getAvatars</i> method. It's neccesarry to put peer Id of a user instead of  {userId} value in a endpoint string. 
</p>

<p> Endpoint <b> "/https://messapi.btsdapps.net/bot/v1/webhook/" </b> is used for the following methods:
<ul>
<li> <i>getWebhookInfo;</i>
</li>
<li> <i>setWebhook;</i>
</li>
<li> <i>deleteWebhook;</i>
</li>
</ul>
</p>
