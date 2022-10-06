# DAT250: Software Technology Experiment Assignment 5

This assigment was focused on the spring framework and some tutroials to get familiar with the framework.
All the experiment was easy to follow and I did not encountered any issues while doing the assignment.

## Experiment 1

Simple tutoriel to set up a single get entrypoint

Runned by entering `./mvnw spring-boot:run` and verified by `curl http://localhost:8080/hello`

Link: https://github.com/sigurden/dat250/tree/main/expass5/experiment1

## Experiment 2

Exploring beans included in Spring Boot, unit tests, production grade servies

Runned by entering `./mvnw spring-boot:run` and verified by `curl http://localhost:8080/` and production acuator: `curl localhost:8080/actuator/health`

Test runned with `mvn clean test`

Link: https://github.com/sigurden/dat250/tree/main/expass5/experiment2and3

## Experiment 3

Creating a little REST GET request enpoint that returns JSON.

Runned by entering `./mvnw spring-boot:run` and verified by `curl http://localhost:8080/greeting?name=Spring`

Link: https://github.com/sigurden/dat250/tree/main/expass5/experiment2and3

## Experiment 4

Learing to use Spring to create a JPA application.

Runned by entering `./mvnw spring-boot:run` and verified result.

Link: https://github.com/sigurden/dat250/tree/main/expass5/experiment4
