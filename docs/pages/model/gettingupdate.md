---
title: Updates
sidebar: home_sidebar
keywords: Update 
permalink: gettingupdate.html
toc: false
folder: Updates
---

<p> There are 2 ways for getting updates:
<ul>
<li> Long polling mechanics;
</li>
<li> Webhook mechanics.
</li>
</ul>
</p>

<p> For long polling <i>retrieveUpdate</i> method is used.
</p>
<p> For webhook 3 following methods are used:
<ul>
<li> setWebhook;
</li>
<li> deleteWebhook;
</li>
<li> getWebhookInfo.
</li>
</ul>
</p>
<p> No matter what way of getting updates was chosen service would get  JSON-serialized <i>UpdateResponse</i> type as a result .
</p>