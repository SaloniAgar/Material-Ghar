package com.example.materialghar.sem1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.materialghar.R

class Sem1PapersActivity : AppCompatActivity() {


    lateinit var btn1415 : Button
    lateinit var btn1516 : Button
    lateinit var btn1617 : Button
    lateinit var btn1718 : Button
    lateinit var btn1819 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem1_papers)


        btn1415 = findViewById(R.id.btn1415)
        btn1516 = findViewById(R.id.btn1516)
        btn1617 = findViewById(R.id.btn1617)
        btn1718 = findViewById(R.id.btn1718)
        btn1819 = findViewById(R.id.btn1819)

        val intent = Intent(this,
            Sem1PaperPdfActivity::class.java)

        btn1415.setOnClickListener {
            intent.putExtra("Year","1415")
            startActivity(intent)
        }
        btn1516.setOnClickListener {
            intent.putExtra("Year","1516")
            startActivity(intent)
        }
        btn1617.setOnClickListener {
            intent.putExtra("Year","1617")
            startActivity(intent)
        }
        btn1718.setOnClickListener {
            intent.putExtra("Year","1718")
            startActivity(intent)
        }
        btn1819.setOnClickListener {
            intent.putExtra("Year","1819")
            startActivity(intent)
        }

    }

}
