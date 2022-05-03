FROM java:8-jdk-alpine

COPY ./target/demo-swagger-0.0.1.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch demo-swagger-0.0.1.jar'

ENTRYPOINT ["java", "-jar", "demo-swagger-0.0.1.jar"]