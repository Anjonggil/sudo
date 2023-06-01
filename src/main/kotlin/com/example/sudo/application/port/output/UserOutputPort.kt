package com.example.sudo.application.port.output

import com.example.sudo.adapter.output.apdapter.entity.UserEntity
import com.example.sudo.domain.dto.UserCreator
import com.example.sudo.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserOutputPort{
    fun existsById(userId: Long) : Boolean

    fun createUser(userCreator: UserCreator) : User
}
