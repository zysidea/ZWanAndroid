package com.zysidea.libsrc.version

class Third {

    val gson = "com.google.code.gson:gson:2.8.2"
    val guava = Guava()
    val eventBus = EventBus()
    val retrofit = Retrofit()
    val parcel = Parcel()
    val rx = Rx()

    class Guava {
        private val guava = "com.google.guava:guava:20.0"
        val guava_android = "com.google.guava:guava:24.0-android"
    }

    class EventBus {
        private val version = "3.0.0"
        val eventbus = "org.greenrobot:eventbus:$version"
        val eventbusProcessor = "org.greenrobot:eventbus-annotation-processor:$version"
    }

    class Retrofit {
        private val version = "2.9.0"
        val retrofit = "com.squareup.retrofit2:retrofit:$version"
        val gson = "com.squareup.retrofit2:converter-gson:$version"
        val rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:$version"
    }

    class Parcel{
        private val parcelerVersion = "1.1.12"
        val parceler = "org.parceler:parceler:$parcelerVersion"
        val parceler_api = "org.parceler:parceler-api:$parcelerVersion"
    }

    class Rx {
        val rxjava = "io.reactivex.rxjava2:rxjava:2.1.8"
        val rxandroid = "io.reactivex.rxjava2:rxandroid:2.0.1"
    }

}