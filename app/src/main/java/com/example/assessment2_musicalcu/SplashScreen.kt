package com.example.assessment2_musicalcu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //displays the Splash Screen as full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({ //delays the splash screen for a few moments for a longer exposure
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000) //splash screen is delayed for 4000 miliseconds
    }
}