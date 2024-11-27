FROM eclipse-temurin:21-jre-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} ClockDegree.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/ClockDegree.jar"]