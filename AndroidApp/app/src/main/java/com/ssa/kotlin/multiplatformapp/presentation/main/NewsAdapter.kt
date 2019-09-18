package com.ssa.kotlin.multiplatformapp.presentation.main
/*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ssa.kotlin.multiplatformapp.R
import com.ssa.kotlin.multiplatformapp.presentation.main.NewsAdapter.ViewHolder
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.news_item.view.*
import models.News

class NewsAdapter : RecyclerView.Adapter<ViewHolder>() {

    var data: List<News> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer {
        fun bind(item: News) {
            containerView.newsTitle.text = item.newsTitle
            containerView.newsDescription.text = item.newsDescription

            item.iconUrl?.let {
                Picasso.get()
                    .load(it)
                    .placeholder(R.drawable.ic_placeholder)
                    .error(R.drawable.ic_placeholder)
                    .into(containerView.newsIcon)
            }
        }
    }
}*/