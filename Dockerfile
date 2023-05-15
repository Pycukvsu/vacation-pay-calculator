FROM adoptopenjdk:11-jre-hotspot
ADD ./target/VacationCalculateService-0.0.1-SNAPSHOT.jar VacationCalculateService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","VacationCalculateService-0.0.1-SNAPSHOT.jar"]
