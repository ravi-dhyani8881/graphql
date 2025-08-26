FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/FilterQuery-0.0.1-SNAPSHOT.jar FilterQuery-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/FilterQuery/target/FilterQuery-0.0.1-SNAPSHOT.jar FilterQuery-0.0.1-SNAPSHOT.jar

ADD target/FilterQuery-0.0.1-SNAPSHOT.jar FilterQuery-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/FilterQuery/0.0.1-SNAPSHOT/FilterQuery-0.0.1-SNAPSHOT.jar FilterQuery-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "FilterQuery-0.0.1-SNAPSHOT.jar"]
