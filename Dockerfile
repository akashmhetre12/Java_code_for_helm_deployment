FROM eclipse-temurin:17-jre-jammy

ARG NEXUS_URL

WORKDIR /app
COPY target/myapp.jar /app/myapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
