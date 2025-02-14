plugins {
    alias(libs.plugins.androidApplication)
}



android {
    namespace = "com.example.sikshasahayak"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sikshasahayak"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packaging{
        resources.excludes.add("META-INF/NOTICE.md")
        resources.excludes.add("META-INF/LICENSE.md")
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation("com.github.smarteist:autoimageslider:1.4.0")
    implementation("com.sun.mail:android-mail:1.6.6")
    implementation("com.sun.mail:android-activation:1.6.7")
    implementation ("com.squareup.picasso:picasso:2.8")
    implementation("com.android.volley:volley:1.2.1")
    implementation("com.github.bumptech.glide:glide:4.11.0")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation ("com.google.android.gms:play-services-auth:20.0.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}