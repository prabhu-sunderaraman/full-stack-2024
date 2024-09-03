FROM eclipse-temurin:22-alpine

COPY target/word-games-api-0.0.1.jar app.jar

ENV PALINDROME_HOST=localhost
ENV PALINDROME_PORT=9000

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "-Dpalindrome-api.base-url=http://${PALINDROME_HOST}:${PALINDROME_PORT}", "/app.jar"]

# docker run --name word-games-api -p 8080:8080 -e PALINDROME_HOST=host.docker.internal -e PALINDROME_PORT=9000 <imageName>