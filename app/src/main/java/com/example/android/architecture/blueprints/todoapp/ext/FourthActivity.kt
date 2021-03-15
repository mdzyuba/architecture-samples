package com.example.android.architecture.blueprints.todoapp.ext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.android.architecture.blueprints.todoapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        val sumView = findViewById<TextView>(R.id.textViewSum)
        sumView.text = "8"
    }
}