package dev.rrlabs.hikotlin.editor.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Ldev/rrlabs/hikotlin/editor/service/BffEditorService;", "", "appereanceGateway", "Ldev/rrlabs/hikotlin/downstream/appearance/AppereanceGateway;", "shopsGateway", "Ldev/rrlabs/hikotlin/downstream/shops/ShopsGateway;", "mpGateway", "Ldev/rrlabs/hikotlin/downstream/mp/MpGateway;", "(Ldev/rrlabs/hikotlin/downstream/appearance/AppereanceGateway;Ldev/rrlabs/hikotlin/downstream/shops/ShopsGateway;Ldev/rrlabs/hikotlin/downstream/mp/MpGateway;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLog", "()Lorg/slf4j/Logger;", "searchData", "Ldev/rrlabs/hikotlin/editor/api/resource/EditorResource;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchEditorData", "Lorg/springframework/http/ResponseEntity;", "hi-kotlin"})
@org.springframework.stereotype.Service()
public class BffEditorService {
    private final dev.rrlabs.hikotlin.downstream.appearance.AppereanceGateway appereanceGateway = null;
    private final dev.rrlabs.hikotlin.downstream.shops.ShopsGateway shopsGateway = null;
    private final dev.rrlabs.hikotlin.downstream.mp.MpGateway mpGateway = null;
    private final org.slf4j.Logger log = null;
    
    public BffEditorService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    dev.rrlabs.hikotlin.downstream.appearance.AppereanceGateway appereanceGateway, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    dev.rrlabs.hikotlin.downstream.shops.ShopsGateway shopsGateway, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    dev.rrlabs.hikotlin.downstream.mp.MpGateway mpGateway) {
        super();
    }
    
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object searchEditorData(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.springframework.http.ResponseEntity<dev.rrlabs.hikotlin.editor.api.resource.EditorResource>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object searchData(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super dev.rrlabs.hikotlin.editor.api.resource.EditorResource> continuation) {
        return null;
    }
}