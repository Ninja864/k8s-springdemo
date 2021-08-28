FROM maven:3.5.3-alpine
#Navigate to below location in docker container
WORKDIR /usr/src

#Add Project folder from localhost location to docker container
ADD ./springdemoapp .

#Run build command inside container
RUN mvn clean install 

#Copy the built jar from below location and app.jar
RUN cp ./target/*.jar app.jar

EXPOSE 8080

#Run app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]