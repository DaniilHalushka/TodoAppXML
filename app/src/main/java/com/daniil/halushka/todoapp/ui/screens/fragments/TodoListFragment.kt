package com.daniil.halushka.todoapp.ui.screens.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.daniil.halushka.todoapp.R
import com.daniil.halushka.todoapp.data.repository.TodoRepository
import com.daniil.halushka.todoapp.databinding.FragmentTodoListBinding
import com.daniil.halushka.todoapp.ui.screens.adapters.TodoAdapter

class TodoListFragment : Fragment(R.layout.fragment_todo_list) {
    private lateinit var todoListBinding: FragmentTodoListBinding
    private lateinit var todoListRecycler: RecyclerView
    private lateinit var todoListAdapter: TodoAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        todoListBinding = FragmentTodoListBinding.inflate(inflater, container, false)
        return todoListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toolbar = todoListBinding.toolbar
        toolbar.title = ""
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)
    }

    override fun onResume() {
        super.onResume()

        initializeRecyclerView()
    }

    private fun initializeRecyclerView() {
        val repository = TodoRepository()
        val todoList = repository.getTodoList()

        todoListRecycler = todoListBinding.todoListRecycler
        todoListAdapter = TodoAdapter(todoList)

        todoListBinding.todoListRecycler.adapter = todoListAdapter
    }
}