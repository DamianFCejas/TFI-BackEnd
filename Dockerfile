FROM amazoncorretto:11-alpine-jdk

MAINTAINER emaaristimuno

COPY target/ProyectoFinal-0.0.1-SNAPSHOT.jar ProyectoFinal-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ProyectoFinal-0.0.1-SNAPSHOT.jar"]
