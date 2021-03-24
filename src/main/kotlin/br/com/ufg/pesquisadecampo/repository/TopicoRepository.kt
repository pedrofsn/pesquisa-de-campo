package br.com.ufg.pesquisadecampo.repository

import br.com.ufg.pesquisadecampo.modelo.Topico
import org.springframework.data.jpa.repository.JpaRepository

interface TopicoRepository : JpaRepository<Topico, Long> {

    fun findByCursoNome(nomeCurso: String): List<Topico>
}