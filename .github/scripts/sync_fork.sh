#!/bin/bash

UPSTREAM_REPO="https://github.com/SimplifyJobs/Summer2024-Internships"
BRANCH="dev"

cd "$(dirname "$0")" || exit

if ! git remote | grep -q upstream; then
    git remote add upstream $UPSTREAM_REPO
fi

git fetch upstream

git checkout $BRANCH

git rebase upstream/$BRANCH

git push origin $BRANCH --force