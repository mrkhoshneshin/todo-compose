package com.mrkhoshneshin.todo_compose.ui.feature.empty_state

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mrkhoshneshin.todo_compose.R
import com.mrkhoshneshin.todo_compose.ui.theme.Blue
import com.mrkhoshneshin.todo_compose.ui.theme.shabnam

@Composable
fun EmptyStateScreen(
    onAddTaskButtonClicked: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.empty_state),
                contentDescription = "EmptyStateImage",
                modifier = Modifier.size(250.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = stringResource(id = R.string.noTaskFound))
            Spacer(modifier = Modifier.height(5.dp))
            TextButton(
                onClick = { onAddTaskButtonClicked() },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(contentColor = Color.White, backgroundColor = Blue)
            ) {
                Text(text = stringResource(id = R.string.addTask), style = TextStyle(fontFamily = shabnam))
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun EmptyStateScreenPreview() {
    EmptyStateScreen {

    }
}