# Use Java 17 JDK
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy all project files to container
COPY . .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Build the project (skip tests for faster deploy)
RUN ./mvnw clean package -DskipTests

# Expose the port (Render sets PORT env variable)
EXPOSE 8080

# Run the Spring Boot jar
CMD ["java", "-jar", "target/Card*.jar"]
