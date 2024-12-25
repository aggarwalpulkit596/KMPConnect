package com.supernova.kmpconnect

import android.app.Application
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

class AndroidApp : Application() {
    @ExperimentalUuidApi
    companion object {
        internal val service by lazy {
            createNetService(
                type = SERVICE_TYPE,
                name = "Android-${Build.MODEL}",
                port = 8080,
                txt =
                mapOf(
                    "key1" to "value1",
                    "key2" to "value2",
                ),
            )
        }
    }
}

@ExperimentalUuidApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(
                service = AndroidApp.service,
            )
        }
    }
}