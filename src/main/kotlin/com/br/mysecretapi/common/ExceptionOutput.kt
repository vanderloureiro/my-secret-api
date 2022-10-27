package com.br.mysecretapi.common

import org.springframework.http.HttpStatus

data class ExceptionOutput(val httpStatus: HttpStatus, val message: String)
