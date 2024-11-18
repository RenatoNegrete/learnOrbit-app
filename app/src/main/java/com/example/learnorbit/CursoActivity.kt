package com.example.learnorbit

import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learnorbit.databinding.ActivityCursoBinding

class CursoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCursoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCursoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navbar = binding.bottomNavigation

        val webView = binding.web
        webView.settings.apply {
            javaScriptEnabled = true // Habilita JavaScript
            domStorageEnabled = true // Habilita almacenamiento DOM
            cacheMode = WebSettings.LOAD_NO_CACHE // Evita problemas de caché
            mediaPlaybackRequiresUserGesture = false // Permite reproducción automática si es necesario
        }
        val videoId = "0NPFJ73Pmu0"
        val embedUrl = "https://www.youtube.com/embed/$videoId"
        webView.loadUrl(embedUrl)

        binding.boton1.setOnClickListener {
            val webView = binding.web
            webView.settings.apply {
                javaScriptEnabled = true // Habilita JavaScript
                domStorageEnabled = true // Habilita almacenamiento DOM
                cacheMode = WebSettings.LOAD_NO_CACHE // Evita problemas de caché
                mediaPlaybackRequiresUserGesture = false // Permite reproducción automática si es necesario
            }
            val videoId = "0NPFJ73Pmu0"
            val embedUrl = "https://www.youtube.com/embed/$videoId"
            webView.loadUrl(embedUrl)
        }

        binding.boton2.setOnClickListener {
            val webView = binding.web
            webView.settings.apply {
                javaScriptEnabled = true // Habilita JavaScript
                domStorageEnabled = true // Habilita almacenamiento DOM
                cacheMode = WebSettings.LOAD_NO_CACHE // Evita problemas de caché
                mediaPlaybackRequiresUserGesture = false // Permite reproducción automática si es necesario
            }
            val videoId = "ZzaPdXTrSb8"
            val embedUrl = "https://www.youtube.com/embed/$videoId"
            webView.loadUrl(embedUrl)
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