package com.example.sudo.domain.entity

class Board(
    val title: String,
    val content: String?,
    val creatorId: Long,
) {

    var boardId: Long? = -1
    var replies: MutableList<Reply> = mutableListOf()

    constructor(
        boardId: Long?,
        title: String,
        content: String?,
        creatorId: Long,
    ) : this(title, content, creatorId) {
        this.boardId = boardId
    }

    constructor(
        boardId: Long?,
        title: String,
        content: String?,
        creatorId: Long,
        replies: List<Reply>
    ) : this(title, content, creatorId) {
        this.boardId = boardId
        this.replies = replies.toMutableList()
    }

    fun createReply(){

    }
}