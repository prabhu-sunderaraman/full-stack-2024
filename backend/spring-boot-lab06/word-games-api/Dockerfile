FROM eclipse-temurin:22

COPY target/word-games-api-0.0.1.jar app.jar

ENTRYPOINT ["java", "-jar", "-Dpalindrome-api.base-url=http://host.docker.internal:9000", "/app.jar"]