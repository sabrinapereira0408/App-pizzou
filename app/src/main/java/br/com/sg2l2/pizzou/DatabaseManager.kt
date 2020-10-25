package br.com.sg2l2.pizzou

import androidx.room.Room

object DatabaseManager {

    private var dbInstance: PizzouDatabase

    init {
        val contexto = PizzouApplication.getInstance().applicationContext

        dbInstance = Room.databaseBuilder(
            contexto,
            PizzouDatabase::class.java,
            "pizzou.sqlite"
        ).build()
    }

    fun getCardapioDAO() : CardapioDAO {
        return dbInstance.cardapioDAO()
    }
}