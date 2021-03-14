package com.example.materialghar.sem2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.materialghar.R

class Sem2Activity : AppCompatActivity() {

    lateinit var btnNotesSem2 : Button
    lateinit var btnLecturesSem2 : Button
    lateinit var btnPapersSem2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem2)


        btnNotesSem2 = findViewById(R.id.btnNotesSem2)
        btnLecturesSem2 = findViewById(R.id.btnLecturesSem2)
        btnPapersSem2 = findViewById(R.id.btnPapersSem2)

        val intent = Intent(this,
            Sem2SubjectsActivity::class.java)
        btnNotesSem2.setOnClickListener {
            intent.putExtra("Material","Notes")
            startActivity(intent)
        }

        btnLecturesSem2.setOnClickListener {
            intent.putExtra("Material","Lectures")
            startActivity(intent)
        }
        btnPapersSem2.setOnClickListener {
            Toast.makeText(this,"No Papers available!!\n Check again later",Toast.LENGTH_LONG).show()
        }
    }




}