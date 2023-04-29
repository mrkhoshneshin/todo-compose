package com.mrkhoshneshin.todo_compose.util

import com.mrkhoshneshin.todo_compose.data.ApplicationState
import com.mrkhoshneshin.todo_compose.data.Screen

object NavControllerHelper {

    fun getDestinationRouteAfterSplashScreen(appState: ApplicationState): String{
        return when(appState){
            ApplicationState.FirstEnter -> Screen.RegisterScreen.route
            ApplicationState.AlreadyEntered -> Screen.HomeScreen.route
        }
    }
}