package com.example.praktam_2417051060.model
import androidx.annotation.DrawableRes

data class MoodMusic(
    val mood: String,
    val deskripsi: String,
    val judul: String,
    val artist: String,
    val playlist: String,
    @DrawableRes val imageRes: Int
)