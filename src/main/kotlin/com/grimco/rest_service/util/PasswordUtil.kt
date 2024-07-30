package com.grimco.rest_service.util

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

object PasswordUtil {


    fun hashPassword(password: String): String {

        try {
            val md = MessageDigest.getInstance("SHA-256")
            val hashBytes = md.digest(password.toByteArray())
            val sb = StringBuilder()

            for ( item  in hashBytes) {
                sb.append(String.format("%02x", item))
            }

            return sb.toString()
         }catch (e: NoSuchAlgorithmException) {
             throw RuntimeException("Error hashing password", e)
         }

    }



}