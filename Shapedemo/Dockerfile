FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Shapedemo-0.0.1-SNAPSHOT.jar Shapedemo-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Shapedemo/target/Shapedemo-0.0.1-SNAPSHOT.jar Shapedemo-0.0.1-SNAPSHOT.jar

ADD target/Shapedemo-0.0.1-SNAPSHOT.jar Shapedemo-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Shapedemo/0.0.1-SNAPSHOT/Shapedemo-0.0.1-SNAPSHOT.jar Shapedemo-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Shapedemo-0.0.1-SNAPSHOT.jar"]
