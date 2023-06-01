package com.example.sudo.adapter.output.apdapter.repository

import com.example.sudo.adapter.output.apdapter.entity.BoardEntity
import com.example.sudo.domain.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository :JpaRepository<BoardEntity, Long> {
}