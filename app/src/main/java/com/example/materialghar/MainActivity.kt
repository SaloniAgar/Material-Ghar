package com.example.materialghar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.materialghar.sem1.Sem1Activity
import com.example.materialghar.sem2.Sem2Activity

class MainActivity : AppCompatActivity() {

    lateinit var btnSem1 : Button
    lateinit var btnSem2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSem1 = findViewById(R.id.btnSem1)
        btnSem2 = findViewById(R.id.btnSem2)

        btnSem1.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                Sem1Activity::class.java))
        }
        btnSem2.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                Sem2Activity::class.java))
        }
    }
}