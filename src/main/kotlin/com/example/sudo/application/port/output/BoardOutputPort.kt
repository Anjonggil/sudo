package com.example.sudo.application.port.output

import com.example.sudo.adapter.output.entity.BoardEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BoardOutputPort : JpaRepository<BoardEntity, Long> {

}
