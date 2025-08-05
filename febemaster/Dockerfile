FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/febemaster-0.0.1-SNAPSHOT.jar febemaster-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/febemaster/target/febemaster-0.0.1-SNAPSHOT.jar febemaster-0.0.1-SNAPSHOT.jar

ADD target/febemaster-0.0.1-SNAPSHOT.jar febemaster-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/febemaster/0.0.1-SNAPSHOT/febemaster-0.0.1-SNAPSHOT.jar febemaster-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "febemaster-0.0.1-SNAPSHOT.jar"]
