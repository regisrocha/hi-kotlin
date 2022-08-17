package dev.rrlabs.hikotlin.user.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u00032\u0006\u0010\r\u001a\u00020\u0006H\'J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Ldev/rrlabs/hikotlin/user/api/UserApi;", "", "create", "Lorg/springframework/http/ResponseEntity;", "Ljava/lang/Void;", "resource", "Ldev/rrlabs/hikotlin/user/api/resource/UserResource;", "delete", "id", "", "findById", "search", "", "filter", "update", "resrouce", "hi-kotlin"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/user"}, produces = {"application/json"})
@io.swagger.v3.oas.annotations.tags.Tag(name = "User API", description = "User API")
public abstract interface UserApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping()
    @io.swagger.v3.oas.annotations.responses.ApiResponses(value = {@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Some data was not filled correctly"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "417", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Failed to create the user"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Unexpected error")})
    @io.swagger.v3.oas.annotations.Operation(summary = "API to create a new user")
    public abstract org.springframework.http.ResponseEntity<java.lang.Void> create(@org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.api.resource.UserResource resource);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping()
    @io.swagger.v3.oas.annotations.responses.ApiResponses(value = {@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "204", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = java.lang.Void.class))}, description = "When users not found for filter applied"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "417", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Failed to search the user"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Unexpected error")})
    @io.swagger.v3.oas.annotations.Operation(summary = "API to search user")
    public abstract org.springframework.http.ResponseEntity<java.util.List<dev.rrlabs.hikotlin.user.api.resource.UserResource>> search(@org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.api.resource.UserResource filter);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @io.swagger.v3.oas.annotations.responses.ApiResponses(value = {@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = java.lang.Void.class))}, description = "When user not found"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "417", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Failed to search the user"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Unexpected error")})
    @io.swagger.v3.oas.annotations.Operation(summary = "API to search user by ID")
    public abstract org.springframework.http.ResponseEntity<dev.rrlabs.hikotlin.user.api.resource.UserResource> findById(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    @io.swagger.v3.oas.annotations.responses.ApiResponses(value = {@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = java.lang.Void.class))}, description = "When user deleted successfuly"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = java.lang.Void.class))}, description = "When user not found"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "417", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Failed to delete the user"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Unexpected error")})
    @io.swagger.v3.oas.annotations.Operation(summary = "API to delete user")
    public abstract org.springframework.http.ResponseEntity<java.lang.Void> delete(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}"})
    @io.swagger.v3.oas.annotations.responses.ApiResponses(value = {@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = java.lang.Void.class))}, description = "When user updated successfuly"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = java.lang.Void.class))}, description = "When user not found"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "417", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Failed to update the user"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Unexpected error")})
    @io.swagger.v3.oas.annotations.Operation(summary = "API to update user")
    public abstract org.springframework.http.ResponseEntity<java.lang.Void> update(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    dev.rrlabs.hikotlin.user.api.resource.UserResource resrouce);
}