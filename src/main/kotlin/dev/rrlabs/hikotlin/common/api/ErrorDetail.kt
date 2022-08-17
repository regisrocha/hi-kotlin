package dev.rrlabs.hikotlin.common.api

data class ErrorDetail(
    val code: String? = null,
    val description: String? = null,
    val field: String? = null
)
