package com.example.learnorbit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learnorbit.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val log = binding.buttonLog
        val create = binding.buttonCreate

        log.setOnClickListener {
            val user = binding.user.text.toString()
            val password = binding.password.text.toString()
            if (user == "user" && password == "123456") {
                val intent = Intent(this, PrincipalActivity::class.java)
                startActivity(intent)
            }
        }
    }
}