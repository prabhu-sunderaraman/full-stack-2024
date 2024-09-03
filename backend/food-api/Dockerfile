FROM eclipse-temurin:22-alpine

COPY target/food-api-0.0.1.jar app.jar

ENV WELCOME "Welcome to Food API"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "-Dwelcome.message=${WELCOME}", "app.jar"]