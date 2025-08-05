FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Money-0.0.1-SNAPSHOT.jar Money-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Money/target/Money-0.0.1-SNAPSHOT.jar Money-0.0.1-SNAPSHOT.jar

ADD target/Money-0.0.1-SNAPSHOT.jar Money-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Money/0.0.1-SNAPSHOT/Money-0.0.1-SNAPSHOT.jar Money-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Money-0.0.1-SNAPSHOT.jar"]
