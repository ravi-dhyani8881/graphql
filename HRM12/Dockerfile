FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/HRM12-0.0.1-SNAPSHOT.jar HRM12-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/HRM12/target/HRM12-0.0.1-SNAPSHOT.jar HRM12-0.0.1-SNAPSHOT.jar

ADD target/HRM12-0.0.1-SNAPSHOT.jar HRM12-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/HRM12/0.0.1-SNAPSHOT/HRM12-0.0.1-SNAPSHOT.jar HRM12-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "HRM12-0.0.1-SNAPSHOT.jar"]
