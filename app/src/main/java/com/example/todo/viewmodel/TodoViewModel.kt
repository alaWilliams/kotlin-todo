package com.example.todo.viewmodel

import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {
    val todos = mutableListOf<String>()

    init {
        todos.add("Test1")
        todos.add("Test2")
        todos.add("Test3")
    }
}