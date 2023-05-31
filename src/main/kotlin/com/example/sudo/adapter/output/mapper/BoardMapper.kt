package com.example.sudo.adapter.output.mapper

import com.example.sudo.adapter.output.entity.BoardEntity
import com.example.sudo.domain.entity.Board
import com.example.sudo.domain.entity.Reply

class BoardMapper private constructor() {

    companion object {
        fun domainToBoardEntity(board: Board): BoardEntity {
            return board.let {
                BoardEntity(
                    it.title,
                    it.content,
                    it.creatorId
                )
            }
        }

        fun boardEntityToDomain(boardEntity: BoardEntity): Board {
            boardEntity.replyEntities
            return boardEntity.let {
                Board(
                    it.id,
                    it.title,
                    it.content,
                    it.creatorId,
                    it.replyEntities.map { replyEntity -> Reply(
                        replyEntity.id,
                        replyEntity.content,
                        replyEntity.creatorId,
                        replyEntity.boardEntity.id) }
                )
            }
        }
    }
}