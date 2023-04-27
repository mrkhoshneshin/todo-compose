package com.mrkhoshneshin.todo_compose.data

data class Task(
    val id: Int,
    val title: String,
    val desc: String,
    val hasDone: Boolean = false
)