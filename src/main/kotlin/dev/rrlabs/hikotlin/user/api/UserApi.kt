package dev.rrlabs.hikotlin.user.api

import dev.rrlabs.hikotlin.common.api.ApiError
import dev.rrlabs.hikotlin.user.api.resource.UserResource
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping

@Tag(name = "User API", description = "User API")
@RequestMapping("/api/user", produces = [MediaType.APPLICATION_JSON_VALUE])
interface UserApi {

    @Operation(summary = "API to create a new user")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "400",
                description = "Some data was not filled correctly",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            ),
            ApiResponse(
                responseCode = "417",
                description = "Failed to create the user",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Unexpected error",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            )
        ]
    )
    @PostMapping
    fun create(resource: UserResource) : ResponseEntity<Void>

    @Operation(summary = "API to search user")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "204",
                description = "When users not found for filter applied",
                content = [Content(schema = Schema(implementation = Void::class))]
            ),
            ApiResponse(
                responseCode = "417",
                description = "Failed to search the user",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Unexpected error",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            )
        ]
    )
    @GetMapping
    fun search(filter: UserResource): ResponseEntity<List<UserResource>>

    @Operation(summary = "API to search user by ID")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "404",
                description = "When user not found",
                content = [Content(schema = Schema(implementation = Void::class))]
            ),
            ApiResponse(
                responseCode = "417",
                description = "Failed to search the user",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Unexpected error",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            )
        ]
    )
    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<UserResource>

    @Operation(summary = "API to delete user")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "When user deleted successfuly",
                content = [Content(schema = Schema(implementation = Void::class))]
            ),
            ApiResponse(
                responseCode = "404",
                description = "When user not found",
                content = [Content(schema = Schema(implementation = Void::class))]
            ),
            ApiResponse(
                responseCode = "417",
                description = "Failed to delete the user",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Unexpected error",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            )
        ]
    )
    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String): ResponseEntity<Void>

    @Operation(summary = "API to update user")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "When user updated successfuly",
                content = [Content(schema = Schema(implementation = Void::class))]
            ),
            ApiResponse(
                responseCode = "404",
                description = "When user not found",
                content = [Content(schema = Schema(implementation = Void::class))]
            ),
            ApiResponse(
                responseCode = "417",
                description = "Failed to update the user",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Unexpected error",
                content = [Content(schema = Schema(implementation = ApiError::class))]
            )
        ]
    )
    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: String, resrouce: UserResource): ResponseEntity<Void>

}