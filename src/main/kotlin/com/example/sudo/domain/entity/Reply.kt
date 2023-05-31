package com.example.sudo.domain.entity

class Reply(
    val replyId: Long,
    val content: String?,
    val creatorId: Long,
    val boardId: Long
) {

}