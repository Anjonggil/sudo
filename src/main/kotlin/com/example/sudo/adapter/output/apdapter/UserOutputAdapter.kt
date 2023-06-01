package com.example.sudo.adapter.output.apdapter

import com.example.sudo.adapter.output.apdapter.repository.UserRepository
import com.example.sudo.application.port.output.UserOutputPort
import com.example.sudo.domain.dto.UserCreator
import com.example.sudo.domain.entity.User
import org.springframework.stereotype.Service

@Service
class UserOutputAdapter(
    val userRepository: UserRepository
) : UserOutputPort {
    override fun existsById(userId: Long) : Boolean{
        return userRepository.existsById(userId)
    }

    override fun createUser(userCreator: UserCreator): User {
        TODO("Not yet implemented")
    }
}