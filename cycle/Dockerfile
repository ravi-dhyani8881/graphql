FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/cycle-0.0.1-SNAPSHOT.jar cycle-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/cycle/target/cycle-0.0.1-SNAPSHOT.jar cycle-0.0.1-SNAPSHOT.jar

ADD target/cycle-0.0.1-SNAPSHOT.jar cycle-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/cycle/0.0.1-SNAPSHOT/cycle-0.0.1-SNAPSHOT.jar cycle-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "cycle-0.0.1-SNAPSHOT.jar"]
