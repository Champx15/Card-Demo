# Use full Java 17 image (non-alpine)
FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# Build with system Maven (already in the image)
RUN mvn clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/Card*.jar"]
