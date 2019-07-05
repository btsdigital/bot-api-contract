#!/usr/bin/env bash

if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    openssl aes-256-cbc -K $encrypted_ac6d98c4fed3_key -iv $encrypted_ac6d98c4fed3_iv -in cd/codesigning.asc.enc -out cd/codesigning.asc -d
fi
