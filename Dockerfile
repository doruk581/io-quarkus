FROM registry.fedoraproject.org/fedora-minimal
WORKDIR /work/
RUN pwd
COPY /target/my-artifactId-my-version-runner.jar /work/my-artifactId-my-version-runner.jar
EXPOSE 8080
RUN chmod +x my-artifactId-my-version-runner.jar
CMD ["./my-artifactId-my-version-runner.jar", "-Dquarkus.http.host=0.0.0.0"]