FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/FEBE5-0.0.1-SNAPSHOT.jar FEBE5-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/FEBE5/target/FEBE5-0.0.1-SNAPSHOT.jar FEBE5-0.0.1-SNAPSHOT.jar

ADD target/FEBE5-0.0.1-SNAPSHOT.jar FEBE5-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/FEBE5/0.0.1-SNAPSHOT/FEBE5-0.0.1-SNAPSHOT.jar FEBE5-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "FEBE5-0.0.1-SNAPSHOT.jar"]
