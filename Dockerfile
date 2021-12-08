FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /myapp
COPY target/Docker-0.0.1-SNAPSHOT.jar /myapp/my-app.jar
EXPOSE 8181
ENTRYPOINT ["java","-jar","my-app.jar"]