package com.example.sudo.adapter.output.apdapter.repository

import com.example.sudo.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User,Long> {

}
