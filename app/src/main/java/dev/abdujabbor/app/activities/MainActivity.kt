package dev.abdujabbor.app.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addToDo.setOnClickListener {
            val intent =  Intent(this,AddToDo::class.java)
            startActivity(intent)
        }

        binding.todoList.setOnClickListener {
          val intent =  Intent(this,ToDoList::class.java)
            startActivity(intent)
        }

    }
}
