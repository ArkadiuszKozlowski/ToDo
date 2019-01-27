package com.github.akmn.todo.domain.common

import io.reactivex.disposables.CompositeDisposable

abstract class BasePresenter<T : BaseContract.View> : BaseContract.Presenter<T> {

    protected var view: T? = null
    protected val compositeDisposable: CompositeDisposable = CompositeDisposable()

    override fun onAttach(view: T) {
        this.view = view
    }

    override fun onDetach() {
        compositeDisposable.clear()
        this.view = null
    }

}