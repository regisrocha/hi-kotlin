package dev.rrlabs.hikotlin.user.api.mapper

import dev.rrlabs.hikotlin.user.api.resource.UserResource
import dev.rrlabs.hikotlin.user.domain.entity.User
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper {
    fun parse(resource: UserResource) : User
    fun parse(user: User) : UserResource
    fun parse(users: List<User>) : List<UserResource>
}