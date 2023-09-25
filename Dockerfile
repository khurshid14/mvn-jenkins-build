FROM openjdk:21
COPY target/executable.jar executable.jar 
RUN Java -jar executable.jar