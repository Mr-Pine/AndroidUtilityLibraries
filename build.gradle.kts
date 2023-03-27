// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    kotlin("android") version libs.versions.kotlin.get() apply false
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    alias(libs.plugins.dokka)
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}

apply(from = "${rootDir}/scripts/publish-root.gradle")