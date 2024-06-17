package com.daniil.halushka.todoapp.ui.screens.activities.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daniil.halushka.todoapp.R
import com.daniil.halushka.todoapp.constants.Constants
import com.daniil.halushka.todoapp.databinding.ActivityMainBinding
import com.daniil.halushka.todoapp.ui.screens.fragments.TodoListFragment
import com.daniil.halushka.todoapp.util.replaceFragment

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        Constants.APP_ACTIVITY = this
        replaceFragment(TodoListFragment(), R.id.main_data_container, false)

    }
}