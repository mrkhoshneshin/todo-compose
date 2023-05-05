package com.mrkhoshneshin.todo_compose.ui.feature.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.ui.feature.TaskItem
import com.mrkhoshneshin.todo_compose.R

@Composable
fun HomeScreen(
    tasks: List<Task>,
    onNavigateToAddTask: () -> Unit,
    onTaskShouldUpdate: (Task) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Scaffold(modifier = Modifier.fillMaxSize(), floatingActionButton = {
            FloatingActionButton(
                onClick = { onNavigateToAddTask() }) {
                Icon(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = "FloatingActionButtonIcon"
                )
            }
        }, content = {
            LazyColumn(contentPadding = it) {
                items(tasks.size) { position ->
                    TaskItem(tasks[position], onTaskCompleteButtonClicked = {
                        onTaskShouldUpdate(tasks[position])
                    })
                }
            }
        })
    }
}