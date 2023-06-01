package com.example.sudo.application.port.input

import com.example.sudo.adapter.output.mapper.BoardMapper
import com.example.sudo.application.port.output.BoardOutputPort
import com.example.sudo.application.port.output.UserOutputPort
import com.example.sudo.application.usecase.BoardUseCase
import com.example.sudo.domain.dto.BoardCreator
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class BoardInputPort(
    val boardOutputPort: BoardOutputPort,
    val userOutputPort: UserOutputPort
) : BoardUseCase {

    @Transactional
    override fun createBoard(boardCreator: BoardCreator): Long {
        validUser(boardCreator.creatorId)

        var boardEntity = BoardMapper.domainToBoardEntity(boardCreator.toDomain())

        boardEntity = boardOutputPort.save(boardEntity)

        return boardEntity.id
    }

    private fun validUser(userId:Long){
        if (!userOutputPort.existsById(userId)) {
            throw IllegalArgumentException("미안하지만 그런 사람은 없어!")
        }
    }
}