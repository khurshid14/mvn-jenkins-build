FROM openjdk:21
COPY target/executable.jar executable.jar 
RUN java -jar executable.jar