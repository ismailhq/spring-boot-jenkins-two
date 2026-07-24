FROM eclipse-temurin:21-jdk
EXPOSE 8081
ADD target/spring-boot-jenkins-two.jar spring-boot-jenkins-two.jar
ENTRYPOINT [ "java","-jar","/spring-boot-jenkins-two.jar" ]
