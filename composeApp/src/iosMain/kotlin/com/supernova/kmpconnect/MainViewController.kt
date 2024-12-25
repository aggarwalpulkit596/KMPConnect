package com.supernova.kmpconnect

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@ExperimentalUuidApi
val service by lazy {
    createNetService(
        type = SERVICE_TYPE,
        name = "iOS-${Uuid.random()}",
        port = 8080,
        txt =
        mapOf(
            "key1" to "value1",
        ),
    )
}

@ExperimentalUuidApi
fun MainViewController(): UIViewController = ComposeUIViewController {
    App(
        service = service,
    )
}
