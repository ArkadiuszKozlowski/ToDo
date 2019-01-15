package com.github.akmn.todo.util

import android.app.Application
import androidx.room.Room
import com.github.akmn.todo.data.AppDatabase
import com.github.akmn.todo.data.dao.TaskDao

class ToDoApplication : Application() {

    private lateinit var taskDao: TaskDao

    override fun onCreate() {
        super.onCreate()

        taskDao = Room.databaseBuilder(this, AppDatabase::class.java, "task-db")
                .allowMainThreadQueries()
                .build()
                .taskDao()
    }
}