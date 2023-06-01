package com.example.sudo.application.service

import com.example.sudo.application.port.output.UserOutputPort
import com.example.sudo.application.port.input.UserInputPort
import com.example.sudo.domain.dto.UserCreator
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserService(val userOutputPort: UserOutputPort) : UserInputPort {

    override fun createUser(userCreator: UserCreator): Long {

//        userOutputPort.save(UserMapper.domainToUserEntity())
        return 0L
    }
}