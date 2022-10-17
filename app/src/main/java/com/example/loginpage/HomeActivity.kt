package com.example.loginpage

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    lateinit var tvEmail: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val intent = intent
        val email = getIntent().extras!!.getString("ekey")
        val msg = intent.getStringExtra("message")
        tvEmail = findViewById<TextView>(R.id.tvEmail)
        tvEmail.setText(email)
    }
}