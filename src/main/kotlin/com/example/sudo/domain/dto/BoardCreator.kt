package com.example.sudo.domain.dto

import com.example.sudo.domain.entity.Board

data class BoardCreator ( val title: String,
                          val content: String?,
                          val creatorId: Long){

    fun toDomain(): Board{
        return Board(this.title, this.content, this.creatorId)
    }

}
