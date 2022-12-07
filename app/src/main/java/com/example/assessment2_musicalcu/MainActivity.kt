package com.example.assessment2_musicalcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insPopup = InstructionPopUp()

        insPopup.show(supportFragmentManager, "InstructionModal")

        mood1.setOnClickListener {
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Happy")

            mood2.isChecked = !mood1.isChecked
            mood3.isChecked = !mood1.isChecked
            mood4.isChecked = !mood1.isChecked
        }

        mood2.setOnClickListener {
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Sad")

            mood1.isChecked = !mood2.isChecked
            mood3.isChecked = !mood2.isChecked
            mood4.isChecked = !mood2.isChecked
        }

        mood3.setOnClickListener {
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Anxious")

            mood1.isChecked = !mood3.isChecked
            mood2.isChecked = !mood3.isChecked
            mood4.isChecked = !mood3.isChecked

        }
        mood4.setOnClickListener {
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Excited")

            mood1.isChecked = !mood4.isChecked
            mood2.isChecked = !mood4.isChecked
            mood3.isChecked = !mood4.isChecked
        }

        //genre buttons

        genre1.setOnClickListener {
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("Pop")

            genre2.isChecked = !genre1.isChecked
            genre3.isChecked = !genre1.isChecked
            genre4.isChecked = !genre1.isChecked
        }

        genre2.setOnClickListener {
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("RnB")

            genre1.isChecked = !genre2.isChecked
            genre3.isChecked = !genre2.isChecked
            genre4.isChecked = !genre2.isChecked
        }

        genre3.setOnClickListener {
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("Country")

            genre1.isChecked = !genre3.isChecked
            genre2.isChecked = !genre3.isChecked
            genre4.isChecked = !genre3.isChecked
        }


        genre4.setOnClickListener {
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("Gospel")

            genre1.isChecked = !genre4.isChecked
            genre2.isChecked = !genre4.isChecked
            genre3.isChecked = !genre4.isChecked
        }



    }

    fun Calculate(view: View) {
        if (mood1.isChecked && genre1.isChecked){
            val vidPopup = HappyPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if (mood1.isChecked && genre2.isChecked){
            val vidPopup = HappyRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood1.isChecked && genre3.isChecked){
            val vidPopup = HappyCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood1.isChecked && genre4.isChecked) {
            val vidPopup = HappyGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood2.isChecked && genre1.isChecked) {
            val vidPopup = SadPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood2.isChecked && genre2.isChecked) {
            val vidPopup = SadRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood2.isChecked && genre3.isChecked) {
            val vidPopup = SadCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood2.isChecked && genre4.isChecked) {
            val vidPopup = SadGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood3.isChecked && genre1.isChecked) {
            val vidPopup = AnxiousPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood3.isChecked && genre2.isChecked) {
            val vidPopup = AnxiousRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood3.isChecked && genre3.isChecked) {
            val vidPopup = AnxiousCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood3.isChecked && genre4.isChecked) {
            val vidPopup = AnxiousGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood4.isChecked && genre1.isChecked) {
            val vidPopup = ExcitedPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood4.isChecked && genre2.isChecked) {
            val vidPopup = ExcitedRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood4.isChecked && genre3.isChecked) {
            val vidPopup = ExcitedCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        else if(mood4.isChecked && genre4.isChecked) {
            val vidPopup = ExcitedGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }


    }

}