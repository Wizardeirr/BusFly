package com.volkankelleci.busfly.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey
    val uid: Int,
    val name:String,
    val surName:String,
    val identification:Int,
    val date:Int,
    val male:String,
    val email:String,
    val password:String
)
