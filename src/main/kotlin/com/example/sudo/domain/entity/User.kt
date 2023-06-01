package com.example.sudo.domain.entity

class User(
    var username: String,
    var nickname: String
) {

    var userId: Long = -1

    constructor(
        userId: Long,
        username: String,
        nickname: String
    ) : this(username, nickname) {
        this.userId = userId
        this.username = username
        this.nickname = nickname
    }
}