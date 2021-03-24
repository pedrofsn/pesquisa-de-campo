package br.com.ufg.pesquisadecampo.modelo

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    lateinit var mensagem: String

    @ManyToOne
    lateinit var topico: Topico
    var dataCriacao: LocalDateTime = LocalDateTime.now()

    @ManyToOne
    lateinit var autor: Usuario
    var solucao: Boolean = false
}