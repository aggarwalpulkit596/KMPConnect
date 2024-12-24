package com.supernova.kmpconnect

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform