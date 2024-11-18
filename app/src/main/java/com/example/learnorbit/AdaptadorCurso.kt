package com.example.learnorbit

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.learnorbit.databinding.TarjetaCursoBinding

class AdaptadorCurso(context: Context, private val cursos: List<PrincipalActivity.Curso>): ArrayAdapter<PrincipalActivity.Curso>(context, 0, cursos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: TarjetaCursoBinding
        val view: View
        if (convertView == null) {
            binding = TarjetaCursoBinding.inflate(LayoutInflater.from(context), parent, false)
            view = binding.root
            view.tag = binding
        } else {
            binding = convertView.tag as TarjetaCursoBinding
            view = convertView
        }

        val curso = cursos[position]
        binding.nombre.text = curso.name
        binding.profesor.text = curso.profesor
        binding.universidad.text = curso.universidad
        binding.photo.setImageResource(curso.foto)

        binding.vermas.setOnClickListener {
            val intent = Intent(context, InfoCursoActivity::class.java)
            context.startActivity(intent)
        }

        return view
    }

}