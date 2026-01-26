FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Project 2-0.0.1-SNAPSHOT.jar Project 2-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Project 2/target/Project 2-0.0.1-SNAPSHOT.jar Project 2-0.0.1-SNAPSHOT.jar

ADD target/Project 2-0.0.1-SNAPSHOT.jar Project 2-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Project 2/0.0.1-SNAPSHOT/Project 2-0.0.1-SNAPSHOT.jar Project 2-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Project 2-0.0.1-SNAPSHOT.jar"]
