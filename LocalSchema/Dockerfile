FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/LocalSchema-0.0.1-SNAPSHOT.jar LocalSchema-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/LocalSchema/target/LocalSchema-0.0.1-SNAPSHOT.jar LocalSchema-0.0.1-SNAPSHOT.jar

ADD target/LocalSchema-0.0.1-SNAPSHOT.jar LocalSchema-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/LocalSchema/0.0.1-SNAPSHOT/LocalSchema-0.0.1-SNAPSHOT.jar LocalSchema-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "LocalSchema-0.0.1-SNAPSHOT.jar"]
