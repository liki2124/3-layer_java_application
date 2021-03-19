FROM openjdk:8
ADD target/TeamManagement*.jar TeamManagement.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","TeamManagement.jar"]
