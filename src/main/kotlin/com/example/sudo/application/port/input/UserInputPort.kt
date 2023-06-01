package com.example.sudo.application.port.input

import com.example.sudo.domain.dto.UserCreator

interface UserInputPort {
    fun createUser(userCreator: UserCreator): Long
}
