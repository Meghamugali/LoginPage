package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var etMail: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etMail = findViewById(R.id.etMail)
    }

    fun OnClick(view: View) {
        //Toast.makeText(this, "Signed up Successfully", Toast.LENGTH_SHORT).show()

        val email: String = etMail.getText().toString()
        val intent = Intent(this, HomeActivity::class.java)
        intent.putExtra("ekey", email)

        startActivity(intent)

    }
}