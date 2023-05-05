package com.mrkhoshneshin.todo_compose.ui.feature

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
    var isCompleted by remember { mutableStateOf(task.isCompleted) }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            IconButton(onClick = {
                task.isCompleted = !task.isCompleted
                onTaskCompleteButtonClicked()
                isCompleted = !isCompleted
            }) {
                Icon(
                    painter = painterResource(id = if (isCompleted) R.drawable.circle_check else R.drawable.circle),
                    contentDescription = "Task icon",
                    tint = if (isCompleted) Green else Blue
                )
            }
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = task.title)
        }
        Text(
            text = task.desc,
            style = TextStyle(fontSize = MaterialTheme.typography.body1.fontSize)
        )
    }

}