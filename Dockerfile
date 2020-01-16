FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY demo-1.0.0.jar demo-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/demo-1.0.0.jar"]
