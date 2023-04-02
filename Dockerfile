FROM openjdk:11-jdk
WORKDIR /app
COPY target/mapstruct-demo-0.0.1-SNAPSHOT.jar /app/cicd.jar
EXPOSE 8080
CMD ["java", "-jar", "cicd.jar"]