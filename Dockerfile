FROM openjdk:17
COPY target/executable.jar executable.jar 
RUN Java -jar executable.jar