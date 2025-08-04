FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/deploy-0.0.1-SNAPSHOT.jar deploy-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/deploy/target/deploy-0.0.1-SNAPSHOT.jar deploy-0.0.1-SNAPSHOT.jar

ADD target/deploy-0.0.1-SNAPSHOT.jar deploy-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/deploy/0.0.1-SNAPSHOT/deploy-0.0.1-SNAPSHOT.jar deploy-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "deploy-0.0.1-SNAPSHOT.jar"]
