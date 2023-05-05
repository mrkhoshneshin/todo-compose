package com.mrkhoshneshin.todo_compose.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mrkhoshneshin.todo_compose.data.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun taskDao(): TaskDao
}