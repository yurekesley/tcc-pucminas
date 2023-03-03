FROM eclipse-temurin:11-jdk-alpine as builder

COPY . /usr/app
WORKDIR /usr/app
RUN chmod +x mvnw && ./mvnw clean package
RUN mkdir target/dependency && cd target/dependency; jar -xf ../*.jar

FROM eclipse-temurin:11-jre-alpine
ARG DEPENDENCY=/usr/app/target/dependency
RUN adduser -D app
USER app
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META_INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "com.boaentrega.msgestao.MsgestaoApplication"]

