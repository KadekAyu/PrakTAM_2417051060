package com.example.praktam_2417051060

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.praktam_2417051060.model.MoodMusic
import com.example.praktam_2417051060.model.MoodSource
import com.example.praktam_2417051060.ui.theme.PrakTAM_2417051060Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2417051060Theme {
                DaftarMoodScreen()
            }
        }
    }
}

@Composable
fun DaftarMoodScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

        Text(
            text = "Mood Music",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        MoodSource.dummyMood.forEach { mood ->
            DetailMoodScreen(mood)
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun DetailMoodScreen(mood: MoodMusic) {
    var isFavorite by remember { mutableStateOf(false) }
    var isPlaying by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Box {
            Image(
                painter = painterResource(id = mood.imageRes),
                contentDescription = mood.mood,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Fit

            )

            IconButton(
                onClick = { isFavorite = !isFavorite },
                modifier = Modifier.align(Alignment.TopEnd).padding(8.dp)
            ) {
                Icon(
                    imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = "Favorite",
                    tint = if (isFavorite) Color.Red else Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = mood.mood,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = mood.deskripsi,
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row {
            Text("Playlist: ", fontWeight = FontWeight.Bold)
            Text(mood.playlist)
        }

        Row {
            Text("Artist: ", fontWeight = FontWeight.Bold)
            Text(mood.artist)
        }

        Row {
            Text("Judul: ", fontWeight = FontWeight.Bold)
            Text(mood.judul)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isPlaying = !isPlaying },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(if (isPlaying) "Sedang Diputar" else "Putar Sekarang")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDaftarMood() {
    PrakTAM_2417051060Theme {
        DaftarMoodScreen()
    }
}