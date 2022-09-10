package com.br.mysecretapi.secret.gateway

import com.br.mysecretapi.secret.gateway.io.SecretInput
import com.br.mysecretapi.secret.gateway.io.SecretOutput
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/secret")
class SecretController(var service: SecretService) {

    @GetMapping
    fun getByUser(userId: Long): ResponseEntity<List<SecretOutput>> {
        return ResponseEntity.ok(service.getByUser(userId));
    }

    @PostMapping
    fun create(@RequestBody input: SecretInput): ResponseEntity<Unit> {
        return ResponseEntity.ok(service.create(input));
    }
}