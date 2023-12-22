FROM maven:3-amazoncorretto-21-debian-bookworm AS build

ENV WORKDIR="/build"

WORKDIR ${WORKDIR}

COPY ./java ${WORKDIR}

RUN mvn package

FROM openjdk:21-bullseye

ENV WORKDIR="/opt/animal"

WORKDIR ${WORKDIR}

COPY --from=build "/build/target/animal-api-0.0.1-SNAPSHOT.jar" "${WORKDIR}/animal-api-0.0.1-SNAPSHOT.jar"

EXPOSE 5001

ENTRYPOINT ["java", "-jar", "animal-api-0.0.1-SNAPSHOT.jar"]
