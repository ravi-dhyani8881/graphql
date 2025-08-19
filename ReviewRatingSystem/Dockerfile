FROM eclipse-temurin:17-jre-focal
EXPOSE 8082
# ADD target/ReviewRatingSystem-0.0.1-SNAPSHOT.jar ReviewRatingSystem-0.0.1-SNAPSHOT.jar

# ADD /home/runner/work/graphql/graphql/ReviewRatingSystem/target/ReviewRatingSystem-0.0.1-SNAPSHOT.jar ReviewRatingSystem-0.0.1-SNAPSHOT.jar

ADD target/ReviewRatingSystem-0.0.1-SNAPSHOT.jar ReviewRatingSystem-0.0.1-SNAPSHOT.jar

# ADD /home/runner/.m2/repository/com/spring/graph/ReviewRatingSystem/0.0.1-SNAPSHOT/ReviewRatingSystem-0.0.1-SNAPSHOT.jar ReviewRatingSystem-0.0.1-SNAPSHOT.jar
# /home/runner/.m2/repository/com/spring/graph/Prototype/0.0.1-SNAPSHOT/Prototype-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ReviewRatingSystem-0.0.1-SNAPSHOT.jar"]
