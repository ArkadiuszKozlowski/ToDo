package com.github.akmn.todo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.github.akmn.todo.data.converter.Converters
import com.github.akmn.todo.data.dao.TaskDao
import com.github.akmn.todo.data.model.TaskEntity

@Database(entities = [TaskEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao
}