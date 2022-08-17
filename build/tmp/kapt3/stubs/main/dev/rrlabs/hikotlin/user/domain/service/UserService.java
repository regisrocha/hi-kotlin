package dev.rrlabs.hikotlin.user.domain.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/rrlabs/hikotlin/user/domain/service/UserService;", "", "userRepository", "Ldev/rrlabs/hikotlin/user/domain/repository/UserRepository;", "(Ldev/rrlabs/hikotlin/user/domain/repository/UserRepository;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLog", "()Lorg/slf4j/Logger;", "create", "", "user", "Ldev/rrlabs/hikotlin/user/domain/entity/User;", "hi-kotlin"})
@org.springframework.stereotype.Service()
public class UserService {
    private final dev.rrlabs.hikotlin.user.domain.repository.UserRepository userRepository = null;
    private final org.slf4j.Logger log = null;
    
    public UserService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    dev.rrlabs.hikotlin.user.domain.repository.UserRepository userRepository) {
        super();
    }
    
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    public void create(@org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.domain.entity.User user) {
    }
}