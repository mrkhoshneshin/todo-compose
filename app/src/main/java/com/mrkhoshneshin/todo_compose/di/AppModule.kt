package com.mrkhoshneshin.todo_compose.di

import android.content.Context
import androidx.room.Room
import com.mrkhoshneshin.todo_compose.data.database.AppDatabase
import com.mrkhoshneshin.todo_compose.data.database.TaskDao
import com.mrkhoshneshin.todo_compose.ui.feature.addTask.data.repository.AddTaskRepository
import com.mrkhoshneshin.todo_compose.ui.feature.addTask.data.repository.AddTaskRepositoryImpl
import com.mrkhoshneshin.todo_compose.ui.feature.home.data.repository.HomeRepository
import com.mrkhoshneshin.todo_compose.ui.feature.home.data.repository.HomeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideTaskDao(@ApplicationContext context: Context): TaskDao {
        val db = Room.databaseBuilder(context, AppDatabase::class.java, "task_db").build()
        return db.taskDao()
    }

    @Provides
    @Singleton
    @Inject
    fun provideHomeRepository(taskDao: TaskDao): HomeRepository {
        return HomeRepositoryImpl(taskDao)
    }

    @Provides
    @Singleton
    @Inject
    fun provideAddTaskRepository(taskDao: TaskDao): AddTaskRepository{
        return AddTaskRepositoryImpl(taskDao)
    }
}