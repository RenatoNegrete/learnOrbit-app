package com.example.learnorbit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learnorbit.databinding.ActivityCuentaBinding

class CuentaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCuentaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navbar = binding.bottomNavigation

        navbar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, PrincipalActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.account -> {
                    true
                }
                else -> false
            }
        }
    }
}