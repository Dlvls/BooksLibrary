package com.example.bookslib

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BookAdapter(private val listBook: ArrayList<BookModel>) :
    RecyclerView.Adapter<BookAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.img)
            .apply(RequestOptions().override(55, 55))
            .into((holder.tvImg))

        holder.tvTitle.text = book.title
        holder.tvDesc.text = book.desc

        val moveDetail = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveToDetail = Intent(moveDetail, DetailActivity::class.java)

            moveToDetail.putExtra(DetailActivity.TITLE, book.title)
            moveToDetail.putExtra(DetailActivity.WRITER, book.writer)
            moveToDetail.putExtra(DetailActivity.DESC, book.desc)
            moveToDetail.putExtra(DetailActivity.ID, book.id)
            moveToDetail.putExtra(DetailActivity.PAGE, book.pages)
            moveToDetail.putExtra(DetailActivity.IMG, book.img)
            moveToDetail.putExtra(DetailActivity.PUBLISHER, book.publisher)
            moveDetail.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.item_title)
        var tvDesc: TextView = itemView.findViewById(R.id.item_desc)
        var tvImg: ImageView = itemView.findViewById(R.id.item_img)

    }
}