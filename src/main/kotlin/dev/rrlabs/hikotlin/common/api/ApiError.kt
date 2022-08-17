package dev.rrlabs.hikotlin.common.api

data class ApiError(
    val errors: List<ErrorDetail?>? = null
)
