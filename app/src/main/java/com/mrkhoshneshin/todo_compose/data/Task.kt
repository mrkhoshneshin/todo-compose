package com.mrkhoshneshin.todo_compose.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val title: String,
    val desc: String,
    val isCompleted: Boolean = false
)