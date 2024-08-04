FROM eclipse-temurin:17-jre-focal
EXPOSE 8080
# ADD target/Prototype-0.0.1-SNAPSHOT.jar Prototype-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Prototype/target/Prototype-0.0.1-SNAPSHOT.jar Prototype-0.0.1-SNAPSHOT.jar

ADD target/Prototype-0.0.1-SNAPSHOT.jar Prototype-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar Prototype-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Prototype-0.0.1-SNAPSHOT.jar"]
