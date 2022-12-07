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

        //sets value for instructional modal
        val insPopup = InstructionPopUp()
        //shows the instructional pop-up modal at the start of the app
        insPopup.show(supportFragmentManager, "InstructionModal")

        //mood buttons

        //button for the mood "happy"
        mood1.setOnClickListener {
            //changes the text of the top text view into the text on the button
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Happy")

            //unchecks the other buttons in the mood group once this button is selected
            mood2.isChecked = !mood1.isChecked
            mood3.isChecked = !mood1.isChecked
            mood4.isChecked = !mood1.isChecked
        }
        //button for mood "sad"
        mood2.setOnClickListener {
            //changes the text of the top text view into the text of the button
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Sad")

            //unchecks the other buttons once this button is selected
            mood1.isChecked = !mood2.isChecked
            mood3.isChecked = !mood2.isChecked
            mood4.isChecked = !mood2.isChecked
        }
        //button for mood "anxious"
        mood3.setOnClickListener {
            //changes the text of the top text view into the text of the button
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Anxious")

            //unchecks the other buttons in the mood group once this button is selected
            mood1.isChecked = !mood3.isChecked
            mood2.isChecked = !mood3.isChecked
            mood4.isChecked = !mood3.isChecked

        }
        //button for mood "excited"
        mood4.setOnClickListener {
            //changes the text of the top text view into the text of the button
            var moodText: TextView = findViewById(R.id.Mood)
            moodText.setText("Excited")

            //unchecks the other buttons in the mood group once this button is selected
            mood1.isChecked = !mood4.isChecked
            mood2.isChecked = !mood4.isChecked
            mood3.isChecked = !mood4.isChecked
        }

        //genre buttons

        //button for "pop" genre
        genre1.setOnClickListener {
            //changes the text of the bottom text view into the text of the button
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("Pop")

            //unchecks the other buttons in the genre group once this button is selected
            genre2.isChecked = !genre1.isChecked
            genre3.isChecked = !genre1.isChecked
            genre4.isChecked = !genre1.isChecked
        }
        //button for "RnB" genre
        genre2.setOnClickListener {
            //changes the text of the bottom text view into the text of the button
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("RnB")

            //unchecks the other buttons in the genre group once this button is selected
            genre1.isChecked = !genre2.isChecked
            genre3.isChecked = !genre2.isChecked
            genre4.isChecked = !genre2.isChecked
        }
        //button for "Country" genre
        genre3.setOnClickListener {
            //changes the text of the bottom text view into the text of the button
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("Country")

            //unchecks the other buttons in the genre group once this button is selected
            genre1.isChecked = !genre3.isChecked
            genre2.isChecked = !genre3.isChecked
            genre4.isChecked = !genre3.isChecked
        }
        //button for "Gospel" genre
        genre4.setOnClickListener {
            //changes the text of the bottom text view into the text of the button
            var genreText: TextView = findViewById(R.id.Genre)
            genreText.setText("Gospel")

            //unchecks the other buttons in the genre group once this button is selected
            genre1.isChecked = !genre4.isChecked
            genre2.isChecked = !genre4.isChecked
            genre3.isChecked = !genre4.isChecked
        }
    }

    //function for the calculate button
    fun Calculate(view: View) {
        //shows the modal for "happy pop" song
        if (mood1.isChecked && genre1.isChecked){
            val vidPopup = HappyPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "happy RnB" song
        else if (mood1.isChecked && genre2.isChecked){
            val vidPopup = HappyRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "happy country" song
        else if(mood1.isChecked && genre3.isChecked){
            val vidPopup = HappyCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "happy gospel" song
        else if(mood1.isChecked && genre4.isChecked) {
            val vidPopup = HappyGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "sad pop" song
        else if(mood2.isChecked && genre1.isChecked) {
            val vidPopup = SadPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "sad rnb" song
        else if(mood2.isChecked && genre2.isChecked) {
            val vidPopup = SadRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "sad country" song
        else if(mood2.isChecked && genre3.isChecked) {
            val vidPopup = SadCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "sad gospel" song
        else if(mood2.isChecked && genre4.isChecked) {
            val vidPopup = SadGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "anxious pop" song
        else if(mood3.isChecked && genre1.isChecked) {
            val vidPopup = AnxiousPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "anxious rnb" song
        else if(mood3.isChecked && genre2.isChecked) {
            val vidPopup = AnxiousRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "anxious country" song
        else if(mood3.isChecked && genre3.isChecked) {
            val vidPopup = AnxiousCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "anxious gospel" song
        else if(mood3.isChecked && genre4.isChecked) {
            val vidPopup = AnxiousGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "excited pop" song
        else if(mood4.isChecked && genre1.isChecked) {
            val vidPopup = ExcitedPop()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "excited rnb" song
        else if(mood4.isChecked && genre2.isChecked) {
            val vidPopup = ExcitedRnB()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "excited country" song
        else if(mood4.isChecked && genre3.isChecked) {
            val vidPopup = ExcitedCountry()
            vidPopup.show(supportFragmentManager, "Video")
        }
        //shows the modal for "excited gospel song
        else if(mood4.isChecked && genre4.isChecked) {
            val vidPopup = ExcitedGospel()
            vidPopup.show(supportFragmentManager, "Video")
        }


    }

}