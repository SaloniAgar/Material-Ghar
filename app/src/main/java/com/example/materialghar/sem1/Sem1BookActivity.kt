package com.example.materialghar.sem1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialghar.R
import com.github.barteksc.pdfviewer.PDFView

class Sem1BookActivity : AppCompatActivity() {

    lateinit var bookPDFView: PDFView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem1_book)

        val subject = intent.getStringExtra("Subject")

        bookPDFView = findViewById(R.id.bookPdfView)


      if (subject=="EMI"){
            bookPDFView.fromAsset("EE notes.pdf").load()
        }
        else {
          if (subject == "HV") {
              bookPDFView.fromAsset("Professional Ethics and Human Values by R.S NAAGARAZAN.pdf")
                  .load()
          } else {
              Toast.makeText(this, "No Subject Selected", Toast.LENGTH_SHORT).show()
          }
      }


    }



}
