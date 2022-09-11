package com.br.mysecretapi.secret

import javax.persistence.*

@Entity
class Secret(
    @field: Id
    @field: GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @field: Column(nullable = false)
    var message: String,
    @field: Column(nullable = false)
    var userId: Long
)