//
//buildscript {
//    repositories {
//        jcenter()
//    }
//}

plugins {
    java // or kotlin if algs4 is in kotlin
//    id "com.jfrog.bintray" version "1.7"
}

group = "edu.princeton.cs" // Match algs4 group if you know it
version = "1.0.1" // Or whatever version you are using

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(11)
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-Xlint:-unchecked")
}
// If algs4 is a git submodule, you don't need to do anything here.
// If you've just cloned it, you might want to create a jar
//tasks.register("createAlgs4Jar", Jar::class) {
//    archiveFileName.set("algs4.jar")
//    from(sourceSets.main.get().output)
//}

// You can publish to local maven if you want to reuse the library in other projects
// publishing {
//     publications {
//         maven(MavenPublication) {
//             from components.java
//         }
//     }
// }
// repositories {
//     mavenLocal()
// }
