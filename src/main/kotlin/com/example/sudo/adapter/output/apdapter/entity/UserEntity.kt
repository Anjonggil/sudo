package com.example.sudo.adapter.output.apdapter.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class UserEntity (
    username: String,
    nickname: String
){
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
        protected set

    var username: String = username
        protected set

    var nickname: String = nickname
        protected set
}
