FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/imported-0.0.1-SNAPSHOT.jar imported-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/imported/target/imported-0.0.1-SNAPSHOT.jar imported-0.0.1-SNAPSHOT.jar

ADD target/imported-0.0.1-SNAPSHOT.jar imported-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/imported/0.0.1-SNAPSHOT/imported-0.0.1-SNAPSHOT.jar imported-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "imported-0.0.1-SNAPSHOT.jar"]
