package com.example.sudo.application.usecase

import com.example.sudo.domain.entity.User

interface UserUseCase {
    fun createUser(user: User): Long
}
