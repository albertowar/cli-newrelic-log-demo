# cli-newrelic-log-demo
## Introduction
This repository contains a repro for NewRelic Support.

In an ideal world, this should send logs to NewRelic using [APM logs in Context](https://docs.newrelic.com/docs/logs/logs-context/java-configure-logs-context-all/)

## Instructions
How to run:
* `make build`
* `NEW_RELIC_LICENSE_KEY=<key> make run`