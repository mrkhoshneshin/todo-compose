package com.mrkhoshneshin.todo_compose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mrkhoshneshin.todo_compose.R

// Set of Material typography styles to start with
val shabnam = FontFamily(
    listOf(
        Font(R.font.shabnam_medium, weight = FontWeight.Medium),
        Font(R.font.shabnam_light, weight = FontWeight.Light),
        Font(R.font.shabnam_bold, weight = FontWeight.Bold)
    )
)
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = shabnam,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)