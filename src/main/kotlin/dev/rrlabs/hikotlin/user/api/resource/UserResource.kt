package dev.rrlabs.hikotlin.user.api.resource

import javax.validation.constraints.NotBlank

data class UserResource(
    val id: Long?,

    @NotBlank(message = "Name cant be empty")
    val name: String?,

    @NotBlank(message = "Name cant be empty")
    val email: String?,

    val nickname: String?
)
