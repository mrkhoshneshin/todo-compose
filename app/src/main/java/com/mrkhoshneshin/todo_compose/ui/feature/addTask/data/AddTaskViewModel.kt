package com.mrkhoshneshin.todo_compose.ui.feature.addTask.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.ui.feature.addTask.data.repository.AddTaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddTaskViewModel @Inject constructor(private val addTaskRepository: AddTaskRepository): ViewModel() {
    fun addTask(task: Task){
        viewModelScope.launch(Dispatchers.IO) {
            addTaskRepository.addTask(task)
        }
    }
}