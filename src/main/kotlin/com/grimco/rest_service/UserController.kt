package com.grimco.rest_service

import com.grimco.rest_service.model.User
import com.grimco.rest_service.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/users")
class UserController(@Autowired private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }


    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }


}