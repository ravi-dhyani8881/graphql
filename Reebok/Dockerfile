FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/Reebok-0.0.1-SNAPSHOT.jar Reebok-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/Reebok/target/Reebok-0.0.1-SNAPSHOT.jar Reebok-0.0.1-SNAPSHOT.jar

ADD target/Reebok-0.0.1-SNAPSHOT.jar Reebok-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/Reebok/0.0.1-SNAPSHOT/Reebok-0.0.1-SNAPSHOT.jar Reebok-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Reebok-0.0.1-SNAPSHOT.jar"]
