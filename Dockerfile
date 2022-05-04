FROM openjdk:11
MAINTAINER sugrado
WORKDIR /opt/docker-compose-demo
COPY target/docker-compose-demo-0.0.1-SNAPSHOT.jar docker-compose-demo.jar
ENTRYPOINT ["java", "-jar", "docker-compose-demo.jar"]