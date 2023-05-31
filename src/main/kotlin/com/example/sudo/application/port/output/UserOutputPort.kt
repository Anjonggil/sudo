package com.example.sudo.application.port.output

import com.example.sudo.adapter.output.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserOutputPort : JpaRepository<UserEntity, Long> {

}
