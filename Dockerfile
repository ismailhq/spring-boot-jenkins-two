FROM eclipse-temurin:21-jdk
EXPOSE 8081
ADD target/spring-boot-jenkins.jar spring-boot-jenkins.jar
ENTRYPOINT [ "java","-jar","/spring-boot-jenkins.jar" ]
