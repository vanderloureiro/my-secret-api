package com.br.mysecretapi.common

import com.br.mysecretapi.user.exception.UserNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException::class)
    fun illegalArgumentException(e: IllegalArgumentException): ResponseEntity<ExceptionOutput?>? {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body<ExceptionOutput?>(
            ExceptionOutput(HttpStatus.BAD_REQUEST, e.message as String)
        )
    }

    @ExceptionHandler(UserNotFoundException::class)
    fun userNotFoundException(e: UserNotFoundException?): ResponseEntity<ExceptionOutput?>? {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
            ExceptionOutput(HttpStatus.NOT_FOUND, "Usuário não encontrado")
        )
    }
}