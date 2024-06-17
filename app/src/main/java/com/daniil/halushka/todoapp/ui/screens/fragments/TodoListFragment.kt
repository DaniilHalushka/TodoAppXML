package com.daniil.halushka.todoapp.ui.screens.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.daniil.halushka.todoapp.data.repository.TodoRepository
import com.daniil.halushka.todoapp.databinding.FragmentTodoListBinding
import com.daniil.halushka.todoapp.ui.screens.adapters.TodoAdapter

class TodoListFragment : Fragment() {
    private lateinit var todoListBinding: FragmentTodoListBinding
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

        todoListBinding.todoListRecycler.layoutManager = LinearLayoutManager(requireContext())

        val repository = TodoRepository()
        val todoList = repository.getTodoList()

        todoListAdapter = TodoAdapter(todoList)
        todoListBinding.todoListRecycler.adapter = todoListAdapter
    }
}