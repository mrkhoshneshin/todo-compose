package com.mrkhoshneshin.todo_compose.ui.feature.addTask.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import com.mrkhoshneshin.todo_compose.R
import com.mrkhoshneshin.todo_compose.ui.theme.shabnam

@Composable
fun AddTaskScreen(
    onAddButtonClicked: (String, String) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(id = R.string.title),
                style = TextStyle(fontFamily = shabnam)
            )
            TextField(value = title, onValueChange = { title = it })
            Text(
                text = stringResource(id = R.string.description),
                style = TextStyle(fontFamily = shabnam)
            )
            TextField(value = description, onValueChange = { description = it })
            Button(onClick = { onAddButtonClicked(title, description) }, content = {
                Text(text = stringResource(id = R.string.addTask))
            })
        }

    }
}