package com.mrkhoshneshin.todo_compose.ui.feature.splash

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {

    val isLoading = flow {
        var startValue = 3
        emit(startValue)
        while (startValue > 0){
            delay(1000)
            emit(startValue)
            startValue--
        }
    }

}