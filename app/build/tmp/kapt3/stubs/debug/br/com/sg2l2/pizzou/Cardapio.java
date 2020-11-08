package br.com.sg2l2.pizzou;

import java.lang.System;

@androidx.room.Entity(tableName = "cardapio")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lbr/com/sg2l2/pizzou/Cardapio;", "Ljava/io/Serializable;", "()V", "foto", "", "getFoto", "()Ljava/lang/String;", "setFoto", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "nome", "getNome", "setNome", "preco", "getPreco", "setPreco", "toString", "app_debug"})
public final class Cardapio implements java.io.Serializable {
    @androidx.room.PrimaryKey()
    private long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nome = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String foto = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String preco = "";
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNome() {
        return null;
    }
    
    public final void setNome(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFoto() {
        return null;
    }
    
    public final void setFoto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPreco() {
        return null;
    }
    
    public final void setPreco(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Cardapio() {
        super();
    }
}