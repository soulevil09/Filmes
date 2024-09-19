package br.edu.fatecpg.filmes.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.filmes.R
import br.edu.fatecpg.filmes.dao.FilmeDiretorDao
import br.edu.fatecpg.filmes.dao.FilmeDiretorDaoImpl
import br.edu.fatecpg.filmes.model.Diretor
import br.edu.fatecpg.filmes.model.Filme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    val dao = FilmeDiretorDaoImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt_filme = findViewById<EditText>(R.id.edt_filme)
        val edt_diretor = findViewById<EditText>(R.id.edt_diretor)
        val btnSalva = findViewById<Button>(R.id.btn_salvar)
        val fabLista = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        btnSalva.setOnClickListener{
            val nome_filme = edt_filme.text.toString()
            val filme = Filme(nome_filme)
            dao.adicionarFilme(filme)
            Toast.makeText(this, "Filme cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
            edt_filme.text.clear()

            val nome_diretor = edt_diretor.text.toString()
            val diretor = Diretor(nome_diretor)
            dao.adicionarDiretor(diretor)
            edt_diretor.text.clear()
        }

        fabLista.setOnClickListener {
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }

    }
}
