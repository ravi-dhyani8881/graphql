FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/raviproject-0.0.1-SNAPSHOT.jar raviproject-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/raviproject/target/raviproject-0.0.1-SNAPSHOT.jar raviproject-0.0.1-SNAPSHOT.jar

ADD target/raviproject-0.0.1-SNAPSHOT.jar raviproject-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/raviproject/0.0.1-SNAPSHOT/raviproject-0.0.1-SNAPSHOT.jar raviproject-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "raviproject-0.0.1-SNAPSHOT.jar"]
