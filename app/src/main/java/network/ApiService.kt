package com.example.praktam_2417051060.network

import com.example.praktam_2417051060.model.MoodMusic
import retrofit2.http.GET

interface ApiService {
    @GET("mood_music.json")
    suspend fun getMoods(): List<MoodMusic>
}