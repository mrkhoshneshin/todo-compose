package com.mrkhoshneshin.todo_compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mrkhoshneshin.todo_compose.data.Screen
import com.mrkhoshneshin.todo_compose.ui.feature.home.ui.HomeScreen
import com.mrkhoshneshin.todo_compose.ui.feature.splash.SplashScreen
import kotlinx.coroutines.delay

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(appName = "Taskino")
            LaunchedEffect(key1 = null) {
                delay(3000)
                navController.navigate(Screen.HomeScreen.route) {
                    popUpTo(Screen.SplashScreen.route) {
                        inclusive = true
                    }
                }
            }
        }

        composable(Screen.HomeScreen.route) {
            HomeScreen()
        }

        composable(Screen.AddTaskScreen.route) {

        }
    }
}

