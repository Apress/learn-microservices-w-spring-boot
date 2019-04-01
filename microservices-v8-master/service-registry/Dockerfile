FROM openjdk:8-jdk-alpine
VOLUME ["/tmp"]
ADD "target/service-registry-v8-0.8.0-SNAPSHOT.jar" app.jar
ENV JAVA_OPTS=""
EXPOSE 8761
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
