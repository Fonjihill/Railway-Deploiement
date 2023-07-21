
## Production DokerFile
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /home/app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -Dmaven.test.skip=true

FROM openjdk:17
WORKDIR /app
COPY --from=build /home/app/target/student-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 9091


