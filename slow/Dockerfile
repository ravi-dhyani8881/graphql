FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/slow-0.0.1-SNAPSHOT.jar slow-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/slow/target/slow-0.0.1-SNAPSHOT.jar slow-0.0.1-SNAPSHOT.jar

ADD target/slow-0.0.1-SNAPSHOT.jar slow-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/slow/0.0.1-SNAPSHOT/slow-0.0.1-SNAPSHOT.jar slow-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "slow-0.0.1-SNAPSHOT.jar"]
