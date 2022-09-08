package com.br.mysecretapi.user.gateway

import com.br.mysecretapi.user.gateway.io.UserInput
import com.br.mysecretapi.user.gateway.io.UserOutput
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(val service: UserService) {

    @GetMapping
    fun getAll(): ResponseEntity<List<UserOutput>> {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<UserOutput> {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    fun create(@RequestBody input: UserInput): ResponseEntity<Unit> {
        return ResponseEntity.ok(service.create(input));
    }

}