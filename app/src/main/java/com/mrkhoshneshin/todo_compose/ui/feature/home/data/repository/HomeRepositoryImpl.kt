package com.mrkhoshneshin.todo_compose.ui.feature.home.data.repository

import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.data.database.TaskDao
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(private val taskDao: TaskDao): HomeRepository {
    override suspend fun getAllTasks(): List<Task> {
        return taskDao.getAllTasks()
    }

    override suspend fun updateTask(task: Task) {
        taskDao.update(task)
    }
}