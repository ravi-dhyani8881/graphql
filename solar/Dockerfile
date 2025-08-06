FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/solar-0.0.1-SNAPSHOT.jar solar-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/solar/target/solar-0.0.1-SNAPSHOT.jar solar-0.0.1-SNAPSHOT.jar

ADD target/solar-0.0.1-SNAPSHOT.jar solar-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/solar/0.0.1-SNAPSHOT/solar-0.0.1-SNAPSHOT.jar solar-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "solar-0.0.1-SNAPSHOT.jar"]
