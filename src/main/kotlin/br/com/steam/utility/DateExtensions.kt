package br.com.steam.utility

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

internal const val FORMAT_DD_MM_YYYY = "dd/MM/yyyy"

fun String.parseToDate(): Date? {
    return try {
        val sourceFormat = SimpleDateFormat(FORMAT_DD_MM_YYYY)
        sourceFormat.parse(this)
    } catch (e: ParseException) {
        null
    }
}

fun Date.parseToDate(): String? {
    return try {
        val formatter = SimpleDateFormat(FORMAT_DD_MM_YYYY)
        formatter.format(this)
    } catch (e: Exception) {
        null
    }
}

