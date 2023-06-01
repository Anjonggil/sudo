package com.example.sudo.application.service

import com.example.sudo.application.port.output.BoardOutputPort
import com.example.sudo.application.port.output.UserOutputPort
import com.example.sudo.application.port.input.BoardInputPort
import com.example.sudo.domain.dto.BoardCreator
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BoardService(
    val boardOutputPort: BoardOutputPort,
    val userOutputPort: UserOutputPort
) : BoardInputPort {

    @Transactional
    override fun createBoard(boardCreator: BoardCreator): Long {
        if (!userOutputPort.existsById(boardCreator.creatorId)){
            throw IllegalArgumentException("그런 사람은 없어!")
        }
        var board = boardOutputPort.createBoard(boardCreator);

        return board.boardId
    }
}