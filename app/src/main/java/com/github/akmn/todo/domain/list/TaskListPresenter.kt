package com.github.akmn.todo.domain.list

import com.github.akmn.todo.data.dao.TaskDao
import com.github.akmn.todo.domain.common.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TaskListPresenter(private val taskDao: TaskDao) : BasePresenter<TaskListContract.View>(), TaskListContract.Presenter {


    override fun showTaskList() {
        val subscription = taskDao.getAllTasks()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        { view?.showTaskList(it) },
                        {}
                )
        compositeDisposable.add(subscription)
    }
}