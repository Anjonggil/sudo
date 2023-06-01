package com.example.sudo.application.port.input

import com.example.sudo.domain.dto.BoardCreator

interface BoardInputPort {
    fun createBoard(boardCreator: BoardCreator): Long
}
