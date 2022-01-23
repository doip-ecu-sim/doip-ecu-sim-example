plugins {
    kotlin("jvm") // Standalone: Add version
    id("com.github.johnrengelman.shadow") version "7.1.0"
    application
}

group = "com.github.doip-sim-ecu.exampleproject"
version = "0.2-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))

    // You can also define the newest bleeding edge version with com.github.doip-sim-ecu:doip-sim-ecu-dsl:main-SNAPSHOT
    implementation("com.github.doip-sim-ecu:doip-sim-ecu-dsl:0.1")
}

tasks {
    application {
        mainClass.set("MainKt")
    }
}