package com.example.bookslib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBooks: RecyclerView
    private var list: ArrayList<BookModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBooks = findViewById(R.id.item_list)
        rvBooks.setHasFixedSize(true)

        list.addAll(BookData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBooks.layoutManager = LinearLayoutManager(this)
        val bookAdapter = BookAdapter(list)
        rvBooks.adapter = bookAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedModel: Int) {
        when(selectedModel) {
            R.id.about_menu -> {
                val about = Intent(this@MainActivity,
                    AboutActivity::class.java)
                startActivity(about)
            }
        }
    }


}