plugins {
    alias(libs.plugins.nowinandroid.android.feature)
}

android {
    namespace = "com.google.samples.apps.nowinandroid.feature.bookmarks.api"
}

dependencies {
    implementation(projects.core.common)
}