package com.mrkhoshneshin.todo_compose.ui.feature.addTask.data.repository

import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.data.database.TaskDao
import javax.inject.Inject

class AddTaskRepositoryImpl @Inject constructor(private val taskDao: TaskDao) : AddTaskRepository{
    override suspend fun addTask(task: Task) {
        taskDao.insert(task)
    }
}