package com.tbegames.and.top_speed_drag_racing.fggttgtggt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tbegames.and.top_speed_drag_racing.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        onDestroy()
    }
}