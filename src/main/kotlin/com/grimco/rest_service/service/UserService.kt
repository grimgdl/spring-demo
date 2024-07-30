package com.grimco.rest_service.service

import com.grimco.rest_service.model.User
import com.grimco.rest_service.respository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService(@Autowired private val userRepository: UserRepository) {



    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    fun createUser(user: User): User {
        return userRepository.save(user)
    }


}