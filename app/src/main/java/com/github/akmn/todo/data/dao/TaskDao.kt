package com.github.akmn.todo.data.dao

import androidx.room.*
import com.github.akmn.todo.data.model.TaskEntity

@Dao
interface TaskDao {

    @Query("select * from tasks")
    fun getAllTasks(): List<TaskEntity>

    @Query("select * from tasks where id = :id")
    fun findTaskById(id: Long): TaskEntity

    @Insert(onConflict = OnConflictStrategy.FAIL)
    fun insertTask(task: TaskEntity)

    @Update
    fun updateTask(task: TaskEntity)
}