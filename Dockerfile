# Use an official base image
FROM openjdk:11-jdk-slim

# Install jq (JSON processor)
RUN apt-get update && apt-get install -y jq && apt-get install -y nano

# Set the working directory
WORKDIR /app

# Copy the JSON file and the script into the container
COPY config.json /app/config.json
COPY read_json.sh /app/read_json.sh

# Make sure the script is executable
RUN chmod +x /app/read_json.sh

# Define the command to run the script
CMD ["/app/read_json.sh"]
