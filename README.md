# quarkus-caching

In this project Illustrate caching operation with Quarkus framework using the default Quarkus Cache backend (Caffeine). :) You can use Redis instead

This project uses Quarkus framework to Illustrate caching operation using quarkus-cache extention witch also uses.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_** You can retrieve and cache remote API result using this URL: http://localhost:8080/todos or http://localhost:8080/todos/{id}.

> **_NOTE:_** You can inspect cache metrics using this URL: http://localhost:8080/todos/q/metrics and search for "my-cache" and "my-cache-with-param"

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

With Love

~Joe
