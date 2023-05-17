@file:Suppress("MemberVisibilityCanBePrivate")

package com.chrynan.navigation.buildSrc

object LibraryConstants {

    const val group = "com.qawaz.navigation"
    const val owner = "chrynan"
    const val repoName = "navigation"
    const val versionName = "0.7.1"
    const val versionCode = 10
    const val versionDescription = "Release $versionName ($versionCode)"
    const val license = "Apache-2.0"
    const val vcsUrl = "https://github.com/chRyNaN/navigation.git"

    object Android {

        const val compileSdkVersion = 33
        const val minSdkVersion = 21
        const val targetSdkVersion = 33
    }
}
