FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/openapi-0.0.1-SNAPSHOT.jar openapi-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/openapi/target/openapi-0.0.1-SNAPSHOT.jar openapi-0.0.1-SNAPSHOT.jar

ADD target/openapi-0.0.1-SNAPSHOT.jar openapi-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/openapi/0.0.1-SNAPSHOT/openapi-0.0.1-SNAPSHOT.jar openapi-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "openapi-0.0.1-SNAPSHOT.jar"]
