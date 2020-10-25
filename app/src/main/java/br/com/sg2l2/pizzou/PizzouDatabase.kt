package br.com.sg2l2.pizzou

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Cardapio::class), version = 1)
abstract class PizzouDatabase : RoomDatabase() {
    abstract fun cardapioDAO() : CardapioDAO
}