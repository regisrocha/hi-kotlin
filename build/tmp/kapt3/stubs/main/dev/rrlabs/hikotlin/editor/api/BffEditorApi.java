package dev.rrlabs.hikotlin.editor.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Ldev/rrlabs/hikotlin/editor/api/BffEditorApi;", "", "searchEditorData", "Lorg/springframework/http/ResponseEntity;", "Ldev/rrlabs/hikotlin/editor/api/resource/EditorResource;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hi-kotlin"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/bff/editor"}, produces = {"application/json"})
@io.swagger.v3.oas.annotations.tags.Tag(name = "BFF Editor API", description = "BFF Edtir API")
public abstract interface BffEditorApi {
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @io.swagger.v3.oas.annotations.responses.ApiResponses(value = {@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = java.lang.Void.class))}, description = "When user not found"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "417", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Failed to search the user"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", content = {@io.swagger.v3.oas.annotations.media.Content(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = dev.rrlabs.hikotlin.common.api.ApiError.class))}, description = "Unexpected error")})
    @io.swagger.v3.oas.annotations.Operation(summary = "API to orchestrate all the others API calls to contrust the editor view of user")
    public abstract java.lang.Object searchEditorData(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.springframework.http.ResponseEntity<dev.rrlabs.hikotlin.editor.api.resource.EditorResource>> continuation);
}