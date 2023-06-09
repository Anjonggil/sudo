package com.example.sudo.application.port.output

import com.example.sudo.adapter.output.apdapter.entity.BoardEntity
import com.example.sudo.domain.dto.BoardCreator
import com.example.sudo.domain.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardOutputPort{
    fun createBoard(board: BoardCreator): Board
}
