package com.example.learnorbit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learnorbit.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navbar = binding.bottomNavigation

        navbar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    true
                }
                R.id.account -> {
                    val intent = Intent(this, CuentaActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}