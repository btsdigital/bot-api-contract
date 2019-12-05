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

<p> For long polling <i><a href="https://btsdigital.github.io/bot-api-contract/retrieveUpdate.html">retrieveUpdate</a></i> method is used.
</p>
<p> For webhook 3 following methods are used:
<ul>
<li><a href="https://btsdigital.github.io/bot-api-contract/setwebhook.html"> setWebhook</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/deletewebhook.html"> deleteWebhook</a>;
</li>
<li> <a href="https://btsdigital.github.io/bot-api-contract/getwebhookinfo.html"> getWebhookInfo</a>.
</li>
</ul>
</p>
<p> No matter what way of getting updates was chosen service would get  JSON-serialized <i><a href="https://btsdigital.github.io/bot-api-contract/updateresponse.html">UpdateResponse</a></i> type as a result .
</p>
