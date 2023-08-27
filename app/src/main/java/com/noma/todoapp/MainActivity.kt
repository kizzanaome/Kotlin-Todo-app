package com.noma.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.noma.todoapp.data.ActivityAdapter
import com.noma.todoapp.data.ActivityModel
import com.noma.todoapp.data.ActivityStatus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ActivityModel>()
        list.add(ActivityModel(R.drawable.mails, "Check mails", "5:05 am", "Check and reply to important emails and many more", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.download, "Do Kotlin work", "6:05 am", "Check and reply to important emails and many more", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.market, "Go to the market", "8:05 am", "Check and reply to important emails and many more", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.fam_dinner, "Have dinner", "6:00 pm", "Check and reply to important emails and many more", ActivityStatus.pending))

        val activityAdapter = ActivityAdapter(this,list)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = activityAdapter
        // orientation
//      recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = LinearLayoutManager(this)



    }
}