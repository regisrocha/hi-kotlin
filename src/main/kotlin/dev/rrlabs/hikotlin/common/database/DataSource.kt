package dev.rrlabs.hikotlin.common.database

import com.zaxxer.hikari.HikariDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class DataSource {
    @Bean
    fun getDataSource(): HikariDataSource {
        val dataSource = HikariDataSource()
        dataSource.driverClassName = "org.h2.Driver"
        dataSource.jdbcUrl = "jdbc:h2:~/test"
        dataSource.username = "sa"
        dataSource.password = ""
        return dataSource
    }
}