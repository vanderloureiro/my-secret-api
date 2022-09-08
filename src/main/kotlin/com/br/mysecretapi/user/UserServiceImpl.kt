package com.br.mysecretapi.user

import com.br.mysecretapi.user.gateway.UserService
import com.br.mysecretapi.user.gateway.io.UserInput
import com.br.mysecretapi.user.gateway.io.UserOutput

class UserServiceImpl : UserService {

    override fun create(input: UserInput) {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<UserOutput> {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): UserOutput {
        TODO("Not yet implemented")
    }
}