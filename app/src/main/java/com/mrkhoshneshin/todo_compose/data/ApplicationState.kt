package com.mrkhoshneshin.todo_compose.data

sealed class ApplicationState(val id : Int){
    object FirstEnter: ApplicationState(0)
    object AlreadyEntered: ApplicationState(1)
}
