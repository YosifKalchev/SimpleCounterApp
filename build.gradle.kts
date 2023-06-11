plugins {
    //trick: for the same plugin versions in all sub-modules
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
}

buildscript {
    dependencies {
        // Use the same version in the error
        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.17.3")
    }
}

allprojects {
    apply(plugin = "kotlinx-atomicfu")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
