package com.example.materialghar.sem1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.materialghar.R

class Sem1Activity : AppCompatActivity() {

    lateinit var btnBooksSem1  : Button
    lateinit var btnPapersSem1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem1)

        btnBooksSem1 = findViewById(R.id.btnBooksSem1)
        btnPapersSem1 = findViewById(R.id.btnPapersSem1)

        var intent : Intent

        btnBooksSem1.setOnClickListener {
            intent = Intent(this@Sem1Activity,
                Sem1SubjectsActivity::class.java)
            startActivity(intent)
        }

        btnPapersSem1.setOnClickListener {
            intent = Intent(this@Sem1Activity,
                Sem1PapersActivity::class.java)
            startActivity(intent)
        }

    }
}