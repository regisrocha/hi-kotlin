package dev.rrlabs.hikotlin.editor.api

import dev.rrlabs.hikotlin.common.api.ApiError
import dev.rrlabs.hikotlin.editor.api.resource.EditorResource
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Tag(name = "BFF Editor API", description = "BFF Edtir API")
@RequestMapping("/api/bff/editor", produces = [MediaType.APPLICATION_JSON_VALUE])
interface BffEditorApi {

    @Operation(summary = "API to orchestrate all the others API calls to contrust the editor view of user")
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
    suspend fun searchEditorData(@PathVariable("id") id: String): ResponseEntity<EditorResource>

}