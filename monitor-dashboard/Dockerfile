# Start with a base image containing Java runtime
FROM openjdk:8u111-jre-alpine

# Add Maintainer Info
LABEL maintainer="rf.gholami@yahoo.com"

# Add a volume pointing to /tmp
VOLUME /tmp

EXPOSE 7979

# The application's jar file
ARG JAR_FILE=target/monitor-dashboard-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} monitor-dashboard.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/monitor-dashboard.jar"]

