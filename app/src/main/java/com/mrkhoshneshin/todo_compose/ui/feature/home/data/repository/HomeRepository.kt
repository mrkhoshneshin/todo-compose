package com.mrkhoshneshin.todo_compose.ui.feature.home.data.repository

import com.mrkhoshneshin.todo_compose.data.Task

interface HomeRepository {
    suspend fun getAllTasks(): List<Task>
    suspend fun updateTask(task: Task)
}