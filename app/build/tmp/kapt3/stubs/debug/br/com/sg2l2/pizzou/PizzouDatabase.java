package br.com.sg2l2.pizzou;

import java.lang.System;

@androidx.room.Database(entities = {br.com.sg2l2.pizzou.Cardapio.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lbr/com/sg2l2/pizzou/PizzouDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cardapioDAO", "Lbr/com/sg2l2/pizzou/CardapioDAO;", "app_debug"})
public abstract class PizzouDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.sg2l2.pizzou.CardapioDAO cardapioDAO();
    
    public PizzouDatabase() {
        super();
    }
}