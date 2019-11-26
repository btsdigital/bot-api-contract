---
title: Peer
sidebar: home_sidebar
keywords: peer,types
permalink: peer.html
toc: true
folder: Types
---

## Desciprtion

<p> This object represents a user, service, group dialog or channel.
</p>

## User

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "USER" value |Type of request "USER" |
| id | true |  String |Id must be a valid  UUID  | Unique ID of  a particular user  |
| username  | false |  String | - | Username of a user in a messenger |
| lastName  | false |  String | - | Last name of a user in a messenger |
| firstName  | false |  String | - | First name of a user in a messenger |

## Service

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "BOT" value |Type of request "BOT" |
| id | true |  String |Id must be a valid  UUID  | Unique ID of  a particular service  |
| name  | false |  String | - | Title of a service in a messenger |
  
## Group
  
| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "GROUP" value |Type of request "GROUP" |
| id | true |  String |Id must be a valid  UUID  | Unique ID of  a particular group dialog  |
| name  | false |  String | - | Title of a group dialog in a messenger |
   
## Channel
     
| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "CHANNEL" value |Type of request "CHANNEL" |
| id | true |  String |Id must be a valid  UUID  | Unique ID of  a particular channel  |
| name  | false |  false | - | Title of a channel |
| username  | false |  false | - | Username of a channel owner |
    
## Sample object

```

		{
			"type": "USER",
			"id": "ga018bae-e3e7-11e8-a458-7a609eaf8200",
			 "username" :  "test_username",
			 "lastName":  "test_lastName",
			 "firstName":  "test_firstName"
		}
	
```


