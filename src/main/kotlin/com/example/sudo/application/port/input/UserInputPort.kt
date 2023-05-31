package com.example.sudo.application.port.input

import com.example.sudo.application.port.output.UserOutputPort
import com.example.sudo.application.usecase.UserUseCase
import com.example.sudo.domain.entity.User
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserInputPort(val userOutputPort: UserOutputPort) : UserUseCase{

    override fun createUser(user: User): Long {
        TODO("Not yet implemented")
    }
}