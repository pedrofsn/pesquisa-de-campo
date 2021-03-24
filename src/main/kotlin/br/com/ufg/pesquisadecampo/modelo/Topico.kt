package br.com.ufg.pesquisadecampo.modelo

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    lateinit var titulo: String
    lateinit var mensagem: String
    var dataCriacao: LocalDateTime = LocalDateTime.now()

    @Enumerated(EnumType.STRING)
    var status: StatusTopico = StatusTopico.NAO_RESPONDIDO

    @ManyToOne
    lateinit var autor: Usuario

    @ManyToOne
    lateinit var curso: Curso

    @OneToMany(mappedBy = "topico")
    var respostas: List<Resposta> = emptyList()

}