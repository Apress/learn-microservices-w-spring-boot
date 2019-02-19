FROM openjdk:8-jre
VOLUME ["/data/social-multiplication","/tmp"]
ADD "target/social-multiplication-0.11.0-SNAPSHOT.jar" app.jar
ENV JAVA_OPTS=""
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
