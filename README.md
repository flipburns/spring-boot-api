# spring-boot
base spring boot project for getting started with api development - fork and modify to begin developing a spring boot application.

#prerequisites

- Java (1.8 preferred)
- Gradle

#Build and run

navigate to root dir and run `gradle build` - this will generate the packaged jar file inside build/libs directory as 'spring-boot-0.jar'

then run `java -jar spring-boot-0.jar` to start the application

navigate to `http://www.localhost:8080/api` to hit the example api endpoint, you should get a simple text response reading `api success`

from here it's possible to begin developing apis as you would with spring MVC.

#Spring actuator

The project includes spring boot actuator which provides some health check, metrics, and mapping endpoints under:

`http://www.localhost:8080/mappings` - shows available endpoints

`http://www.localhost:8080/health` - shows if application is running

`http://www.localhost:8080/metrics` - shows metrics

