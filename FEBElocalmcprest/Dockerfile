FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/FEBElocalmcprest-0.0.1-SNAPSHOT.jar FEBElocalmcprest-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/FEBElocalmcprest/target/FEBElocalmcprest-0.0.1-SNAPSHOT.jar FEBElocalmcprest-0.0.1-SNAPSHOT.jar

ADD target/FEBElocalmcprest-0.0.1-SNAPSHOT.jar FEBElocalmcprest-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/FEBElocalmcprest/0.0.1-SNAPSHOT/FEBElocalmcprest-0.0.1-SNAPSHOT.jar FEBElocalmcprest-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "FEBElocalmcprest-0.0.1-SNAPSHOT.jar"]
