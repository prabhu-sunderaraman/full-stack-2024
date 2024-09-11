FROM openjdk:22-alpine

COPY target/square-api-0.0.1.jar app.jar

ENV PROFILE=docker

ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=${PROFILE}", "/app.jar"]
