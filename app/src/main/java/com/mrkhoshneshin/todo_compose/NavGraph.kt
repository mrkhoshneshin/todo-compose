package com.mrkhoshneshin.todo_compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mrkhoshneshin.todo_compose.data.Screen
import com.mrkhoshneshin.todo_compose.data.Task
import com.mrkhoshneshin.todo_compose.ui.feature.addTask.data.AddTaskViewModel
import com.mrkhoshneshin.todo_compose.ui.feature.addTask.ui.AddTaskScreen
import com.mrkhoshneshin.todo_compose.ui.feature.empty_state.EmptyStateScreen
import com.mrkhoshneshin.todo_compose.ui.feature.home.data.HomeViewModel
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
            val viewModel = hiltViewModel<HomeViewModel>()
            val tasks = viewModel.tasks.collectAsState().value
            if (tasks.isEmpty()) {
                EmptyStateScreen(onAddTaskButtonClicked = { navController.navigate(Screen.AddTaskScreen.route) })
            } else {
                HomeScreen(
                    tasks = tasks,
                    onNavigateToAddTask = { navController.navigate(Screen.AddTaskScreen.route) },
                    onTaskShouldUpdate = { viewModel.updateTask(it) })
            }
        }

        composable(Screen.AddTaskScreen.route) {
            val viewModel = hiltViewModel<AddTaskViewModel>()
            AddTaskScreen(onAddButtonClicked = { title, description ->
                val task = Task(title = title, desc = description)
                viewModel.addTask(task)
                navController.popBackStack()
            })
        }
    }
}

