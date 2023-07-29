FROM ubuntu
RUN apt-get update && apt-get install -y openjdk-17-jdk && apt-get install -y unzip
RUN mkdir database

COPY newhw3.war /database
#COPY SWE645hw3-0.0.1-SNAPSHOT.jar /database
RUN unzip database/newhw3.war

WORKDIR /database

CMD ["bash"]

CMD ["/usr/bin/java", "-jar", "/newhw3/target/SWE645hw3-0.0.1-SNAPSHOT.jar"]


EXPOSE 8080
