FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY . /app

EXPOSE 8080

ENTRYPOINT [ "java","-jar","/app/build/libs/bookshop-0.0.1-SNAPSHOT.jar" ]