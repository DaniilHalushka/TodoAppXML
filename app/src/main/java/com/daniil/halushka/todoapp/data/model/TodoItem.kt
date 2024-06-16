package com.daniil.halushka.todoapp.data

import java.util.Date

data class TodoItem(
    val id: String,
    val text: String,
    val priority: String,
    val deadline: Date?,
    val isDone: Boolean,
    val startDate: Date,
    val changeDate: Date?
)