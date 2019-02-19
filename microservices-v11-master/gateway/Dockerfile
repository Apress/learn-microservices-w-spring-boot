FROM openjdk:8-jdk-alpine
VOLUME ["/tmp"]
ADD "target/gateway-0.11.0-SNAPSHOT.jar" app.jar
ENV JAVA_OPTS=""
EXPOSE 8000
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
