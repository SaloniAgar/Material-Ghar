package com.example.materialghar.sem1

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.materialghar.R

class Sem1SubjectsActivity : AppCompatActivity() {

    lateinit var btnCpp : Button
    lateinit var btnDLD : Button
    lateinit var btnEC : Button
    lateinit var btnEMI : Button
    lateinit var btnMaths : Button
    lateinit var btnHV : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem1_subjects)


        btnCpp = findViewById(R.id.btnCpp)
        btnDLD = findViewById(R.id.btnDLD)
        btnEC = findViewById(R.id.btnEC)
        btnEMI = findViewById(R.id.btnEMI)
        btnMaths = findViewById(R.id.btnMaths)
        btnHV = findViewById(R.id.btnHV)

        val intent : Intent = Intent(this@Sem1SubjectsActivity,
            Sem1BookActivity::class.java)

        btnCpp.setOnClickListener {
                watchYouTubeVideo("yGB9jhsEsr8")
        }

        btnDLD.setOnClickListener {
            watchYouTubePlaylist("https://www.youtube.com/playlist?list=PLBlnK6fEyqRjMH3mWf6kwqiTbT798eAOm")
        }

        btnEC.setOnClickListener {
            watchYouTubePlaylist("https://www.youtube.com/playlist?list=PL9RcWoqXmzaI7KDKsQZFf6l5LFgfMo7So")

        }

        btnEMI.setOnClickListener {

                intent.putExtra("Subject","EMI")
                startActivity(intent)

        }

        btnMaths.setOnClickListener {

                watchYouTubeVideo("imWeJJhnHCQ")


        }

        btnHV.setOnClickListener {
                intent.putExtra("Subject","HV")
                startActivity(intent)
        }
    }

    private fun watchYouTubeVideo(videoId:String) {
        val appIntent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        val browserIntent =
            Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com.watch?v=$videoId"))
        try {
            startActivity(appIntent)
        } catch (ex: ActivityNotFoundException) {
            startActivity(browserIntent)
        }
    }
    private fun watchYouTubePlaylist(playlistUrl:String) {

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(playlistUrl))
        startActivity(browserIntent)

    }

}