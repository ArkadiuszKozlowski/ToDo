package com.github.akmn.todo.domain.common

interface BaseContract {

    interface View

    interface Presenter<T : BaseContract.View> {

        fun onAttach(view: T)

        fun onDetach()
    }
}