package br.com.sg2l2.pizzou;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u000b"}, d2 = {"Lbr/com/sg2l2/pizzou/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onMessageReceived", "", "mensagemRemota", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "showNotification", "app_debug"})
public final class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.Nullable()
    com.google.firebase.messaging.RemoteMessage mensagemRemota) {
    }
    
    private final void showNotification(com.google.firebase.messaging.RemoteMessage mensagemRemota) {
    }
    
    public MyFirebaseMessagingService() {
        super();
    }
}