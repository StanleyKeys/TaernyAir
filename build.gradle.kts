import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


//buildscript {
//    repositories {
//        mavenCentral()
//    }
//    dependencies {
//        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.16.2")
//    }
//}
//apply(plugin = "kotlinx-atomicfu")

plugins {
    kotlin("jvm") version "1.8.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    implementation("io.ktor:ktor-client-core:1.6.2")
    implementation("io.ktor:ktor-client-cio:1.6.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}