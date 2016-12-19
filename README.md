# SpringBootHelloWorld
This application is a service to return greetings in different languages.

# Features
SpringBoot
Java8
Gradle
Docker

# How To run using docker
Docker Image: npavan/demo
$ docker run -p 8081:8080 npavan/demo

#url's
Request: GET: http://localhost:8081/all/hello/pavan
Response:[Namaste pavan, Ola pavan, Salaam pavan, Hello pavan, Hola pavan, Hallo pavan, Bonjour pavan]

Request: GET: http://localhost:8081/hello
Response: Hello World

Request: GET: http://localhost:8081/HI/hello
Response: Namaste World
