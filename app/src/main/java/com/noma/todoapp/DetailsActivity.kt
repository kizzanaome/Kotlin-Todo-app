package com.noma.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val image = intent.getIntExtra("image", R.drawable.download)
        val name = intent.getStringExtra("activityName")
        val time = intent.getStringExtra("activityTime")


        val icon = findViewById<ImageView>(R.id.activity_icon)
        icon.setImageResource(image)
        val title = findViewById<TextView>(R.id.activity_name)
        title.text = name
        val detailsTime = findViewById<TextView>(R.id.detailsTime)
        detailsTime.text = time
    }
}