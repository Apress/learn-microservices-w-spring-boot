# microservices-v5

This project contains the version 5 of the application that is developed under the scope of the book *Learn Microservices with Spring Boot*. You can get a copy of the book on [Apress](http://www.apress.com/gp/book/9781484231647).

## About this version

From this version onwards we have a new microservice: **Gamification**. Our **Multiplication** microservice 
is now using Spring AMQP and RabbitMQ to send an event when we receive an attempt.

On the other hand we have a new project, located in the `gamification` folder. This microservice subscribes to
the event sent by Multiplication, and react to it assigning points - and potentially badges, to our users.
