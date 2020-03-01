FROM java
CMD ["java", "-version"]
ADD docker-mloine-0.0.1-SNAPSHOT.jar docker-mloine-0.0.1-SNAPSHOT.jar
#ADD  ${project.build.finalName}.jar ${project.build.finalName}.jar
EXPOSE 8080
VOLUME /tmp
ENTRYPOINT ["java", "-jar", "/docker-mloine-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-jar", "/${project.build.finalName}.jar"]


