FROM amazoncorretto:21.0.4-alpine3.18
EXPOSE 5000
ADD target/food-service-0.0.1-SNAPSHOT.jar food.jar
ENTRYPOINT ["java","-jar","food.jar"]
