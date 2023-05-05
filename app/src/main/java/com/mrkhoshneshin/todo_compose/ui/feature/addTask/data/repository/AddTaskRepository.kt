package com.mrkhoshneshin.todo_compose.ui.feature.addTask.data.repository

import com.mrkhoshneshin.todo_compose.data.Task

interface AddTaskRepository {
    suspend fun addTask(task: Task)
}