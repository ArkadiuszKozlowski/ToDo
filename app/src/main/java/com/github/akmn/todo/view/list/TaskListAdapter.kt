package com.github.akmn.todo.view.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.akmn.todo.R
import com.github.akmn.todo.data.model.TaskEntity

class TaskListAdapter : RecyclerView.Adapter<TaskListAdapter.TaskItemViewHolder>() {

    internal var taskList: List<TaskEntity> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskItemViewHolder {

        val textView = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskItemViewHolder(textView)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
        holder.name.text = taskList[position].name
    }

    class TaskItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.task_name)

    }
}