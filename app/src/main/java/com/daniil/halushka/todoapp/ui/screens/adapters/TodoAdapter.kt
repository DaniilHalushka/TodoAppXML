package com.daniil.halushka.todoapp.ui.screens.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.daniil.halushka.todoapp.R
import com.daniil.halushka.todoapp.data.model.TodoItem
import com.daniil.halushka.todoapp.databinding.TodoItemBinding

class TodoAdapter(private val todoItems: List<TodoItem>): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    class TodoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val todoItemBinding = TodoItemBinding.bind(view)

        val itemStatusIndicator: CheckBox = todoItemBinding.itemCheckbox
        val itemText: TextView = todoItemBinding.itemText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false)
        return TodoViewHolder(view)
    }

    override fun getItemCount() = todoItems.size

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val currentTodoItem = todoItems[position]
        holder.itemStatusIndicator.isSelected = currentTodoItem.isDone
        holder.itemText.text = currentTodoItem.text
    }
}