FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/flightdata-0.0.1-SNAPSHOT.jar flightdata-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/flightdata/target/flightdata-0.0.1-SNAPSHOT.jar flightdata-0.0.1-SNAPSHOT.jar

ADD target/flightdata-0.0.1-SNAPSHOT.jar flightdata-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/flightdata/0.0.1-SNAPSHOT/flightdata-0.0.1-SNAPSHOT.jar flightdata-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "flightdata-0.0.1-SNAPSHOT.jar"]
