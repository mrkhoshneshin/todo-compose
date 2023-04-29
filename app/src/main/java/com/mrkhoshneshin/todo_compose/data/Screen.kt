package com.mrkhoshneshin.todo_compose.data

const val HOME_SCREEN_ROUTE = "home"
const val ADD_TASK_SCREEN_ROUTE = "addTask"
const val SPLASH_SCREEN_ROUTE = "splash"
const val REGISTER_SCREEN_ROUTE = "register"

sealed class Screen(val route: String) {
    object SplashScreen : Screen(SPLASH_SCREEN_ROUTE)
    object HomeScreen : Screen(HOME_SCREEN_ROUTE)

    object RegisterScreen : Screen(REGISTER_SCREEN_ROUTE)
    object AddTaskScreen : Screen(ADD_TASK_SCREEN_ROUTE)
}
