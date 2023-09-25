FROM openjdk:8
COPY target/executable.jar executable.jar 
RUN Java -jar executable.jar