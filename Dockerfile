FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the built JAR into the image
# The actual JAR name will be passed dynamically
COPY target/*.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
