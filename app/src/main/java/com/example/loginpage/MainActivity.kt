package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var etMail: EditText
    lateinit var etPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etMail = findViewById(R.id.etMail)
        etPassword = findViewById(R.id.etPassword)
    }

    fun OnClick(view: View) {
        if(etMail.text.isNullOrBlank() || etPassword.text.isNullOrBlank()){
            Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
        }
        else {
            val email: String = etMail.getText().toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("ekey", email)

            startActivity(intent)
        }

    }
}