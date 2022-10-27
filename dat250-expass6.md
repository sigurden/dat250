# DAT250: Software Technology Experiment Assignment 6

This assigment was focused learing MVC and SPA applications

## Experiment 1

Simple MVC application

Runned by entering `./mvnw spring-boot:run` and verified by using a browser on url `http://localhost:8080`

Link: https://github.com/sigurden/dat250/tree/main/expass6/exp1

## Experiment 2 and 3

Frontend for the todo api developed as a SPA in angular.
It implements GET, POST and DELETE

Api runned by `./mvnw spring-boot:run` and SPA is runned by `npm start`

I had some issues with the todo ids where some ids last digits where cut off in the browser. I changed the code to store ids as strings, and the application worked as expected.

I also had to add some code to make cors work:

```
options("/*", (request, response) -> {

    String accessControlRequestHeaders = request
        .headers("Access-Control-Request-Headers");
    if (accessControlRequestHeaders != null) {
      response.header("Access-Control-Allow-Headers",
          accessControlRequestHeaders);
    }

    String accessControlRequestMethod = request
        .headers("Access-Control-Request-Method");
    if (accessControlRequestMethod != null) {
      response.header("Access-Control-Allow-Methods",
          accessControlRequestMethod);
    }

    return "OK";
});

before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
```

Link: https://github.com/sigurden/dat250/tree/main/expass6/exp2
