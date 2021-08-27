FROM maven:3.5.3-alpine
WORKDIR /usr/src

ADD ./springdemoapp .

RUN mvn clean install 

RUN cp ./target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]