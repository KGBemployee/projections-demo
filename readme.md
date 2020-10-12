# Spring data REST projections demo

This project is an example project for projections applied with Spring Data Rest.
The app uses a H2 in memory database just for demo purposes.
A very small sample of data is seeded at startup via the `import.sql` file.

###Runing the app

- build the project with `gradle clean build` 
- run the app with `java -jar build/libs/demo-0.0.1-SNAPSHOT.jar`

###Using the app
There is a full postman collection that shows all the endpoints with demo requests. This is available under `collections`.
Data is created at start but there are also POST request examples in the postman collection.

###Documentation
Spring documentation regardin projections can be found here: https://docs.spring.io/spring-data/rest/docs/current/reference/html/#projections-excerpts.projections
