package com.example.sudo.adapter.input

import com.example.sudo.application.usecase.BoardUseCase
import com.example.sudo.domain.dto.BoardCreator
import com.example.sudo.domain.entity.Board
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/api/board")
class BoardInputAdapter(
    val boardUseCase: BoardUseCase
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    fun createBoard(@RequestBody boardRequest: BoardRequest): URI {
        val boardId = boardUseCase.createBoard(boardRequest.toBoardCreator())
        return URI("/api/board/${boardId}")
    }
}

data class BoardRequest(
    val title: String,
    val content: String,
    val creatorId: Long
) {
    fun toBoardCreator(): BoardCreator {
        return BoardCreator(this.title, this.content, this.creatorId)
    }
}

data class BoardResponse(
    val boardId: Long?,
    val title: String,
    val content: String?,
    val creatorId: Long
){
    companion object {
        fun toDto(board: Board): BoardResponse {
            return board.let { BoardResponse(it.boardId,it.title, it.content, it.creatorId) }
        }
    }
}

