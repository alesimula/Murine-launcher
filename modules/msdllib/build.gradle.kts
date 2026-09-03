plugins {
    id("com.android.library")
}

android {
    namespace = "com.google.android.msdl"

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
    implementation(libs.core)
    implementation(libs.annotation)
}
