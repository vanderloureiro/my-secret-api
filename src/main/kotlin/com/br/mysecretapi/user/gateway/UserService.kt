package com.br.mysecretapi.user.gateway

import com.br.mysecretapi.user.gateway.io.UserInput
import com.br.mysecretapi.user.gateway.io.UserOutput

interface UserService {

    fun create(input: UserInput);

    fun getAll(): List<UserOutput>;

    fun getById(id: Long): UserOutput;
}