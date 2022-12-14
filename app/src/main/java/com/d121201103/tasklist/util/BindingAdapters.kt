package com.d121201103.tasklist.util

import android.annotation.SuppressLint
import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.DateFormat

@SuppressLint("SetTextI18n")
@BindingAdapter("setPriority")
fun setPriority(view: TextView, priority: Int){
    when(priority){
        0 -> {
            view.text = "Penting Mendesak"
            view.setTextColor(Color.parseColor("#FC5050"))
        }
        1 -> {
            view.text = "Penting Tidak Mendesak"
            view.setTextColor(Color.parseColor("#FFC4B7"))
        }
        2 -> {
            view.text = "Tidak Penting Mendesak"
            view.setTextColor(Color.parseColor("#C1BCF5"))
        }
        else -> {
            view.text = "Tidak Penting Tidak Mendesak"
            view.setTextColor(Color.parseColor("#E799D1"))
        }
    }
}

@BindingAdapter("setTimestamp")
fun setTimestamp(view: TextView, timestamp: Long){
    view.text = DateFormat.getInstance().format(timestamp)
}