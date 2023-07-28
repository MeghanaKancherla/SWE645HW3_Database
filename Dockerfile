FROM ubuntu
RUN apt-get update && apt-get install -y openjdk-17-jdk && apt-get install -y unzip
RUN mkdir database

COPY newhw3.war database
CMD ["bash"]

CMD ["/usr/bin/java", "-jar", "645HW3/target/645hw3-0.0.1-SNAPSHOT.jar"]


EXPOSE 8080
