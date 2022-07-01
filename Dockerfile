FROM amazoncorretto:11
COPY target/tax-service-0.0.1-SNAPSHOT.jar tax-service-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/tax-service-0.0.1-SNAPSHOT.jar"]