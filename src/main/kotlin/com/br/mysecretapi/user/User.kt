package com.br.mysecretapi.user

import javax.persistence.*

@Entity
@Table(name = "users")
class User(
    @field: Id
    @field: GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    var username: String
) {
}