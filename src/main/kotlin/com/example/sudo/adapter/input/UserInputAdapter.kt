package com.example.sudo.adapter.input

import com.example.sudo.application.usecase.UserUseCase
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserInputAdapter(val userUserCase: UserUseCase) {
}