package br.com.sg2l2.pizzou

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CardapioDAO {

    @Query("SELECT * FROM cardapio where id=:id")
    fun getById(id: Long): Cardapio?

    @Query("SELECT * FROM cardapio")
    fun findAll(): List<Cardapio>

    @Insert
    fun insert(cardapio: Cardapio)

    @Delete
    fun delete(cardapio: Cardapio)
    

}