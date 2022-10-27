package com.br.mysecretapi.user

import com.br.mysecretapi.user.gateway.UserService
import com.br.mysecretapi.user.gateway.io.UserInput
import com.br.mysecretapi.user.gateway.io.UserOutput
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val repository: UserRepository) : UserService {

    override fun create(input: UserInput) {
        val entity = User(null, input.username);
        this.repository.save(entity);
    }

    override fun getAll(): List<UserOutput> {
        val result: List<User> = this.repository.findAll();
        return result.map {
                user -> UserOutput(user.id as Long, user.usernaame);
        }
    }

    override fun getById(id: Long): UserOutput {
        val reference: User = this.repository.getReferenceById(id);
        return UserOutput(reference.id as Long, reference.usernaame);
    }
}