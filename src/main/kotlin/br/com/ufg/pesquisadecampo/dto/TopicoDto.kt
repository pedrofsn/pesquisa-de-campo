package br.com.ufg.pesquisadecampo.dto

import java.time.LocalDateTime

data class TopicoDto(
    val id: Long,
    val titulo: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime
)