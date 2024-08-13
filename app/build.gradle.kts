plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.dagger.hilt.android)
    alias(libs.plugins.google.firebase.crashlytics)
    alias(libs.plugins.androidx.navigation.safe.args)
}

android {
    namespace = "com.denise.castro.vouvotar"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.denise.castro.vouvotar"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    //Android
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    //Firebase
    implementation(libs.firebase.auth)
    implementation (platform(libs.firebase.bom))
    implementation(libs.firebase.firestore.ktx)
    implementation(libs.firebase.crashlytics)

    implementation(libs.loading.button.android)

    //Dagger Hilt
    implementation(libs.dagger.hilt.android)
    ksp(libs.hilt.compiler)

    //Room
    implementation(libs.androidx.room.common)

    //Glide
    implementation(libs.glide)
    ksp(libs.compiler)

    //Circular Image
    implementation(libs.circleimageview)

    //Navigation Component
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    //Coroutines with Firebase
    implementation(libs.kotlinx.coroutines.play.services)

    //Lottie Animation
    implementation(libs.lottie)

    //Tests
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}