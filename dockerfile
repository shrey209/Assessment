FROM amazoncorretto:17

WORKDIR /app


COPY Assignment.jar /app/Assignment.jar

ENTRYPOINT ["java", "-jar", "Assignment.jar"]
