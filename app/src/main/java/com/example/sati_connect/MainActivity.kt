package com.example.sati_connect

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    private fun startActivity(intent: Any, mainActivity: MainActivity, java: Class<RegisterActivity>) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        6
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        },3000)


    }
}