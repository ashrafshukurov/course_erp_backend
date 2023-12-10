FROM openjdk
WORKDIR /home
COPY target/course-erp-backend-0.0.1.jar .
ENTRYPOINT ["java","-jar","course-erp-backend-0.0.1.jar"]