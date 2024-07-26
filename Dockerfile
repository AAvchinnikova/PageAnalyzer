FROM gradle:8.3.0-jdk20

WORKDIR /app

COPY /app .

RUN ./gradlew --no-daemon build

CMD ./build/install/app/bin/app
