package com.example.webdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="user")
data class User(@PrimaryKey val contact: String,
                val name: String) {

}

