FROM beresfordt/alpine-java8

EXPOSE 8080
COPY build/libs/insultgenerator-api.jar /insultgenerator-api.jar

CMD ["java", "-jar", "/insultgenerator-api.jar"]