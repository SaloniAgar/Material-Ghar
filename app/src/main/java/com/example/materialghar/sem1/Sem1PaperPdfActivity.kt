package com.example.materialghar.sem1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialghar.R
import com.github.barteksc.pdfviewer.PDFView

class Sem1PaperPdfActivity : AppCompatActivity() {

    lateinit var paperPdfView : PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem1_paper_pdf)

        paperPdfView = findViewById(R.id.paperPdfView)

        val yr = intent.getStringExtra("Year")

        if(yr == "1415"){
            paperPdfView.fromAsset("2014-15.pdf").load()
        }
        if(yr == "1516"){
            paperPdfView.fromAsset("2015-16.pdf").load()
        }
        if(yr == "1617"){
            paperPdfView.fromAsset("2016-17.pdf").load()
        }
        if (yr == "1718"){
            paperPdfView.fromAsset("2017-18.pdf").load()
        }
        if(yr == "1819"){
            paperPdfView.fromAsset("2018-19.pdf").load()
        }

    }
}