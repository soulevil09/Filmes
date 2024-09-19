package br.edu.fatecpg.filmes.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.filmes.R
import br.edu.fatecpg.filmes.adapter.DiretorAdapter
import br.edu.fatecpg.filmes.adapter.FilmeAdapter
import br.edu.fatecpg.filmes.dao.FilmeDiretorDaoImpl

class ListaActivity : AppCompatActivity() {
    val dao = FilmeDiretorDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        Log.i("Filme", dao.obterFilme().toString())
        val rvFilmes = findViewById<RecyclerView>(R.id.rv_filmes)
        val filmes = dao.obterFilme()

        Log.i("Diretor", dao.obterDiretor().toString())
        val rvDiretores = findViewById<RecyclerView>(R.id.rv_diretores)
        val diretores = dao.obterDiretor()

        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = FilmeAdapter(filmes)

        rvDiretores.layoutManager = LinearLayoutManager(this)
        rvDiretores.adapter = DiretorAdapter(diretores)
    }
}