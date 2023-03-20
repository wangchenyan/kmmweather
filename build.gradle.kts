plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.4.2").apply(false)
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("android").version("1.8.0").apply(false)
    kotlin("multiplatform").version("1.8.0").apply(false)
}

buildscript {
    val sqlDelightVersion = "1.5.5"
    dependencies {
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
