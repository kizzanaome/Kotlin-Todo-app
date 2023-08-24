package com.noma.todoapp

data class ActivityModel(
    val image:Int = 1,
    val activityName:String = "",
    var activityTime:String = "",
    var activityDescription:String = "",
    var activityStatus:ActivityStatus = ActivityStatus.pending
)
