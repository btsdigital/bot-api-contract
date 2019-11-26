---
title: Contribute
sidebar: home_sidebar
keywords: contribution
permalink: contribution.html
toc: true
folder: examples
---

This is an open source project, so you may help to enhance it. Create pull request with changes made or issue with a problem description in 
 [repository](https://github.com/btsdigital/bot-api-contract)

## Contribution to documentation
To contribute to documentation please follow the instructions:
1. [Create issue](https://help.github.com/en/articles/creating-an-issue) or assign to yourself. 
Label the issue with `documentation`
2. [Create branch](https://help.github.com/en/articles/creating-and-deleting-branches-within-your-repository) for the issue.
Name it documentation/ISSUE_NUMBER-DESCRIPTION
3. [Create](#create-documentation-page) or edit documentation page
4. [Deploy locally](#deploy-locally)
5. Commit your changes to remote branch
6/ [Create pull request](https://help.github.com/en/articles/creating-a-pull-request) to master
 

## Create documentation page

To create new documentation page follow the instructions:
1) Add page reference to [menu](https://github.com/btsdigital/bot-api-contract/blob/master/docs/_data/sidebars/home_sidebar.yml)
    ```
    entries:
    - title: Sidebar
      levels: two
      folders:
      - title: Model
        output: web
        folderitems:
        - title: Catalog
          url: /Catalog.html
          output: web
        - title: NEW_PAGE_TITLE
          url: /NEW_PAGE_FILE_NAME.html
          output: web
    ```
2) Add page to [pages directory](https://github.com/btsdigital/bot-api-contract/tree/master/docs/pages) `/docs/pages`.
For `model` pages use [corresponding](https://github.com/btsdigital/bot-api-contract/tree/master/docs/pages/model) directory `/docs/pages/model`
Page file should have .md extension and should be written using markdown syntax

See [Catalog.md](https://github.com/btsdigital/bot-api-contract/blob/master/docs/pages/model/Catalog.md) for example

## Deploy locally
There are 2 ways to deploy documentation locally: using docker or local jekyll. Please pay attention, that there is no need
to restart jekyll when you make changes to the pages, it will be regenerating automatically and in jekyll logs you will see following lines
```,
 Regenerating: 1 file(s) changed at 2019-09-12 00:49:27
               index.md
               ...done in 3.1696679 seconds.
```
### Using docker
1) open `/docs` directory in console
2) execute command
```
docker-compose up
```

### Using local jekyll installation
1) [Install jekyll](https://jekyllrb.com/docs/installation/)
2) Start jekyll
```
jekyll serve
```
