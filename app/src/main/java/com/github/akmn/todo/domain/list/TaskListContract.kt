package com.github.akmn.todo.domain.list

import com.github.akmn.todo.data.model.TaskEntity
import com.github.akmn.todo.domain.common.BaseContract

class TaskListContract {

    interface View : BaseContract.View {

        fun showTaskList(tasks: List<TaskEntity>)
    }

    interface Presenter : BaseContract.Presenter<TaskListContract.View> {

        fun showTaskList()
    }
}