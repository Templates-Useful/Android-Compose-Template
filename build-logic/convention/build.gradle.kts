plugins {
  `kotlin-dsl`
}

dependencies {
  compileOnly(libs.android.gradle)
  compileOnly(libs.compose.gradle)
  compileOnly(libs.kotlin.gradle)
  compileOnly(libs.ksp.gradle)
}

gradlePlugin {
  plugins {
    register("templateapp.application") {
      id = "templateapp.application"
      implementationClass = "ApplicationConventionPlugin"
    }
    
    register("templateapp.library") {
      id = "templateapp.library"
      implementationClass = "LibraryConventionPlugin"
    }
    
    register("templateapp.compose") {
      id = "templateapp.compose"
      implementationClass = "ComposeConventionPlugin"
    }
  }
}