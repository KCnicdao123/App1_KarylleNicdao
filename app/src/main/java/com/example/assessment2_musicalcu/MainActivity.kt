package com.example.assessment2_musicalcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insPopup = InstructionPopUp()

        insPopup.show(supportFragmentManager, "InstructionModal")
    }
}