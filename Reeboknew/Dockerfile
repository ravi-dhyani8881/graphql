FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Reeboknew-0.0.1-SNAPSHOT.jar Reeboknew-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Reeboknew/target/Reeboknew-0.0.1-SNAPSHOT.jar Reeboknew-0.0.1-SNAPSHOT.jar

ADD target/Reeboknew-0.0.1-SNAPSHOT.jar Reeboknew-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Reeboknew/0.0.1-SNAPSHOT/Reeboknew-0.0.1-SNAPSHOT.jar Reeboknew-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Reeboknew-0.0.1-SNAPSHOT.jar"]
