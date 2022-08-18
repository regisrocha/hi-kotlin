package dev.rrlabs.hikotlin.editor.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Ldev/rrlabs/hikotlin/editor/api/BffEditorController;", "Ldev/rrlabs/hikotlin/editor/api/BffEditorApi;", "service", "Ldev/rrlabs/hikotlin/editor/service/BffEditorService;", "(Ldev/rrlabs/hikotlin/editor/service/BffEditorService;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLog", "()Lorg/slf4j/Logger;", "searchEditorData", "Lorg/springframework/http/ResponseEntity;", "Ldev/rrlabs/hikotlin/editor/api/resource/EditorResource;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hi-kotlin"})
@org.springframework.web.bind.annotation.RestController()
public class BffEditorController implements dev.rrlabs.hikotlin.editor.api.BffEditorApi {
    private final dev.rrlabs.hikotlin.editor.service.BffEditorService service = null;
    private final org.slf4j.Logger log = null;
    
    public BffEditorController(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    dev.rrlabs.hikotlin.editor.service.BffEditorService service) {
        super();
    }
    
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchEditorData(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.springframework.http.ResponseEntity<dev.rrlabs.hikotlin.editor.api.resource.EditorResource>> continuation) {
        return null;
    }
}