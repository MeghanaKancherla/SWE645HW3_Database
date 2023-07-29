FROM ubuntu
#RUN apt-get update && apt-get install -y openjdk-17-jdk && apt-get install -y unzip
#RUN mkdir database

#COPY newhw3.war /database
#COPY SWE645hw3-0.0.1-SNAPSHOT.jar /database
#RUN unzip database/newhw3.war

#WORKDIR /database

#CMD ["mvm clean package"]

#CMD ["bash"]

#CMD ["/usr/bin/java", "-jar", "SWE645hw3-0.0.1-SNAPSHOT.jar"]

#ADD newhw3.war /usr/local/tomcat/webapps/

#CMD ["catalina.sh", "run"]

VOLUME /tmp
COPY SWE645hw3-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
