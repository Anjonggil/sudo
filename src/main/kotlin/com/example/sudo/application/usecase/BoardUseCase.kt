package com.example.sudo.application.usecase

import com.example.sudo.domain.entity.Board

interface BoardUseCase {
    fun createBoard(board: Board): Long
}
