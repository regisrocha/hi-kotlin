package dev.rrlabs.hikotlin.user.domain.service

import dev.rrlabs.hikotlin.user.domain.entity.User
import dev.rrlabs.hikotlin.user.domain.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    val log = LoggerFactory.getLogger(this.javaClass)

    fun create(user: User) {
        user.id = UUID.randomUUID().toString()
        log.info("Service - Creating user: {}", user)
        this.userRepository.save(user)
    }

}