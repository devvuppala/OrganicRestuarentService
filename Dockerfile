FROM openjdk:8
ADD target/ran-optimization-data-microservice.jar ran-optimization-data-microservice.jar
EXPOSE 9009
ENTRYPOINT ["java","-jar", "ran-optimization-data-microservice.jar"]