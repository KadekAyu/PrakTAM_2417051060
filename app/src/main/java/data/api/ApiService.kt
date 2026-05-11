package data.api

import data.model.MoodMusic
import retrofit2.http.GET

interface ApiService {

    @GET("mood_music.json")
    suspend fun getMoods(): List<MoodMusic>
}