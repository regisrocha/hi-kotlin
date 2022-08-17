package dev.rrlabs.hikotlin.user.api.mapper;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\t"}, d2 = {"Ldev/rrlabs/hikotlin/user/api/mapper/UserMapper;", "", "parse", "Ldev/rrlabs/hikotlin/user/domain/entity/User;", "resource", "Ldev/rrlabs/hikotlin/user/api/resource/UserResource;", "user", "", "users", "hi-kotlin"})
public abstract interface UserMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract dev.rrlabs.hikotlin.user.domain.entity.User parse(@org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.api.resource.UserResource resource);
    
    @org.jetbrains.annotations.NotNull()
    public abstract dev.rrlabs.hikotlin.user.api.resource.UserResource parse(@org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.domain.entity.User user);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dev.rrlabs.hikotlin.user.api.resource.UserResource> parse(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.rrlabs.hikotlin.user.domain.entity.User> users);
}