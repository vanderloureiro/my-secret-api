package com.br.mysecretapi.secret

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SecretRepository : JpaRepository<Secret, Long>