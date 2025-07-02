//Group Task 4

# Use OpenJDK 23 as the base image
FROM openjdk:23

# Create directory and set permissions
RUN mkdir -p /app && chmod 777 /app

# Copy compiled Java files
COPY out/production/IS247GroupProject/ /app

# Set working directory
WORKDIR /app

# Run with explicit classpath and JSON-formatted CMD
CMD ["java", "-cp", "/app", "HelloWorld"]
