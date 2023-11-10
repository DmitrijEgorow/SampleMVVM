plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

@Suppress("UnstableApiUsage")
android {
    defaultConfig {
        applicationId = "ru.myitschool.lab23"
        versionCode = 1
        versionName = "0.0.1"

        targetSdk = 33
        minSdk = 30
        compileSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    lint {
        warningsAsErrors = true
        ignoreWarnings = false
        abortOnError = true
        checkAllWarnings = true
        lintConfig = file("lint.xml")
        lint {
            disable.addAll(
                listOf(
                    "InvalidPackage",
                    "UnusedIds",
                    "GradleDependency",
                    "UnusedResources",
                )
            )
        }
    }

    /*applicationVariants.all {
        val lintTask = tasks["lint${name.capitalize()}"]
        assembleProvider.get().dependsOn.add(lintTask)
    }*/

    buildFeatures {
        viewBinding = true
    }
    namespace = "ru.myitschool.lab23"
}

dependencies {

    implementation(libs.android.material)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.core.ktx)
    implementation(libs.koin.android)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.androidx.test.ext)

}