package com.example.myphone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myphone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val usernameEditText = binding.editTextUsername
        with(binding) {
            login.setOnClickListener {
                val username = usernameEditText.text.toString().trim()
                if (username.isNotEmpty()) {
                    val message = "Hello $username!"
                    Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this@MainActivity, "Please enter a username", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}