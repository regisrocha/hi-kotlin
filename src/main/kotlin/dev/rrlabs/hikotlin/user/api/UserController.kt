package dev.rrlabs.hikotlin.user.api

import dev.rrlabs.hikotlin.user.api.mapper.UserMapper
import dev.rrlabs.hikotlin.user.api.resource.UserResource
import dev.rrlabs.hikotlin.user.domain.repository.UserRepository
import dev.rrlabs.hikotlin.user.domain.service.UserService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(@Autowired private val mapper: UserMapper,
                     @Autowired private val userService: UserService) : UserApi {

    val log = LoggerFactory.getLogger(this.javaClass)

    override fun create(resource: UserResource) : ResponseEntity<Void>{
        log.info("controller - creating user: {}", resource)

        this.userService.create(this.mapper.parse(resource))

        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

    override fun search(filter: UserResource): ResponseEntity<List<UserResource>> {
        log.info("Search user: {}", filter)
        return ResponseEntity.ok().build()
    }

    override fun findById(id: String): ResponseEntity<UserResource> {
        log.info("Find user by ID: {}", id)
        return ResponseEntity.ok().build()
    }

    override fun delete(id: String): ResponseEntity<Void> {
        log.info("Delete user: {}", id)
        return ResponseEntity.ok().build()
    }

    override fun update(id: String, resrouce: UserResource): ResponseEntity<Void> {
        log.info("Update user: {}", id)
        return ResponseEntity.ok().build()
    }
}