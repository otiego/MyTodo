package com.rondroid.mytodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var todoAdapter : TodoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(this)

        btnAdd.setOnClickListener {
            val todo = edvTodo.text.toString()
            if (todo.isNotEmpty()){
                val todo = Todo(todo)
                todoAdapter.addTodo(todo)
                edvTodo.text.clear()
            }
        }
        btnDelete.setOnClickListener {
            todoAdapter.deleteDoneRTodos()
        }
    }
}