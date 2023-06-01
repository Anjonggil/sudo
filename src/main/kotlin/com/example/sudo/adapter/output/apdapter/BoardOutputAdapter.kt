package com.example.sudo.adapter.output.apdapter

import com.example.sudo.adapter.output.apdapter.mapper.BoardMapper
import com.example.sudo.adapter.output.apdapter.repository.BoardRepository
import com.example.sudo.application.port.output.BoardOutputPort
import com.example.sudo.domain.dto.BoardCreator
import com.example.sudo.domain.entity.Board
import org.springframework.stereotype.Service

@Service
class BoardOutputAdapter(val boardRepository: BoardRepository): BoardOutputPort{
    override fun createBoard(boardCreator: BoardCreator): Board {
        var boardEntity = BoardMapper.creatorToBoardEntity(boardCreator)
        boardEntity = boardRepository.save(boardEntity)
        return BoardMapper.boardEntityToDomain(boardEntity)
    }
}