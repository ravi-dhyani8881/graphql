FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Schema10Jay-0.0.1-SNAPSHOT.jar Schema10Jay-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Schema10Jay/target/Schema10Jay-0.0.1-SNAPSHOT.jar Schema10Jay-0.0.1-SNAPSHOT.jar

ADD target/Schema10Jay-0.0.1-SNAPSHOT.jar Schema10Jay-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Schema10Jay/0.0.1-SNAPSHOT/Schema10Jay-0.0.1-SNAPSHOT.jar Schema10Jay-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Schema10Jay-0.0.1-SNAPSHOT.jar"]
