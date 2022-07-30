package com.example.bookslib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    companion object {
        const val WRITER = "detailWriter"
        const val TITLE = "detailTitle"
        const val DESC = "detailDesc"
        const val PUBLISHER = "detailPublisher"
        const val ID = "detailId"
        const val IMG = "detailImg"
        const val PAGE = "detailPages"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvTitle: TextView = findViewById(R.id.detailTitle)
        val tvWriter: TextView = findViewById(R.id.detailWriter)
        val tvDesc: TextView = findViewById(R.id.detailDesc)
        val tvPublisher: TextView = findViewById(R.id.detailPublisher)
        val tvId: TextView = findViewById(R.id.detailId)
        val tvImg: ImageView = findViewById(R.id.detailImg)
        val tvPage: TextView = findViewById(R.id.detailPages)

        val dTitle = intent.getStringExtra(TITLE)
        val dWriter = intent.getStringExtra(WRITER)
        val dDesc = intent.getStringExtra(DESC)
        val dPublisher = intent.getStringExtra(PUBLISHER)
        val dId = intent.getIntExtra(ID, 0)
        val dImg = intent.getIntExtra(IMG, 0)
        val dPage = intent.getIntExtra(PAGE, 0)

        tvTitle.text = dTitle
        tvWriter.text = dWriter
        tvDesc.text = dDesc
        tvPublisher.text = dPublisher
        tvId.text = dId.toString()
        tvPage.text = dPage.toString()

        Glide.with(this)
            .load(dImg)
            .apply(RequestOptions())
            .into(tvImg)
    }
}