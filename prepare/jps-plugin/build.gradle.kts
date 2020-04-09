description = "Kotlin JPS plugin"

plugins {
    java
}

val compilerComponents by extra(
    listOf(
        ":core:type-system",
        ":kotlin-build-common",
        ":kotlin-util-io",
        ":kotlin-util-klib",
        ":kotlin-util-klib-metadata",
        ":compiler:cli-common",
        ":kotlin-compiler-runner",
        ":daemon-common",
        ":daemon-common-new",
        ":core:descriptors",
        ":core:descriptors.jvm",
        ":idea:idea-jps-common",
        ":kotlin-preloader",
        ":compiler:util",
        ":compiler:config",
        ":compiler:config.jvm",
        ":js:js.config",
        ":core:util.runtime",
        ":compiler:compiler.version"
    )
)

val projectsToShadow = compilerComponents + listOf(":jps-plugin")

dependencies {
    projectsToShadow.forEach {
        embedded(project(it)) { isTransitive = false }
    }

    embedded(projectRuntimeJar(":kotlin-daemon-client"))
}

runtimeJar {
    manifest.attributes["Main-Class"] = "org.jetbrains.kotlin.runner.Main"
    manifest.attributes["Class-Path"] = "kotlin-stdlib.jar"
    from(files("$rootDir/resources/kotlinManifest.properties"))
}
