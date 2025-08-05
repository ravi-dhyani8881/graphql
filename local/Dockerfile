FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/local-0.0.1-SNAPSHOT.jar local-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/local/target/local-0.0.1-SNAPSHOT.jar local-0.0.1-SNAPSHOT.jar

ADD target/local-0.0.1-SNAPSHOT.jar local-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/local/0.0.1-SNAPSHOT/local-0.0.1-SNAPSHOT.jar local-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "local-0.0.1-SNAPSHOT.jar"]
