import io.grpc.internal.SharedResourceHolder.release

plugins {
    id("com.android.library")
//    `maven-publish`
}

android {
    namespace = "com.github.jaykkumar01.mylibrary1"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

//afterEvaluate {
//    android.libraryVariants.forEach {  }
//}

//afterEvaluate {
//    publishing {
//        publications {
//// Creates a Maven publication called "release".
//            release(MavenPublication) {
//                from components.release
//                        groupId = 'com.github.Vipinbalakrishnan'
//                artifactId = 'ribbonlayout'
//                version = '1.1'
//            }
//        }
//    }
//}