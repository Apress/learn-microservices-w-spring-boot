FROM openjdk:8-jre
VOLUME ["/data/multiplication","/tmp"]
ADD "target/social-multiplication-v8-0.8.0-SNAPSHOT.jar" app.jar
ENV JAVA_OPTS=""
ENV APPLICATION_DATA_PATH="/data/multiplication"
ENV SPRING_RABBITMQ_HOST=rabbitmq
ENV SPRING_RABBITMQ_PORT=5672
ENV SPRING_RABBITMQ_USERNAME=guest
ENV SPRING_RABBITMQ_PASSWORD=guest
ENV REGISTRY_HOST=registry
ENV REGISTRY_PORT=8761
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
