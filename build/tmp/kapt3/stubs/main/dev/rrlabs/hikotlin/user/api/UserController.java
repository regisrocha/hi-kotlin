package dev.rrlabs.hikotlin.user.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\r2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Ldev/rrlabs/hikotlin/user/api/UserController;", "Ldev/rrlabs/hikotlin/user/api/UserApi;", "mapper", "Ldev/rrlabs/hikotlin/user/api/mapper/UserMapper;", "userService", "Ldev/rrlabs/hikotlin/user/domain/service/UserService;", "(Ldev/rrlabs/hikotlin/user/api/mapper/UserMapper;Ldev/rrlabs/hikotlin/user/domain/service/UserService;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLog", "()Lorg/slf4j/Logger;", "create", "Lorg/springframework/http/ResponseEntity;", "Ljava/lang/Void;", "resource", "Ldev/rrlabs/hikotlin/user/api/resource/UserResource;", "delete", "id", "", "findById", "search", "", "filter", "update", "resrouce", "hi-kotlin"})
@org.springframework.web.bind.annotation.RestController()
public class UserController implements dev.rrlabs.hikotlin.user.api.UserApi {
    private final dev.rrlabs.hikotlin.user.api.mapper.UserMapper mapper = null;
    private final dev.rrlabs.hikotlin.user.domain.service.UserService userService = null;
    private final org.slf4j.Logger log = null;
    
    public UserController(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    dev.rrlabs.hikotlin.user.api.mapper.UserMapper mapper, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    dev.rrlabs.hikotlin.user.domain.service.UserService userService) {
        super();
    }
    
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.lang.Void> create(@org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.api.resource.UserResource resource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<dev.rrlabs.hikotlin.user.api.resource.UserResource>> search(@org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.api.resource.UserResource filter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<dev.rrlabs.hikotlin.user.api.resource.UserResource> findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.lang.Void> delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.lang.Void> update(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.api.resource.UserResource resrouce) {
        return null;
    }
}