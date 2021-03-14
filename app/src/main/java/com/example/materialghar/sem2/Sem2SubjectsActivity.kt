package com.example.materialghar.sem2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.materialghar.R

class Sem2SubjectsActivity : AppCompatActivity() {

    lateinit var btnMaths2 : Button
    lateinit var btnComSys : Button
    lateinit var btnPDW : Button
    lateinit var btnDSA : Button
    lateinit var btnCOA : Button
    lateinit var btnUnix : Button
    lateinit var btnJava : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem2_subjects)

        val material = intent.getStringExtra("Material")

        btnMaths2 = findViewById(R.id.btnMaths2)
        btnComSys = findViewById(R.id.btnComSys)
        btnPDW = findViewById(R.id.btnPDW)
        btnDSA = findViewById(R.id.btnDSA)
        btnCOA = findViewById(R.id.btnCOA)
        btnUnix = findViewById(R.id.btnUnix)
        btnJava = findViewById(R.id.btnJava)


        btnMaths2.setOnClickListener {
            if (material=="Notes"){
                openUrl("http://www.crectirupati.com/sites/default/files/lecture_notes/DMS-LECTURE%20NOTES.pdf")
            }
            if (material=="Lectures"){
                openUrl("https://www.youtube.com/playlist?list=PLBlnK6fEyqRhqJPDXcvYlLfXPh37L89g3")
            }
        }

        btnComSys.setOnClickListener {
            if (material=="Notes"){
                openUrl("https://lecturenotes.in/notes/17905-note-for-communication-system-engineering-cse-by-manav-garg?reading=true")
            }
            if (material=="Lectures"){
                openUrl("https://www.youtube.com/playlist?list=PLs5_Rtf2P2r5VTd_qql5OiIIsRcBxYdyk")
            }
        }

        btnPDW.setOnClickListener {
            if (material=="Notes"){
                openUrl("http://www.geethanjaliinstitutions.com/engineering/coursefiles/downloads/ece/pdc.pdf")
            }
            if (material=="Lectures"){
                openUrl("https://www.youtube.com/channel/UCUsA0w4nUVzEyqBHZwMawIg")
            }
        }

        btnDSA.setOnClickListener {
            if (material=="Notes"){
                openUrl("https://mrcet.com/downloads/digital_notes/IT/DATA%20STRUCTURES%20USING-18.pdf")
            }
            if (material=="Lectures"){
                openUrl("https://www.youtube.com/playlist?list=PLG9aCp4uE-s334Pe8qACh32TdxsMKqDRU")
            }
        }

        btnCOA.setOnClickListener {
            if (material=="Notes"){
                openUrl("http://www.crectirupati.com/sites/default/files/lecture_notes/CO_LECTURE_NOTES.pdf")
            }
            if (material=="Lectures"){
                openUrl("https://www.youtube.com/playlist?list=PLG9aCp4uE-s3WzvFW1nI-7hHWNC8s2RdI")
            }
        }

        btnUnix.setOnClickListener {
            if (material=="Notes"){
                openUrl("https://www.tutorialspoint.com/unix/unix_tutorial.pdf")
            }
            if (material=="Lectures"){
                Toast.makeText(this,"No lectures available for unix",Toast.LENGTH_LONG).show()
            }
        }

        btnJava.setOnClickListener {
            if (material=="Notes"){
                openUrl("https://mrcet.com/downloads/digital_notes/CSE/II%20Year/JAVA%20PROGRAMMING_19.11.2018.pdf \n")
            }
            if (material=="Lectures"){
                openUrl("http://www.youtube.com.watch?v=grEKMHGYyns")
            }
        }


    }

    private fun openUrl(url : String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }


}