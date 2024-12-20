package com.example.learnorbit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learnorbit.PrincipalActivity.Curso
import com.example.learnorbit.databinding.ActivityCuentaBinding

class CuentaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCuentaBinding
    private val listaCursos = mutableListOf<Curso>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navbar = binding.bottomNavigation

        listarCursos()

        val adapter = AdaptadorCurso(this, listaCursos)
        binding.listView.adapter = adapter

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
                R.id.logout -> {
                    val intent = Intent(this, LogInActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }

    private fun listarCursos() {
        val curso1 = Curso("Introduccion a la programacion", R.drawable.intro_prog, "Jorge Lopez", "Universidad Javeriana")
        listaCursos.add(curso1)
        val curso2 = Curso("Estructuras de datos", R.drawable.estruc, "Pedro Gonzales", "Universidad de los Andes")
        listaCursos.add(curso2)
        val curso3 = Curso("Programacion avanzada", R.drawable.prog_avaz, "Maria Gomez", "Universidad Javeriana")
        listaCursos.add(curso3)
    }
}