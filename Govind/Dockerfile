FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Govind-0.0.1-SNAPSHOT.jar Govind-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Govind/target/Govind-0.0.1-SNAPSHOT.jar Govind-0.0.1-SNAPSHOT.jar

ADD target/Govind-0.0.1-SNAPSHOT.jar Govind-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Govind/0.0.1-SNAPSHOT/Govind-0.0.1-SNAPSHOT.jar Govind-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Govind-0.0.1-SNAPSHOT.jar"]
