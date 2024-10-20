buildscript {
    repositories {
        google()
        // Other repositories...
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.14")
        classpath ("com.android.tools.build:gradle:4.2.0")
        classpath ("com.google.gms:google-services:4.3.10")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}