package com.example.sudo.adapter.output.entity

import javax.persistence.*

@Entity
@Table(name = "REPLY")
class ReplyEntity(
    content: String?,
    creatorId: Long,
    boardEntity: BoardEntity
) {
    @Id
    @GeneratedValue
    var id: Long = -1
        protected set

    var content: String? = content
        protected set

    var creatorId: Long = creatorId
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    var boardEntity: BoardEntity = boardEntity
        protected set
}
