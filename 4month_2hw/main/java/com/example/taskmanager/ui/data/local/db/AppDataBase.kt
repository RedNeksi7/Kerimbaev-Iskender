package com.example.taskmanager.ui.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.taskmanager.ui.model.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}