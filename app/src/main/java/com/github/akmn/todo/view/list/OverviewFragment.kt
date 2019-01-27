package com.github.akmn.todo.view.list


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.akmn.todo.R
import com.github.akmn.todo.data.model.TaskEntity
import com.github.akmn.todo.domain.list.TaskListContract
import com.github.akmn.todo.domain.list.TaskListPresenter
import com.github.akmn.todo.util.ToDoApplication
import kotlinx.android.synthetic.main.fragment_overview.*


/**
 * Fragment responsible for showing task list
 *
 */
class OverviewFragment : Fragment(), TaskListContract.View {

    private var listAdapter: TaskListAdapter = TaskListAdapter()
    private lateinit var presenter: TaskListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = TaskListPresenter((context?.applicationContext as ToDoApplication).taskDao)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_overview, container, false)

        return view
    }

    override fun onStart() {
        super.onStart()
        val viewManager = LinearLayoutManager(context)

        task_list_view.apply {
            layoutManager = viewManager
            adapter = listAdapter

            setHasFixedSize(true)
        }
        presenter.onAttach(this)
        presenter.showTaskList()
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter.onDetach()
    }

    override fun showTaskList(tasks: List<TaskEntity>) {
        listAdapter.taskList = tasks
        listAdapter.notifyDataSetChanged()
    }
}
