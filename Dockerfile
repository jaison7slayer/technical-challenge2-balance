FROM openjdk:17-jdk-slim
VOLUME /tmp
EXPOSE 8002
ADD ./target/technical-challenge-balance-0.0.1-SNAPSHOT.jar technical-challenge-balance.jar
ENTRYPOINT ["java","-jar","/technical-challenge-balance.jar"]