FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY app/java-devsecops-ai/target/java-devsecops-ai-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]