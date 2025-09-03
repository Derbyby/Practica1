package com.example.practica1

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practica1.ui.theme.Practica1Theme

class MainActivity : ComponentActivity() {
    val miColor = Color(0xFFFFEB46) // Color amarillo claro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = miColor
                ) {
                    GreetingMessage(
                        name = "Yessenia Morones",
                        numcontrol = "22130839",
                        modifier = Modifier.padding()
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingMessage(name: String, numcontrol: String, modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = 100.sp,
            lineHeight = 120.sp,
            color = Color(0xFF4052D6)
        )
        Text(
            text = numcontrol,
            fontSize = 30.sp
        )
    }
}