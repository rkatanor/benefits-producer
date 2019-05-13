FROM openjdk:8
ADD ./target/benefits-producer-0.0.1-SNAPSHOT.jar producer.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","producer.jar"]