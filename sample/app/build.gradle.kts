plugins {
    id("sample.android.application")
    id("sample.android.compose")
    id("kotlin-parcelize")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.turo.nibel.sample"

    defaultConfig {
        applicationId = "com.turo.nibel.sample"
    }
}

dependencies {
    implementation(projects.sample.common)
    implementation(projects.sample.navigation)
    implementation(projects.sample.featureA)
    implementation(projects.sample.featureB)
    implementation(projects.sample.featureC)

    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.compose.activity)
    implementation(libs.nibel.runtime)

    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
}
