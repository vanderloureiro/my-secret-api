package com.br.mysecretapi.secret

import com.br.mysecretapi.secret.gateway.SecretService
import com.br.mysecretapi.secret.gateway.io.SecretInput
import com.br.mysecretapi.secret.gateway.io.SecretOutput
import com.br.mysecretapi.user.gateway.UserService
import org.springframework.stereotype.Service

@Service
class SecretServiceImpl(
    private var repository: SecretRepository,
    private var userService: UserService) : SecretService {
    override fun create(input: SecretInput) {
        TODO("Not yet implemented")
    }

    override fun getByUser(userId: Long): List<SecretOutput> {
        TODO("Not yet implemented")
    }
}