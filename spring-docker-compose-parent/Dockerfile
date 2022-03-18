FROM java:8
ARG JAR_FILE=target/parent-service.jar
COPY ${JAR_FILE} app.jar
EXPOSE 6090
ENTRYPOINT ["java","-jar","app.jar"] 
