FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/jayproject-0.0.1-SNAPSHOT.jar jayproject-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/jayproject/target/jayproject-0.0.1-SNAPSHOT.jar jayproject-0.0.1-SNAPSHOT.jar

ADD target/jayproject-0.0.1-SNAPSHOT.jar jayproject-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/jayproject/0.0.1-SNAPSHOT/jayproject-0.0.1-SNAPSHOT.jar jayproject-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "jayproject-0.0.1-SNAPSHOT.jar"]
