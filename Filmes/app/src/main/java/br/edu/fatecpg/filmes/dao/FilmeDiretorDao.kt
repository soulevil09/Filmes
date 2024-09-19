package br.edu.fatecpg.filmes.dao

import br.edu.fatecpg.filmes.model.Diretor
import br.edu.fatecpg.filmes.model.Filme

interface FilmeDiretorDao {
    fun adicionarDiretor(diretor: Diretor)
    fun obterDiretor():List<Diretor>

    fun adicionarFilme(filme: Filme)
    fun obterFilme():List<Filme>

}