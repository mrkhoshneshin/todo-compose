package com.mrkhoshneshin.todo_compose.ui.feature.home.data.repository

import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.data.database.TaskDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(private val taskDao: TaskDao): HomeRepository {
    override suspend fun getAllTasks(): Flow<List<Task>> {
        return taskDao.getAllTasks()
    }

    override suspend fun updateTask(task: Task) {
        taskDao.update(task)
    }

    override suspend fun addTask(task: Task) {
        taskDao.insert(task)
    }
}