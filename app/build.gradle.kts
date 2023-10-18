
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.10" // <1>

    application // <2>
}

repositories {
    mavenCentral() // <3>
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5") // <4>

    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.3") // <5>

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("com.google.guava:guava:32.1.1-jre") // <6>

    implementation("com.webauthn4j:webauthn4j-spring-security-core:0.9.0.RELEASE")
}

application {
    mainClass.set("demo.AppKt") // <7>
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <8>
}
