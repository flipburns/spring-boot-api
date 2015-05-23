# spring-boot
Base spring boot project for getting started with api development - fork and modify to begin developing a spring boot application.

Code taken and adapted from https://spring.io/guides/gs/spring-boot/

#Prerequisites

- Java (1.8 preferred)
- Gradle

#Build and run

Navigate to root dir and run `gradle build` - this will generate the packaged jar file inside build/libs directory as 'spring-boot-0.jar'

Then run `java -jar spring-boot-0.jar` to start the application

Navigate to `http://www.localhost:8080/api` to hit the example api endpoint, you should get a simple text response reading `api success`

From here it's possible to begin developing apis as you would with spring MVC. Start with the controller and build up from there. 

#Spring Actuator

The project includes spring boot actuator which provides some health check, metrics, and mapping endpoints under:

`http://www.localhost:8080/mappings` - shows available endpoints

`http://www.localhost:8080/health` - shows if application is running

`http://www.localhost:8080/metrics` - shows metrics

