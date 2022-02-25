FROM adoptopenjdk:11-jre-hotspot
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]