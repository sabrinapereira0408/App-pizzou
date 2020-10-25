package br.com.sg2l2.pizzou

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "cardapio")
class Cardapio: Serializable {

    @PrimaryKey
    var id:Long = 0
    var nome = ""
    var foto = ""

    override fun toString(): String {
        return "Pizza (nome=$nome)"
    }
}