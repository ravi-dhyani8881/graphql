FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/RandR-0.0.1-SNAPSHOT.jar RandR-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/RandR/target/RandR-0.0.1-SNAPSHOT.jar RandR-0.0.1-SNAPSHOT.jar

ADD target/RandR-0.0.1-SNAPSHOT.jar RandR-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/RandR/0.0.1-SNAPSHOT/RandR-0.0.1-SNAPSHOT.jar RandR-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "RandR-0.0.1-SNAPSHOT.jar"]
