FROM gradle:8.3.0-jdk20

WORKDIR /app

COPY /app .

RUN ./gradlew build

CMD ./build/install/app/bin/app
