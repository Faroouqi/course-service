FROM openjdk
LABEL maintaner = 'abc@mail.com'
EXPOSE 8088
WORKDIR /app
COPY target/course-service.jar /app/course-service.jar
ENTRYPOINT ["java","-jar","course-service.jar"]