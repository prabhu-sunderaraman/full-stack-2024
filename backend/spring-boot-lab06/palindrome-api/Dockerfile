FROM eclipse-temurin:22-alpine

COPY target/palindrome-api-0.0.1.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]