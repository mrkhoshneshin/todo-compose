package com.mrkhoshneshin.todo_compose.ui.feature

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mrkhoshneshin.todo_compose.R
import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.ui.theme.Blue
import com.mrkhoshneshin.todo_compose.ui.theme.Green

@Composable
fun TaskItem(
    task: Task,
    onTaskCompleteButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            IconButton(onClick = { onTaskCompleteButtonClicked() }) {
                Icon(
                    painter = painterResource(id = if (task.isCompleted) R.drawable.circle_check else R.drawable.circle),
                    contentDescription = "Task icon",
                    tint = if (task.isCompleted) Blue else Green
                )
            }
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = task.title)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = task.desc)
    }

}