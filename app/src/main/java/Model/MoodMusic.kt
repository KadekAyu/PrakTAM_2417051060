package com.example.praktam_2417051060.model
import com.google.gson.annotations.SerializedName
data class MoodMusic(
    @SerializedName("mood")
    val mood: String,

    @SerializedName("deskripsi")
    val deskripsi: String,

    @SerializedName("judul")
    val judul: String,

    @SerializedName("artist")
    val artist: String,

    @SerializedName("playlist")
    val playlist: String,

    @SerializedName("image_url")
    val imageUrl: String
) {
}