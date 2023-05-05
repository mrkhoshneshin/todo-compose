package com.mrkhoshneshin.todo_compose.ui.feature.home.data

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.ui.feature.home.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) : ViewModel() {
    fun updateTask(task: Task) {
        viewModelScope.launch(Dispatchers.IO) {
            homeRepository.updateTask(task)
        }
    }

    fun addTask(task: Task){
        viewModelScope.launch {
            homeRepository.addTask(task)
        }
    }

    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks = _tasks.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            homeRepository.getAllTasks().collect{
                _tasks.value = it
            }
        }
    }
}