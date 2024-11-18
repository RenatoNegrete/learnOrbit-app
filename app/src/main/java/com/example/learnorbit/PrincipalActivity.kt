package com.example.learnorbit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learnorbit.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrincipalBinding
    private val listaCursos = mutableListOf<Curso>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navbar = binding.bottomNavigation

        listarCursos()

        val adapter = AdaptadorCurso(this, listaCursos)
        binding.listView.adapter = adapter

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
        val curso4 = Curso("Finanzas", R.drawable.finanzas, "Fernanda Perez", "Universidad de la Sabana")
        listaCursos.add(curso4)
    }

    data class Curso (
        val name: String,
        val foto: Int,
        val profesor: String,
        val universidad: String,
    )
}