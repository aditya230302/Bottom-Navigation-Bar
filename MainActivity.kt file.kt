package com.example.menu

import android.app.assist.AssistContent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var tvLabel:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        tvLabel = findViewById(R.id.tvLabel)

        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    setContent("Home")
                    true
                }
                R.id.Notification -> {
                    setContent("Notification")
                    true
                }
                R.id.Search -> {
                    setContent("Search")
                    true
                }
                R.id.profile ->{
                    setContent("Profile")
                    true
                }
                else -> false
            }
        }
    }
    private fun setContent(content: String){
        title = content
        tvLabel.text = content
    }
}