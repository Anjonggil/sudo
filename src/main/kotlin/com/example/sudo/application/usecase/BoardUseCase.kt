package com.example.sudo.application.usecase

import com.example.sudo.domain.dto.BoardCreator
import com.example.sudo.domain.entity.Board

interface BoardUseCase {
    fun createBoard(boardCreator: BoardCreator): Long
}
