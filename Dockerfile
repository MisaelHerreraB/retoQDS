FROM openjdk:8-jdk-slim
COPY "./target/reto-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]