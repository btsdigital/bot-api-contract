---
title: EditContainerMessage
sidebar: home_sidebar
keywords: EditContainerMessage
permalink: EditContainerMessage.html
toc: true
folder: Commands
---

![Commands](images/EditContainerMessage.png "BotCommandSendContainerMessage")
<p>
<i>* Validation error text may vary depending on a source of an error</i>
</p>

## Description

<p> This method is for editing container type message. 
</p>
On succes empty response with http code 200 is returned.

## Endpoint

https://messapi.btsdapps.net/bot/v1/updates/

## Structure

| Variable  | Obligative  | Type| Validation| Description
|---|:---:|---|---|---|
| type | true | String | Must be filled with "EditContainerMessage" value |Type of request "EditContainerMessage" |
| recipient  | true |  [Peer](https://btsdigital.github.io/bot-api-contract/peer.html) | For Peer type validation see type page| Peer  this message was sent to |
| content| true |  String |Size of containerMessage.Content should be <= 20000 symbols | Json array to replace original |

## Sample request

```
{
  "commands": [
    {
      "type": "EditContainerMessage",
      "messageId": "Uuid_value",
      "recipient": {
        "type": "GROUP",
        "id": "Uuid_value"
      },
      "content":"[
        {
          \"type\": \"custom_container\",
          \"options\": {
            \"indent_outer\": {
              \"top\": 8,
              \"bottom\": 8
            },
            \"background\": \"border\"
          },
          \"content\": [
            {
              \"type\": \"custom_container\",
              \"options\": {
                \"flex_options\": {
                  \"flex_direction\": \"column\",
                  \"align_items\": \"start\"
                }
              },
              \"content\": [
                {
                  \"type\": \"image\",
                  \"file_metadata\": {
                    \"file_type\": \"image\",
                    \"file_id\": \"Uuid_value\",
                    \"filename\": \"3762290980\"
                  },
                  \"options\": {
                    \"width\": 62,
                    \"height\": 33
                  }
                },
                {
                  \"type\": \"custom_container\",
                  \"form_action\": {
                    \"action\": \"open_url\",
                    \"data_template\": \"https://common.container.ru\"
                  },
                  \"options\": {
                    \"width\": 62,
                    \"flex_options\": {
                      \"flex_direction\": \"row\",
                      \"justify_content\": \"between\"
                    }
                  },
                  "content\": [
                    {
                      \"type\": \"text\",
                      \"title\": \"ЖК «Багыстан»\",
                      \"form_action\": {
                        \"action\": "open_url",
                        \"data_template\": \"https://bagystan.ru\"
                      },
                      \"options\": {
                        \"text_size\": \"H3\",
                        \"text_style\": \"bold\",
                        \"flex_options\": {
                          \"align_self\": \"center\"
                        },
                        \"indent_outer\": {
                          "\left\": 16
                        }
                      }
                    },
                    {
                      \"type\": \"image\",
                      \"file_metadata\": {
                        \"file_type\": \"image\",
                        \"file_id\": \"Uuid_value\",
                        \"filename\": \"3454567986\"
                      },
                      \"form_action\": {
                        \"action\": \"send_message\",
                        \"data_template\": \"tolkat50\"
                      },
                      \"options\": {
                        \"width\": 17,
                        \"height\": 9,
                        \"indent_outer\": {
                          \"right\": 16
                        }
                      }
                    }
                  ]
                },
                {
                  \"type\": \"divider\",
                  \"options\": {
                    \"indent_outer\": {
                      \"left\": 16,
                      \"right\": 16
                    }
                  }
                },
                {
                  \"type\": \"custom_container\",
                  \"options\": {
                    \"width\": 62,
                    \"flex_options\": {
                      \"flex_direction\": \"row\"
                    },
                    \"indent_outer\": {
                      \"top\": 8,
                      \"bottom\": 12
                    }
                  },
                  \"content\": [
                    {
                      \"type\": \"text\",
                      \"title\": \"1-к квартира, 62 м²\",
                      \"options\": {
                        \"text_size\": \"H4\",
                        \"flex_options\": {
                          \"align_self\": \"center\",
                          \"flex_grow\": 1,
                          \"flex_basis\": 0
                        },
                        \"indent_outer\": {
                          \"left\": 16
                        }
                      }
                    },
                    {
                      \"type\": \"text\",
                      \"title\": \"9 170 100 Т\",
                      \"options\": {
                        \"text_size\": \"H3\",
                        \"text_style\": \"bold\",
                        \"flex_options\": {
                          "align_self\": \"center\",
                          \"flex_grow\": 1,
                          \"flex_basis\": 0
                        },
                        \"alignment": \"right\",
                        \"indent_outer\": {
                          \"right\": 16
                        }
                      }
                    }
                  ]
                }
              ]
            }
          ]
        }
      ]"
    }
  ]
}
```

## Updates

<p>This method may asynchronously return following updates:
</p>

N/A

## Possible business exceptions

<i>Common context </i>
<p>
<ul>
    <li>Service isn't able to edit container message if it wasn't found (deleted/ID error);</li>
    <li>Service isn't able to edit container message if this command is used for common type message, as for editing that type of messages other command is specified;</li>
    <li>Service isn't able to edit forwarded container message;</li>
    <li> Service isn't able to edit container message if it was sent more than 30 days ago  </li>
</ul>
</p>
<i>Service to service dialog
</i>
<p>Editing container messages from service to service is not available, function is not supported.
</p>
<i>Service to user dialog
</i>
<p>
Editing a container message sent to a user who banned a service ( put a service into a black list) is not available).
</p>
<i>Service to channel dialog
</i>
<p>
<ul>
  <li> Editing container message sent to a channel is not available if a channel wasn't found (deleted/ID error) or channel was banned;
  </li>
  <li>Editing container message sent to a channel is not available if a service is not a channel subscriber and has no administrator/owner role assigned;
  </li>
</ul>
</p>
<i>Service to group dialog
</i>
<p>
Editing container message sent to a group dialog is is not available if a service is not a member of this group.
</p>
