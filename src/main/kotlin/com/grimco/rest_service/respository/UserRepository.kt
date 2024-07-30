package com.grimco.rest_service.respository

import com.grimco.rest_service.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>