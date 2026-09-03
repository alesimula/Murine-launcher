plugins {
    id("com.android.library")
}

android {
    namespace = "com.android.wm.shell.shared"

    compileSdk = 36

    defaultConfig {
        minSdk = 26
        // Gone from the AGP 9 library DSL; only ever fed instrumentation tests, which we have none of
        //targetSdk = 36

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }
    sourceSets {
        named("main") {
            java.directories.apply { clear(); add("src") }
            kotlin.directories.add("src")
            manifest.srcFile("AndroidManifest.xml")
            res.directories.apply { clear(); add("res") }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    implementation("androidx.core:core:1.16.0")
    implementation("androidx.annotation:annotation:1.9.1")
    implementation("androidx.core:core-animation:1.0.0")
    implementation("androidx.dynamicanimation:dynamicanimation-ktx:1.1.0")
    implementation("androidx.window:window:1.5.1")
    implementation("javax.inject:javax.inject:1")
    compileOnly(project(":flagslib"))
}
