package com.grimco.rest_service.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.NoHandlerFoundException


@ControllerAdvice
class CustomHandlerController {

    @ExceptionHandler(NoHandlerFoundException::class)
    fun handlerNotFound(e: NoHandlerFoundException) =
        ResponseEntity<ResponseCustom>(ResponseCustom(e.message ?: "error", 404), HttpStatus.NOT_FOUND)
}


data class ResponseCustom(val message: String, val status: Int)