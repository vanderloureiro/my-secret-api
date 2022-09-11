package com.br.mysecretapi.secret.gateway.io

data class SecretOutput(
    val id: Long,
    val message: String,
    val userId: Long
)