package com.example.sudo.adapter.output.apdapter.entity

import javax.persistence.*

@Entity
@Table(name = "BOARD")
class BoardEntity (
        title: String,
        content: String?,
        creatorId: Long
    ){
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
        protected set

    var title: String = title
        protected set

    var content: String? = content
        protected set

    var creatorId: Long = creatorId

    @OneToMany(mappedBy = "board", cascade = [CascadeType.ALL])
    var replyEntities: MutableList<ReplyEntity> = mutableListOf()
}
