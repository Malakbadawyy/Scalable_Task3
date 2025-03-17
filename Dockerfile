FROM openjdk:25-ea-4-jdk-oraclelinux9

COPY target/*.jar app.jar

# Expose the port that the Spring Boot application runs on
EXPOSE 8080



ENTRYPOINT ["java","-jar", "app.jar"]