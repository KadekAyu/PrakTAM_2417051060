package data.repository
import data.api.RetrofitClient
import data.model.MoodMusic


class MoodRepository {
    suspend fun getMoods(): List<MoodMusic> {
        return try {
            RetrofitClient.instance.getMoods()
        } catch (e: Exception) {
            emptyList()
        }
    }
}