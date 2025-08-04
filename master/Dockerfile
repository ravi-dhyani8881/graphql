FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/master-0.0.1-SNAPSHOT.jar master-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/master/target/master-0.0.1-SNAPSHOT.jar master-0.0.1-SNAPSHOT.jar

ADD target/master-0.0.1-SNAPSHOT.jar master-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/master/0.0.1-SNAPSHOT/master-0.0.1-SNAPSHOT.jar master-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "master-0.0.1-SNAPSHOT.jar"]
