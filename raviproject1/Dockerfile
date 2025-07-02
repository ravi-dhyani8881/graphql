FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/raviproject1-0.0.1-SNAPSHOT.jar raviproject1-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/raviproject1/target/raviproject1-0.0.1-SNAPSHOT.jar raviproject1-0.0.1-SNAPSHOT.jar

ADD target/raviproject1-0.0.1-SNAPSHOT.jar raviproject1-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/raviproject1/0.0.1-SNAPSHOT/raviproject1-0.0.1-SNAPSHOT.jar raviproject1-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "raviproject1-0.0.1-SNAPSHOT.jar"]
