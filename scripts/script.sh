#!/bin/sh
git pull
git add .
read message
git commit -m "$message"
git push
