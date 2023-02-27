FROM openjdk:8
EXPOSE 8080
ADD target/Azure-demo-docker.jar Azure-demo-docker.jar
ENTRYPOINT ["java","-jar","/Azure-demo-docker.jar"]



