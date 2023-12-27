#!/bin/bash

UPSTREAM_REPO="https://github.com/SimplifyJobs/Summer2024-Internships"
BRANCH="dev"

git remote add upstream $UPSTREAM_REPO

git fetch upstream

git checkout $BRANCH

git rebase upstream/$BRANCH

git push origin $BRANCH --force