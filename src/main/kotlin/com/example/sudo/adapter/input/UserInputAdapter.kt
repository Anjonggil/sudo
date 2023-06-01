package com.example.sudo.adapter.input

import com.example.sudo.application.port.input.UserInputPort
import com.example.sudo.domain.dto.UserCreator
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/api/user")
class UserInputAdapter(val userUserCase: UserInputPort) {

    @PostMapping("")
    fun createUser(@RequestBody userRequest: UserRequest): URI {
        val userId = userUserCase.createUser(userRequest.toCreator())
        return URI("/api/user${userId}")
    }
}

data class UserRequest(
    val username: String,
    val nickname: String
) {
    fun toCreator():UserCreator{
        return UserCreator(this.username,this.nickname)
    }
}