package com.grimco.rest_service.service

import com.grimco.rest_service.util.PasswordUtil
import com.grimco.rest_service.model.User
import com.grimco.rest_service.respository.UserRepository
import com.grimco.rest_service.util.JsonDefaultView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService(@Autowired private val userRepository: UserRepository) {



    fun getAllUsers(): JsonDefaultView<User> {
        val users = userRepository.findAll()

        return JsonDefaultView(users)
    }

    fun createUser(user: User): User {

        user.password = PasswordUtil.hashPassword(user.password?: "")
        return userRepository.save(user)
    }


}