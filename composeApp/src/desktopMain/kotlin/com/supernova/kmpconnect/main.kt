package com.supernova.kmpconnect

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMPConnect",
    ) {
        App()
    }
}