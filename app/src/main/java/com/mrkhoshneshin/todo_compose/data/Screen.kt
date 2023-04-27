package com.mrkhoshneshin.todo_compose.data

const val SHOW_ALL_TASKS_SCREEN_ROUTE = "showAllTasks"
const val ADD_TASK_SCREEN_ROUTE = "addTask"

sealed class Screen(private val route: String) {
    object ShowAllTaskScreen : Screen(SHOW_ALL_TASKS_SCREEN_ROUTE)
    object AddTaskScreen : Screen(ADD_TASK_SCREEN_ROUTE)
}
