package com.rondroid.mytodo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo_layout.view.*

import kotlinx.android.synthetic.main.item_todo_layout.view.*

class TodoAdapter(
    private val todos:MutableList<Todo>
):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){

    inner class TodoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

//        fun bindItems(todo: Todo){
//            itemView.tvTodo.text = todo.todo
//            itemView.cbTodo.isChecked = todo.done
//        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_todo_layout,parent,false))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val curTodo = todos[position]
        holder.itemView.apply {
            tvTodo.text = curTodo.todo
            cbTodo.isChecked = curTodo.done
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}