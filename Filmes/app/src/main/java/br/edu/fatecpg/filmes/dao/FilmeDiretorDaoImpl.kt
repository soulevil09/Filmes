package br.edu.fatecpg.filmes.dao

import br.edu.fatecpg.filmes.model.Diretor
import br.edu.fatecpg.filmes.model.Filme

class FilmeDiretorDaoImpl : FilmeDiretorDao {
    companion object{
        private val diretores = mutableListOf<Diretor>()
        private val filmes = mutableListOf<Filme>()
    }

    override fun adicionarDiretor(diretor: Diretor) {
        Companion.diretores.add(diretor)
    }

    override fun obterDiretor(): List<Diretor> {
        return Companion.diretores
    }

//---------------------------------------------------//

    override fun adicionarFilme(filme: Filme) {
        Companion.filmes.add(filme)
    }

    override fun obterFilme(): List<Filme> {
        return Companion.filmes
    }
}