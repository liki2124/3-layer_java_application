FROM openjdk:8
ADD target/3-layer_java_application*.jar 3-layer_java_application.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","3-layer_java_application.jar"]
