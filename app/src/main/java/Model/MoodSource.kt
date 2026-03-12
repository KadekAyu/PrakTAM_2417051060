package com.example.praktam_2417051060.model
import com.example.praktam_2417051060.R

object MoodSource {

    val dummyMood = listOf(
        MoodMusic(
            mood = "Fokus",
            deskripsi = "Musik instrumental untuk meningkatkan konsentrasi.",
            judul = "Nuvole Bianche",
            artist = "Ludovico Einaudi",
            playlist = "Deep Focus",
            imageRes = R.drawable.fokus
        ),
        MoodMusic(
            mood = "Santai",
            deskripsi = "Musik chill untuk relaksasi.",
            judul = "Lowkey",
            artist = "NIKI",
            playlist = "Chill Vibes",
            imageRes = R.drawable.santai
        ),
        MoodMusic(
            mood = "Sedih",
            deskripsi = "Lagu mellow untuk menemani suasana hati.",
            judul = "Secukupnya",
            artist = "Hindia",
            playlist = "Sad Hours",
            imageRes = R.drawable.sedih
        ),
        MoodMusic(
            mood = "Semangat",
            deskripsi = "Musik upbeat untuk meningkatkan energi.",
            judul = "Uptown Funk",
            artist = "Bruno Mars",
            playlist = "Workout Boost",
            imageRes = R.drawable.semangat
        )
    )
}