package com.example.praktam_2417051060

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktam_2417051060.model.MoodSource
import com.example.praktam_2417051060.ui.theme.PrakTAM_2417051060Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2417051060Theme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    val mood = MoodSource.dummyMood[0]  // ambil 1 data dari index ke-0

    Column(modifier = Modifier. fillMaxSize().padding(24.dp)) {
        Text(text = "Mood: ${mood.mood}")
        Text(text = "Deskripsi: ${mood.deskripsi}")
        Text(text = "Artist: ${mood.artist}")
        Text(text = "Playlist: ${mood.playlist}")
    }
}

