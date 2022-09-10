package com.br.mysecretapi.secret.gateway

import com.br.mysecretapi.secret.gateway.io.SecretInput
import com.br.mysecretapi.secret.gateway.io.SecretOutput

interface SecretService {

    fun create(input: SecretInput);

    fun getByUser(userId: Long): List<SecretOutput>;
}