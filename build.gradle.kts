plugins {
    kotlin("jvm") version "1.3.72"
    `maven-publish`
}

group = "net.perfectdreams"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.github.kevinsawicki:http-request:6.0")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("io.github.microutils:kotlin-logging:1.8.0.1")
    implementation("com.github.salomonbrys.kotson:kotson:2.5.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

publishing {
    repositories {
        maven {
            name = "PerfectDreams"
            url = uri("https://repo.perfectdreams.net/")

            credentials {
                username = System.getProperty("USERNAME") ?: System.getenv("USERNAME")
                password = System.getProperty("PASSWORD") ?: System.getenv("PASSWORD")
            }
        }
    }
    publications {
        register("PerfectDreams", MavenPublication::class.java) {
            this.artifactId = "merkadopago" // To not use the "KercadoPago" name for the packages
            from(components["java"])
        }
    }
}