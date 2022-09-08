package com.br.mysecretapi.user

import com.br.mysecretapi.user.gateway.UserService
import com.br.mysecretapi.user.gateway.io.UserInput
import com.br.mysecretapi.user.gateway.io.UserOutput

class UserServiceImpl(val repository: UserRepository) : UserService {

    override fun create(input: UserInput) {
        val entity = User(null, input.username);
        this.repository.save(entity);
    }

    override fun getAll(): List<UserOutput> {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): UserOutput {
        TODO("Not yet implemented")
    }
}