package com.grimco.rest_service

import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class CustomErrorHandler: ErrorController {

    @RequestMapping("/error")
    fun handlerError(): String {
        return "error/404"
    }

}