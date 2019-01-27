package com.github.akmn.todo.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.akmn.todo.R
import com.github.akmn.todo.data.model.TaskEntity
import com.github.akmn.todo.domain.list.TaskListContract

/**
 * A simple [Fragment] subclass.
 *
 */
class HistoryFragment : Fragment(), TaskListContract.View {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun showTaskList(tasks: List<TaskEntity>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
