FROM openjdk:8u191-jre-alpine
COPY libs/gradle-0.1-bootable.jar /tmp/jsql-spring-boot-test-app.jar
CMD java -jar /tmp/jsql-spring-boot-test-app.jar
