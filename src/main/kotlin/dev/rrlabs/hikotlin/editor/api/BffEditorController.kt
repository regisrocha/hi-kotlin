package dev.rrlabs.hikotlin.editor.api

import dev.rrlabs.hikotlin.editor.api.resource.EditorResource
import dev.rrlabs.hikotlin.editor.service.BffEditorService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class BffEditorController(@Autowired private val service: BffEditorService) : BffEditorApi {

    val log = LoggerFactory.getLogger(this.javaClass)

    override suspend fun searchEditorData(id: String): ResponseEntity<EditorResource> {
        log.info("Find editor data: {}", id)

        return this.service.searchEditorData(id)
    }
}