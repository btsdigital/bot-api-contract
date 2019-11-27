---
title: Making requests
sidebar: home_sidebar
keywords: requests ,query
permalink: makerequests.html
toc: false
folder: Requests
---

<p> All requests are sent over HTTPS using UTF-8.
</p>
<p>GET, POST and DELETE (DELETE method is used for webhook removal) methods are supported.
</p>
<p> There are 3 ways of passing over request parameters:
<ul>
<li> URL query string;
</li>
<li> application/json;
</li>
<li> multipart/form-data.
</li>
</ul>
</p>
<p> Response contains http status and text of exception in case if any kind of error occur.
</p>

<p> To send a command request CommandRequest object is sent.
</p> 
CommandRequest composed of an array of Command type objects.
