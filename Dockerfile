FROM java:8
WORKDIR /
ADD **/*.jar 
EXPOSE 8080
CMD java - jar my-app-1.0-SNAPSHOT.jar
