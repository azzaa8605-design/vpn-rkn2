
package com.vpnrkn.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    VPNHome()
                }
            }
        }
    }
}

@Composable
fun VPNHome() {
    var status by remember { mutableStateOf("Disconnected") }

    Column {
        Text(text = "VPN-RKN", style = MaterialTheme.typography.headlineLarge)
        Text(text = "Status: $status")

        Button(onClick = {
            status = if (status == "Disconnected") "Connected" else "Disconnected"
        }) {
            Text("CONNECT / DISCONNECT")
        }
    }
}
