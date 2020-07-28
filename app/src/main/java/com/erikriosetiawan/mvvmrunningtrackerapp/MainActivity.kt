package com.erikriosetiawan.mvvmrunningtrackerapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiKey = BuildConfig.GOOGLE_MAPS_API_KEY
        Log.i("GOOGLE_MAPS_API_KEY", apiKey)
    }
}