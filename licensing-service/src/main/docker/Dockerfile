FROM openjdk:8-jdk-alpine
MAINTAINER dylan <dylan.zhang111@gmail.com>
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/licensingservice
ADD @project.build.finalName@.jar /usr/local/licensingservice/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
