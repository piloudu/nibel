plugins {
    id("sample.android.library")
    id("kotlin-parcelize")
}

android {
    namespace = "com.turo.nibel.sample.navigation"
}

dependencies {
    implementation(libs.nibel.runtime)
}
