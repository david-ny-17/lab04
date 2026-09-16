package com.example.lab04

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun DemoAlertDialog() {
    var open by remember { mutableStateOf(false) }
    Button(onClick = { open = true }) { Text("Ver AlertDialog") }
    if (open) {
        AlertDialog(
            onDismissRequest = { open = false },
            title = { Text("Diálogo AlertDialog") },
            text = { Text("Contenido del mensaje.") },
            confirmButton = { Button(onClick = { open = false }) { Text("Cerrar") } }
        )
    }
}