FROM java:8
ADD target/admin-service.jar admin-service.jar
ENTRYPOINT ["java","-jar","admin-service.jar"]