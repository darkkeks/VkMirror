package ru.darkkeks.vkmirror.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory

inline fun <reified T> T.logger(): Logger {
    return LoggerFactory.getLogger(T::class.java)
}

fun prompt(message: String): String {
    print(message)
    print(": ")
    return readLine() ?: ""
}