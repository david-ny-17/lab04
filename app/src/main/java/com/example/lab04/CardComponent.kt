package com.example.lab04

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DemoCard() {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text("Componente Card con contenido dentro.", modifier = Modifier.padding(12.dp))
    }
}