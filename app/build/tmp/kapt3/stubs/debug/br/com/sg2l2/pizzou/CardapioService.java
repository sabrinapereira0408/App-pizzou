package br.com.sg2l2.pizzou;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001e\u0010\f\u001a\u0002H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\b\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lbr/com/sg2l2/pizzou/CardapioService;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "host", "getHost", "getCardapio", "", "Lbr/com/sg2l2/pizzou/Cardapio;", "parseJson", "T", "json", "(Ljava/lang/String;)Ljava/lang/Object;", "saveProduto", "", "cardapio", "app_debug"})
public final class CardapioService {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String host = "http://zguilz.pythonanywhere.com";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WS_LMSApp";
    public static final br.com.sg2l2.pizzou.CardapioService INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<br.com.sg2l2.pizzou.Cardapio> getCardapio() {
        return null;
    }
    
    public final void saveProduto(@org.jetbrains.annotations.NotNull()
    br.com.sg2l2.pizzou.Cardapio cardapio) {
    }
    
    private CardapioService() {
        super();
    }
}