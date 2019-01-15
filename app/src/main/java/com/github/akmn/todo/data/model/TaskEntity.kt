package com.github.akmn.todo.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "tasks")
data class TaskEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Long?,
        val name: String,
        val description: String?,
        val done: Boolean,
        val finished: Date?,
        val type: TaskType,
        val created: Date?
)