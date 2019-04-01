FROM openjdk:8-jdk-alpine
VOLUME ["/tmp"]
ADD "target/gateway-v8-0.8.0-SNAPSHOT.jar" app.jar
ENV JAVA_OPTS=""
ENV REGISTRY_HOST=registry
ENV REGISTRY_PORT=8761
EXPOSE 8000
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
