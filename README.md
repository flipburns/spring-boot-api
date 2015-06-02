# spring-boot
Base spring boot project for getting started with api development - fork and modify to begin developing a spring boot application. Unlike https://github.com/flipburns/spring-boot , this forces some paradigms into the application and is more personal than the generic version. Maybe you'll like some of the features and it'll make life easier...maybe not. I will use this template for my own microservices and find that it is a nice pattern for bog standard apis.

Code taken and adapted from https://spring.io/guides/gs/spring-boot/

#Prerequisites

- Java (1.8 preferred)
- Gradle

#Build and run

Navigate to root dir and run `gradle build` - this will generate the packaged jar file inside build/libs directory as 'spring-boot-api-1.jar'

Then run `java -jar spring-boot-api-1.jar` to start the application

Navigate to `http://www.localhost:8080/hello/yourname` to hit the example api endpoint, where `yourname` is your actual name, you should get a simple json response which greets you inside the object.

From here it's possible to begin developing apis as you would with spring MVC. Start with the controller and build up from there. 

#Structure

We start with a controller, `HelloController`, which has some bean dependencies, `HelloService` and `ApiResponseFactory`. The Controller returns `ApiResponse` which wraps a more specific `HelloServiceResponse`. Beans are defined in respective packages in `PackageConfiguration` classes which all contain `@Configuration` annotation. `HelloService` (whose response is cached with `@Cacheable`) does the grunt work and generates our real data, which the `ApiResponseFactory` then wraps. We have an integration test for the controller and unit tests for other classes. 

Returning a generic `ApiResponse` object which can wrap anything allows us to wrap any response we like, but also make every response contain the same base information. This could be achieved with inheritance, however it's nice to have the ability to be able to wrap anything as a response, instead of only classes which have specifically inherited something. The `ApiResponse` object also provides us with HAL links (by extending spring HATEOAS `ResourceSupport`) as well as a status. This could be enhanced to provide error information and metrics and any other metadata required.

//TODO:

this project will have some additional enhancements in the future, including:

- Exception Handlers
- Swagger integration for api documentation/test page
- integration with/usage of property files

#Spring Actuator

The project includes spring boot actuator which provides some health check, metrics, and mapping endpoints under:

`http://www.localhost:8080/mappings` - shows available endpoints

`http://www.localhost:8080/health` - shows if application is running

`http://www.localhost:8080/metrics` - shows metrics

