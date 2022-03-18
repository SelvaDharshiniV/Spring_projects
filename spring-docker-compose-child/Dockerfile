FROM java:8
ARG JAR_FILE=target/child-service.jar
COPY ${JAR_FILE} app.jar
EXPOSE 6080
ENTRYPOINT ["java","-jar","app.jar"] 
