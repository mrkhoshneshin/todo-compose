package com.mrkhoshneshin.todo_compose.ui.feature.home.data.repository

import com.mrkhoshneshin.todo_compose.data.Task
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    suspend fun getAllTasks(): Flow<List<Task>>
    suspend fun updateTask(task: Task)
    suspend fun addTask(task: Task)
}