# Verwende ein offizielles Gradle-Image als Basis
FROM gradle:openjdk-21 AS build

# Setze das Arbeitsverzeichnis
WORKDIR /home/gradle/src

# Kopiere den Inhalt des aktuellen Verzeichnisses in das Arbeitsverzeichnis im Container
COPY --chown=gradle:gradle . /home/gradle/src

# Führe den Build-Befehl aus
RUN gradle build --no-daemon

# Verwende ein offizielles Eclipse Temurin-Image als Basis für den Laufzeit-Container
FROM eclipse-temurin:21-jdk

# Setze das Arbeitsverzeichnis
WORKDIR /app

# Kopiere das erstellte JAR-File vom Build-Container in das Laufzeit-Image
COPY --from=build /home/gradle/src/build/libs/WebTech_spring-0.0.1-SNAPSHOT.jar app.jar

# Definiere den Befehl zum Starten der Anwendung
ENTRYPOINT ["java", "-jar", "/app.jar"]
