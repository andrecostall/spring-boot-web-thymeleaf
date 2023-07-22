FROM openjdk:17-alpine
# ADD target/spring-boot-web-thymeleaf-0.0.1-SNAPSHOT.jar app.jar
ARG JAR_FILE
ADD target/${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
