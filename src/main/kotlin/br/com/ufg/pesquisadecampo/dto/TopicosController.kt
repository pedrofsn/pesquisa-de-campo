package br.com.ufg.pesquisadecampo.dto

import br.com.ufg.pesquisadecampo.modelo.Topico
import br.com.ufg.pesquisadecampo.repository.TopicoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TopicosController {

    @Autowired
    private lateinit var topicoRepository: TopicoRepository

    @RequestMapping("/topicos")
    fun lista(nomeCurso: String?): List<TopicoDto?>? {
        return when (nomeCurso) {
            null -> topicoRepository.findAll().toList()
            else -> topicoRepository.findByCursoNome(nomeCurso).toList()
        }
    }

    private fun List<Topico>?.toList() = this?.map {
        TopicoDto(id = it.id, titulo = it.titulo, mensagem = it.mensagem, dataCriacao = it.dataCriacao)
    } ?: emptyList()
}