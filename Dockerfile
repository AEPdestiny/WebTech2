# Verwende ein offizielles Gradle-Image als Basis
FROM gradle:jdk21-jammy AS build

# Setze das Arbeitsverzeichnis
WORKDIR /home/gradle/src

# Kopiere den Inhalt des aktuellen Verzeichnisses in das Arbeitsverzeichnis
COPY --chown=gradle:gradle . .

# Führe den Build-Prozess aus
RUN gradle build --no-daemon

# Verwende ein offizielles Eclipse Temurin-Image als Basis für den Laufzeit-Container
FROM eclipse-temurin:21-jdk

# Setze das Arbeitsverzeichnis
WORKDIR /app

# Kopiere das erstellte JAR-File vom Build-Container in das Laufzeit-Image
COPY --from=build /home/gradle/src/build/libs/*.jar app.jar

# Definiere den Befehl zum Starten der Anwendung
ENTRYPOINT ["java", "-jar", "app.jar"]
