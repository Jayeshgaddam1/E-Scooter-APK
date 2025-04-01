// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")
    }
}

allprojects {
    repositories {


    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}