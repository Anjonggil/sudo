package com.example.sudo.adapter.output.apdapter.mapper

import com.example.sudo.adapter.output.apdapter.entity.BoardEntity
import com.example.sudo.domain.dto.BoardCreator
import com.example.sudo.domain.entity.Board
import com.example.sudo.domain.entity.Reply

class BoardMapper private constructor() {

    companion object {
        fun creatorToBoardEntity(boardCreator: BoardCreator): BoardEntity {
            return boardCreator.let {
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