package com.example.learnorbit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learnorbit.databinding.ActivityInfoCursoBinding

class InfoCursoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfoCursoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoCursoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navbar = binding.bottomNavigation
        val ir = binding.boton

        ir.setOnClickListener {
            val intent = Intent(this, CursoActivity::class.java)
            startActivity(intent)
        }

        navbar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, PrincipalActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.account -> {
                    val intent = Intent(this, CuentaActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.logout -> {
                    val intent = Intent(this, LogInActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}