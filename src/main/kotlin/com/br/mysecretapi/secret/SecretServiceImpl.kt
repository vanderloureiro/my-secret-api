package com.br.mysecretapi.secret

import com.br.mysecretapi.secret.gateway.SecretService
import com.br.mysecretapi.secret.gateway.io.SecretInput
import com.br.mysecretapi.secret.gateway.io.SecretOutput
import com.br.mysecretapi.user.gateway.UserService
import org.springframework.stereotype.Service

@Service
class SecretServiceImpl(
    private val repository: SecretRepository,
    private val userService: UserService) : SecretService {

    override fun create(input: SecretInput) {
        userService.getById(input.userId);
        val entity = Secret(null, input.message, input.userId);
        repository.save(entity);
    }

    override fun getByUser(userId: Long): List<SecretOutput> {
        val result = repository.findAllByUserId(userId);
        return result.map { secret -> SecretOutput(secret.id as Long, secret.message, secret.userId) };
    }
}