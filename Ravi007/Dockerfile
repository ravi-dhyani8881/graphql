FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Ravi007-0.0.1-SNAPSHOT.jar Ravi007-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Ravi007/target/Ravi007-0.0.1-SNAPSHOT.jar Ravi007-0.0.1-SNAPSHOT.jar

ADD target/Ravi007-0.0.1-SNAPSHOT.jar Ravi007-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Ravi007/0.0.1-SNAPSHOT/Ravi007-0.0.1-SNAPSHOT.jar Ravi007-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Ravi007-0.0.1-SNAPSHOT.jar"]
