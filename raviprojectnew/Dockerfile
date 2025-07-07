FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/raviprojectnew-0.0.1-SNAPSHOT.jar raviprojectnew-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/raviprojectnew/target/raviprojectnew-0.0.1-SNAPSHOT.jar raviprojectnew-0.0.1-SNAPSHOT.jar

ADD target/raviprojectnew-0.0.1-SNAPSHOT.jar raviprojectnew-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/raviprojectnew/0.0.1-SNAPSHOT/raviprojectnew-0.0.1-SNAPSHOT.jar raviprojectnew-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "raviprojectnew-0.0.1-SNAPSHOT.jar"]
