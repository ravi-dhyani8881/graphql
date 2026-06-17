FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/PARK-0.0.1-SNAPSHOT.jar PARK-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/PARK/target/PARK-0.0.1-SNAPSHOT.jar PARK-0.0.1-SNAPSHOT.jar

ADD target/PARK-0.0.1-SNAPSHOT.jar PARK-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/PARK/0.0.1-SNAPSHOT/PARK-0.0.1-SNAPSHOT.jar PARK-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "PARK-0.0.1-SNAPSHOT.jar"]
