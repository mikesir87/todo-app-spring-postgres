FROM azul/zulu-openjdk:21.0.6-21.40-jre
COPY target/*.jar ./app.jar
CMD ["java", "-jar", "app.jar"]