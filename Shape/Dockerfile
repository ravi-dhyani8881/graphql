FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Shape-0.0.1-SNAPSHOT.jar Shape-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Shape/target/Shape-0.0.1-SNAPSHOT.jar Shape-0.0.1-SNAPSHOT.jar

ADD target/Shape-0.0.1-SNAPSHOT.jar Shape-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Shape/0.0.1-SNAPSHOT/Shape-0.0.1-SNAPSHOT.jar Shape-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Shape-0.0.1-SNAPSHOT.jar"]
