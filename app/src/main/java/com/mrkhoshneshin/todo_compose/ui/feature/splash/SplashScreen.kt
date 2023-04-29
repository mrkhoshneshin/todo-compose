package com.mrkhoshneshin.todo_compose.ui.feature.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mrkhoshneshin.todo_compose.R
import com.mrkhoshneshin.todo_compose.ui.theme.shabnam

@Composable
fun SplashScreen(
    appName: String
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.splash_icon),
                contentDescription = "splashIcon",
                modifier = Modifier.size(200.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = appName,
                fontFamily = shabnam,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}