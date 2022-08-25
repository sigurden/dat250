# DAT250 Experiment 1

## Installation

Installed JDK, git, maven, heroku, postgres as instructed by the webpage/readme

During the installations I did not encounter any problems

## Deploy app

Cloned the example app from heroku

Created the app with `heroku create` and deployed it with `git push heroku main` to `https://damp-citadel-49894.herokuapp.com/`

Followed the tutorial to add new route and use environment variables

No issues was encountered during this process either.

## Validation

To validate the changes, I used a combination with the commands provided by the tutorial and manuell checking changes at the webpage both locally and deployed.

The commands I used to validate:
- `heroku ps` to check that the application is running
- `heroku pg` to check database status
- `heroku logs --tail` to check application logging
- `heroku config` to verify the new environment variable was set

## URL

URL to deployed application: `https://damp-citadel-49894.herokuapp.com/`
