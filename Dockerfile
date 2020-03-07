FROM openjdk:8
ADD out/artifacts/main_jar/main.jar main.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "main.jar"]
