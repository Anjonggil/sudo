package com.example.sudo.adapter.output.apdapter.mapper

import com.example.sudo.adapter.output.apdapter.entity.UserEntity
import com.example.sudo.domain.entity.User

class UserMapper {

    companion object{
        fun domainToUserEntity(user: User): UserEntity {
            return UserEntity(user.username, user.nickname)
        }
    }
}