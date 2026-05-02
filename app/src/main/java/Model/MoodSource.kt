package com.example.praktam_2417051060.model

import android.content.Context

object MoodSource {

    fun getResourceId(context: Context, imageName: String): Int {
        return context.resources.getIdentifier(
            imageName,
            "drawable",
            context.packageName)
    }
}