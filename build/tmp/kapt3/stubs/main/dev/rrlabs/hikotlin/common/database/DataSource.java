package dev.rrlabs.hikotlin.common.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0005"}, d2 = {"Ldev/rrlabs/hikotlin/common/database/DataSource;", "", "()V", "getDataSource", "Lcom/zaxxer/hikari/HikariDataSource;", "hi-kotlin"})
@org.springframework.context.annotation.Configuration()
public class DataSource {
    
    public DataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public com.zaxxer.hikari.HikariDataSource getDataSource() {
        return null;
    }
}