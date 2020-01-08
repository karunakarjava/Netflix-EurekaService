FROM openjdk:8
EXPOSE 8081
ADD target/springboot-docker.jar  springboot-docker.jar
ENTRYPOINT ["java","-jar","/springboot-docker.jar"]