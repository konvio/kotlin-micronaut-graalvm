FROM oracle/graalvm-ce:19.2.0.1 as graalvm
COPY . /home/app/kotlin-micronaut-graalvm
WORKDIR /home/app/kotlin-micronaut-graalvm
RUN gu install native-image
RUN native-image --no-server -cp build/libs/kotlin-micronaut-graalvm-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/kotlin-micronaut-graalvm .
ENTRYPOINT ["./kotlin-micronaut-graalvm"]
