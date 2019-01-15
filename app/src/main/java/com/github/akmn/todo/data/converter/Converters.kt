package com.github.akmn.todo.data.converter

import androidx.room.TypeConverter
import com.github.akmn.todo.data.model.TaskType
import java.util.*

/**
 * Used to convert classes used in db models to classes supported by db framework
 */
class Converters {

    @TypeConverter
    fun toDate(dateLong: Long?): Date? = if (dateLong == null) null else Date(dateLong)

    @TypeConverter
    fun fromDate(date: Date?): Long? = date?.time

    @TypeConverter
    fun fromTaskType(type: String?): TaskType? = if (type == null) null else TaskType.valueOf(type)

    @TypeConverter
    fun fromTaskType(type: TaskType?): String? = type?.name
}