FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/SpaceX API(example)-0.0.1-SNAPSHOT.jar SpaceX API(example)-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/SpaceX API(example)/target/SpaceX API(example)-0.0.1-SNAPSHOT.jar SpaceX API(example)-0.0.1-SNAPSHOT.jar

ADD target/SpaceX API(example)-0.0.1-SNAPSHOT.jar SpaceX API(example)-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/SpaceX API(example)/0.0.1-SNAPSHOT/SpaceX API(example)-0.0.1-SNAPSHOT.jar SpaceX API(example)-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "SpaceX API(example)-0.0.1-SNAPSHOT.jar"]
