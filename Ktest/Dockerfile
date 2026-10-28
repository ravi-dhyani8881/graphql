FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Ktest-0.0.1-SNAPSHOT.jar Ktest-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Ktest/target/Ktest-0.0.1-SNAPSHOT.jar Ktest-0.0.1-SNAPSHOT.jar

ADD target/Ktest-0.0.1-SNAPSHOT.jar Ktest-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Ktest/0.0.1-SNAPSHOT/Ktest-0.0.1-SNAPSHOT.jar Ktest-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Ktest-0.0.1-SNAPSHOT.jar"]
