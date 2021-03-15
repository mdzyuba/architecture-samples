package com.example.android.architecture.blueprints.todoapp.ext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.android.architecture.blueprints.todoapp.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var controller: SampleController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val sumView = findViewById<TextView>(R.id.textViewSum)
        sumView.text = controller.sum(2, 2).toString()
    }
}