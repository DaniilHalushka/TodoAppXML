package com.daniil.halushka.todoapp.ui.screens.activities.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daniil.halushka.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }
}