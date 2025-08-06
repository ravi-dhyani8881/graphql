FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/demo/target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/demo/0.0.1-SNAPSHOT/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
