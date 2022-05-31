FROM maven:3.8.5-openjdk-17 as build-stage

ENV MAVEN_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1"
WORKDIR /opt/service
COPY pom.xml .
RUN mvn dependency:go-offline
COPY ./src ./src
RUN mvn clean install -Dmaven.test.skip=true
RUN mvn sonar:sonar -Dsonar.url=https://sonarcloud.io -Dsonar.login=2bc897157733605299c489d99fa4b7de4b2d8083

FROM openjdk:17
WORKDIR /opt/service
COPY --from=build-stage /opt/service/target/backend.jar /opt/service
ENTRYPOINT ["java","-jar","/opt/service/backend.jar"]
