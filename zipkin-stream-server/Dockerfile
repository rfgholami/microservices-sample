# Start with a base image containing Java runtime
FROM openjdk:8u111-jre-alpine

# Add Maintainer Info
LABEL maintainer="rf.gholami@yahoo.com"

# Add a volume pointing to /tmp
VOLUME /tmp

EXPOSE 9411


# The application's jar file
ARG JAR_FILE=target/zipkin-stream-server-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} zipkin-stream-server.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/zipkin-stream-server.jar"]

